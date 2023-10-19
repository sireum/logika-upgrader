// Generated from /Users/robby/Repositories/Sireum/logika-upgrader/upgrader/src/main/java/Antlr4Logika.g4 by ANTLR 4.13.1

// @formatter:off

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Antlr4LogikaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Antlr4LogikaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code TruthTableFile}
	 * labeled alternative in {@link Antlr4LogikaParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruthTableFile(Antlr4LogikaParser.TruthTableFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SequentFile}
	 * labeled alternative in {@link Antlr4LogikaParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequentFile(Antlr4LogikaParser.SequentFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProgramFile}
	 * labeled alternative in {@link Antlr4LogikaParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramFile(Antlr4LogikaParser.ProgramFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#truthTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruthTable(Antlr4LogikaParser.TruthTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(Antlr4LogikaParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(Antlr4LogikaParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#status}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatus(Antlr4LogikaParser.StatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignments(Antlr4LogikaParser.AssignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#sequent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequent(Antlr4LogikaParser.SequentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#proof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProof(Antlr4LogikaParser.ProofContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Step}
	 * labeled alternative in {@link Antlr4LogikaParser#proofStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(Antlr4LogikaParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubProof}
	 * labeled alternative in {@link Antlr4LogikaParser#proofStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubProof(Antlr4LogikaParser.SubProofContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link Antlr4LogikaParser#primFormula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(Antlr4LogikaParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link Antlr4LogikaParser#primFormula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(Antlr4LogikaParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ApplyResult}
	 * labeled alternative in {@link Antlr4LogikaParser#primFormula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplyResult(Antlr4LogikaParser.ApplyResultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Result}
	 * labeled alternative in {@link Antlr4LogikaParser#primFormula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(Antlr4LogikaParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Apply}
	 * labeled alternative in {@link Antlr4LogikaParser#primFormula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApply(Antlr4LogikaParser.ApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link Antlr4LogikaParser#primFormula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(Antlr4LogikaParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link Antlr4LogikaParser#primFormula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(Antlr4LogikaParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLit}
	 * labeled alternative in {@link Antlr4LogikaParser#primFormula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLit(Antlr4LogikaParser.IntLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RLit}
	 * labeled alternative in {@link Antlr4LogikaParser#primFormula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRLit(Antlr4LogikaParser.RLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatLit}
	 * labeled alternative in {@link Antlr4LogikaParser#primFormula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLit(Antlr4LogikaParser.FloatLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAccess}
	 * labeled alternative in {@link Antlr4LogikaParser#primFormula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAccess(Antlr4LogikaParser.TypeAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Seq}
	 * labeled alternative in {@link Antlr4LogikaParser#primFormula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq(Antlr4LogikaParser.SeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PFormula}
	 * labeled alternative in {@link Antlr4LogikaParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPFormula(Antlr4LogikaParser.PFormulaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link Antlr4LogikaParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(Antlr4LogikaParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link Antlr4LogikaParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(Antlr4LogikaParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Quant}
	 * labeled alternative in {@link Antlr4LogikaParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuant(Antlr4LogikaParser.QuantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#qformula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQformula(Antlr4LogikaParser.QformulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Antlr4LogikaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Premise}
	 * labeled alternative in {@link Antlr4LogikaParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPremise(Antlr4LogikaParser.PremiseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndIntro}
	 * labeled alternative in {@link Antlr4LogikaParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndIntro(Antlr4LogikaParser.AndIntroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndElim}
	 * labeled alternative in {@link Antlr4LogikaParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndElim(Antlr4LogikaParser.AndElimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrIntro}
	 * labeled alternative in {@link Antlr4LogikaParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrIntro(Antlr4LogikaParser.OrIntroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrElim}
	 * labeled alternative in {@link Antlr4LogikaParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrElim(Antlr4LogikaParser.OrElimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImpliesIntro}
	 * labeled alternative in {@link Antlr4LogikaParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpliesIntro(Antlr4LogikaParser.ImpliesIntroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImpliesElim}
	 * labeled alternative in {@link Antlr4LogikaParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpliesElim(Antlr4LogikaParser.ImpliesElimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegIntro}
	 * labeled alternative in {@link Antlr4LogikaParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegIntro(Antlr4LogikaParser.NegIntroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegElim}
	 * labeled alternative in {@link Antlr4LogikaParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegElim(Antlr4LogikaParser.NegElimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BottomElim}
	 * labeled alternative in {@link Antlr4LogikaParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBottomElim(Antlr4LogikaParser.BottomElimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pbc}
	 * labeled alternative in {@link Antlr4LogikaParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPbc(Antlr4LogikaParser.PbcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subst1}
	 * labeled alternative in {@link Antlr4LogikaParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubst1(Antlr4LogikaParser.Subst1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Subst2}
	 * labeled alternative in {@link Antlr4LogikaParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubst2(Antlr4LogikaParser.Subst2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Algebra}
	 * labeled alternative in {@link Antlr4LogikaParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgebra(Antlr4LogikaParser.AlgebraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForallIntro}
	 * labeled alternative in {@link Antlr4LogikaParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForallIntro(Antlr4LogikaParser.ForallIntroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForallElim}
	 * labeled alternative in {@link Antlr4LogikaParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForallElim(Antlr4LogikaParser.ForallElimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExistsIntro}
	 * labeled alternative in {@link Antlr4LogikaParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsIntro(Antlr4LogikaParser.ExistsIntroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExistsElim}
	 * labeled alternative in {@link Antlr4LogikaParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsElim(Antlr4LogikaParser.ExistsElimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Invariant}
	 * labeled alternative in {@link Antlr4LogikaParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvariant(Antlr4LogikaParser.InvariantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fct}
	 * labeled alternative in {@link Antlr4LogikaParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFct(Antlr4LogikaParser.FctContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Auto}
	 * labeled alternative in {@link Antlr4LogikaParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto(Antlr4LogikaParser.AutoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Antlr4LogikaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#impor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpor(Antlr4LogikaParser.ImporContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#facts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFacts(Antlr4LogikaParser.FactsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#factOrFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactOrFun(Antlr4LogikaParser.FactOrFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact(Antlr4LogikaParser.FactContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun(Antlr4LogikaParser.FunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunDefConds}
	 * labeled alternative in {@link Antlr4LogikaParser#funDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDefConds(Antlr4LogikaParser.FunDefCondsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunDefEq}
	 * labeled alternative in {@link Antlr4LogikaParser#funDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDefEq(Antlr4LogikaParser.FunDefEqContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#funDefCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDefCond(Antlr4LogikaParser.FunDefCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#funDefSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDefSimple(Antlr4LogikaParser.FunDefSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(Antlr4LogikaParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(Antlr4LogikaParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclStmt}
	 * labeled alternative in {@link Antlr4LogikaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclStmt(Antlr4LogikaParser.VarDeclStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignVarStmt}
	 * labeled alternative in {@link Antlr4LogikaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVarStmt(Antlr4LogikaParser.AssignVarStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssumeStmt}
	 * labeled alternative in {@link Antlr4LogikaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssumeStmt(Antlr4LogikaParser.AssumeStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssertStmt}
	 * labeled alternative in {@link Antlr4LogikaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStmt(Antlr4LogikaParser.AssertStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link Antlr4LogikaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(Antlr4LogikaParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link Antlr4LogikaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(Antlr4LogikaParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStmt}
	 * labeled alternative in {@link Antlr4LogikaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(Antlr4LogikaParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SeqAssignStmt}
	 * labeled alternative in {@link Antlr4LogikaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqAssignStmt(Antlr4LogikaParser.SeqAssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodDeclStmt}
	 * labeled alternative in {@link Antlr4LogikaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclStmt(Antlr4LogikaParser.MethodDeclStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogikaStmt}
	 * labeled alternative in {@link Antlr4LogikaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogikaStmt(Antlr4LogikaParser.LogikaStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link Antlr4LogikaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmt(Antlr4LogikaParser.ImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpStmt}
	 * labeled alternative in {@link Antlr4LogikaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpStmt(Antlr4LogikaParser.ExpStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(Antlr4LogikaParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#blockEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockEnd(Antlr4LogikaParser.BlockEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(Antlr4LogikaParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#stringOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringOrExp(Antlr4LogikaParser.StringOrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanExp}
	 * labeled alternative in {@link Antlr4LogikaParser#primExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExp(Antlr4LogikaParser.BooleanExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntExp}
	 * labeled alternative in {@link Antlr4LogikaParser#primExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExp(Antlr4LogikaParser.IntExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarExp}
	 * labeled alternative in {@link Antlr4LogikaParser#primExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExp(Antlr4LogikaParser.VarExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeMethodCallExp}
	 * labeled alternative in {@link Antlr4LogikaParser#primExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeMethodCallExp(Antlr4LogikaParser.TypeMethodCallExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAccessExp}
	 * labeled alternative in {@link Antlr4LogikaParser#primExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAccessExp(Antlr4LogikaParser.TypeAccessExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatLitExp}
	 * labeled alternative in {@link Antlr4LogikaParser#primExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLitExp(Antlr4LogikaParser.FloatLitExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLitExp}
	 * labeled alternative in {@link Antlr4LogikaParser#primExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLitExp(Antlr4LogikaParser.IntLitExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RLitExp}
	 * labeled alternative in {@link Antlr4LogikaParser#primExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRLitExp(Antlr4LogikaParser.RLitExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SeqExp}
	 * labeled alternative in {@link Antlr4LogikaParser#primExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqExp(Antlr4LogikaParser.SeqExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InvokeExp}
	 * labeled alternative in {@link Antlr4LogikaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeExp(Antlr4LogikaParser.InvokeExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link Antlr4LogikaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExp(Antlr4LogikaParser.ParenExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PExp}
	 * labeled alternative in {@link Antlr4LogikaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPExp(Antlr4LogikaParser.PExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadIntExp}
	 * labeled alternative in {@link Antlr4LogikaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadIntExp(Antlr4LogikaParser.ReadIntExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RandomIntExp}
	 * labeled alternative in {@link Antlr4LogikaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandomIntExp(Antlr4LogikaParser.RandomIntExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link Antlr4LogikaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp(Antlr4LogikaParser.UnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link Antlr4LogikaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExp(Antlr4LogikaParser.BinaryExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#loopInvariant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopInvariant(Antlr4LogikaParser.LoopInvariantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#modifies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifies(Antlr4LogikaParser.ModifiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#methodContract}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodContract(Antlr4LogikaParser.MethodContractContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4LogikaParser#invariants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvariants(Antlr4LogikaParser.InvariantsContext ctx);
}