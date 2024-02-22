/*
 Copyright (c) 2017-2023, Robby, Kansas State University
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are met:

 1. Redistributions of source code must retain the above copyright notice, this
    list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
import org.sireum._
import org.antlr.v4.runtime._

import java.io._
import Antlr4LogikaParser._
import Upgrader.{inSuffix, oldSuffix}
import org.antlr.v4.runtime.tree.TerminalNode

object Upgrader {

  private final class Visitor(var isPred: B = F,
                              var vars: HashSSet[String] = HashSSet.empty,
                              var funs: HashSMap[String, Z] = HashSMap.empty) extends Antlr4LogikaBaseVisitor[Unit] {
    override def visitVar(ctx: VarContext): Unit = {
      vars = vars + ctx.ID.getText
      super.visitVar(ctx)
    }

    override def visitApply(ctx: ApplyContext): Unit = {
      isPred = T
      funs = funs + ctx.ID.getText ~> (if (ctx.formula == null) 0 else ctx.formula.size)
      super.visitApply(ctx)
    }

    override def visitQformula(ctx: QformulaContext): Unit = {
      isPred = T
      super.visitQformula(ctx)
    }
  }

  private val terminateStmtTokens: HashSet[String] = HashSet ++ ISZ[String](
    "this", "null", "true", "false", "return", "type", ")", "]", "}", "_"
  )

  private val nonBeginStmtTokens: HashSet[String] = HashSet ++ ISZ[String](
    "catch", "else", "extends", "finally", "forSome", "match", "with", "yield",
    ",", ".", ":", "=", "=>", "⇒", "[", ")", "]", "}", "<-", "<:", "<%", ">:", "#"
  )

  private val oldSuffix = "_old"
  private val inSuffix = "_in"

  def main(args: Array[Predef.String]): Unit = {
    def defaultAuto: B = {
      val p = Os.path(args(0)).canon.string.value.toLowerCase
      p.contains("symexe") || p.contains("auto")
    }
    val (input, output, isAuto) = args match {
      case Array(arg0) => (arg0, null, defaultAuto)
      case Array(arg0, "auto") => (arg0, null, T)
      case Array(arg0, arg1) => (arg0, arg1, defaultAuto)
      case Array(arg0, arg1, arg2) => (arg0, arg1, arg2 == "auto": B)
      case _ =>
        println("Usage: <input> [ <output> ] [ auto ]")
        return
    }

    val path = Os.path(input).canon
    val content = path.read.value
    val tree = parse(path.string.value, content)
    val (r, ext) = tree match {
      case tree: TruthTableFileContext =>
        (new Upgrader(F, content, "->:").translateTruthTable(tree.truthTable), ".logika")
      case tree: SequentFileContext =>
        val proof = tree.proof
        (new Upgrader(F, content, "__>:").translateSequent(tree.sequent, if (proof != null) Some(proof) else None()), ".sc")
      case tree: ProgramFileContext =>
        (new Upgrader(isAuto, content, "__>:").translateProgram(tree.program), ".sc")
    }
    if (output == null) {
      println(r.render)
    } else {
      val f = Os.path(s"$output$ext")
      f.writeOver(r.render)
      println(s"Wrote $f")
    }
  }

  private def parse(path: Predef.String, content: Predef.String): FileContext = {
    object Mode extends Enumeration {
      val TruthTable, Sequent, Program = Value
    }
    def hide(t: Token): Unit = {
      t.asInstanceOf[CommonToken].setChannel(Token.HIDDEN_CHANNEL)
    }
    def orientNewlines(cts: CommonTokenStream, isProgram: Boolean): Unit = {
      import Antlr4LogikaLexer.{ID, NL, NUM}
      val tokens: ISZ[Token] = {
        import scala.jdk.CollectionConverters._
        ISZ(cts.getTokens.asScala.toSeq: _*)
      }
      if (tokens.isEmpty) {
        return
      }

      if (!isProgram) {
        var stop = false
        for (t <- tokens if !stop) {
          if (t.getText == "{") stop = true
          else if (t.getType == NL) hide(t)
        }
      }

      var i = 0
      var parens = 0
      var inLogikaStmt = false
      val size = tokens.size
      while (tokens(i).getType != IntStream.EOF) {
        val token = tokens(i)
        token.getText match {
          case "(" => parens += 1
          case ")" if parens > 0 => parens -= 1
          case "l\"\"\"" => inLogikaStmt = true
          case "{" if inLogikaStmt => inLogikaStmt = false
          case "\"\"\"" => inLogikaStmt = false
          case _ if token.getType == NL =>
            if (parens > 0 || inLogikaStmt) {
              token.asInstanceOf[CommonToken].
                setChannel(Token.HIDDEN_CHANNEL)
            }
            else {
              var skip = true
              if (i > 0) {
                val prevToken = tokens(i - 1)
                if (terminateStmtTokens.
                  contains(prevToken.getText)) {
                  skip = false
                } else
                  prevToken.getType match {
                    case ID | NUM => skip = false
                    case _ =>
                  }
              }
              if (i < size - 1) {
                val nextToken = tokens(i + 1)
                if (!nonBeginStmtTokens.contains(nextToken.getText)) {
                  skip = false
                }
              }
              if (skip) {
                hide(token)
              }
            }
          case _ =>
        }
        i += 1
      }
    }

    val input = CharStreams.fromReader(new StringReader(content))
    val lexer = new Antlr4LogikaLexer(input)
    val tokens = new CommonTokenStream(lexer)
    tokens.fill()
    val mode = {
      import scala.jdk.CollectionConverters._
      var firstTokenOpt: Option[Token] = None()
      for (t <- tokens.getTokens().asScala if firstTokenOpt.isEmpty) {
        if (t.getType != Antlr4LogikaLexer.NL &&
          t.getChannel == Lexer.DEFAULT_TOKEN_CHANNEL)
          firstTokenOpt = Some(t)
      }
      firstTokenOpt match {
        case Some(t) =>
          t.getText match {
            case "*" => Mode.TruthTable
            case "import" => Mode.Program
            case _ => Mode.Sequent
          }
        case _ => Mode.Program
      }
    }
    tokens.seek(0)
    mode match {
      case Mode.TruthTable =>
      case Mode.Sequent => orientNewlines(tokens, isProgram = F)
      case Mode.Program => orientNewlines(tokens, isProgram = T)
    }
    val parser = new Antlr4LogikaParser(tokens)
    parser.removeErrorListeners()
    parser.addErrorListener(new BaseErrorListener {
      override def syntaxError(recognizer: Recognizer[_, _], offendingSymbol: Object, line: Int, charPositionInLine: Int, msg: Predef.String, e: RecognitionException): Unit = {
        throw new RuntimeException("Parse Error in " + path + ": [" + line + ", " + charPositionInLine + "] " + msg)
      }
    })
    return parser.file()
  }
}

final class Upgrader(isAuto: B, input: Predef.String, implyOp: String, var invCount: Z = 0) {

  private var importJust: B = F
  private var importProp: B = F
  private var importPred: B = F

  private def translateTruthTable(tt: TruthTableContext): ST = {
    val start = tt.formula.start.getStartIndex
    val stop = tt.formula.stop.getStopIndex
    val newInput = input.replace(" | ", " # ").replace("- ", "").
      replace(input.substring(start, stop + 1), translateFormula(tt.formula, None()).render.value).
      replace('⊤', 'T'). replace('⊥', 'F')
    st"""//@Logika: --background type
        |
        |$newInput"""
  }

  private def translateSequent(sequent: SequentContext, proofOpt: Option[ProofContext]): ST = {
    val visitor = new Upgrader.Visitor
    val ps = sequent.premises
    val cs = sequent.conclusions
    for (i <- 0 until ps.size) {
      visitor.visit(ps.get(i))
    }
    for (i <- 0 until cs.size) {
      visitor.visit(cs.get(i))
    }
    importPred = visitor.isPred
    val pOpt = proofOpt match {
      case Some(proof) =>
        val steps = proof.proofStep
        Some(
          st""" Proof(
              |  //@formatter:off
              |  ${(for (i <- 0 until steps.size) yield translateProofStep(steps.get(i)), ",\n")}
              |  //@formatter:on
              |)"""
        )
      case _ => None[ST]()
    }
    var params = ISZ[ST]()
    if (importPred) {
      for (x <- visitor.vars.elements) {
        params = params :+ st"$x: T"
      }
    } else {
      for (x <- visitor.vars.elements) {
        params = params :+ st"$x: B"
      }
    }
    for ((fun, nargs) <- visitor.funs.entries) {
      val args = if (nargs == 1) st"T" else st"(${(for (_ <- 0 until nargs) yield "T", ", ")})"
      params = params :+ st"$fun: $args => B @pure"
    }
    val seq = translateSequentH(sequent, pOpt)
    val importJustOpt = if (importJust) Some(st"import org.sireum.justification._") else None()
    val importPropJustOpt = if (importProp) Some(st"import org.sireum.justification.natded.prop._") else None()
    val importPredJustOpt = if (importPred) Some(st"import org.sireum.justification.natded.pred._") else None()
    st"""// #Sireum #Logika
        |//@Logika: --manual --background save
        |import org.sireum._
        |$importJustOpt
        |$importPropJustOpt
        |$importPredJustOpt
        |
        |@pure def sequent${if (importPred) "[T]" else ""}(${(params, ", ")}): Unit = {
        |  $seq
        |}"""
  }

  private def translateProgram(program: ProgramContext): ST = {
    val stmts = program.stmts.stmt
    val code = for (i <- 0 until stmts.size) yield translateStmt(stmts.get(i))
    val importJustOpt = if (importJust) Some(st"import org.sireum.justification._") else None()
    val importPropJustOpt = if (importProp) Some(st"import org.sireum.justification.natded.prop._") else None()
    val importPredJustOpt = if (importPred) Some(st"import org.sireum.justification.natded.pred._") else None()
    st"""// #Sireum #Logika
        |//@Logika: ${if (isAuto) "" else "--manual "}--background save
        |import org.sireum._
        |$importJustOpt
        |$importPropJustOpt
        |$importPredJustOpt
        |
        |${(code, "\n")}"""
  }

  private def translateStmt(stmt: StmtContext): ST = {
    stmt match {
      case _: ImportStmtContext => st""
      case stmt: VarDeclStmtContext => st"${stmt.modifier.getText} ${stmt.ID.getText}: ${translateType(stmt.`type`)} = ${translateExp(stmt.exp)}"
      case stmt: AssignVarStmtContext => st"${stmt.ID.getText} = ${translateExp(stmt.exp)}"
      case stmt: AssumeStmtContext => st"assume(${translateExp(stmt.exp)})"
      case stmt: AssertStmtContext => st"assert(${translateExp(stmt.exp)})"
      case stmt: IfStmtContext =>
        if (stmt.fs == null) {
          st"""if (${translateExp(stmt.exp)}) {
              |  ${(translateBlockEnd(stmt.ts), "\n")}
              |}"""
        } else {
          st"""if (${translateExp(stmt.exp)}) {
              |  ${(translateBlockEnd(stmt.ts), "\n")}
              |} else {
              |  ${(translateBlockEnd(stmt.fs), "\n")}
              |}"""
        }
      case stmt: WhileStmtContext =>
        val invOpt = if (stmt.loopInvariant != null) {
          val modOpt = translateModifies(stmt.loopInvariant.modifies, stmt.loopInvariant.formula != null)
          val fs = stmt.loopInvariant.formula
          Some(
            st"""Invariant(
                |  $modOpt
                |  ${(for (i <- 0 until fs.size) yield translateFormula(fs.get(i), None()), ",\n")}
                |)"""
          )
        } else {
          None()
        }
        st"""while (${translateExp(stmt.exp)}) {
            |  $invOpt
            |  ${(translateBlockEnd(stmt.blockEnd), "\n")}
            |}"""
      case stmt: PrintStmtContext =>
        val ses = stmt.stringOrExp
        st"${stmt.op.getText}(${(for (i <- 0 until ses.size) yield translateStringOrExp(ses.get(i)), ", ")})"
      case stmt: SeqAssignStmtContext =>
        st"${stmt.tb.getText}(${translateExp(stmt.index)}) = ${translateExp(stmt.r)}"
      case stmt: MethodDeclStmtContext => translateMethodDecl(stmt.methodDecl)
      case stmt: LogikaStmtContext => translateLogikaStmt(stmt)
      case stmt: ExpStmtContext => translateExp(stmt.exp)
    }
  }

  private def translateBlockEnd(block: BlockEndContext): ISZ[ST] = {
    val stmts = block.stmts.stmt
    var r = ISZ((for (i <- 0 until stmts.size) yield translateStmt(stmts.get(i))): _*)
    if (block.returnStmt != null) {
      if (block.returnStmt.exp != null) {
        r = r :+ st"return ${translateExp(block.returnStmt.exp)}"
      } else {
        r = r :+ st"return"
      }
    }
    r
  }

  private def translateMethodDecl(method: MethodDeclContext): ST = {
    val anns = method.anns
    val annsOpt = if (anns == null) None() else Some(
      st"${(for (i <- 0 until anns.size) yield st"@${anns.get(i)}", " ")} "
    )
    val params = method.param
    val paramsOpt = if (params == null) None() else Some(
      st"${
        (for (i <- 0 until params.size) yield {
          val param = params.get(i)
          st"${param.ID.getText}: ${translateType(param.`type`)}"
        }, ", ")
      }"
    )
    val retType = if (method.`type` == null) st"Unit" else translateType(method.`type`)
    val contractOpt = if (method.methodContract == null) None() else {
      var r = ISZ[ST]()
      val requires = method.methodContract.rs
      if (requires != null && !requires.isEmpty) {
        r = r :+
          st"""Requires(
              |  ${(for (i <- 0 until requires.size) yield translateFormula(requires.get(i), None()), ",\n")}
              |)"""
      }
      val ensures = method.methodContract.es
      translateModifies(method.methodContract.modifies, F) match {
        case Some(mods) => r = r :+ mods
        case _ =>
      }
      if (ensures != null && !ensures.isEmpty) {
        val retTypeOpt = Option.some(retType)
        r = r :+
          st"""Ensures(
              |  ${(for (i <- 0 until ensures.size) yield translateFormula(ensures.get(i), retTypeOpt), ",\n")}
              |)"""
      }
      st"""Contract(
          |  ${(r, ",\n")}
          |)"""
    }
    st"""${annsOpt}def ${method.id.getText}($paramsOpt): $retType = {
        |  $contractOpt
        |  ${(translateBlockEnd(method.blockEnd), "\n")}
        |}"""
  }

  private def translateSequentH(sequent: SequentContext, proofOpt: Option[ST]): ST = {
    val ps = sequent.premises
    val premises = for (i <- 0 until ps.size) yield translateFormula(ps.get(i), None())
    val cs = sequent.conclusions
    val conclusions = for (i <- 0 until cs.size) yield
      st"Deduce(${if (premises.nonEmpty) st"(${(premises, ", ")})  " else st""}⊢  (${translateFormula(cs.get(i), None())})$proofOpt)"
    st"${(conclusions, "\n")}"
  }

  private def translateLogikaStmt(stmt: LogikaStmtContext): ST = {
    if (stmt.invariants != null) {
      var n = invCount
      n = n + 1
      val fs = stmt.invariants.formula
      st"""@spec def inv$n = Invariant(
          |  ${(for (i <- 0 until fs.size) yield translateFormula(fs.get(i), None()), ",\n")}
          |)"""
    } else if (stmt.sequent != null) {
      translateSequentH(stmt.sequent, None())
    } else if (stmt.proof != null) {
      val steps = stmt.proof.proofStep
      st"""Deduce(
          |  //@formatter:off
          |  ${(for (i <- 0 until steps.size) yield translateProofStep(steps.get(i)), ",\n")}
          |  //@formatter:on
          |)"""
    } else {
      val ffs = stmt.facts.factOrFun
      val facts = for (i <- 0 until ffs.size) yield {
        val ff = ffs.get(i)
        if (ff.fact != null) {
          val fact = ff.fact
          st"""@spec def ${fact.ID.getText} = Fact(${translateFormula(fact.formula, None())})"""
        } else {
          val start = ff.fun.start.getStartIndex
          val stop = ff.fun.stop.getStopIndex + 1
          st"""/* The following should be hand-translated as a @strictpure method (with halt for non-total function):
              |  ${input.substring(start, stop)}
              |*/"""
        }
      }
      st"${(facts, "\n")}"
    }
  }

  private def translateProofStep(step: ProofStepContext): ST = {
    step match {
      case step: StepContext =>
        st"${step.NUM.getText}  (${translateFormula(step.formula, None())}) by ${translateJustification(step.justification)}"
      case step: SubProofContext =>
        val steps = step.proofStep
        val ss = for (i <- 0 until steps.size) yield translateProofStep(steps.get(i))
        if (step.ID != null && step.ate != null) {
          st"""${step.sub.getText}  SubProof { (${step.ID.getText}: ${if (step.`type` == null) st"T" else translateType(step.`type`)}) => (
              |  ${step.assume.getText}  Assume(${translateFormula(step.formula, None())})${if (ss.nonEmpty) "," else ""}
              |  ${(ss, ",\n")}
              |)}"""
        } else if (step.formula != null && step.ate != null) {
          st"""${step.sub.getText}  SubProof(
              |  ${step.assume.getText}  Assume(${translateFormula(step.formula, None())})${if (ss.nonEmpty) "," else ""}
              |  ${(ss, ",\n")}
              |)"""
        } else {
          st"""${step.sub.getText}  SubProof { (${step.ID.getText}: ${if (step.`type` == null) st"T" else translateType(step.`type`)}) => (
              |  ${(ss, ",\n")}
              |)}"""
        }
    }
  }

  private def translateJustification(just: JustificationContext): ST = {
    just match {
      case _: PremiseContext =>
        importJust = T
        st"Premise"
      case just: AndIntroContext =>
        importProp = T
        st"AndI(${just.lStep.getText}, ${just.rStep.getText})"
      case just: AndElimContext =>
        importProp = T
        val id = just.tb.getText match {
          case "ande1" => "AndE1"
          case "ande2" => "AndE2"
          case _ => if (just.ID.getText == "e1") "AndE1" else "AndE2"
        }
        st"$id(${just.andStep.getText})"
      case just: OrIntroContext =>
        importProp = T
        val id = just.tb.getText match {
          case "ori1" | "Vi1" => "OrI1"
          case "ori2" | "Vi2" => "OrI2"
          case _ => if (just.ID.getText == "i1") "OrI1" else "OrI2"
        }
        st"$id(${just.step.getText})"
      case just: OrElimContext =>
        importProp = T
        st"OrE(${just.orStep.getText}, ${just.lSubProof.getText}, ${just.rSubProof.getText})"
      case just: ImpliesIntroContext =>
        importProp = T
        st"ImplyI(${just.subProof.getText})"
      case just: ImpliesElimContext =>
        importProp = T
        st"ImplyE(${just.impliesStep.getText}, ${just.antecedentStep.getText})"
      case just: NegIntroContext =>
        importProp = T
        st"NegI(${just.subProof.getText})"
      case just: NegElimContext =>
        importProp = T
        st"NegE(${just.step.getText}, ${just.negStep.getText})"
      case just: BottomElimContext =>
        importProp = T
        st"BottomE(${just.bottomStep.getText})"
      case just: PbcContext =>
        importProp = T
        st"PbC(${just.subProof.getText})"
      case just: Subst1Context =>
        importJust = T
        st"Subst_<(${just.eqStep.getText}, ${just.step.getText})"
      case just: Subst2Context =>
        importJust = T
        st"Subst_>(${just.eqStep.getText}, ${just.step.getText})"
      case just: AlgebraContext =>
        importJust = T
        val steps = just.steps
        if (steps == null || steps.isEmpty) st"Algebra T"
        else st"Algebra*(${(for (i <- 0 until steps.size) yield steps.get(i).getText, ", ")})"
      case just: ForallIntroContext =>
        importPred = T
        st"AllI[T](${just.subProof.getText})"
      case just: ForallElimContext =>
        importPred = T
        st"AllE[T](${just.step.getText})"
      case just: ExistsIntroContext =>
        importPred = T
        st"ExistsI[T](${just.existsStep.getText})"
      case just: ExistsElimContext =>
        importPred = T
        st"ExistsE[T](${just.step.getText}, ${just.subProof.getText})"
      case _: InvariantContext =>
        importJust = T
        st"ClaimOf(id) // FIXME"
      case just: FctContext =>
        importJust = T
        st"ClaimOf(${just.ID.getText})"
      case just: AutoContext =>
        importJust = T
        val steps = just.steps
        if (steps == null || steps.isEmpty) st"Auto" else st"Auto*(${(for (i <- 0 until steps.size) yield steps.get(i).getText, ", ")})"
    }
  }

  private def translateStringOrExp(se: StringOrExpContext): ST = {
    se.getChild(0) match {
      case exp: ExpContext => translateExp(exp)
      case string: TerminalNode => st"${string.getText}"
    }
  }

  private def translateModifies(modifies: ModifiesContext, trailingComma: B): Option[ST] = {
    if (modifies == null || modifies.isEmpty) return None()
    val ids = modifies.ID
    Some(st"Modifies(${(for (i <- 0 until ids.size) yield ids.get(i).getText, ", ")})${if (trailingComma) "," else ""}")
  }

  private def translateFormula(formula: FormulaContext, resTypeOpt: Option[ST]): ST = {
    formula match {
      case formula: UnaryContext =>
        val op = formula.op.getText match {
          case "not" | "!" | "¬" => "!"
          case "neg" => "-"
          case nop => nop
        }
        var f = translateFormula(formula.formula, resTypeOpt)
        if (formula.formula.isInstanceOf[UnaryContext]) {
          f = st"($f)"
        }
        st"$op$f"
      case formula: BinaryContext =>
        val op = formula.op.getText match {
          case "≤" => "<="
          case "≥" => ">="
          case "≠" => "!="
          case "^" | "∧" | "and" => "&"
          case "xor" | "^|" => "|^"
          case "or" | "V" | "∨" => "|"
          case "implies" | "->" | "→" => implyOp
          case "=" => "=="
          case bop => bop
        }
        var left = translateFormula(formula.l, resTypeOpt)
        var right = translateFormula(formula.r, resTypeOpt)
        if (implyOp.value == "->:") {
          if (formula.l.isInstanceOf[BinaryContext] || formula.l.isInstanceOf[QuantContext]) {
            left = st"($left)"
          }
          if (formula.r.isInstanceOf[BinaryContext] || formula.r.isInstanceOf[QuantContext]) {
            right = st"($right)"
          }
        }
        st"$left $op $right"
      case formula: PFormulaContext =>
        val ids = formula.ID
        st"${translatePrimFormula(formula.primFormula, resTypeOpt)}${(for (i <- 0 until ids.size) yield st".${ids.get(i).getText}", "")}"
      case formula: QuantContext =>
        val op = formula.qformula.q.getText match {
          case "forall" | "all" | "A" | "∀" => "∀"
          case _ => "∃"
        }
        val ids = formula.qformula.vars
        val t = formula.qformula.`type`
        if (formula.qformula.lo != null) {
          var lo = translateFormula(formula.qformula.lo, resTypeOpt)
          if (formula.qformula.ll != null) {
            lo = st"$lo + 1"
          }
          val hi = translateFormula(formula.qformula.hi, resTypeOpt)
          val rop = if (formula.qformula.lh != null) "until" else "to"
          var r = st"$op($lo $rop $hi)(${ids.get(ids.size - 1).getText} => ${translateFormula(formula.qformula.qf, resTypeOpt)})"
          for (i <- ids.size - 2 to 0 by -1) {
            r = st"$op($lo $rop $hi)(${ids.get(i).getText} => $r)"
          }
          r
        } else {
          val tpe = if (t == null) "T" else translateType(t)
          st"$op{ (${(for (i <- 0 until ids.size) yield st"${ids.get(i).getText}: $tpe", ", ")}) => ${translateFormula(formula.qformula.qf, resTypeOpt)} }"
        }
    }
  }

  private def translateIdFormula(id: Predef.String): ST = {
    if (id.endsWith(oldSuffix)) {
      st"Old(${id.substring(0, id.length - oldSuffix.length)})"
    } else if (id.endsWith(inSuffix)) {
      st"In(${id.substring(0, id.length - inSuffix.length)})"
    } else {
      st"$id"
    }
  }

  private def translatePrimFormula(formula: PrimFormulaContext, resTypeOpt: Option[ST]): ST = {
    formula match {
      case _: ResultContext => st"Res[${resTypeOpt.get}]"
      case formula: VarContext => translateIdFormula(formula.tb.getText)
      case formula: IntContext => st"${formula.NUM.getText}"
      case formula: IntLitContext => st"${formula.INT.getText}"
      case formula: RLitContext => st"${formula.REAL.getText}"
      case formula: FloatLitContext => st"${formula.FLOAT.getText}"
      case formula: ParenContext => st"(${translateFormula(formula.formula, resTypeOpt)})"
      case formula: TypeAccessContext => st"${formula.t.getText}.${formula.ID.getText}"
      case formula: ApplyContext =>
        val args = formula.formula
        st"${translateIdFormula(formula.ID.getText)}(${(for (i <- 0 until args.size) yield translateFormula(args.get(i), resTypeOpt), ", ")})"
      case formula: ApplyResultContext =>
        val args = formula.formula
        st"Res[${resTypeOpt.get}](${(for (i <- 0 until args.size) yield translateFormula(args.get(i), resTypeOpt), ", ")})"
      case formula: BooleanContext =>
        formula.t.getText match {
          case "true" | "T" | "⊤" => st"T"
          case _ => st"F"
        }
      case formula: SeqContext =>
        val args = formula.exp
        st"${formula.t.getText}(${(for (i <- 0 until args.size) yield translateExp(args.get(i)), ", ")})"
    }
  }

  private def translateExp(exp: ExpContext): ST = {
    exp match {
      case _: RandomIntExpContext => st"Z.random"
      case exp: ReadIntExpContext => if (exp.STRING == null) st"Z.read()" else st"Z.prompt(${exp.STRING.getText})"
      case exp: ParenExpContext => st"(${translateExp(exp.exp)})"
      case exp: UnaryExpContext => st"${exp.op.getText}${translateExp(exp.exp)}"
      case exp: InvokeExpContext =>
        val args = exp.exp
        st"${exp.tb.getText}(${(for (i <- 0 until args.size) yield translateExp(args.get(i)), ", ")})"
      case exp: PExpContext =>
        val ids = exp.ID
        st"${translatePrimExp(exp.primExp)}${(for (i <- 0 until ids.size if ids.get(i).getText != "clone") yield st".${ids.get(i).getText}", "")}"
      case exp: BinaryExpContext =>
        val op = exp.op.getText match {
          case "^|" => "|^"
          case opText => opText
        }
        st"${translateExp(exp.l)} $op ${translateExp(exp.r)}"
    }
  }

  private def translatePrimExp(exp: PrimExpContext): ST = {
    exp match {
      case exp: IntExpContext => st"${exp.NUM.getText}"
      case exp: VarExpContext => st"${exp.ID.getText}"
      case exp: FloatLitExpContext => st"${exp.FLOAT.getText}"
      case exp: IntLitExpContext => st"${exp.INT.getText}"
      case exp: RLitExpContext => st"${exp.REAL.getText}"
      case exp: TypeAccessExpContext =>
        val t = exp.t.getText
        val f = exp.ID.getText
        st"$t.$f"
      case exp: BooleanExpContext =>
        exp.t.getText match {
          case "true" | "T" | "⊤" => st"T"
          case _ => st"F"
        }
      case exp: TypeMethodCallExpContext =>
        val args = exp.exp
        st"${exp.t.getText}.${exp.ID.getText}(${(for (i <- 0 until args.size) yield translateExp(args.get(i)), ", ")})"
      case exp: SeqExpContext =>
        val args = exp.exp
        st"${exp.t.getText}(${(for (i <- 0 until args.size) yield translateExp(args.get(i)), ", ")})"
    }
  }

  private def translateType(tpe: TypeContext): ST = {
    st"${tpe.getText}"
  }
}

