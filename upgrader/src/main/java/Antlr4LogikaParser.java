// Generated from /Users/robby/Repositories/Sireum/logika-upgrader/upgrader/src/main/java/Antlr4Logika.g4 by ANTLR 4.13.1

// @formatter:off

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Antlr4LogikaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, T__128=129, T__129=130, T__130=131, 
		T__131=132, T__132=133, T__133=134, T__134=135, T__135=136, T__136=137, 
		T__137=138, T__138=139, T__139=140, T__140=141, T__141=142, T__142=143, 
		T__143=144, T__144=145, T__145=146, T__146=147, T__147=148, T__148=149, 
		T__149=150, T__150=151, T__151=152, T__152=153, T__153=154, T__154=155, 
		T__155=156, T__156=157, T__157=158, T__158=159, T__159=160, T__160=161, 
		T__161=162, T__162=163, T__163=164, T__164=165, T__165=166, T__166=167, 
		T__167=168, T__168=169, T__169=170, T__170=171, HLINE=172, NUM=173, ID=174, 
		REAL=175, INT=176, RESERVED=177, NL=178, LINE_COMMENT=179, COMMENT=180, 
		TAB=181, WS=182, STRING=183, FLOAT=184, ERROR_CHAR=185;
	public static final int
		RULE_file = 0, RULE_truthTable = 1, RULE_row = 2, RULE_bool = 3, RULE_status = 4, 
		RULE_assignments = 5, RULE_sequent = 6, RULE_proof = 7, RULE_proofStep = 8, 
		RULE_primFormula = 9, RULE_formula = 10, RULE_qformula = 11, RULE_type = 12, 
		RULE_justification = 13, RULE_program = 14, RULE_impor = 15, RULE_facts = 16, 
		RULE_factOrFun = 17, RULE_fact = 18, RULE_fun = 19, RULE_funDef = 20, 
		RULE_funDefCond = 21, RULE_funDefSimple = 22, RULE_param = 23, RULE_stmts = 24, 
		RULE_stmt = 25, RULE_methodDecl = 26, RULE_blockEnd = 27, RULE_returnStmt = 28, 
		RULE_stringOrExp = 29, RULE_primExp = 30, RULE_exp = 31, RULE_loopInvariant = 32, 
		RULE_modifies = 33, RULE_methodContract = 34, RULE_invariants = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "truthTable", "row", "bool", "status", "assignments", "sequent", 
			"proof", "proofStep", "primFormula", "formula", "qformula", "type", "justification", 
			"program", "impor", "facts", "factOrFun", "fact", "fun", "funDef", "funDefCond", 
			"funDefSimple", "param", "stmts", "stmt", "methodDecl", "blockEnd", "returnStmt", 
			"stringOrExp", "primExp", "exp", "loopInvariant", "modifies", "methodContract", 
			"invariants"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'|'", "'T'", "'\\u22A4'", "'F'", "'\\u22A5'", "'-'", "':'", 
			"'['", "']'", "','", "'|-'", "'\\u22A2'", "'{'", "'}'", "'.'", "'assume'", 
			"'true'", "'false'", "'_|_'", "'('", "')'", "'result'", "'B'", "'Z'", 
			"'Z8'", "'Z16'", "'Z32'", "'Z64'", "'N'", "'N8'", "'N16'", "'N32'", "'N64'", 
			"'S8'", "'S16'", "'S32'", "'S64'", "'U8'", "'U16'", "'U32'", "'U64'", 
			"'R'", "'F32'", "'F64'", "'BS'", "'ZS'", "'Z8S'", "'Z16S'", "'Z32S'", 
			"'Z64S'", "'NS'", "'N8S'", "'N16S'", "'N32S'", "'N64S'", "'S8S'", "'S16S'", 
			"'S32S'", "'S64S'", "'U8S'", "'U16S'", "'U32S'", "'U64S'", "'RS'", "'F32S'", 
			"'F64S'", "'not'", "'neg'", "'!'", "'~'", "'\\u00AC'", "'/'", "'%'", 
			"'+'", "'+:'", "':+'", "'<'", "'<='", "'\\u2264'", "'>'", "'>='", "'\\u2265'", 
			"'>>'", "'>>>'", "'<<'", "'='", "'=='", "'!='", "'\\u2260'", "'and'", 
			"'&'", "'^'", "'\\u2227'", "'xor'", "'^|'", "'or'", "'V'", "'\\u2228'", 
			"'implies'", "'->'", "'\\u2192'", "'forall'", "'all'", "'A'", "'\\u2200'", 
			"'exists'", "'some'", "'E'", "'\\u2203'", "'..'", "'premise'", "'andi'", 
			"'ande1'", "'ande2'", "'ori1'", "'Vi1'", "'ori2'", "'Vi2'", "'ore'", 
			"'Ve'", "'impliesi'", "'impliese'", "'noti'", "'negi'", "'note'", "'nege'", 
			"'bottome'", "'falsee'", "'pbc'", "'subst1'", "'subst2'", "'algebra'", 
			"'foralli'", "'alli'", "'Ai'", "'foralle'", "'alle'", "'Ae'", "'existsi'", 
			"'somei'", "'Ei'", "'existse'", "'somee'", "'Ee'", "'invariant'", "'fact'", 
			"'auto'", "'import'", "'_'", "'def'", "'if'", "'var'", "'val'", "'assert'", 
			"'else'", "'while'", "'l\"\"\"'", "'\"\"\"'", "'print'", "'println'", 
			"'@'", "'Unit'", "'return'", "'randomInt'", "'readInt'", "'modifies'", 
			"'requires'", "'pre'", "'ensures'", "'post'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "HLINE", "NUM", "ID", "REAL", "INT", "RESERVED", 
			"NL", "LINE_COMMENT", "COMMENT", "TAB", "WS", "STRING", "FLOAT", "ERROR_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Antlr4Logika.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Antlr4LogikaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
	 
		public FileContext() { }
		public void copyFrom(FileContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TruthTableFileContext extends FileContext {
		public TruthTableContext truthTable() {
			return getRuleContext(TruthTableContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Antlr4LogikaParser.EOF, 0); }
		public TruthTableFileContext(FileContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitTruthTableFile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SequentFileContext extends FileContext {
		public SequentContext sequent() {
			return getRuleContext(SequentContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Antlr4LogikaParser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public ProofContext proof() {
			return getRuleContext(ProofContext.class,0);
		}
		public SequentFileContext(FileContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitSequentFile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgramFileContext extends FileContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Antlr4LogikaParser.EOF, 0); }
		public ProgramFileContext(FileContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitProgramFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			int _alt;
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new TruthTableFileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				truthTable();
				setState(73);
				match(EOF);
				}
				break;
			case 2:
				_localctx = new SequentFileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(75);
					match(NL);
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(81);
				sequent();
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(82);
						match(NL);
						}
						} 
					}
					setState(87);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(88);
					proof();
					}
				}

				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(91);
					match(NL);
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(97);
				match(EOF);
				}
				break;
			case 3:
				_localctx = new ProgramFileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				program();
				setState(100);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TruthTableContext extends ParserRuleContext {
		public Token star;
		public Token ID;
		public List<Token> vars = new ArrayList<Token>();
		public Token bar;
		public List<TerminalNode> HLINE() { return getTokens(Antlr4LogikaParser.HLINE); }
		public TerminalNode HLINE(int i) {
			return getToken(Antlr4LogikaParser.HLINE, i);
		}
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public StatusContext status() {
			return getRuleContext(StatusContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(Antlr4LogikaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Antlr4LogikaParser.ID, i);
		}
		public TruthTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truthTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitTruthTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruthTableContext truthTable() throws RecognitionException {
		TruthTableContext _localctx = new TruthTableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_truthTable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(104);
				match(NL);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			((TruthTableContext)_localctx).star = match(T__0);
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				match(NL);
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL );
			setState(116);
			match(HLINE);
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(117);
				match(NL);
				}
				}
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL );
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				((TruthTableContext)_localctx).ID = match(ID);
				((TruthTableContext)_localctx).vars.add(((TruthTableContext)_localctx).ID);
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(127);
			((TruthTableContext)_localctx).bar = match(T__1);
			setState(128);
			formula(0);
			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				match(NL);
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL );
			setState(134);
			match(HLINE);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(135);
						match(NL);
						}
						}
						setState(138); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NL );
					setState(140);
					row();
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				match(NL);
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL );
			setState(151);
			match(HLINE);
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(152);
					match(NL);
					}
					}
					setState(155); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				setState(157);
				status();
				}
				break;
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(160);
				match(NL);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RowContext extends ParserRuleContext {
		public BoolContext bool;
		public List<BoolContext> model = new ArrayList<BoolContext>();
		public Token bar;
		public List<BoolContext> eval = new ArrayList<BoolContext>();
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120L) != 0)) {
				{
				{
				setState(166);
				((RowContext)_localctx).bool = bool();
				((RowContext)_localctx).model.add(((RowContext)_localctx).bool);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			((RowContext)_localctx).bar = match(T__1);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120L) != 0)) {
				{
				{
				setState(173);
				((RowContext)_localctx).bool = bool();
				((RowContext)_localctx).eval.add(((RowContext)_localctx).bool);
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ParserRuleContext {
		public Token t;
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			((BoolContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120L) != 0)) ) {
				((BoolContext)_localctx).t = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatusContext extends ParserRuleContext {
		public Token t;
		public AssignmentsContext assignments;
		public List<AssignmentsContext> tContingentAssignments = new ArrayList<AssignmentsContext>();
		public List<AssignmentsContext> fContingentAssignments = new ArrayList<AssignmentsContext>();
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public List<AssignmentsContext> assignments() {
			return getRuleContexts(AssignmentsContext.class);
		}
		public AssignmentsContext assignments(int i) {
			return getRuleContext(AssignmentsContext.class,i);
		}
		public StatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_status; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitStatus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatusContext status() throws RecognitionException {
		StatusContext _localctx = new StatusContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_status);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(ID);
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(182);
					match(NL);
					}
					}
					setState(185); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				setState(187);
				((StatusContext)_localctx).t = match(T__6);
				setState(188);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(189);
				match(T__7);
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(193);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(190);
							match(NL);
							}
							}
							setState(195);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(196);
						((StatusContext)_localctx).assignments = assignments();
						((StatusContext)_localctx).tContingentAssignments.add(((StatusContext)_localctx).assignments);
						}
						} 
					}
					setState(201);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(202);
					match(NL);
					}
					}
					setState(205); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				setState(207);
				match(T__6);
				setState(208);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__5) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(209);
				match(T__7);
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(213);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(210);
							match(NL);
							}
							}
							setState(215);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(216);
						((StatusContext)_localctx).assignments = assignments();
						((StatusContext)_localctx).fContingentAssignments.add(((StatusContext)_localctx).assignments);
						}
						} 
					}
					setState(221);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentsContext extends ParserRuleContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public AssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitAssignments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentsContext assignments() throws RecognitionException {
		AssignmentsContext _localctx = new AssignmentsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__8);
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(225);
				bool();
				}
				}
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 120L) != 0) );
			setState(230);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SequentContext extends ParserRuleContext {
		public FormulaContext formula;
		public List<FormulaContext> premises = new ArrayList<FormulaContext>();
		public List<FormulaContext> conclusions = new ArrayList<FormulaContext>();
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public TerminalNode HLINE() { return getToken(Antlr4LogikaParser.HLINE, 0); }
		public SequentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitSequent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequentContext sequent() throws RecognitionException {
		SequentContext _localctx = new SequentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sequent);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4456200L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 140187732541951L) != 0) || ((((_la - 173)) & ~0x3f) == 0 && ((1L << (_la - 173)) & 2063L) != 0)) {
					{
					setState(232);
					((SequentContext)_localctx).formula = formula(0);
					((SequentContext)_localctx).premises.add(((SequentContext)_localctx).formula);
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(233);
						match(T__10);
						setState(234);
						((SequentContext)_localctx).formula = formula(0);
						((SequentContext)_localctx).premises.add(((SequentContext)_localctx).formula);
						}
						}
						setState(239);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(242);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(243);
				((SequentContext)_localctx).formula = formula(0);
				((SequentContext)_localctx).conclusions.add(((SequentContext)_localctx).formula);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(244);
					match(T__10);
					setState(245);
					((SequentContext)_localctx).formula = formula(0);
					((SequentContext)_localctx).conclusions.add(((SequentContext)_localctx).formula);
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4456200L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 140187732541951L) != 0) || ((((_la - 173)) & ~0x3f) == 0 && ((1L << (_la - 173)) & 2063L) != 0)) {
					{
					{
					setState(251);
					((SequentContext)_localctx).formula = formula(0);
					((SequentContext)_localctx).premises.add(((SequentContext)_localctx).formula);
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
				match(HLINE);
				setState(259); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(258);
					((SequentContext)_localctx).formula = formula(0);
					((SequentContext)_localctx).conclusions.add(((SequentContext)_localctx).formula);
					}
					}
					setState(261); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -4456200L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 140187732541951L) != 0) || ((((_la - 173)) & ~0x3f) == 0 && ((1L << (_la - 173)) & 2063L) != 0) );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProofContext extends ParserRuleContext {
		public Token tb;
		public Token te;
		public List<ProofStepContext> proofStep() {
			return getRuleContexts(ProofStepContext.class);
		}
		public ProofStepContext proofStep(int i) {
			return getRuleContext(ProofStepContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public ProofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proof; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitProof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProofContext proof() throws RecognitionException {
		ProofContext _localctx = new ProofContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_proof);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			((ProofContext)_localctx).tb = match(T__13);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(266);
				proofStep();
				}
			}

			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(270); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(269);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(272); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUM) {
					{
					setState(274);
					proofStep();
					}
				}

				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			((ProofContext)_localctx).te = match(T__14);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(283);
					match(NL);
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProofStepContext extends ParserRuleContext {
		public ProofStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proofStep; }
	 
		public ProofStepContext() { }
		public void copyFrom(ProofStepContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubProofContext extends ProofStepContext {
		public Token sub;
		public Token assume;
		public Token ate;
		public List<TerminalNode> NUM() { return getTokens(Antlr4LogikaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Antlr4LogikaParser.NUM, i);
		}
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ProofStepContext> proofStep() {
			return getRuleContexts(ProofStepContext.class);
		}
		public ProofStepContext proofStep(int i) {
			return getRuleContext(ProofStepContext.class,i);
		}
		public SubProofContext(ProofStepContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitSubProof(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StepContext extends ProofStepContext {
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public JustificationContext justification() {
			return getRuleContext(JustificationContext.class,0);
		}
		public StepContext(ProofStepContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProofStepContext proofStep() throws RecognitionException {
		ProofStepContext _localctx = new ProofStepContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_proofStep);
		int _la;
		try {
			int _alt;
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new StepContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(NUM);
				setState(290);
				match(T__15);
				setState(291);
				formula(0);
				setState(292);
				justification();
				}
				break;
			case 2:
				_localctx = new SubProofContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				((SubProofContext)_localctx).sub = match(NUM);
				setState(295);
				match(T__15);
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(296);
					match(NL);
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(302);
				match(T__13);
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(303);
					match(NL);
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(309);
				((SubProofContext)_localctx).assume = match(NUM);
				setState(310);
				match(T__15);
				setState(327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(311);
					match(ID);
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(312);
						match(T__7);
						setState(313);
						type();
						}
					}

					}
					break;
				case 2:
					{
					setState(316);
					formula(0);
					setState(317);
					((SubProofContext)_localctx).ate = match(T__16);
					}
					break;
				case 3:
					{
					setState(319);
					match(ID);
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(320);
						match(T__7);
						setState(321);
						type();
						}
					}

					setState(324);
					formula(0);
					setState(325);
					((SubProofContext)_localctx).ate = match(T__16);
					}
					break;
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(330); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(329);
							match(NL);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(332); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NUM) {
						{
						setState(334);
						proofStep();
						}
					}

					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(342);
				match(T__14);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimFormulaContext extends ParserRuleContext {
		public PrimFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primFormula; }
	 
		public PrimFormulaContext() { }
		public void copyFrom(PrimFormulaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatLitContext extends PrimFormulaContext {
		public TerminalNode FLOAT() { return getToken(Antlr4LogikaParser.FLOAT, 0); }
		public FloatLitContext(PrimFormulaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitFloatLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RLitContext extends PrimFormulaContext {
		public TerminalNode REAL() { return getToken(Antlr4LogikaParser.REAL, 0); }
		public RLitContext(PrimFormulaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitRLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ApplyContext extends PrimFormulaContext {
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ApplyContext(PrimFormulaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitApply(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends PrimFormulaContext {
		public Token tb;
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public VarContext(PrimFormulaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAccessContext extends PrimFormulaContext {
		public Token t;
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public TypeAccessContext(PrimFormulaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitTypeAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends PrimFormulaContext {
		public Token t;
		public BooleanContext(PrimFormulaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ApplyResultContext extends PrimFormulaContext {
		public Token tb;
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ApplyResultContext(PrimFormulaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitApplyResult(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLitContext extends PrimFormulaContext {
		public TerminalNode INT() { return getToken(Antlr4LogikaParser.INT, 0); }
		public IntLitContext(PrimFormulaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitIntLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends PrimFormulaContext {
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public IntContext(PrimFormulaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SeqContext extends PrimFormulaContext {
		public Token t;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public SeqContext(PrimFormulaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitSeq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenContext extends PrimFormulaContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public ParenContext(PrimFormulaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ResultContext extends PrimFormulaContext {
		public ResultContext(PrimFormulaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimFormulaContext primFormula() throws RecognitionException {
		PrimFormulaContext _localctx = new PrimFormulaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_primFormula);
		int _la;
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				((BooleanContext)_localctx).t = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835128L) != 0)) ) {
					((BooleanContext)_localctx).t = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				_localctx = new ParenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(T__20);
				setState(347);
				formula(0);
				setState(348);
				match(T__21);
				}
				break;
			case 3:
				_localctx = new ApplyResultContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				((ApplyResultContext)_localctx).tb = match(T__22);
				setState(351);
				match(T__20);
				setState(352);
				formula(0);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(353);
					match(T__10);
					setState(354);
					formula(0);
					}
					}
					setState(359);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(360);
				match(T__21);
				}
				break;
			case 4:
				_localctx = new ResultContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				match(T__22);
				}
				break;
			case 5:
				_localctx = new ApplyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(363);
				match(ID);
				setState(364);
				match(T__20);
				setState(365);
				formula(0);
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(366);
					match(T__10);
					setState(367);
					formula(0);
					}
					}
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(373);
				match(T__21);
				}
				break;
			case 6:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(375);
				((VarContext)_localctx).tb = match(ID);
				}
				break;
			case 7:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(376);
				match(NUM);
				}
				break;
			case 8:
				_localctx = new IntLitContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(377);
				match(INT);
				}
				break;
			case 9:
				_localctx = new RLitContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(378);
				match(REAL);
				}
				break;
			case 10:
				_localctx = new FloatLitContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(379);
				match(FLOAT);
				}
				break;
			case 11:
				_localctx = new TypeAccessContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(380);
				((TypeAccessContext)_localctx).t = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 70368727400448L) != 0)) ) {
					((TypeAccessContext)_localctx).t = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(381);
				match(T__15);
				setState(382);
				match(ID);
				}
				break;
			case 12:
				_localctx = new SeqContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(383);
				((SeqContext)_localctx).t = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 4194303L) != 0)) ) {
					((SeqContext)_localctx).t = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(384);
				match(T__20);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -12844808L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 207L) != 0) || ((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & 528131L) != 0)) {
					{
					setState(385);
					exp(0);
					setState(390);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(386);
						match(T__10);
						setState(387);
						exp(0);
						}
						}
						setState(392);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(395);
				match(T__21);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormulaContext extends ParserRuleContext {
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
	 
		public FormulaContext() { }
		public void copyFrom(FormulaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PFormulaContext extends FormulaContext {
		public PrimFormulaContext primFormula() {
			return getRuleContext(PrimFormulaContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(Antlr4LogikaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Antlr4LogikaParser.ID, i);
		}
		public PFormulaContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitPFormula(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryContext extends FormulaContext {
		public FormulaContext l;
		public Token op;
		public FormulaContext r;
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public TerminalNode NL() { return getToken(Antlr4LogikaParser.NL, 0); }
		public BinaryContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryContext extends FormulaContext {
		public Token op;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public UnaryContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuantContext extends FormulaContext {
		public QformulaContext qformula() {
			return getRuleContext(QformulaContext.class,0);
		}
		public QuantContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitQuant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		return formula(0);
	}

	private FormulaContext formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FormulaContext _localctx = new FormulaContext(_ctx, _parentState);
		FormulaContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_formula, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case NUM:
			case ID:
			case REAL:
			case INT:
			case FLOAT:
				{
				_localctx = new PFormulaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(399);
				primFormula();
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(400);
						match(T__15);
						setState(401);
						match(ID);
						}
						} 
					}
					setState(406);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				}
				break;
			case T__6:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(407);
				((UnaryContext)_localctx).op = match(T__6);
				setState(408);
				formula(13);
				}
				break;
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(409);
				((UnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 31L) != 0)) ) {
					((UnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(410);
				formula(12);
				}
				break;
			case T__102:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__108:
			case T__109:
				{
				_localctx = new QuantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(411);
				qformula();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(474);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryContext(new FormulaContext(_parentctx, _parentState));
						((BinaryContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(414);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(415);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__72 || _la==T__73) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(417);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(416);
							match(NL);
							}
						}

						setState(419);
						((BinaryContext)_localctx).r = formula(12);
						}
						break;
					case 2:
						{
						_localctx = new BinaryContext(new FormulaContext(_parentctx, _parentState));
						((BinaryContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(420);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(421);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__74) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(423);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(422);
							match(NL);
							}
						}

						setState(425);
						((BinaryContext)_localctx).r = formula(11);
						}
						break;
					case 3:
						{
						_localctx = new BinaryContext(new FormulaContext(_parentctx, _parentState));
						((BinaryContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(426);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(427);
						((BinaryContext)_localctx).op = match(T__75);
						setState(429);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(428);
							match(NL);
							}
						}

						setState(431);
						((BinaryContext)_localctx).r = formula(9);
						}
						break;
					case 4:
						{
						_localctx = new BinaryContext(new FormulaContext(_parentctx, _parentState));
						((BinaryContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(432);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(433);
						((BinaryContext)_localctx).op = match(T__76);
						setState(435);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(434);
							match(NL);
							}
						}

						setState(437);
						((BinaryContext)_localctx).r = formula(9);
						}
						break;
					case 5:
						{
						_localctx = new BinaryContext(new FormulaContext(_parentctx, _parentState));
						((BinaryContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(438);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(439);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 511L) != 0)) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(441);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(440);
							match(NL);
							}
						}

						setState(443);
						((BinaryContext)_localctx).r = formula(8);
						}
						break;
					case 6:
						{
						_localctx = new BinaryContext(new FormulaContext(_parentctx, _parentState));
						((BinaryContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(444);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(445);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 15L) != 0)) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(447);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(446);
							match(NL);
							}
						}

						setState(449);
						((BinaryContext)_localctx).r = formula(7);
						}
						break;
					case 7:
						{
						_localctx = new BinaryContext(new FormulaContext(_parentctx, _parentState));
						((BinaryContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(450);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(451);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 15L) != 0)) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(453);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(452);
							match(NL);
							}
						}

						setState(455);
						((BinaryContext)_localctx).r = formula(6);
						}
						break;
					case 8:
						{
						_localctx = new BinaryContext(new FormulaContext(_parentctx, _parentState));
						((BinaryContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(456);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(457);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__94 || _la==T__95) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(459);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(458);
							match(NL);
							}
						}

						setState(461);
						((BinaryContext)_localctx).r = formula(5);
						}
						break;
					case 9:
						{
						_localctx = new BinaryContext(new FormulaContext(_parentctx, _parentState));
						((BinaryContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(462);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(463);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__1 || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 7L) != 0)) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(465);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(464);
							match(NL);
							}
						}

						setState(467);
						((BinaryContext)_localctx).r = formula(4);
						}
						break;
					case 10:
						{
						_localctx = new BinaryContext(new FormulaContext(_parentctx, _parentState));
						((BinaryContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(468);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(469);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 7L) != 0)) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(471);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(470);
							match(NL);
							}
						}

						setState(473);
						((BinaryContext)_localctx).r = formula(2);
						}
						break;
					}
					} 
				}
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QformulaContext extends ParserRuleContext {
		public Token q;
		public Token ID;
		public List<Token> vars = new ArrayList<Token>();
		public FormulaContext lo;
		public Token ll;
		public Token lh;
		public FormulaContext hi;
		public FormulaContext qf;
		public List<TerminalNode> ID() { return getTokens(Antlr4LogikaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Antlr4LogikaParser.ID, i);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NL() { return getToken(Antlr4LogikaParser.NL, 0); }
		public QformulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qformula; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitQformula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QformulaContext qformula() throws RecognitionException {
		QformulaContext _localctx = new QformulaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_qformula);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			((QformulaContext)_localctx).q = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 255L) != 0)) ) {
				((QformulaContext)_localctx).q = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(480);
			((QformulaContext)_localctx).ID = match(ID);
			((QformulaContext)_localctx).vars.add(((QformulaContext)_localctx).ID);
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(481);
				match(T__10);
				setState(482);
				((QformulaContext)_localctx).ID = match(ID);
				((QformulaContext)_localctx).vars.add(((QformulaContext)_localctx).ID);
				}
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(488);
				match(T__7);
				setState(489);
				type();
				}
				break;
			case 2:
				{
				setState(490);
				match(T__7);
				setState(491);
				match(T__20);
				setState(492);
				((QformulaContext)_localctx).lo = formula(0);
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__77) {
					{
					setState(493);
					((QformulaContext)_localctx).ll = match(T__77);
					}
				}

				setState(496);
				match(T__110);
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__77) {
					{
					setState(497);
					((QformulaContext)_localctx).lh = match(T__77);
					}
				}

				setState(500);
				((QformulaContext)_localctx).hi = formula(0);
				setState(501);
				match(T__21);
				}
				break;
			}
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(505);
				match(NL);
				}
			}

			setState(508);
			((QformulaContext)_localctx).qf = formula(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Token t;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			((TypeContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & 17592186044415L) != 0)) ) {
				((TypeContext)_localctx).t = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JustificationContext extends ParserRuleContext {
		public JustificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_justification; }
	 
		public JustificationContext() { }
		public void copyFrom(JustificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InvariantContext extends JustificationContext {
		public Token tb;
		public InvariantContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitInvariant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForallElimContext extends JustificationContext {
		public Token tb;
		public Token step;
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public ForallElimContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitForallElim(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExistsIntroContext extends JustificationContext {
		public Token tb;
		public Token existsStep;
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public ExistsIntroContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitExistsIntro(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndIntroContext extends JustificationContext {
		public Token tb;
		public Token lStep;
		public Token rStep;
		public List<TerminalNode> NUM() { return getTokens(Antlr4LogikaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Antlr4LogikaParser.NUM, i);
		}
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public AndIntroContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitAndIntro(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrIntroContext extends JustificationContext {
		public Token tb;
		public Token step;
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public OrIntroContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitOrIntro(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForallIntroContext extends JustificationContext {
		public Token tb;
		public Token subProof;
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public ForallIntroContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitForallIntro(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExistsElimContext extends JustificationContext {
		public Token tb;
		public Token step;
		public Token subProof;
		public Token t;
		public List<TerminalNode> NUM() { return getTokens(Antlr4LogikaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Antlr4LogikaParser.NUM, i);
		}
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public ExistsElimContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitExistsElim(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImpliesElimContext extends JustificationContext {
		public Token tb;
		public Token impliesStep;
		public Token antecedentStep;
		public List<TerminalNode> NUM() { return getTokens(Antlr4LogikaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Antlr4LogikaParser.NUM, i);
		}
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public ImpliesElimContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitImpliesElim(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PremiseContext extends JustificationContext {
		public Token t;
		public PremiseContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitPremise(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndElimContext extends JustificationContext {
		public Token tb;
		public Token andStep;
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public AndElimContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitAndElim(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegIntroContext extends JustificationContext {
		public Token tb;
		public Token subProof;
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public NegIntroContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitNegIntro(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegElimContext extends JustificationContext {
		public Token tb;
		public Token step;
		public Token negStep;
		public List<TerminalNode> NUM() { return getTokens(Antlr4LogikaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Antlr4LogikaParser.NUM, i);
		}
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public NegElimContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitNegElim(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PbcContext extends JustificationContext {
		public Token tb;
		public Token subProof;
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public PbcContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitPbc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Subst2Context extends JustificationContext {
		public Token tb;
		public Token eqStep;
		public Token step;
		public List<TerminalNode> NUM() { return getTokens(Antlr4LogikaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Antlr4LogikaParser.NUM, i);
		}
		public Subst2Context(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitSubst2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AutoContext extends JustificationContext {
		public Token tb;
		public Token NUM;
		public List<Token> steps = new ArrayList<Token>();
		public List<TerminalNode> NUM() { return getTokens(Antlr4LogikaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Antlr4LogikaParser.NUM, i);
		}
		public AutoContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitAuto(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Subst1Context extends JustificationContext {
		public Token tb;
		public Token eqStep;
		public Token step;
		public List<TerminalNode> NUM() { return getTokens(Antlr4LogikaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Antlr4LogikaParser.NUM, i);
		}
		public Subst1Context(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitSubst1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AlgebraContext extends JustificationContext {
		public Token tb;
		public Token NUM;
		public List<Token> steps = new ArrayList<Token>();
		public List<TerminalNode> NUM() { return getTokens(Antlr4LogikaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Antlr4LogikaParser.NUM, i);
		}
		public AlgebraContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitAlgebra(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FctContext extends JustificationContext {
		public Token tb;
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public FctContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitFct(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BottomElimContext extends JustificationContext {
		public Token tb;
		public Token bottomStep;
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public BottomElimContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitBottomElim(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrElimContext extends JustificationContext {
		public Token tb;
		public Token orStep;
		public Token lSubProof;
		public Token rSubProof;
		public List<TerminalNode> NUM() { return getTokens(Antlr4LogikaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Antlr4LogikaParser.NUM, i);
		}
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public OrElimContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitOrElim(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImpliesIntroContext extends JustificationContext {
		public Token tb;
		public Token subProof;
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public ImpliesIntroContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitImpliesIntro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JustificationContext justification() throws RecognitionException {
		JustificationContext _localctx = new JustificationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_justification);
		int _la;
		try {
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				_localctx = new PremiseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				((PremiseContext)_localctx).t = match(T__111);
				}
				break;
			case 2:
				_localctx = new AndIntroContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__112:
					{
					setState(513);
					((AndIntroContext)_localctx).tb = match(T__112);
					}
					break;
				case T__91:
				case T__92:
				case T__93:
					{
					setState(514);
					((AndIntroContext)_localctx).tb = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 7L) != 0)) ) {
						((AndIntroContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(515);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(518);
				((AndIntroContext)_localctx).lStep = match(NUM);
				setState(519);
				((AndIntroContext)_localctx).rStep = match(NUM);
				}
				break;
			case 3:
				_localctx = new AndElimContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(523);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__113:
				case T__114:
					{
					setState(520);
					((AndElimContext)_localctx).tb = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__113 || _la==T__114) ) {
						((AndElimContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case T__91:
				case T__92:
				case T__93:
					{
					setState(521);
					((AndElimContext)_localctx).tb = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 7L) != 0)) ) {
						((AndElimContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(522);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(525);
				((AndElimContext)_localctx).andStep = match(NUM);
				}
				break;
			case 4:
				_localctx = new OrIntroContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(529);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__115:
				case T__116:
				case T__117:
				case T__118:
					{
					setState(526);
					((OrIntroContext)_localctx).tb = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & 15L) != 0)) ) {
						((OrIntroContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case T__1:
				case T__98:
					{
					setState(527);
					((OrIntroContext)_localctx).tb = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__1 || _la==T__98) ) {
						((OrIntroContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(528);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(531);
				((OrIntroContext)_localctx).step = match(NUM);
				}
				break;
			case 5:
				_localctx = new OrElimContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(535);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__119:
				case T__120:
					{
					setState(532);
					((OrElimContext)_localctx).tb = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__119 || _la==T__120) ) {
						((OrElimContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case T__1:
				case T__98:
					{
					setState(533);
					((OrElimContext)_localctx).tb = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__1 || _la==T__98) ) {
						((OrElimContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(534);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(537);
				((OrElimContext)_localctx).orStep = match(NUM);
				setState(538);
				((OrElimContext)_localctx).lSubProof = match(NUM);
				setState(539);
				((OrElimContext)_localctx).rSubProof = match(NUM);
				}
				break;
			case 6:
				_localctx = new ImpliesIntroContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(540);
				((ImpliesIntroContext)_localctx).tb = match(T__121);
				setState(541);
				((ImpliesIntroContext)_localctx).subProof = match(NUM);
				}
				break;
			case 7:
				_localctx = new ImpliesElimContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(542);
				((ImpliesElimContext)_localctx).tb = match(T__122);
				setState(543);
				((ImpliesElimContext)_localctx).impliesStep = match(NUM);
				setState(544);
				((ImpliesElimContext)_localctx).antecedentStep = match(NUM);
				}
				break;
			case 8:
				_localctx = new ImpliesIntroContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(545);
				if (!(("->".equals(_input.LT(1).getText()) ||
				      "→".equals(_input.LT(1).getText())) &&
				     "i".equals(_input.LT(2).getText()))) throw new FailedPredicateException(this, "(\"->\".equals(_input.LT(1).getText()) ||\n      \"\u002F\".equals(_input.LT(1).getText())) &&\n     \"i\".equals(_input.LT(2).getText())");
				setState(546);
				((ImpliesIntroContext)_localctx).tb = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__100 || _la==T__101) ) {
					((ImpliesIntroContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(547);
				match(ID);
				setState(548);
				((ImpliesIntroContext)_localctx).subProof = match(NUM);
				}
				break;
			case 9:
				_localctx = new ImpliesElimContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(549);
				if (!(("->".equals(_input.LT(1).getText()) ||
				      "→".equals(_input.LT(1).getText())) &&
				      "e".equals(_input.LT(2).getText()))) throw new FailedPredicateException(this, "(\"->\".equals(_input.LT(1).getText()) ||\n      \"\u002F\".equals(_input.LT(1).getText())) &&\n      \"e\".equals(_input.LT(2).getText())");
				setState(550);
				((ImpliesElimContext)_localctx).tb = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__100 || _la==T__101) ) {
					((ImpliesElimContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(551);
				match(ID);
				setState(552);
				((ImpliesElimContext)_localctx).impliesStep = match(NUM);
				setState(553);
				((ImpliesElimContext)_localctx).antecedentStep = match(NUM);
				}
				break;
			case 10:
				_localctx = new NegIntroContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(554);
				((NegIntroContext)_localctx).tb = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__123 || _la==T__124) ) {
					((NegIntroContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(555);
				((NegIntroContext)_localctx).subProof = match(NUM);
				}
				break;
			case 11:
				_localctx = new NegElimContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(556);
				((NegElimContext)_localctx).tb = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__125 || _la==T__126) ) {
					((NegElimContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(557);
				((NegElimContext)_localctx).step = match(NUM);
				setState(558);
				((NegElimContext)_localctx).negStep = match(NUM);
				}
				break;
			case 12:
				_localctx = new NegIntroContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(559);
				if (!(("!".equals(_input.LT(1).getText()) ||
				      "~".equals(_input.LT(1).getText()) ||
				      "¬".equals(_input.LT(1).getText())) &&
				     "i".equals(_input.LT(2).getText()))) throw new FailedPredicateException(this, "(\"!\".equals(_input.LT(1).getText()) ||\n      \"~\".equals(_input.LT(1).getText()) ||\n      \"\u005A\".equals(_input.LT(1).getText())) &&\n     \"i\".equals(_input.LT(2).getText())");
				setState(560);
				((NegIntroContext)_localctx).tb = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 7L) != 0)) ) {
					((NegIntroContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(561);
				match(ID);
				setState(562);
				((NegIntroContext)_localctx).subProof = match(NUM);
				}
				break;
			case 13:
				_localctx = new NegElimContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(563);
				if (!(("!".equals(_input.LT(1).getText()) ||
				      "~".equals(_input.LT(1).getText()) ||
				      "¬".equals(_input.LT(1).getText())) &&
				     "e".equals(_input.LT(2).getText()))) throw new FailedPredicateException(this, "(\"!\".equals(_input.LT(1).getText()) ||\n      \"~\".equals(_input.LT(1).getText()) ||\n      \"\u005A\".equals(_input.LT(1).getText())) &&\n     \"e\".equals(_input.LT(2).getText())");
				setState(564);
				((NegElimContext)_localctx).tb = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 7L) != 0)) ) {
					((NegElimContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(565);
				match(ID);
				setState(566);
				((NegElimContext)_localctx).step = match(NUM);
				setState(567);
				((NegElimContext)_localctx).negStep = match(NUM);
				}
				break;
			case 14:
				_localctx = new BottomElimContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(571);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__127:
				case T__128:
					{
					setState(568);
					((BottomElimContext)_localctx).tb = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__127 || _la==T__128) ) {
						((BottomElimContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case T__5:
				case T__19:
					{
					setState(569);
					((BottomElimContext)_localctx).tb = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__5 || _la==T__19) ) {
						((BottomElimContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(570);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(573);
				((BottomElimContext)_localctx).bottomStep = match(NUM);
				}
				break;
			case 15:
				_localctx = new PbcContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(574);
				((PbcContext)_localctx).tb = match(T__129);
				setState(575);
				((PbcContext)_localctx).subProof = match(NUM);
				}
				break;
			case 16:
				_localctx = new Subst1Context(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(576);
				((Subst1Context)_localctx).tb = match(T__130);
				setState(577);
				((Subst1Context)_localctx).eqStep = match(NUM);
				setState(578);
				((Subst1Context)_localctx).step = match(NUM);
				}
				break;
			case 17:
				_localctx = new Subst2Context(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(579);
				((Subst2Context)_localctx).tb = match(T__131);
				setState(580);
				((Subst2Context)_localctx).eqStep = match(NUM);
				setState(581);
				((Subst2Context)_localctx).step = match(NUM);
				}
				break;
			case 18:
				_localctx = new AlgebraContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(582);
				((AlgebraContext)_localctx).tb = match(T__132);
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUM) {
					{
					{
					setState(583);
					((AlgebraContext)_localctx).NUM = match(NUM);
					((AlgebraContext)_localctx).steps.add(((AlgebraContext)_localctx).NUM);
					}
					}
					setState(588);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 19:
				_localctx = new ForallIntroContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(589);
				((ForallIntroContext)_localctx).tb = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 7L) != 0)) ) {
					((ForallIntroContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(590);
				((ForallIntroContext)_localctx).subProof = match(NUM);
				}
				break;
			case 20:
				_localctx = new ForallElimContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(591);
				((ForallElimContext)_localctx).tb = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 7L) != 0)) ) {
					((ForallElimContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(592);
				((ForallElimContext)_localctx).step = match(NUM);
				setState(594); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(593);
					formula(0);
					}
					}
					setState(596); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -4456200L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 140187732541951L) != 0) || ((((_la - 173)) & ~0x3f) == 0 && ((1L << (_la - 173)) & 2063L) != 0) );
				}
				break;
			case 21:
				_localctx = new ForallIntroContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(598);
				if (!("∀".equals(_input.LT(1).getText()) &&
				     "i".equals(_input.LT(2).getText()))) throw new FailedPredicateException(this, "\"\u0001\".equals(_input.LT(1).getText()) &&\n     \"i\".equals(_input.LT(2).getText())");
				setState(599);
				((ForallIntroContext)_localctx).tb = match(T__105);
				setState(600);
				match(ID);
				setState(601);
				((ForallIntroContext)_localctx).subProof = match(NUM);
				}
				break;
			case 22:
				_localctx = new ForallElimContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(602);
				if (!("∀".equals(_input.LT(1).getText()) &&
				     "e".equals(_input.LT(2).getText()))) throw new FailedPredicateException(this, "\"\u0001\".equals(_input.LT(1).getText()) &&\n     \"e\".equals(_input.LT(2).getText())");
				setState(603);
				((ForallElimContext)_localctx).tb = match(T__105);
				setState(604);
				match(ID);
				setState(605);
				((ForallElimContext)_localctx).step = match(NUM);
				setState(607); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(606);
					formula(0);
					}
					}
					setState(609); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -4456200L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 140187732541951L) != 0) || ((((_la - 173)) & ~0x3f) == 0 && ((1L << (_la - 173)) & 2063L) != 0) );
				}
				break;
			case 23:
				_localctx = new ExistsIntroContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(611);
				((ExistsIntroContext)_localctx).tb = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & 7L) != 0)) ) {
					((ExistsIntroContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(612);
				((ExistsIntroContext)_localctx).existsStep = match(NUM);
				setState(614); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(613);
					formula(0);
					}
					}
					setState(616); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -4456200L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 140187732541951L) != 0) || ((((_la - 173)) & ~0x3f) == 0 && ((1L << (_la - 173)) & 2063L) != 0) );
				}
				break;
			case 24:
				_localctx = new ExistsElimContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(618);
				((ExistsElimContext)_localctx).tb = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 7L) != 0)) ) {
					((ExistsElimContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(619);
				((ExistsElimContext)_localctx).step = match(NUM);
				setState(620);
				((ExistsElimContext)_localctx).subProof = match(NUM);
				}
				break;
			case 25:
				_localctx = new ExistsIntroContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(621);
				if (!("∃".equals(_input.LT(1).getText()) &&
				     "i".equals(_input.LT(2).getText()))) throw new FailedPredicateException(this, "\"\u0001\".equals(_input.LT(1).getText()) &&\n     \"i\".equals(_input.LT(2).getText())");
				setState(622);
				((ExistsIntroContext)_localctx).tb = match(T__109);
				setState(623);
				match(ID);
				setState(624);
				((ExistsIntroContext)_localctx).existsStep = match(NUM);
				setState(626); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(625);
					formula(0);
					}
					}
					setState(628); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -4456200L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 140187732541951L) != 0) || ((((_la - 173)) & ~0x3f) == 0 && ((1L << (_la - 173)) & 2063L) != 0) );
				}
				break;
			case 26:
				_localctx = new ExistsElimContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(630);
				if (!("∃".equals(_input.LT(1).getText()) &&
				     "e".equals(_input.LT(2).getText()))) throw new FailedPredicateException(this, "\"\u0001\".equals(_input.LT(1).getText()) &&\n     \"e\".equals(_input.LT(2).getText())");
				setState(631);
				((ExistsElimContext)_localctx).tb = match(T__109);
				setState(632);
				((ExistsElimContext)_localctx).t = match(ID);
				setState(633);
				((ExistsElimContext)_localctx).step = match(NUM);
				setState(634);
				((ExistsElimContext)_localctx).subProof = match(NUM);
				}
				break;
			case 27:
				_localctx = new InvariantContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(635);
				((InvariantContext)_localctx).tb = match(T__145);
				}
				break;
			case 28:
				_localctx = new FctContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(636);
				((FctContext)_localctx).tb = match(T__146);
				setState(637);
				match(ID);
				}
				break;
			case 29:
				_localctx = new AutoContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(638);
				((AutoContext)_localctx).tb = match(T__147);
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUM) {
					{
					{
					setState(639);
					((AutoContext)_localctx).NUM = match(NUM);
					((AutoContext)_localctx).steps.add(((AutoContext)_localctx).NUM);
					}
					}
					setState(644);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public ImporContext impor() {
			return getRuleContext(ImporContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(647);
				match(NL);
				}
				}
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__148) {
				{
				setState(653);
				impor();
				setState(655); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(654);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(657); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(659);
				stmts();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImporContext extends ParserRuleContext {
		public Token tb;
		public Token org;
		public Token sireum;
		public Token logika;
		public Token te;
		public List<TerminalNode> ID() { return getTokens(Antlr4LogikaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Antlr4LogikaParser.ID, i);
		}
		public ImporContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitImpor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImporContext impor() throws RecognitionException {
		ImporContext _localctx = new ImporContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_impor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			((ImporContext)_localctx).tb = match(T__148);
			setState(664);
			((ImporContext)_localctx).org = match(ID);
			setState(665);
			match(T__15);
			setState(666);
			((ImporContext)_localctx).sireum = match(ID);
			setState(667);
			match(T__15);
			setState(668);
			((ImporContext)_localctx).logika = match(ID);
			setState(669);
			match(T__15);
			setState(670);
			((ImporContext)_localctx).te = match(T__149);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactsContext extends ParserRuleContext {
		public Token ftb;
		public Token te;
		public List<FactOrFunContext> factOrFun() {
			return getRuleContexts(FactOrFunContext.class);
		}
		public FactOrFunContext factOrFun(int i) {
			return getRuleContext(FactOrFunContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public FactsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facts; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitFacts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactsContext facts() throws RecognitionException {
		FactsContext _localctx = new FactsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_facts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(T__13);
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(673);
				match(NL);
				}
				}
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(679);
			((FactsContext)_localctx).ftb = match(T__146);
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(680);
				match(NL);
				}
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(686);
			factOrFun();
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(688); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(687);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(690); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__150 || _la==ID) {
					{
					setState(692);
					factOrFun();
					}
				}

				}
				}
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(700);
			((FactsContext)_localctx).te = match(T__14);
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(701);
				match(NL);
				}
				}
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactOrFunContext extends ParserRuleContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public FunContext fun() {
			return getRuleContext(FunContext.class,0);
		}
		public FactOrFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factOrFun; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitFactOrFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactOrFunContext factOrFun() throws RecognitionException {
		FactOrFunContext _localctx = new FactOrFunContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factOrFun);
		try {
			setState(709);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				fact();
				}
				break;
			case T__150:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				fun();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(ID);
			setState(712);
			match(T__15);
			setState(713);
			formula(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunContext extends ParserRuleContext {
		public Token tb;
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NL() { return getToken(Antlr4LogikaParser.NL, 0); }
		public FunDefContext funDef() {
			return getRuleContext(FunDefContext.class,0);
		}
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			((FunContext)_localctx).tb = match(T__150);
			setState(716);
			match(ID);
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(717);
				match(NL);
				}
			}

			setState(720);
			match(T__20);
			setState(721);
			param();
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(722);
				match(T__10);
				setState(723);
				param();
				}
				}
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(729);
			match(T__21);
			setState(730);
			match(T__7);
			setState(731);
			type();
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(732);
				funDef();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunDefContext extends ParserRuleContext {
		public FunDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDef; }
	 
		public FunDefContext() { }
		public void copyFrom(FunDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunDefCondsContext extends FunDefContext {
		public List<FunDefCondContext> funDefCond() {
			return getRuleContexts(FunDefCondContext.class);
		}
		public FunDefCondContext funDefCond(int i) {
			return getRuleContext(FunDefCondContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public FunDefCondsContext(FunDefContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitFunDefConds(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunDefEqContext extends FunDefContext {
		public FunDefSimpleContext funDefSimple() {
			return getRuleContext(FunDefSimpleContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public FunDefEqContext(FunDefContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitFunDefEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDefContext funDef() throws RecognitionException {
		FunDefContext _localctx = new FunDefContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funDef);
		int _la;
		try {
			int _alt;
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				_localctx = new FunDefCondsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(735);
					match(NL);
					}
					}
					setState(740);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(741);
				funDefCond();
				setState(750);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(743); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(742);
							match(NL);
							}
							}
							setState(745); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NL );
						setState(747);
						funDefCond();
						}
						} 
					}
					setState(752);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new FunDefEqContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(753);
					match(NL);
					}
					}
					setState(758);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(759);
				funDefSimple();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunDefCondContext extends ParserRuleContext {
		public FormulaContext e;
		public FormulaContext c;
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public FunDefCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDefCond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitFunDefCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDefCondContext funDefCond() throws RecognitionException {
		FunDefCondContext _localctx = new FunDefCondContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_funDefCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(T__86);
			setState(763);
			((FunDefCondContext)_localctx).e = formula(0);
			setState(764);
			match(T__10);
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(765);
				match(NL);
				}
				}
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(771);
			match(T__151);
			setState(772);
			((FunDefCondContext)_localctx).c = formula(0);
			setState(773);
			match(T__20);
			setState(774);
			match(ID);
			setState(775);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunDefSimpleContext extends ParserRuleContext {
		public FormulaContext e;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public FunDefSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDefSimple; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitFunDefSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDefSimpleContext funDefSimple() throws RecognitionException {
		FunDefSimpleContext _localctx = new FunDefSimpleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_funDefSimple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(T__86);
			setState(778);
			((FunDefSimpleContext)_localctx).e = formula(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(ID);
			setState(781);
			match(T__7);
			setState(782);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtsContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_stmts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -12713736L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 207L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 34611608445L) != 0)) {
				{
				setState(784);
				stmt();
				}
			}

			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(788); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(787);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(790); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -12713736L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 207L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 34611608445L) != 0)) {
					{
					setState(792);
					stmt();
					}
				}

				}
				}
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SeqAssignStmtContext extends StmtContext {
		public Token tb;
		public ExpContext index;
		public ExpContext r;
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NL() { return getToken(Antlr4LogikaParser.NL, 0); }
		public SeqAssignStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitSeqAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpStmtContext extends StmtContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitExpStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignVarStmtContext extends StmtContext {
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NL() { return getToken(Antlr4LogikaParser.NL, 0); }
		public AssignVarStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitAssignVarStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends StmtContext {
		public Token tt;
		public BlockEndContext ts;
		public Token tf;
		public BlockEndContext fs;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<BlockEndContext> blockEnd() {
			return getRuleContexts(BlockEndContext.class);
		}
		public BlockEndContext blockEnd(int i) {
			return getRuleContext(BlockEndContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public IfStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStmtContext extends StmtContext {
		public Token op;
		public List<StringOrExpContext> stringOrExp() {
			return getRuleContexts(StringOrExpContext.class);
		}
		public StringOrExpContext stringOrExp(int i) {
			return getRuleContext(StringOrExpContext.class,i);
		}
		public PrintStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclStmtContext extends StmtContext {
		public MethodDeclContext methodDecl() {
			return getRuleContext(MethodDeclContext.class,0);
		}
		public MethodDeclStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitMethodDeclStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStmtContext extends StmtContext {
		public ImporContext impor() {
			return getRuleContext(ImporContext.class,0);
		}
		public ImportStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitImportStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends StmtContext {
		public Token t;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BlockEndContext blockEnd() {
			return getRuleContext(BlockEndContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public LoopInvariantContext loopInvariant() {
			return getRuleContext(LoopInvariantContext.class,0);
		}
		public WhileStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogikaStmtContext extends StmtContext {
		public ProofContext proof() {
			return getRuleContext(ProofContext.class,0);
		}
		public SequentContext sequent() {
			return getRuleContext(SequentContext.class,0);
		}
		public InvariantsContext invariants() {
			return getRuleContext(InvariantsContext.class,0);
		}
		public FactsContext facts() {
			return getRuleContext(FactsContext.class,0);
		}
		public LogikaStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitLogikaStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclStmtContext extends StmtContext {
		public Token modifier;
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NL() { return getToken(Antlr4LogikaParser.NL, 0); }
		public VarDeclStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitVarDeclStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssertStmtContext extends StmtContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssertStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitAssertStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssumeStmtContext extends StmtContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssumeStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitAssumeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_stmt);
		int _la;
		try {
			setState(909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				_localctx = new VarDeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(800);
				((VarDeclStmtContext)_localctx).modifier = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__152 || _la==T__153) ) {
					((VarDeclStmtContext)_localctx).modifier = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(801);
				match(ID);
				setState(802);
				match(T__7);
				setState(803);
				type();
				setState(804);
				match(T__86);
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(805);
					match(NL);
					}
				}

				setState(808);
				exp(0);
				}
				break;
			case 2:
				_localctx = new AssignVarStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(810);
				match(ID);
				setState(811);
				match(T__86);
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(812);
					match(NL);
					}
				}

				setState(815);
				exp(0);
				}
				break;
			case 3:
				_localctx = new AssumeStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(816);
				match(T__16);
				setState(817);
				match(T__20);
				setState(818);
				exp(0);
				setState(819);
				match(T__21);
				}
				break;
			case 4:
				_localctx = new AssertStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(821);
				match(T__154);
				setState(822);
				match(T__20);
				setState(823);
				exp(0);
				setState(824);
				match(T__21);
				}
				break;
			case 5:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(826);
				match(T__151);
				setState(827);
				match(T__20);
				setState(828);
				exp(0);
				setState(829);
				match(T__21);
				setState(833);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(830);
					match(NL);
					}
					}
					setState(835);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(836);
				((IfStmtContext)_localctx).tt = match(T__13);
				setState(837);
				((IfStmtContext)_localctx).ts = blockEnd();
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__155) {
					{
					setState(838);
					match(T__155);
					setState(842);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(839);
						match(NL);
						}
						}
						setState(844);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(845);
					((IfStmtContext)_localctx).tf = match(T__13);
					setState(846);
					((IfStmtContext)_localctx).fs = blockEnd();
					}
				}

				}
				break;
			case 6:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(849);
				match(T__156);
				setState(850);
				match(T__20);
				setState(851);
				exp(0);
				setState(852);
				match(T__21);
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(853);
					match(NL);
					}
					}
					setState(858);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(859);
				((WhileStmtContext)_localctx).t = match(T__13);
				setState(870);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(863);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(860);
						match(NL);
						}
						}
						setState(865);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(866);
					match(T__157);
					setState(867);
					loopInvariant();
					setState(868);
					match(T__158);
					}
					break;
				}
				setState(872);
				blockEnd();
				}
				break;
			case 7:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(874);
				((PrintStmtContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__159 || _la==T__160) ) {
					((PrintStmtContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(875);
				match(T__20);
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -12844808L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 207L) != 0) || ((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & 790275L) != 0)) {
					{
					setState(876);
					stringOrExp();
					setState(881);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(877);
						match(T__10);
						setState(878);
						stringOrExp();
						}
						}
						setState(883);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(886);
				match(T__21);
				}
				break;
			case 8:
				_localctx = new SeqAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(887);
				((SeqAssignStmtContext)_localctx).tb = match(ID);
				setState(888);
				match(T__20);
				setState(889);
				((SeqAssignStmtContext)_localctx).index = exp(0);
				setState(890);
				match(T__21);
				setState(891);
				match(T__86);
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(892);
					match(NL);
					}
				}

				setState(895);
				((SeqAssignStmtContext)_localctx).r = exp(0);
				}
				break;
			case 9:
				_localctx = new MethodDeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(897);
				methodDecl();
				}
				break;
			case 10:
				_localctx = new LogikaStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(898);
				match(T__157);
				setState(903);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(899);
					proof();
					}
					break;
				case 2:
					{
					setState(900);
					sequent();
					}
					break;
				case 3:
					{
					setState(901);
					invariants();
					}
					break;
				case 4:
					{
					setState(902);
					facts();
					}
					break;
				}
				setState(905);
				match(T__158);
				}
				break;
			case 11:
				_localctx = new ImportStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(907);
				impor();
				}
				break;
			case 12:
				_localctx = new ExpStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(908);
				exp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclContext extends ParserRuleContext {
		public Token ID;
		public List<Token> anns = new ArrayList<Token>();
		public Token id;
		public Token t;
		public BlockEndContext blockEnd() {
			return getRuleContext(BlockEndContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(Antlr4LogikaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Antlr4LogikaParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public MethodContractContext methodContract() {
			return getRuleContext(MethodContractContext.class,0);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__161) {
				{
				{
				setState(911);
				match(T__161);
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(912);
					match(NL);
					}
					}
					setState(917);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(918);
				((MethodDeclContext)_localctx).ID = match(ID);
				((MethodDeclContext)_localctx).anns.add(((MethodDeclContext)_localctx).ID);
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(919);
					match(NL);
					}
					}
					setState(924);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(930);
			match(T__150);
			setState(931);
			((MethodDeclContext)_localctx).id = match(ID);
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(932);
				match(NL);
				}
			}

			setState(935);
			match(T__20);
			setState(944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(936);
				param();
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(937);
					match(T__10);
					setState(938);
					param();
					}
					}
					setState(943);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(946);
			match(T__21);
			setState(947);
			match(T__7);
			setState(950);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
				{
				setState(948);
				type();
				}
				break;
			case T__162:
				{
				setState(949);
				match(T__162);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(952);
			match(T__86);
			setState(956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(953);
				match(NL);
				}
				}
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(959);
			((MethodDeclContext)_localctx).t = match(T__13);
			setState(976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(960);
					match(NL);
					}
					}
					setState(965);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(966);
				match(T__157);
				setState(967);
				methodContract();
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(968);
					match(NL);
					}
					}
					setState(973);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(974);
				match(T__158);
				}
				break;
			}
			setState(978);
			blockEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockEndContext extends ParserRuleContext {
		public Token t;
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public BlockEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockEnd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitBlockEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockEndContext blockEnd() throws RecognitionException {
		BlockEndContext _localctx = new BlockEndContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_blockEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			stmts();
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__163) {
				{
				setState(981);
				returnStmt();
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(982);
					match(NL);
					}
					}
					setState(987);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(990);
			((BlockEndContext)_localctx).t = match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			match(T__163);
			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -12844808L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 207L) != 0) || ((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & 528131L) != 0)) {
				{
				setState(993);
				exp(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringOrExpContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(Antlr4LogikaParser.STRING, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StringOrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringOrExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitStringOrExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringOrExpContext stringOrExp() throws RecognitionException {
		StringOrExpContext _localctx = new StringOrExpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_stringOrExp);
		try {
			setState(998);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(996);
				match(STRING);
				}
				break;
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__69:
			case T__70:
			case T__164:
			case T__165:
			case NUM:
			case ID:
			case REAL:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(997);
				exp(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimExpContext extends ParserRuleContext {
		public PrimExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primExp; }
	 
		public PrimExpContext() { }
		public void copyFrom(PrimExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLitExpContext extends PrimExpContext {
		public TerminalNode INT() { return getToken(Antlr4LogikaParser.INT, 0); }
		public IntLitExpContext(PrimExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitIntLitExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatLitExpContext extends PrimExpContext {
		public TerminalNode FLOAT() { return getToken(Antlr4LogikaParser.FLOAT, 0); }
		public FloatLitExpContext(PrimExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitFloatLitExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAccessExpContext extends PrimExpContext {
		public Token t;
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public TypeAccessExpContext(PrimExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitTypeAccessExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RLitExpContext extends PrimExpContext {
		public TerminalNode REAL() { return getToken(Antlr4LogikaParser.REAL, 0); }
		public RLitExpContext(PrimExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitRLitExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeMethodCallExpContext extends PrimExpContext {
		public Token t;
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TypeMethodCallExpContext(PrimExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitTypeMethodCallExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpContext extends PrimExpContext {
		public Token t;
		public BooleanExpContext(PrimExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitBooleanExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarExpContext extends PrimExpContext {
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public VarExpContext(PrimExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitVarExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntExpContext extends PrimExpContext {
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public IntExpContext(PrimExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitIntExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SeqExpContext extends PrimExpContext {
		public Token t;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public SeqExpContext(PrimExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitSeqExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimExpContext primExp() throws RecognitionException {
		PrimExpContext _localctx = new PrimExpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_primExp);
		int _la;
		try {
			setState(1037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				_localctx = new BooleanExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1000);
				((BooleanExpContext)_localctx).t = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835128L) != 0)) ) {
					((BooleanExpContext)_localctx).t = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				_localctx = new IntExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1001);
				match(NUM);
				}
				break;
			case 3:
				_localctx = new VarExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1002);
				match(ID);
				}
				break;
			case 4:
				_localctx = new TypeMethodCallExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1003);
				((TypeMethodCallExpContext)_localctx).t = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 4194303L) != 0)) ) {
					((TypeMethodCallExpContext)_localctx).t = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1004);
				match(T__15);
				setState(1005);
				match(ID);
				setState(1006);
				match(T__20);
				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -12844808L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 207L) != 0) || ((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & 528131L) != 0)) {
					{
					setState(1007);
					exp(0);
					setState(1012);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(1008);
						match(T__10);
						setState(1009);
						exp(0);
						}
						}
						setState(1014);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1017);
				match(T__21);
				}
				break;
			case 5:
				_localctx = new TypeAccessExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1018);
				((TypeAccessExpContext)_localctx).t = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & 17592186044415L) != 0)) ) {
					((TypeAccessExpContext)_localctx).t = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1019);
				match(T__15);
				setState(1020);
				match(ID);
				}
				break;
			case 6:
				_localctx = new FloatLitExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1021);
				match(FLOAT);
				}
				break;
			case 7:
				_localctx = new IntLitExpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1022);
				match(INT);
				}
				break;
			case 8:
				_localctx = new RLitExpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1023);
				match(REAL);
				}
				break;
			case 9:
				_localctx = new SeqExpContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1024);
				((SeqExpContext)_localctx).t = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 4194303L) != 0)) ) {
					((SeqExpContext)_localctx).t = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1025);
				match(T__20);
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -12844808L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 207L) != 0) || ((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & 528131L) != 0)) {
					{
					setState(1026);
					exp(0);
					setState(1031);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(1027);
						match(T__10);
						setState(1028);
						exp(0);
						}
						}
						setState(1033);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1036);
				match(T__21);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InvokeExpContext extends ExpContext {
		public Token tb;
		public Token t;
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public InvokeExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitInvokeExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExpContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParenExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitParenExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PExpContext extends ExpContext {
		public PrimExpContext primExp() {
			return getRuleContext(PrimExpContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(Antlr4LogikaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Antlr4LogikaParser.ID, i);
		}
		public PExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitPExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadIntExpContext extends ExpContext {
		public TerminalNode STRING() { return getToken(Antlr4LogikaParser.STRING, 0); }
		public ReadIntExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitReadIntExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RandomIntExpContext extends ExpContext {
		public RandomIntExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitRandomIntExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpContext extends ExpContext {
		public Token op;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UnaryExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpContext extends ExpContext {
		public ExpContext l;
		public Token op;
		public ExpContext r;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NL() { return getToken(Antlr4LogikaParser.NL, 0); }
		public BinaryExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitBinaryExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				_localctx = new InvokeExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1040);
				((InvokeExpContext)_localctx).tb = match(ID);
				setState(1041);
				((InvokeExpContext)_localctx).t = match(T__20);
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -12844808L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 207L) != 0) || ((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & 528131L) != 0)) {
					{
					setState(1042);
					exp(0);
					setState(1047);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(1043);
						match(T__10);
						setState(1044);
						exp(0);
						}
						}
						setState(1049);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1052);
				match(T__21);
				}
				break;
			case 2:
				{
				_localctx = new PExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1053);
				primExp();
				setState(1058);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1054);
						match(T__15);
						setState(1055);
						match(ID);
						}
						} 
					}
					setState(1060);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				}
				}
				break;
			case 3:
				{
				_localctx = new RandomIntExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1061);
				match(T__164);
				setState(1062);
				match(T__20);
				setState(1063);
				match(T__21);
				}
				break;
			case 4:
				{
				_localctx = new ReadIntExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1064);
				match(T__165);
				setState(1065);
				match(T__20);
				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1066);
					match(STRING);
					}
				}

				setState(1069);
				match(T__21);
				}
				break;
			case 5:
				{
				_localctx = new ParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1070);
				match(T__20);
				setState(1071);
				exp(0);
				setState(1072);
				match(T__21);
				}
				break;
			case 6:
				{
				_localctx = new UnaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1074);
				((UnaryExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__69 || _la==T__70) ) {
					((UnaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1075);
				exp(10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1132);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(1078);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1079);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__72 || _la==T__73) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1081);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(1080);
							match(NL);
							}
						}

						setState(1083);
						((BinaryExpContext)_localctx).r = exp(10);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(1084);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1085);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__74) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1087);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(1086);
							match(NL);
							}
						}

						setState(1089);
						((BinaryExpContext)_localctx).r = exp(9);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(1090);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1091);
						((BinaryExpContext)_localctx).op = match(T__75);
						setState(1093);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(1092);
							match(NL);
							}
						}

						setState(1095);
						((BinaryExpContext)_localctx).r = exp(7);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(1096);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1097);
						((BinaryExpContext)_localctx).op = match(T__76);
						setState(1099);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(1098);
							match(NL);
							}
						}

						setState(1101);
						((BinaryExpContext)_localctx).r = exp(7);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(1102);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1103);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 475L) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1105);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(1104);
							match(NL);
							}
						}

						setState(1107);
						((BinaryExpContext)_localctx).r = exp(6);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(1108);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1109);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__87 || _la==T__88) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1111);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(1110);
							match(NL);
							}
						}

						setState(1113);
						((BinaryExpContext)_localctx).r = exp(5);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(1114);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1115);
						((BinaryExpContext)_localctx).op = match(T__91);
						setState(1117);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(1116);
							match(NL);
							}
						}

						setState(1119);
						((BinaryExpContext)_localctx).r = exp(4);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(1120);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1121);
						((BinaryExpContext)_localctx).op = match(T__95);
						setState(1123);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(1122);
							match(NL);
							}
						}

						setState(1125);
						((BinaryExpContext)_localctx).r = exp(3);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(1126);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1127);
						((BinaryExpContext)_localctx).op = match(T__1);
						setState(1129);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(1128);
							match(NL);
							}
						}

						setState(1131);
						((BinaryExpContext)_localctx).r = exp(2);
						}
						break;
					}
					} 
				}
				setState(1136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopInvariantContext extends ParserRuleContext {
		public Token tb;
		public Token te;
		public Token itb;
		public ModifiesContext modifies() {
			return getRuleContext(ModifiesContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public LoopInvariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopInvariant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitLoopInvariant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopInvariantContext loopInvariant() throws RecognitionException {
		LoopInvariantContext _localctx = new LoopInvariantContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_loopInvariant);
		int _la;
		try {
			int _alt;
			setState(1190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1137);
				((LoopInvariantContext)_localctx).tb = match(T__13);
				setState(1141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1138);
					match(NL);
					}
					}
					setState(1143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1144);
				modifies();
				setState(1145);
				((LoopInvariantContext)_localctx).te = match(T__14);
				setState(1149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1146);
					match(NL);
					}
					}
					setState(1151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1152);
				((LoopInvariantContext)_localctx).tb = match(T__13);
				setState(1156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1153);
					match(NL);
					}
					}
					setState(1158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1159);
				((LoopInvariantContext)_localctx).itb = match(T__145);
				setState(1163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1160);
					match(NL);
					}
					}
					setState(1165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1166);
				formula(0);
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1168); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1167);
							match(NL);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1170); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(1173);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4456200L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 140187732541951L) != 0) || ((((_la - 173)) & ~0x3f) == 0 && ((1L << (_la - 173)) & 2063L) != 0)) {
						{
						setState(1172);
						formula(0);
						}
					}

					}
					}
					setState(1179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__166) {
					{
					setState(1180);
					modifies();
					}
				}

				setState(1183);
				((LoopInvariantContext)_localctx).te = match(T__14);
				setState(1187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1184);
					match(NL);
					}
					}
					setState(1189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModifiesContext extends ParserRuleContext {
		public Token tb;
		public List<TerminalNode> ID() { return getTokens(Antlr4LogikaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Antlr4LogikaParser.ID, i);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public ModifiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifies; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitModifies(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiesContext modifies() throws RecognitionException {
		ModifiesContext _localctx = new ModifiesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_modifies);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			((ModifiesContext)_localctx).tb = match(T__166);
			setState(1193);
			match(ID);
			setState(1198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(1194);
				match(T__10);
				setState(1195);
				match(ID);
				}
				}
				setState(1200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1201);
					match(NL);
					}
					} 
				}
				setState(1206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodContractContext extends ParserRuleContext {
		public Token tb;
		public FormulaContext formula;
		public List<FormulaContext> rs = new ArrayList<FormulaContext>();
		public List<FormulaContext> es = new ArrayList<FormulaContext>();
		public Token te;
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public ModifiesContext modifies() {
			return getRuleContext(ModifiesContext.class,0);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public MethodContractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodContract; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitMethodContract(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContractContext methodContract() throws RecognitionException {
		MethodContractContext _localctx = new MethodContractContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_methodContract);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			((MethodContractContext)_localctx).tb = match(T__13);
			setState(1211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1208);
					match(NL);
					}
					} 
				}
				setState(1213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			}
			setState(1235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__167 || _la==T__168) {
				{
				setState(1214);
				_la = _input.LA(1);
				if ( !(_la==T__167 || _la==T__168) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1215);
					match(NL);
					}
					}
					setState(1220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1221);
				((MethodContractContext)_localctx).formula = formula(0);
				((MethodContractContext)_localctx).rs.add(((MethodContractContext)_localctx).formula);
				setState(1232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1223); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1222);
								match(NL);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1225); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(1228);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4456200L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 140187732541951L) != 0) || ((((_la - 173)) & ~0x3f) == 0 && ((1L << (_la - 173)) & 2063L) != 0)) {
							{
							setState(1227);
							((MethodContractContext)_localctx).formula = formula(0);
							((MethodContractContext)_localctx).rs.add(((MethodContractContext)_localctx).formula);
							}
						}

						}
						} 
					}
					setState(1234);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				}
				}
			}

			setState(1240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1237);
					match(NL);
					}
					} 
				}
				setState(1242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			}
			setState(1244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__166) {
				{
				setState(1243);
				modifies();
				}
			}

			setState(1267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__169 || _la==T__170) {
				{
				setState(1246);
				_la = _input.LA(1);
				if ( !(_la==T__169 || _la==T__170) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1247);
					match(NL);
					}
					}
					setState(1252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1253);
				((MethodContractContext)_localctx).formula = formula(0);
				((MethodContractContext)_localctx).es.add(((MethodContractContext)_localctx).formula);
				setState(1264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1255); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1254);
								match(NL);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1257); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(1260);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4456200L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 140187732541951L) != 0) || ((((_la - 173)) & ~0x3f) == 0 && ((1L << (_la - 173)) & 2063L) != 0)) {
							{
							setState(1259);
							((MethodContractContext)_localctx).formula = formula(0);
							((MethodContractContext)_localctx).es.add(((MethodContractContext)_localctx).formula);
							}
						}

						}
						} 
					}
					setState(1266);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
				}
				}
			}

			setState(1272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1269);
				match(NL);
				}
				}
				setState(1274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1275);
			((MethodContractContext)_localctx).te = match(T__14);
			setState(1279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1276);
					match(NL);
					}
					} 
				}
				setState(1281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InvariantsContext extends ParserRuleContext {
		public Token tb;
		public Token te;
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public InvariantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invariants; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Antlr4LogikaVisitor ) return ((Antlr4LogikaVisitor<? extends T>)visitor).visitInvariants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvariantsContext invariants() throws RecognitionException {
		InvariantsContext _localctx = new InvariantsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_invariants);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
			((InvariantsContext)_localctx).tb = match(T__13);
			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1283);
				match(NL);
				}
				}
				setState(1288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1289);
			match(T__145);
			setState(1293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1290);
				match(NL);
				}
				}
				setState(1295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1296);
			formula(0);
			setState(1307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1298); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1297);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1300); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4456200L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 140187732541951L) != 0) || ((((_la - 173)) & ~0x3f) == 0 && ((1L << (_la - 173)) & 2063L) != 0)) {
					{
					setState(1302);
					formula(0);
					}
				}

				}
				}
				setState(1309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1310);
			((InvariantsContext)_localctx).te = match(T__14);
			setState(1314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1311);
				match(NL);
				}
				}
				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return formula_sempred((FormulaContext)_localctx, predIndex);
		case 13:
			return justification_sempred((JustificationContext)_localctx, predIndex);
		case 31:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean formula_sempred(FormulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean justification_sempred(JustificationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return ("->".equals(_input.LT(1).getText()) ||
		      "→".equals(_input.LT(1).getText())) &&
		     "i".equals(_input.LT(2).getText());
		case 11:
			return ("->".equals(_input.LT(1).getText()) ||
		      "→".equals(_input.LT(1).getText())) &&
		      "e".equals(_input.LT(2).getText());
		case 12:
			return ("!".equals(_input.LT(1).getText()) ||
		      "~".equals(_input.LT(1).getText()) ||
		      "¬".equals(_input.LT(1).getText())) &&
		     "i".equals(_input.LT(2).getText());
		case 13:
			return ("!".equals(_input.LT(1).getText()) ||
		      "~".equals(_input.LT(1).getText()) ||
		      "¬".equals(_input.LT(1).getText())) &&
		     "e".equals(_input.LT(2).getText());
		case 14:
			return "∀".equals(_input.LT(1).getText()) &&
		     "i".equals(_input.LT(2).getText());
		case 15:
			return "∀".equals(_input.LT(1).getText()) &&
		     "e".equals(_input.LT(2).getText());
		case 16:
			return "∃".equals(_input.LT(1).getText()) &&
		     "i".equals(_input.LT(2).getText());
		case 17:
			return "∃".equals(_input.LT(1).getText()) &&
		     "e".equals(_input.LT(2).getText());
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 9);
		case 19:
			return precpred(_ctx, 8);
		case 20:
			return precpred(_ctx, 7);
		case 21:
			return precpred(_ctx, 6);
		case 22:
			return precpred(_ctx, 5);
		case 23:
			return precpred(_ctx, 4);
		case 24:
			return precpred(_ctx, 3);
		case 25:
			return precpred(_ctx, 2);
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00b9\u0526\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000M\b\u0000\n\u0000\f\u0000P\t\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000T\b\u0000\n\u0000\f\u0000W\t\u0000\u0001\u0000\u0003\u0000Z\b\u0000"+
		"\u0001\u0000\u0005\u0000]\b\u0000\n\u0000\f\u0000`\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000g\b\u0000"+
		"\u0001\u0001\u0005\u0001j\b\u0001\n\u0001\f\u0001m\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001q\b\u0001\u000b\u0001\f\u0001r\u0001\u0001\u0001"+
		"\u0001\u0004\u0001w\b\u0001\u000b\u0001\f\u0001x\u0001\u0001\u0004\u0001"+
		"|\b\u0001\u000b\u0001\f\u0001}\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001\u0083\b\u0001\u000b\u0001\f\u0001\u0084\u0001\u0001\u0001\u0001"+
		"\u0004\u0001\u0089\b\u0001\u000b\u0001\f\u0001\u008a\u0001\u0001\u0005"+
		"\u0001\u008e\b\u0001\n\u0001\f\u0001\u0091\t\u0001\u0001\u0001\u0004\u0001"+
		"\u0094\b\u0001\u000b\u0001\f\u0001\u0095\u0001\u0001\u0001\u0001\u0004"+
		"\u0001\u009a\b\u0001\u000b\u0001\f\u0001\u009b\u0001\u0001\u0003\u0001"+
		"\u009f\b\u0001\u0001\u0001\u0005\u0001\u00a2\b\u0001\n\u0001\f\u0001\u00a5"+
		"\t\u0001\u0001\u0002\u0005\u0002\u00a8\b\u0002\n\u0002\f\u0002\u00ab\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00af\b\u0002\n\u0002\f\u0002"+
		"\u00b2\t\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0004\u0004"+
		"\u00b8\b\u0004\u000b\u0004\f\u0004\u00b9\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u00c0\b\u0004\n\u0004\f\u0004\u00c3\t\u0004"+
		"\u0001\u0004\u0005\u0004\u00c6\b\u0004\n\u0004\f\u0004\u00c9\t\u0004\u0001"+
		"\u0004\u0004\u0004\u00cc\b\u0004\u000b\u0004\f\u0004\u00cd\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00d4\b\u0004\n\u0004"+
		"\f\u0004\u00d7\t\u0004\u0001\u0004\u0005\u0004\u00da\b\u0004\n\u0004\f"+
		"\u0004\u00dd\t\u0004\u0003\u0004\u00df\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0004\u0005\u00e3\b\u0005\u000b\u0005\f\u0005\u00e4\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00ec\b\u0006\n"+
		"\u0006\f\u0006\u00ef\t\u0006\u0003\u0006\u00f1\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00f7\b\u0006\n\u0006\f\u0006"+
		"\u00fa\t\u0006\u0001\u0006\u0005\u0006\u00fd\b\u0006\n\u0006\f\u0006\u0100"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u0104\b\u0006\u000b\u0006"+
		"\f\u0006\u0105\u0003\u0006\u0108\b\u0006\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u010c\b\u0007\u0001\u0007\u0004\u0007\u010f\b\u0007\u000b\u0007"+
		"\f\u0007\u0110\u0001\u0007\u0003\u0007\u0114\b\u0007\u0005\u0007\u0116"+
		"\b\u0007\n\u0007\f\u0007\u0119\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u011d\b\u0007\n\u0007\f\u0007\u0120\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u012a\b\b\n\b\f\b\u012d\t\b"+
		"\u0001\b\u0001\b\u0005\b\u0131\b\b\n\b\f\b\u0134\t\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u013b\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0143\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u0148\b\b"+
		"\u0001\b\u0004\b\u014b\b\b\u000b\b\f\b\u014c\u0001\b\u0003\b\u0150\b\b"+
		"\u0005\b\u0152\b\b\n\b\f\b\u0155\t\b\u0001\b\u0003\b\u0158\b\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u0164\b\t\n\t\f\t\u0167\t\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0171\b\t\n\t\f\t\u0174\t\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0185\b\t\n\t\f\t\u0188"+
		"\t\t\u0003\t\u018a\b\t\u0001\t\u0003\t\u018d\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u0193\b\n\n\n\f\n\u0196\t\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0003\n\u019d\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u01a2"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u01a8\b\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0003\n\u01ae\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u01b4\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u01ba\b\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0003\n\u01c0\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u01c6\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u01cc\b\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u01d2\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u01d8\b\n\u0001\n\u0005\n\u01db\b\n\n\n\f\n\u01de\t"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u01e4\b"+
		"\u000b\n\u000b\f\u000b\u01e7\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01ef\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u01f3\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u01f8\b\u000b\u0001\u000b\u0003\u000b\u01fb\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u0205\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u020c\b\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0212\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0218\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u023c\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0249\b\r\n\r\f\r\u024c"+
		"\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u0253\b\r\u000b\r"+
		"\f\r\u0254\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0004\r\u0260\b\r\u000b\r\f\r\u0261\u0001\r\u0001\r\u0001\r"+
		"\u0004\r\u0267\b\r\u000b\r\f\r\u0268\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0004\r\u0273\b\r\u000b\r\f\r\u0274\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u0281\b\r\n\r\f\r\u0284\t\r\u0003\r\u0286\b\r\u0001\u000e\u0005"+
		"\u000e\u0289\b\u000e\n\u000e\f\u000e\u028c\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0004\u000e\u0290\b\u000e\u000b\u000e\f\u000e\u0291\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0296\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u02a3\b\u0010\n\u0010\f\u0010\u02a6\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u02aa\b\u0010\n\u0010\f\u0010\u02ad"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u02b1\b\u0010\u000b\u0010"+
		"\f\u0010\u02b2\u0001\u0010\u0003\u0010\u02b6\b\u0010\u0005\u0010\u02b8"+
		"\b\u0010\n\u0010\f\u0010\u02bb\t\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u02bf\b\u0010\n\u0010\f\u0010\u02c2\t\u0010\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u02c6\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u02cf\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u02d5\b\u0013\n\u0013\f\u0013"+
		"\u02d8\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u02de\b\u0013\u0001\u0014\u0005\u0014\u02e1\b\u0014\n\u0014\f\u0014\u02e4"+
		"\t\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u02e8\b\u0014\u000b\u0014"+
		"\f\u0014\u02e9\u0001\u0014\u0005\u0014\u02ed\b\u0014\n\u0014\f\u0014\u02f0"+
		"\t\u0014\u0001\u0014\u0005\u0014\u02f3\b\u0014\n\u0014\f\u0014\u02f6\t"+
		"\u0014\u0001\u0014\u0003\u0014\u02f9\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u02ff\b\u0015\n\u0015\f\u0015\u0302\t\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0003\u0018\u0312\b\u0018\u0001\u0018\u0004\u0018"+
		"\u0315\b\u0018\u000b\u0018\f\u0018\u0316\u0001\u0018\u0003\u0018\u031a"+
		"\b\u0018\u0005\u0018\u031c\b\u0018\n\u0018\f\u0018\u031f\t\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0327\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u032e\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u0340\b\u0019\n\u0019\f\u0019\u0343\t\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0349\b\u0019\n\u0019"+
		"\f\u0019\u034c\t\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0350\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u0357\b\u0019\n\u0019\f\u0019\u035a\t\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u035e\b\u0019\n\u0019\f\u0019\u0361\t\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0367\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u0370\b\u0019\n\u0019\f\u0019\u0373\t\u0019\u0003\u0019\u0375\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u037e\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0388\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u038e\b\u0019\u0001\u001a\u0001\u001a\u0005\u001a\u0392\b\u001a\n\u001a"+
		"\f\u001a\u0395\t\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0399\b\u001a"+
		"\n\u001a\f\u001a\u039c\t\u001a\u0005\u001a\u039e\b\u001a\n\u001a\f\u001a"+
		"\u03a1\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u03a6\b"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u03ac"+
		"\b\u001a\n\u001a\f\u001a\u03af\t\u001a\u0003\u001a\u03b1\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u03b7\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u03bb\b\u001a\n\u001a\f\u001a\u03be\t\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u03c2\b\u001a\n\u001a\f\u001a\u03c5"+
		"\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u03ca\b\u001a"+
		"\n\u001a\f\u001a\u03cd\t\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u03d1"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u03d8\b\u001b\n\u001b\f\u001b\u03db\t\u001b\u0003\u001b\u03dd\b"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u03e3"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u03e7\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u03f3\b\u001e\n\u001e"+
		"\f\u001e\u03f6\t\u001e\u0003\u001e\u03f8\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0406\b\u001e"+
		"\n\u001e\f\u001e\u0409\t\u001e\u0003\u001e\u040b\b\u001e\u0001\u001e\u0003"+
		"\u001e\u040e\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u0416\b\u001f\n\u001f\f\u001f\u0419\t\u001f"+
		"\u0003\u001f\u041b\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u0421\b\u001f\n\u001f\f\u001f\u0424\t\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u042c"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u0435\b\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u043a\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u0440\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u0446\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u044c\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u0452\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u0458\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u045e\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u0464\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u046a\b\u001f\u0001\u001f\u0005\u001f\u046d\b\u001f"+
		"\n\u001f\f\u001f\u0470\t\u001f\u0001 \u0001 \u0005 \u0474\b \n \f \u0477"+
		"\t \u0001 \u0001 \u0001 \u0005 \u047c\b \n \f \u047f\t \u0001 \u0001 "+
		"\u0005 \u0483\b \n \f \u0486\t \u0001 \u0001 \u0005 \u048a\b \n \f \u048d"+
		"\t \u0001 \u0001 \u0004 \u0491\b \u000b \f \u0492\u0001 \u0003 \u0496"+
		"\b \u0005 \u0498\b \n \f \u049b\t \u0001 \u0003 \u049e\b \u0001 \u0001"+
		" \u0005 \u04a2\b \n \f \u04a5\t \u0003 \u04a7\b \u0001!\u0001!\u0001!"+
		"\u0001!\u0005!\u04ad\b!\n!\f!\u04b0\t!\u0001!\u0005!\u04b3\b!\n!\f!\u04b6"+
		"\t!\u0001\"\u0001\"\u0005\"\u04ba\b\"\n\"\f\"\u04bd\t\"\u0001\"\u0001"+
		"\"\u0005\"\u04c1\b\"\n\"\f\"\u04c4\t\"\u0001\"\u0001\"\u0004\"\u04c8\b"+
		"\"\u000b\"\f\"\u04c9\u0001\"\u0003\"\u04cd\b\"\u0005\"\u04cf\b\"\n\"\f"+
		"\"\u04d2\t\"\u0003\"\u04d4\b\"\u0001\"\u0005\"\u04d7\b\"\n\"\f\"\u04da"+
		"\t\"\u0001\"\u0003\"\u04dd\b\"\u0001\"\u0001\"\u0005\"\u04e1\b\"\n\"\f"+
		"\"\u04e4\t\"\u0001\"\u0001\"\u0004\"\u04e8\b\"\u000b\"\f\"\u04e9\u0001"+
		"\"\u0003\"\u04ed\b\"\u0005\"\u04ef\b\"\n\"\f\"\u04f2\t\"\u0003\"\u04f4"+
		"\b\"\u0001\"\u0005\"\u04f7\b\"\n\"\f\"\u04fa\t\"\u0001\"\u0001\"\u0005"+
		"\"\u04fe\b\"\n\"\f\"\u0501\t\"\u0001#\u0001#\u0005#\u0505\b#\n#\f#\u0508"+
		"\t#\u0001#\u0001#\u0005#\u050c\b#\n#\f#\u050f\t#\u0001#\u0001#\u0004#"+
		"\u0513\b#\u000b#\f#\u0514\u0001#\u0003#\u0518\b#\u0005#\u051a\b#\n#\f"+
		"#\u051d\t#\u0001#\u0001#\u0005#\u0521\b#\n#\f#\u0524\t#\u0001#\u0000\u0002"+
		"\u0014>$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000(\u0001\u0000\u0003\u0006"+
		"\u0001\u0000\u0003\u0004\u0001\u0000\u0005\u0006\u0001\u0000\f\r\u0002"+
		"\u0000\u0003\u0006\u0012\u0014\u0001\u0000\u0018-\u0001\u0000.C\u0001"+
		"\u0000DH\u0002\u0000\u0001\u0001IJ\u0002\u0000\u0007\u0007KK\u0001\u0000"+
		"NV\u0001\u0000WZ\u0001\u0000[^\u0001\u0000_`\u0002\u0000\u0002\u0002a"+
		"c\u0001\u0000df\u0001\u0000gn\u0001\u0000\u0018C\u0001\u0000\\^\u0001"+
		"\u0000rs\u0001\u0000tw\u0002\u0000\u0002\u0002cc\u0001\u0000xy\u0001\u0000"+
		"ef\u0001\u0000|}\u0001\u0000~\u007f\u0001\u0000FH\u0001\u0000\u0080\u0081"+
		"\u0002\u0000\u0006\u0006\u0014\u0014\u0001\u0000\u0086\u0088\u0001\u0000"+
		"\u0089\u008b\u0001\u0000\u008c\u008e\u0001\u0000\u008f\u0091\u0001\u0000"+
		"\u0099\u009a\u0001\u0000\u00a0\u00a1\u0002\u0000\u0007\u0007FG\u0003\u0000"+
		"NOQRTV\u0001\u0000XY\u0001\u0000\u00a8\u00a9\u0001\u0000\u00aa\u00ab\u060c"+
		"\u0000f\u0001\u0000\u0000\u0000\u0002k\u0001\u0000\u0000\u0000\u0004\u00a9"+
		"\u0001\u0000\u0000\u0000\u0006\u00b3\u0001\u0000\u0000\u0000\b\u00b5\u0001"+
		"\u0000\u0000\u0000\n\u00e0\u0001\u0000\u0000\u0000\f\u0107\u0001\u0000"+
		"\u0000\u0000\u000e\u0109\u0001\u0000\u0000\u0000\u0010\u0157\u0001\u0000"+
		"\u0000\u0000\u0012\u018c\u0001\u0000\u0000\u0000\u0014\u019c\u0001\u0000"+
		"\u0000\u0000\u0016\u01df\u0001\u0000\u0000\u0000\u0018\u01fe\u0001\u0000"+
		"\u0000\u0000\u001a\u0285\u0001\u0000\u0000\u0000\u001c\u028a\u0001\u0000"+
		"\u0000\u0000\u001e\u0297\u0001\u0000\u0000\u0000 \u02a0\u0001\u0000\u0000"+
		"\u0000\"\u02c5\u0001\u0000\u0000\u0000$\u02c7\u0001\u0000\u0000\u0000"+
		"&\u02cb\u0001\u0000\u0000\u0000(\u02f8\u0001\u0000\u0000\u0000*\u02fa"+
		"\u0001\u0000\u0000\u0000,\u0309\u0001\u0000\u0000\u0000.\u030c\u0001\u0000"+
		"\u0000\u00000\u0311\u0001\u0000\u0000\u00002\u038d\u0001\u0000\u0000\u0000"+
		"4\u039f\u0001\u0000\u0000\u00006\u03d4\u0001\u0000\u0000\u00008\u03e0"+
		"\u0001\u0000\u0000\u0000:\u03e6\u0001\u0000\u0000\u0000<\u040d\u0001\u0000"+
		"\u0000\u0000>\u0434\u0001\u0000\u0000\u0000@\u04a6\u0001\u0000\u0000\u0000"+
		"B\u04a8\u0001\u0000\u0000\u0000D\u04b7\u0001\u0000\u0000\u0000F\u0502"+
		"\u0001\u0000\u0000\u0000HI\u0003\u0002\u0001\u0000IJ\u0005\u0000\u0000"+
		"\u0001Jg\u0001\u0000\u0000\u0000KM\u0005\u00b2\u0000\u0000LK\u0001\u0000"+
		"\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"QU\u0003\f\u0006\u0000RT\u0005\u00b2\u0000\u0000SR\u0001\u0000\u0000\u0000"+
		"TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XZ\u0003\u000e"+
		"\u0007\u0000YX\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z^\u0001"+
		"\u0000\u0000\u0000[]\u0005\u00b2\u0000\u0000\\[\u0001\u0000\u0000\u0000"+
		"]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000"+
		"\u0000_a\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ab\u0005\u0000"+
		"\u0000\u0001bg\u0001\u0000\u0000\u0000cd\u0003\u001c\u000e\u0000de\u0005"+
		"\u0000\u0000\u0001eg\u0001\u0000\u0000\u0000fH\u0001\u0000\u0000\u0000"+
		"fN\u0001\u0000\u0000\u0000fc\u0001\u0000\u0000\u0000g\u0001\u0001\u0000"+
		"\u0000\u0000hj\u0005\u00b2\u0000\u0000ih\u0001\u0000\u0000\u0000jm\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000np\u0005\u0001\u0000"+
		"\u0000oq\u0005\u00b2\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tv\u0005\u00ac\u0000\u0000uw\u0005\u00b2\u0000\u0000"+
		"vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000z|\u0005\u00ae"+
		"\u0000\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005\u0002\u0000\u0000\u0080\u0082\u0003\u0014\n\u0000"+
		"\u0081\u0083\u0005\u00b2\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000"+
		"\u0086\u008f\u0005\u00ac\u0000\u0000\u0087\u0089\u0005\u00b2\u0000\u0000"+
		"\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e\u0003\u0004\u0002\u0000"+
		"\u008d\u0088\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0092\u0094\u0005\u00b2\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u009e\u0005\u00ac\u0000\u0000\u0098\u009a\u0005\u00b2\u0000\u0000"+
		"\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0003\b\u0004\u0000\u009e"+
		"\u0099\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a0\u00a2\u0005\u00b2\u0000\u0000\u00a1"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u0003\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a8\u0003\u0006\u0003\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8"+
		"\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ac\u00b0\u0005\u0002\u0000\u0000\u00ad"+
		"\u00af\u0003\u0006\u0003\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b1\u0005\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b4\u0007\u0000\u0000\u0000\u00b4"+
		"\u0007\u0001\u0000\u0000\u0000\u00b5\u00de\u0005\u00ae\u0000\u0000\u00b6"+
		"\u00b8\u0005\u00b2\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0005\u0007\u0000\u0000\u00bc\u00bd\u0007\u0001\u0000\u0000\u00bd"+
		"\u00c7\u0005\b\u0000\u0000\u00be\u00c0\u0005\u00b2\u0000\u0000\u00bf\u00be"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c6"+
		"\u0003\n\u0005\u0000\u00c5\u00c1\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cc\u0005\u00b2\u0000\u0000\u00cb\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0005\u0007\u0000\u0000\u00d0\u00d1\u0007"+
		"\u0002\u0000\u0000\u00d1\u00db\u0005\b\u0000\u0000\u00d2\u00d4\u0005\u00b2"+
		"\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d8\u00da\u0003\n\u0005\u0000\u00d9\u00d5\u0001\u0000\u0000"+
		"\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000"+
		"\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00b7\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\t\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e2\u0005\t\u0000\u0000\u00e1\u00e3\u0003\u0006\u0003\u0000\u00e2"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\n\u0000\u0000\u00e7\u000b"+
		"\u0001\u0000\u0000\u0000\u00e8\u00ed\u0003\u0014\n\u0000\u00e9\u00ea\u0005"+
		"\u000b\u0000\u0000\u00ea\u00ec\u0003\u0014\n\u0000\u00eb\u00e9\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000"+
		"\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00e8\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0007\u0003\u0000\u0000\u00f3\u00f8\u0003\u0014"+
		"\n\u0000\u00f4\u00f5\u0005\u000b\u0000\u0000\u00f5\u00f7\u0003\u0014\n"+
		"\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f9\u0108\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fd\u0003\u0014\n\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000"+
		"\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0103\u0005\u00ac\u0000\u0000"+
		"\u0102\u0104\u0003\u0014\n\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105"+
		"\u0106\u0001\u0000\u0000\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107"+
		"\u00f0\u0001\u0000\u0000\u0000\u0107\u00fe\u0001\u0000\u0000\u0000\u0108"+
		"\r\u0001\u0000\u0000\u0000\u0109\u010b\u0005\u000e\u0000\u0000\u010a\u010c"+
		"\u0003\u0010\b\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010b\u010c\u0001"+
		"\u0000\u0000\u0000\u010c\u0117\u0001\u0000\u0000\u0000\u010d\u010f\u0005"+
		"\u00b2\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001"+
		"\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001"+
		"\u0000\u0000\u0000\u0111\u0113\u0001\u0000\u0000\u0000\u0112\u0114\u0003"+
		"\u0010\b\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000"+
		"\u0000\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115\u010e\u0001\u0000"+
		"\u0000\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u011a\u0001\u0000"+
		"\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u011e\u0005\u000f"+
		"\u0000\u0000\u011b\u011d\u0005\u00b2\u0000\u0000\u011c\u011b\u0001\u0000"+
		"\u0000\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u000f\u0001\u0000"+
		"\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u00ad"+
		"\u0000\u0000\u0122\u0123\u0005\u0010\u0000\u0000\u0123\u0124\u0003\u0014"+
		"\n\u0000\u0124\u0125\u0003\u001a\r\u0000\u0125\u0158\u0001\u0000\u0000"+
		"\u0000\u0126\u0127\u0005\u00ad\u0000\u0000\u0127\u012b\u0005\u0010\u0000"+
		"\u0000\u0128\u012a\u0005\u00b2\u0000\u0000\u0129\u0128\u0001\u0000\u0000"+
		"\u0000\u012a\u012d\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012e\u0001\u0000\u0000"+
		"\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e\u0132\u0005\u000e\u0000"+
		"\u0000\u012f\u0131\u0005\u00b2\u0000\u0000\u0130\u012f\u0001\u0000\u0000"+
		"\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0135\u0001\u0000\u0000"+
		"\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u00ad\u0000"+
		"\u0000\u0136\u0147\u0005\u0010\u0000\u0000\u0137\u013a\u0005\u00ae\u0000"+
		"\u0000\u0138\u0139\u0005\b\u0000\u0000\u0139\u013b\u0003\u0018\f\u0000"+
		"\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000"+
		"\u013b\u0148\u0001\u0000\u0000\u0000\u013c\u013d\u0003\u0014\n\u0000\u013d"+
		"\u013e\u0005\u0011\u0000\u0000\u013e\u0148\u0001\u0000\u0000\u0000\u013f"+
		"\u0142\u0005\u00ae\u0000\u0000\u0140\u0141\u0005\b\u0000\u0000\u0141\u0143"+
		"\u0003\u0018\f\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0003"+
		"\u0014\n\u0000\u0145\u0146\u0005\u0011\u0000\u0000\u0146\u0148\u0001\u0000"+
		"\u0000\u0000\u0147\u0137\u0001\u0000\u0000\u0000\u0147\u013c\u0001\u0000"+
		"\u0000\u0000\u0147\u013f\u0001\u0000\u0000\u0000\u0148\u0153\u0001\u0000"+
		"\u0000\u0000\u0149\u014b\u0005\u00b2\u0000\u0000\u014a\u0149\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014f\u0001\u0000"+
		"\u0000\u0000\u014e\u0150\u0003\u0010\b\u0000\u014f\u014e\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0152\u0001\u0000\u0000"+
		"\u0000\u0151\u014a\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000\u0000"+
		"\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000"+
		"\u0000\u0154\u0156\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000"+
		"\u0000\u0156\u0158\u0005\u000f\u0000\u0000\u0157\u0121\u0001\u0000\u0000"+
		"\u0000\u0157\u0126\u0001\u0000\u0000\u0000\u0158\u0011\u0001\u0000\u0000"+
		"\u0000\u0159\u018d\u0007\u0004\u0000\u0000\u015a\u015b\u0005\u0015\u0000"+
		"\u0000\u015b\u015c\u0003\u0014\n\u0000\u015c\u015d\u0005\u0016\u0000\u0000"+
		"\u015d\u018d\u0001\u0000\u0000\u0000\u015e\u015f\u0005\u0017\u0000\u0000"+
		"\u015f\u0160\u0005\u0015\u0000\u0000\u0160\u0165\u0003\u0014\n\u0000\u0161"+
		"\u0162\u0005\u000b\u0000\u0000\u0162\u0164\u0003\u0014\n\u0000\u0163\u0161"+
		"\u0001\u0000\u0000\u0000\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0163"+
		"\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0168"+
		"\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0168\u0169"+
		"\u0005\u0016\u0000\u0000\u0169\u018d\u0001\u0000\u0000\u0000\u016a\u018d"+
		"\u0005\u0017\u0000\u0000\u016b\u016c\u0005\u00ae\u0000\u0000\u016c\u016d"+
		"\u0005\u0015\u0000\u0000\u016d\u0172\u0003\u0014\n\u0000\u016e\u016f\u0005"+
		"\u000b\u0000\u0000\u016f\u0171\u0003\u0014\n\u0000\u0170\u016e\u0001\u0000"+
		"\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000"+
		"\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0175\u0001\u0000"+
		"\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175\u0176\u0005\u0016"+
		"\u0000\u0000\u0176\u018d\u0001\u0000\u0000\u0000\u0177\u018d\u0005\u00ae"+
		"\u0000\u0000\u0178\u018d\u0005\u00ad\u0000\u0000\u0179\u018d\u0005\u00b0"+
		"\u0000\u0000\u017a\u018d\u0005\u00af\u0000\u0000\u017b\u018d\u0005\u00b8"+
		"\u0000\u0000\u017c\u017d\u0007\u0005\u0000\u0000\u017d\u017e\u0005\u0010"+
		"\u0000\u0000\u017e\u018d\u0005\u00ae\u0000\u0000\u017f\u0180\u0007\u0006"+
		"\u0000\u0000\u0180\u0189\u0005\u0015\u0000\u0000\u0181\u0186\u0003>\u001f"+
		"\u0000\u0182\u0183\u0005\u000b\u0000\u0000\u0183\u0185\u0003>\u001f\u0000"+
		"\u0184\u0182\u0001\u0000\u0000\u0000\u0185\u0188\u0001\u0000\u0000\u0000"+
		"\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000"+
		"\u0187\u018a\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000"+
		"\u0189\u0181\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000"+
		"\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018d\u0005\u0016\u0000\u0000"+
		"\u018c\u0159\u0001\u0000\u0000\u0000\u018c\u015a\u0001\u0000\u0000\u0000"+
		"\u018c\u015e\u0001\u0000\u0000\u0000\u018c\u016a\u0001\u0000\u0000\u0000"+
		"\u018c\u016b\u0001\u0000\u0000\u0000\u018c\u0177\u0001\u0000\u0000\u0000"+
		"\u018c\u0178\u0001\u0000\u0000\u0000\u018c\u0179\u0001\u0000\u0000\u0000"+
		"\u018c\u017a\u0001\u0000\u0000\u0000\u018c\u017b\u0001\u0000\u0000\u0000"+
		"\u018c\u017c\u0001\u0000\u0000\u0000\u018c\u017f\u0001\u0000\u0000\u0000"+
		"\u018d\u0013\u0001\u0000\u0000\u0000\u018e\u018f\u0006\n\uffff\uffff\u0000"+
		"\u018f\u0194\u0003\u0012\t\u0000\u0190\u0191\u0005\u0010\u0000\u0000\u0191"+
		"\u0193\u0005\u00ae\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0193"+
		"\u0196\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0194"+
		"\u0195\u0001\u0000\u0000\u0000\u0195\u019d\u0001\u0000\u0000\u0000\u0196"+
		"\u0194\u0001\u0000\u0000\u0000\u0197\u0198\u0005\u0007\u0000\u0000\u0198"+
		"\u019d\u0003\u0014\n\r\u0199\u019a\u0007\u0007\u0000\u0000\u019a\u019d"+
		"\u0003\u0014\n\f\u019b\u019d\u0003\u0016\u000b\u0000\u019c\u018e\u0001"+
		"\u0000\u0000\u0000\u019c\u0197\u0001\u0000\u0000\u0000\u019c\u0199\u0001"+
		"\u0000\u0000\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019d\u01dc\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\n\u000b\u0000\u0000\u019f\u01a1\u0007\b"+
		"\u0000\u0000\u01a0\u01a2\u0005\u00b2\u0000\u0000\u01a1\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a3\u01db\u0003\u0014\n\f\u01a4\u01a5\n\n\u0000\u0000\u01a5"+
		"\u01a7\u0007\t\u0000\u0000\u01a6\u01a8\u0005\u00b2\u0000\u0000\u01a7\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u0001\u0000\u0000\u0000\u01a9\u01db\u0003\u0014\n\u000b\u01aa\u01ab\n"+
		"\t\u0000\u0000\u01ab\u01ad\u0005L\u0000\u0000\u01ac\u01ae\u0005\u00b2"+
		"\u0000\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000"+
		"\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01db\u0003\u0014"+
		"\n\t\u01b0\u01b1\n\b\u0000\u0000\u01b1\u01b3\u0005M\u0000\u0000\u01b2"+
		"\u01b4\u0005\u00b2\u0000\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5"+
		"\u01db\u0003\u0014\n\t\u01b6\u01b7\n\u0007\u0000\u0000\u01b7\u01b9\u0007"+
		"\n\u0000\u0000\u01b8\u01ba\u0005\u00b2\u0000\u0000\u01b9\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bb\u01db\u0003\u0014\n\b\u01bc\u01bd\n\u0006\u0000\u0000"+
		"\u01bd\u01bf\u0007\u000b\u0000\u0000\u01be\u01c0\u0005\u00b2\u0000\u0000"+
		"\u01bf\u01be\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01db\u0003\u0014\n\u0007\u01c2"+
		"\u01c3\n\u0005\u0000\u0000\u01c3\u01c5\u0007\f\u0000\u0000\u01c4\u01c6"+
		"\u0005\u00b2\u0000\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c5\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01db"+
		"\u0003\u0014\n\u0006\u01c8\u01c9\n\u0004\u0000\u0000\u01c9\u01cb\u0007"+
		"\r\u0000\u0000\u01ca\u01cc\u0005\u00b2\u0000\u0000\u01cb\u01ca\u0001\u0000"+
		"\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000"+
		"\u0000\u0000\u01cd\u01db\u0003\u0014\n\u0005\u01ce\u01cf\n\u0003\u0000"+
		"\u0000\u01cf\u01d1\u0007\u000e\u0000\u0000\u01d0\u01d2\u0005\u00b2\u0000"+
		"\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01db\u0003\u0014\n\u0004"+
		"\u01d4\u01d5\n\u0002\u0000\u0000\u01d5\u01d7\u0007\u000f\u0000\u0000\u01d6"+
		"\u01d8\u0005\u00b2\u0000\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9"+
		"\u01db\u0003\u0014\n\u0002\u01da\u019e\u0001\u0000\u0000\u0000\u01da\u01a4"+
		"\u0001\u0000\u0000\u0000\u01da\u01aa\u0001\u0000\u0000\u0000\u01da\u01b0"+
		"\u0001\u0000\u0000\u0000\u01da\u01b6\u0001\u0000\u0000\u0000\u01da\u01bc"+
		"\u0001\u0000\u0000\u0000\u01da\u01c2\u0001\u0000\u0000\u0000\u01da\u01c8"+
		"\u0001\u0000\u0000\u0000\u01da\u01ce\u0001\u0000\u0000\u0000\u01da\u01d4"+
		"\u0001\u0000\u0000\u0000\u01db\u01de\u0001\u0000\u0000\u0000\u01dc\u01da"+
		"\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u0015"+
		"\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df\u01e0"+
		"\u0007\u0010\u0000\u0000\u01e0\u01e5\u0005\u00ae\u0000\u0000\u01e1\u01e2"+
		"\u0005\u000b\u0000\u0000\u01e2\u01e4\u0005\u00ae\u0000\u0000\u01e3\u01e1"+
		"\u0001\u0000\u0000\u0000\u01e4\u01e7\u0001\u0000\u0000\u0000\u01e5\u01e3"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01f7"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e8\u01e9"+
		"\u0005\b\u0000\u0000\u01e9\u01f8\u0003\u0018\f\u0000\u01ea\u01eb\u0005"+
		"\b\u0000\u0000\u01eb\u01ec\u0005\u0015\u0000\u0000\u01ec\u01ee\u0003\u0014"+
		"\n\u0000\u01ed\u01ef\u0005N\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f2\u0005o\u0000\u0000\u01f1\u01f3\u0005N\u0000\u0000\u01f2"+
		"\u01f1\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f5\u0003\u0014\n\u0000\u01f5\u01f6"+
		"\u0005\u0016\u0000\u0000\u01f6\u01f8\u0001\u0000\u0000\u0000\u01f7\u01e8"+
		"\u0001\u0000\u0000\u0000\u01f7\u01ea\u0001\u0000\u0000\u0000\u01f7\u01f8"+
		"\u0001\u0000\u0000\u0000\u01f8\u01fa\u0001\u0000\u0000\u0000\u01f9\u01fb"+
		"\u0005\u00b2\u0000\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fa\u01fb"+
		"\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fd"+
		"\u0003\u0014\n\u0000\u01fd\u0017\u0001\u0000\u0000\u0000\u01fe\u01ff\u0007"+
		"\u0011\u0000\u0000\u01ff\u0019\u0001\u0000\u0000\u0000\u0200\u0286\u0005"+
		"p\u0000\u0000\u0201\u0205\u0005q\u0000\u0000\u0202\u0203\u0007\u0012\u0000"+
		"\u0000\u0203\u0205\u0005\u00ae\u0000\u0000\u0204\u0201\u0001\u0000\u0000"+
		"\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000"+
		"\u0000\u0206\u0207\u0005\u00ad\u0000\u0000\u0207\u0286\u0005\u00ad\u0000"+
		"\u0000\u0208\u020c\u0007\u0013\u0000\u0000\u0209\u020a\u0007\u0012\u0000"+
		"\u0000\u020a\u020c\u0005\u00ae\u0000\u0000\u020b\u0208\u0001\u0000\u0000"+
		"\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000"+
		"\u0000\u020d\u0286\u0005\u00ad\u0000\u0000\u020e\u0212\u0007\u0014\u0000"+
		"\u0000\u020f\u0210\u0007\u0015\u0000\u0000\u0210\u0212\u0005\u00ae\u0000"+
		"\u0000\u0211\u020e\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000"+
		"\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u0286\u0005\u00ad\u0000"+
		"\u0000\u0214\u0218\u0007\u0016\u0000\u0000\u0215\u0216\u0007\u0015\u0000"+
		"\u0000\u0216\u0218\u0005\u00ae\u0000\u0000\u0217\u0214\u0001\u0000\u0000"+
		"\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000"+
		"\u0000\u0219\u021a\u0005\u00ad\u0000\u0000\u021a\u021b\u0005\u00ad\u0000"+
		"\u0000\u021b\u0286\u0005\u00ad\u0000\u0000\u021c\u021d\u0005z\u0000\u0000"+
		"\u021d\u0286\u0005\u00ad\u0000\u0000\u021e\u021f\u0005{\u0000\u0000\u021f"+
		"\u0220\u0005\u00ad\u0000\u0000\u0220\u0286\u0005\u00ad\u0000\u0000\u0221"+
		"\u0222\u0004\r\n\u0000\u0222\u0223\u0007\u0017\u0000\u0000\u0223\u0224"+
		"\u0005\u00ae\u0000\u0000\u0224\u0286\u0005\u00ad\u0000\u0000\u0225\u0226"+
		"\u0004\r\u000b\u0000\u0226\u0227\u0007\u0017\u0000\u0000\u0227\u0228\u0005"+
		"\u00ae\u0000\u0000\u0228\u0229\u0005\u00ad\u0000\u0000\u0229\u0286\u0005"+
		"\u00ad\u0000\u0000\u022a\u022b\u0007\u0018\u0000\u0000\u022b\u0286\u0005"+
		"\u00ad\u0000\u0000\u022c\u022d\u0007\u0019\u0000\u0000\u022d\u022e\u0005"+
		"\u00ad\u0000\u0000\u022e\u0286\u0005\u00ad\u0000\u0000\u022f\u0230\u0004"+
		"\r\f\u0000\u0230\u0231\u0007\u001a\u0000\u0000\u0231\u0232\u0005\u00ae"+
		"\u0000\u0000\u0232\u0286\u0005\u00ad\u0000\u0000\u0233\u0234\u0004\r\r"+
		"\u0000\u0234\u0235\u0007\u001a\u0000\u0000\u0235\u0236\u0005\u00ae\u0000"+
		"\u0000\u0236\u0237\u0005\u00ad\u0000\u0000\u0237\u0286\u0005\u00ad\u0000"+
		"\u0000\u0238\u023c\u0007\u001b\u0000\u0000\u0239\u023a\u0007\u001c\u0000"+
		"\u0000\u023a\u023c\u0005\u00ae\u0000\u0000\u023b\u0238\u0001\u0000\u0000"+
		"\u0000\u023b\u0239\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000"+
		"\u0000\u023d\u0286\u0005\u00ad\u0000\u0000\u023e\u023f\u0005\u0082\u0000"+
		"\u0000\u023f\u0286\u0005\u00ad\u0000\u0000\u0240\u0241\u0005\u0083\u0000"+
		"\u0000\u0241\u0242\u0005\u00ad\u0000\u0000\u0242\u0286\u0005\u00ad\u0000"+
		"\u0000\u0243\u0244\u0005\u0084\u0000\u0000\u0244\u0245\u0005\u00ad\u0000"+
		"\u0000\u0245\u0286\u0005\u00ad\u0000\u0000\u0246\u024a\u0005\u0085\u0000"+
		"\u0000\u0247\u0249\u0005\u00ad\u0000\u0000\u0248\u0247\u0001\u0000\u0000"+
		"\u0000\u0249\u024c\u0001\u0000\u0000\u0000\u024a\u0248\u0001\u0000\u0000"+
		"\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u0286\u0001\u0000\u0000"+
		"\u0000\u024c\u024a\u0001\u0000\u0000\u0000\u024d\u024e\u0007\u001d\u0000"+
		"\u0000\u024e\u0286\u0005\u00ad\u0000\u0000\u024f\u0250\u0007\u001e\u0000"+
		"\u0000\u0250\u0252\u0005\u00ad\u0000\u0000\u0251\u0253\u0003\u0014\n\u0000"+
		"\u0252\u0251\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000"+
		"\u0254\u0252\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000"+
		"\u0255\u0286\u0001\u0000\u0000\u0000\u0256\u0257\u0004\r\u000e\u0000\u0257"+
		"\u0258\u0005j\u0000\u0000\u0258\u0259\u0005\u00ae\u0000\u0000\u0259\u0286"+
		"\u0005\u00ad\u0000\u0000\u025a\u025b\u0004\r\u000f\u0000\u025b\u025c\u0005"+
		"j\u0000\u0000\u025c\u025d\u0005\u00ae\u0000\u0000\u025d\u025f\u0005\u00ad"+
		"\u0000\u0000\u025e\u0260\u0003\u0014\n\u0000\u025f\u025e\u0001\u0000\u0000"+
		"\u0000\u0260\u0261\u0001\u0000\u0000\u0000\u0261\u025f\u0001\u0000\u0000"+
		"\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0286\u0001\u0000\u0000"+
		"\u0000\u0263\u0264\u0007\u001f\u0000\u0000\u0264\u0266\u0005\u00ad\u0000"+
		"\u0000\u0265\u0267\u0003\u0014\n\u0000\u0266\u0265\u0001\u0000\u0000\u0000"+
		"\u0267\u0268\u0001\u0000\u0000\u0000\u0268\u0266\u0001\u0000\u0000\u0000"+
		"\u0268\u0269\u0001\u0000\u0000\u0000\u0269\u0286\u0001\u0000\u0000\u0000"+
		"\u026a\u026b\u0007 \u0000\u0000\u026b\u026c\u0005\u00ad\u0000\u0000\u026c"+
		"\u0286\u0005\u00ad\u0000\u0000\u026d\u026e\u0004\r\u0010\u0000\u026e\u026f"+
		"\u0005n\u0000\u0000\u026f\u0270\u0005\u00ae\u0000\u0000\u0270\u0272\u0005"+
		"\u00ad\u0000\u0000\u0271\u0273\u0003\u0014\n\u0000\u0272\u0271\u0001\u0000"+
		"\u0000\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274\u0272\u0001\u0000"+
		"\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0286\u0001\u0000"+
		"\u0000\u0000\u0276\u0277\u0004\r\u0011\u0000\u0277\u0278\u0005n\u0000"+
		"\u0000\u0278\u0279\u0005\u00ae\u0000\u0000\u0279\u027a\u0005\u00ad\u0000"+
		"\u0000\u027a\u0286\u0005\u00ad\u0000\u0000\u027b\u0286\u0005\u0092\u0000"+
		"\u0000\u027c\u027d\u0005\u0093\u0000\u0000\u027d\u0286\u0005\u00ae\u0000"+
		"\u0000\u027e\u0282\u0005\u0094\u0000\u0000\u027f\u0281\u0005\u00ad\u0000"+
		"\u0000\u0280\u027f\u0001\u0000\u0000\u0000\u0281\u0284\u0001\u0000\u0000"+
		"\u0000\u0282\u0280\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000"+
		"\u0000\u0283\u0286\u0001\u0000\u0000\u0000\u0284\u0282\u0001\u0000\u0000"+
		"\u0000\u0285\u0200\u0001\u0000\u0000\u0000\u0285\u0204\u0001\u0000\u0000"+
		"\u0000\u0285\u020b\u0001\u0000\u0000\u0000\u0285\u0211\u0001\u0000\u0000"+
		"\u0000\u0285\u0217\u0001\u0000\u0000\u0000\u0285\u021c\u0001\u0000\u0000"+
		"\u0000\u0285\u021e\u0001\u0000\u0000\u0000\u0285\u0221\u0001\u0000\u0000"+
		"\u0000\u0285\u0225\u0001\u0000\u0000\u0000\u0285\u022a\u0001\u0000\u0000"+
		"\u0000\u0285\u022c\u0001\u0000\u0000\u0000\u0285\u022f\u0001\u0000\u0000"+
		"\u0000\u0285\u0233\u0001\u0000\u0000\u0000\u0285\u023b\u0001\u0000\u0000"+
		"\u0000\u0285\u023e\u0001\u0000\u0000\u0000\u0285\u0240\u0001\u0000\u0000"+
		"\u0000\u0285\u0243\u0001\u0000\u0000\u0000\u0285\u0246\u0001\u0000\u0000"+
		"\u0000\u0285\u024d\u0001\u0000\u0000\u0000\u0285\u024f\u0001\u0000\u0000"+
		"\u0000\u0285\u0256\u0001\u0000\u0000\u0000\u0285\u025a\u0001\u0000\u0000"+
		"\u0000\u0285\u0263\u0001\u0000\u0000\u0000\u0285\u026a\u0001\u0000\u0000"+
		"\u0000\u0285\u026d\u0001\u0000\u0000\u0000\u0285\u0276\u0001\u0000\u0000"+
		"\u0000\u0285\u027b\u0001\u0000\u0000\u0000\u0285\u027c\u0001\u0000\u0000"+
		"\u0000\u0285\u027e\u0001\u0000\u0000\u0000\u0286\u001b\u0001\u0000\u0000"+
		"\u0000\u0287\u0289\u0005\u00b2\u0000\u0000\u0288\u0287\u0001\u0000\u0000"+
		"\u0000\u0289\u028c\u0001\u0000\u0000\u0000\u028a\u0288\u0001\u0000\u0000"+
		"\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u0295\u0001\u0000\u0000"+
		"\u0000\u028c\u028a\u0001\u0000\u0000\u0000\u028d\u028f\u0003\u001e\u000f"+
		"\u0000\u028e\u0290\u0005\u00b2\u0000\u0000\u028f\u028e\u0001\u0000\u0000"+
		"\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000\u0000"+
		"\u0000\u0291\u0292\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000"+
		"\u0000\u0293\u0294\u00030\u0018\u0000\u0294\u0296\u0001\u0000\u0000\u0000"+
		"\u0295\u028d\u0001\u0000\u0000\u0000\u0295\u0296\u0001\u0000\u0000\u0000"+
		"\u0296\u001d\u0001\u0000\u0000\u0000\u0297\u0298\u0005\u0095\u0000\u0000"+
		"\u0298\u0299\u0005\u00ae\u0000\u0000\u0299\u029a\u0005\u0010\u0000\u0000"+
		"\u029a\u029b\u0005\u00ae\u0000\u0000\u029b\u029c\u0005\u0010\u0000\u0000"+
		"\u029c\u029d\u0005\u00ae\u0000\u0000\u029d\u029e\u0005\u0010\u0000\u0000"+
		"\u029e\u029f\u0005\u0096\u0000\u0000\u029f\u001f\u0001\u0000\u0000\u0000"+
		"\u02a0\u02a4\u0005\u000e\u0000\u0000\u02a1\u02a3\u0005\u00b2\u0000\u0000"+
		"\u02a2\u02a1\u0001\u0000\u0000\u0000\u02a3\u02a6\u0001\u0000\u0000\u0000"+
		"\u02a4\u02a2\u0001\u0000\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000"+
		"\u02a5\u02a7\u0001\u0000\u0000\u0000\u02a6\u02a4\u0001\u0000\u0000\u0000"+
		"\u02a7\u02ab\u0005\u0093\u0000\u0000\u02a8\u02aa\u0005\u00b2\u0000\u0000"+
		"\u02a9\u02a8\u0001\u0000\u0000\u0000\u02aa\u02ad\u0001\u0000\u0000\u0000"+
		"\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000"+
		"\u02ac\u02ae\u0001\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000"+
		"\u02ae\u02b9\u0003\"\u0011\u0000\u02af\u02b1\u0005\u00b2\u0000\u0000\u02b0"+
		"\u02af\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b2"+
		"\u02b0\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3"+
		"\u02b5\u0001\u0000\u0000\u0000\u02b4\u02b6\u0003\"\u0011\u0000\u02b5\u02b4"+
		"\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6\u02b8"+
		"\u0001\u0000\u0000\u0000\u02b7\u02b0\u0001\u0000\u0000\u0000\u02b8\u02bb"+
		"\u0001\u0000\u0000\u0000\u02b9\u02b7\u0001\u0000\u0000\u0000\u02b9\u02ba"+
		"\u0001\u0000\u0000\u0000\u02ba\u02bc\u0001\u0000\u0000\u0000\u02bb\u02b9"+
		"\u0001\u0000\u0000\u0000\u02bc\u02c0\u0005\u000f\u0000\u0000\u02bd\u02bf"+
		"\u0005\u00b2\u0000\u0000\u02be\u02bd\u0001\u0000\u0000\u0000\u02bf\u02c2"+
		"\u0001\u0000\u0000\u0000\u02c0\u02be\u0001\u0000\u0000\u0000\u02c0\u02c1"+
		"\u0001\u0000\u0000\u0000\u02c1!\u0001\u0000\u0000\u0000\u02c2\u02c0\u0001"+
		"\u0000\u0000\u0000\u02c3\u02c6\u0003$\u0012\u0000\u02c4\u02c6\u0003&\u0013"+
		"\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c5\u02c4\u0001\u0000\u0000"+
		"\u0000\u02c6#\u0001\u0000\u0000\u0000\u02c7\u02c8\u0005\u00ae\u0000\u0000"+
		"\u02c8\u02c9\u0005\u0010\u0000\u0000\u02c9\u02ca\u0003\u0014\n\u0000\u02ca"+
		"%\u0001\u0000\u0000\u0000\u02cb\u02cc\u0005\u0097\u0000\u0000\u02cc\u02ce"+
		"\u0005\u00ae\u0000\u0000\u02cd\u02cf\u0005\u00b2\u0000\u0000\u02ce\u02cd"+
		"\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cf\u02d0"+
		"\u0001\u0000\u0000\u0000\u02d0\u02d1\u0005\u0015\u0000\u0000\u02d1\u02d6"+
		"\u0003.\u0017\u0000\u02d2\u02d3\u0005\u000b\u0000\u0000\u02d3\u02d5\u0003"+
		".\u0017\u0000\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d5\u02d8\u0001\u0000"+
		"\u0000\u0000\u02d6\u02d4\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000"+
		"\u0000\u0000\u02d7\u02d9\u0001\u0000\u0000\u0000\u02d8\u02d6\u0001\u0000"+
		"\u0000\u0000\u02d9\u02da\u0005\u0016\u0000\u0000\u02da\u02db\u0005\b\u0000"+
		"\u0000\u02db\u02dd\u0003\u0018\f\u0000\u02dc\u02de\u0003(\u0014\u0000"+
		"\u02dd\u02dc\u0001\u0000\u0000\u0000\u02dd\u02de\u0001\u0000\u0000\u0000"+
		"\u02de\'\u0001\u0000\u0000\u0000\u02df\u02e1\u0005\u00b2\u0000\u0000\u02e0"+
		"\u02df\u0001\u0000\u0000\u0000\u02e1\u02e4\u0001\u0000\u0000\u0000\u02e2"+
		"\u02e0\u0001\u0000\u0000\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000\u02e3"+
		"\u02e5\u0001\u0000\u0000\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000\u02e5"+
		"\u02ee\u0003*\u0015\u0000\u02e6\u02e8\u0005\u00b2\u0000\u0000\u02e7\u02e6"+
		"\u0001\u0000\u0000\u0000\u02e8\u02e9\u0001\u0000\u0000\u0000\u02e9\u02e7"+
		"\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea\u02eb"+
		"\u0001\u0000\u0000\u0000\u02eb\u02ed\u0003*\u0015\u0000\u02ec\u02e7\u0001"+
		"\u0000\u0000\u0000\u02ed\u02f0\u0001\u0000\u0000\u0000\u02ee\u02ec\u0001"+
		"\u0000\u0000\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000\u02ef\u02f9\u0001"+
		"\u0000\u0000\u0000\u02f0\u02ee\u0001\u0000\u0000\u0000\u02f1\u02f3\u0005"+
		"\u00b2\u0000\u0000\u02f2\u02f1\u0001\u0000\u0000\u0000\u02f3\u02f6\u0001"+
		"\u0000\u0000\u0000\u02f4\u02f2\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001"+
		"\u0000\u0000\u0000\u02f5\u02f7\u0001\u0000\u0000\u0000\u02f6\u02f4\u0001"+
		"\u0000\u0000\u0000\u02f7\u02f9\u0003,\u0016\u0000\u02f8\u02e2\u0001\u0000"+
		"\u0000\u0000\u02f8\u02f4\u0001\u0000\u0000\u0000\u02f9)\u0001\u0000\u0000"+
		"\u0000\u02fa\u02fb\u0005W\u0000\u0000\u02fb\u02fc\u0003\u0014\n\u0000"+
		"\u02fc\u0300\u0005\u000b\u0000\u0000\u02fd\u02ff\u0005\u00b2\u0000\u0000"+
		"\u02fe\u02fd\u0001\u0000\u0000\u0000\u02ff\u0302\u0001\u0000\u0000\u0000"+
		"\u0300\u02fe\u0001\u0000\u0000\u0000\u0300\u0301\u0001\u0000\u0000\u0000"+
		"\u0301\u0303\u0001\u0000\u0000\u0000\u0302\u0300\u0001\u0000\u0000\u0000"+
		"\u0303\u0304\u0005\u0098\u0000\u0000\u0304\u0305\u0003\u0014\n\u0000\u0305"+
		"\u0306\u0005\u0015\u0000\u0000\u0306\u0307\u0005\u00ae\u0000\u0000\u0307"+
		"\u0308\u0005\u0016\u0000\u0000\u0308+\u0001\u0000\u0000\u0000\u0309\u030a"+
		"\u0005W\u0000\u0000\u030a\u030b\u0003\u0014\n\u0000\u030b-\u0001\u0000"+
		"\u0000\u0000\u030c\u030d\u0005\u00ae\u0000\u0000\u030d\u030e\u0005\b\u0000"+
		"\u0000\u030e\u030f\u0003\u0018\f\u0000\u030f/\u0001\u0000\u0000\u0000"+
		"\u0310\u0312\u00032\u0019\u0000\u0311\u0310\u0001\u0000\u0000\u0000\u0311"+
		"\u0312\u0001\u0000\u0000\u0000\u0312\u031d\u0001\u0000\u0000\u0000\u0313"+
		"\u0315\u0005\u00b2\u0000\u0000\u0314\u0313\u0001\u0000\u0000\u0000\u0315"+
		"\u0316\u0001\u0000\u0000\u0000\u0316\u0314\u0001\u0000\u0000\u0000\u0316"+
		"\u0317\u0001\u0000\u0000\u0000\u0317\u0319\u0001\u0000\u0000\u0000\u0318"+
		"\u031a\u00032\u0019\u0000\u0319\u0318\u0001\u0000\u0000\u0000\u0319\u031a"+
		"\u0001\u0000\u0000\u0000\u031a\u031c\u0001\u0000\u0000\u0000\u031b\u0314"+
		"\u0001\u0000\u0000\u0000\u031c\u031f\u0001\u0000\u0000\u0000\u031d\u031b"+
		"\u0001\u0000\u0000\u0000\u031d\u031e\u0001\u0000\u0000\u0000\u031e1\u0001"+
		"\u0000\u0000\u0000\u031f\u031d\u0001\u0000\u0000\u0000\u0320\u0321\u0007"+
		"!\u0000\u0000\u0321\u0322\u0005\u00ae\u0000\u0000\u0322\u0323\u0005\b"+
		"\u0000\u0000\u0323\u0324\u0003\u0018\f\u0000\u0324\u0326\u0005W\u0000"+
		"\u0000\u0325\u0327\u0005\u00b2\u0000\u0000\u0326\u0325\u0001\u0000\u0000"+
		"\u0000\u0326\u0327\u0001\u0000\u0000\u0000\u0327\u0328\u0001\u0000\u0000"+
		"\u0000\u0328\u0329\u0003>\u001f\u0000\u0329\u038e\u0001\u0000\u0000\u0000"+
		"\u032a\u032b\u0005\u00ae\u0000\u0000\u032b\u032d\u0005W\u0000\u0000\u032c"+
		"\u032e\u0005\u00b2\u0000\u0000\u032d\u032c\u0001\u0000\u0000\u0000\u032d"+
		"\u032e\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000\u0000\u0000\u032f"+
		"\u038e\u0003>\u001f\u0000\u0330\u0331\u0005\u0011\u0000\u0000\u0331\u0332"+
		"\u0005\u0015\u0000\u0000\u0332\u0333\u0003>\u001f\u0000\u0333\u0334\u0005"+
		"\u0016\u0000\u0000\u0334\u038e\u0001\u0000\u0000\u0000\u0335\u0336\u0005"+
		"\u009b\u0000\u0000\u0336\u0337\u0005\u0015\u0000\u0000\u0337\u0338\u0003"+
		">\u001f\u0000\u0338\u0339\u0005\u0016\u0000\u0000\u0339\u038e\u0001\u0000"+
		"\u0000\u0000\u033a\u033b\u0005\u0098\u0000\u0000\u033b\u033c\u0005\u0015"+
		"\u0000\u0000\u033c\u033d\u0003>\u001f\u0000\u033d\u0341\u0005\u0016\u0000"+
		"\u0000\u033e\u0340\u0005\u00b2\u0000\u0000\u033f\u033e\u0001\u0000\u0000"+
		"\u0000\u0340\u0343\u0001\u0000\u0000\u0000\u0341\u033f\u0001\u0000\u0000"+
		"\u0000\u0341\u0342\u0001\u0000\u0000\u0000\u0342\u0344\u0001\u0000\u0000"+
		"\u0000\u0343\u0341\u0001\u0000\u0000\u0000\u0344\u0345\u0005\u000e\u0000"+
		"\u0000\u0345\u034f\u00036\u001b\u0000\u0346\u034a\u0005\u009c\u0000\u0000"+
		"\u0347\u0349\u0005\u00b2\u0000\u0000\u0348\u0347\u0001\u0000\u0000\u0000"+
		"\u0349\u034c\u0001\u0000\u0000\u0000\u034a\u0348\u0001\u0000\u0000\u0000"+
		"\u034a\u034b\u0001\u0000\u0000\u0000\u034b\u034d\u0001\u0000\u0000\u0000"+
		"\u034c\u034a\u0001\u0000\u0000\u0000\u034d\u034e\u0005\u000e\u0000\u0000"+
		"\u034e\u0350\u00036\u001b\u0000\u034f\u0346\u0001\u0000\u0000\u0000\u034f"+
		"\u0350\u0001\u0000\u0000\u0000\u0350\u038e\u0001\u0000\u0000\u0000\u0351"+
		"\u0352\u0005\u009d\u0000\u0000\u0352\u0353\u0005\u0015\u0000\u0000\u0353"+
		"\u0354\u0003>\u001f\u0000\u0354\u0358\u0005\u0016\u0000\u0000\u0355\u0357"+
		"\u0005\u00b2\u0000\u0000\u0356\u0355\u0001\u0000\u0000\u0000\u0357\u035a"+
		"\u0001\u0000\u0000\u0000\u0358\u0356\u0001\u0000\u0000\u0000\u0358\u0359"+
		"\u0001\u0000\u0000\u0000\u0359\u035b\u0001\u0000\u0000\u0000\u035a\u0358"+
		"\u0001\u0000\u0000\u0000\u035b\u0366\u0005\u000e\u0000\u0000\u035c\u035e"+
		"\u0005\u00b2\u0000\u0000\u035d\u035c\u0001\u0000\u0000\u0000\u035e\u0361"+
		"\u0001\u0000\u0000\u0000\u035f\u035d\u0001\u0000\u0000\u0000\u035f\u0360"+
		"\u0001\u0000\u0000\u0000\u0360\u0362\u0001\u0000\u0000\u0000\u0361\u035f"+
		"\u0001\u0000\u0000\u0000\u0362\u0363\u0005\u009e\u0000\u0000\u0363\u0364"+
		"\u0003@ \u0000\u0364\u0365\u0005\u009f\u0000\u0000\u0365\u0367\u0001\u0000"+
		"\u0000\u0000\u0366\u035f\u0001\u0000\u0000\u0000\u0366\u0367\u0001\u0000"+
		"\u0000\u0000\u0367\u0368\u0001\u0000\u0000\u0000\u0368\u0369\u00036\u001b"+
		"\u0000\u0369\u038e\u0001\u0000\u0000\u0000\u036a\u036b\u0007\"\u0000\u0000"+
		"\u036b\u0374\u0005\u0015\u0000\u0000\u036c\u0371\u0003:\u001d\u0000\u036d"+
		"\u036e\u0005\u000b\u0000\u0000\u036e\u0370\u0003:\u001d\u0000\u036f\u036d"+
		"\u0001\u0000\u0000\u0000\u0370\u0373\u0001\u0000\u0000\u0000\u0371\u036f"+
		"\u0001\u0000\u0000\u0000\u0371\u0372\u0001\u0000\u0000\u0000\u0372\u0375"+
		"\u0001\u0000\u0000\u0000\u0373\u0371\u0001\u0000\u0000\u0000\u0374\u036c"+
		"\u0001\u0000\u0000\u0000\u0374\u0375\u0001\u0000\u0000\u0000\u0375\u0376"+
		"\u0001\u0000\u0000\u0000\u0376\u038e\u0005\u0016\u0000\u0000\u0377\u0378"+
		"\u0005\u00ae\u0000\u0000\u0378\u0379\u0005\u0015\u0000\u0000\u0379\u037a"+
		"\u0003>\u001f\u0000\u037a\u037b\u0005\u0016\u0000\u0000\u037b\u037d\u0005"+
		"W\u0000\u0000\u037c\u037e\u0005\u00b2\u0000\u0000\u037d\u037c\u0001\u0000"+
		"\u0000\u0000\u037d\u037e\u0001\u0000\u0000\u0000\u037e\u037f\u0001\u0000"+
		"\u0000\u0000\u037f\u0380\u0003>\u001f\u0000\u0380\u038e\u0001\u0000\u0000"+
		"\u0000\u0381\u038e\u00034\u001a\u0000\u0382\u0387\u0005\u009e\u0000\u0000"+
		"\u0383\u0388\u0003\u000e\u0007\u0000\u0384\u0388\u0003\f\u0006\u0000\u0385"+
		"\u0388\u0003F#\u0000\u0386\u0388\u0003 \u0010\u0000\u0387\u0383\u0001"+
		"\u0000\u0000\u0000\u0387\u0384\u0001\u0000\u0000\u0000\u0387\u0385\u0001"+
		"\u0000\u0000\u0000\u0387\u0386\u0001\u0000\u0000\u0000\u0388\u0389\u0001"+
		"\u0000\u0000\u0000\u0389\u038a\u0005\u009f\u0000\u0000\u038a\u038e\u0001"+
		"\u0000\u0000\u0000\u038b\u038e\u0003\u001e\u000f\u0000\u038c\u038e\u0003"+
		">\u001f\u0000\u038d\u0320\u0001\u0000\u0000\u0000\u038d\u032a\u0001\u0000"+
		"\u0000\u0000\u038d\u0330\u0001\u0000\u0000\u0000\u038d\u0335\u0001\u0000"+
		"\u0000\u0000\u038d\u033a\u0001\u0000\u0000\u0000\u038d\u0351\u0001\u0000"+
		"\u0000\u0000\u038d\u036a\u0001\u0000\u0000\u0000\u038d\u0377\u0001\u0000"+
		"\u0000\u0000\u038d\u0381\u0001\u0000\u0000\u0000\u038d\u0382\u0001\u0000"+
		"\u0000\u0000\u038d\u038b\u0001\u0000\u0000\u0000\u038d\u038c\u0001\u0000"+
		"\u0000\u0000\u038e3\u0001\u0000\u0000\u0000\u038f\u0393\u0005\u00a2\u0000"+
		"\u0000\u0390\u0392\u0005\u00b2\u0000\u0000\u0391\u0390\u0001\u0000\u0000"+
		"\u0000\u0392\u0395\u0001\u0000\u0000\u0000\u0393\u0391\u0001\u0000\u0000"+
		"\u0000\u0393\u0394\u0001\u0000\u0000\u0000\u0394\u0396\u0001\u0000\u0000"+
		"\u0000\u0395\u0393\u0001\u0000\u0000\u0000\u0396\u039a\u0005\u00ae\u0000"+
		"\u0000\u0397\u0399\u0005\u00b2\u0000\u0000\u0398\u0397\u0001\u0000\u0000"+
		"\u0000\u0399\u039c\u0001\u0000\u0000\u0000\u039a\u0398\u0001\u0000\u0000"+
		"\u0000\u039a\u039b\u0001\u0000\u0000\u0000\u039b\u039e\u0001\u0000\u0000"+
		"\u0000\u039c\u039a\u0001\u0000\u0000\u0000\u039d\u038f\u0001\u0000\u0000"+
		"\u0000\u039e\u03a1\u0001\u0000\u0000\u0000\u039f\u039d\u0001\u0000\u0000"+
		"\u0000\u039f\u03a0\u0001\u0000\u0000\u0000\u03a0\u03a2\u0001\u0000\u0000"+
		"\u0000\u03a1\u039f\u0001\u0000\u0000\u0000\u03a2\u03a3\u0005\u0097\u0000"+
		"\u0000\u03a3\u03a5\u0005\u00ae\u0000\u0000\u03a4\u03a6\u0005\u00b2\u0000"+
		"\u0000\u03a5\u03a4\u0001\u0000\u0000\u0000\u03a5\u03a6\u0001\u0000\u0000"+
		"\u0000\u03a6\u03a7\u0001\u0000\u0000\u0000\u03a7\u03b0\u0005\u0015\u0000"+
		"\u0000\u03a8\u03ad\u0003.\u0017\u0000\u03a9\u03aa\u0005\u000b\u0000\u0000"+
		"\u03aa\u03ac\u0003.\u0017\u0000\u03ab\u03a9\u0001\u0000\u0000\u0000\u03ac"+
		"\u03af\u0001\u0000\u0000\u0000\u03ad\u03ab\u0001\u0000\u0000\u0000\u03ad"+
		"\u03ae\u0001\u0000\u0000\u0000\u03ae\u03b1\u0001\u0000\u0000\u0000\u03af"+
		"\u03ad\u0001\u0000\u0000\u0000\u03b0\u03a8\u0001\u0000\u0000\u0000\u03b0"+
		"\u03b1\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001\u0000\u0000\u0000\u03b2"+
		"\u03b3\u0005\u0016\u0000\u0000\u03b3\u03b6\u0005\b\u0000\u0000\u03b4\u03b7"+
		"\u0003\u0018\f\u0000\u03b5\u03b7\u0005\u00a3\u0000\u0000\u03b6\u03b4\u0001"+
		"\u0000\u0000\u0000\u03b6\u03b5\u0001\u0000\u0000\u0000\u03b7\u03b8\u0001"+
		"\u0000\u0000\u0000\u03b8\u03bc\u0005W\u0000\u0000\u03b9\u03bb\u0005\u00b2"+
		"\u0000\u0000\u03ba\u03b9\u0001\u0000\u0000\u0000\u03bb\u03be\u0001\u0000"+
		"\u0000\u0000\u03bc\u03ba\u0001\u0000\u0000\u0000\u03bc\u03bd\u0001\u0000"+
		"\u0000\u0000\u03bd\u03bf\u0001\u0000\u0000\u0000\u03be\u03bc\u0001\u0000"+
		"\u0000\u0000\u03bf\u03d0\u0005\u000e\u0000\u0000\u03c0\u03c2\u0005\u00b2"+
		"\u0000\u0000\u03c1\u03c0\u0001\u0000\u0000\u0000\u03c2\u03c5\u0001\u0000"+
		"\u0000\u0000\u03c3\u03c1\u0001\u0000\u0000\u0000\u03c3\u03c4\u0001\u0000"+
		"\u0000\u0000\u03c4\u03c6\u0001\u0000\u0000\u0000\u03c5\u03c3\u0001\u0000"+
		"\u0000\u0000\u03c6\u03c7\u0005\u009e\u0000\u0000\u03c7\u03cb\u0003D\""+
		"\u0000\u03c8\u03ca\u0005\u00b2\u0000\u0000\u03c9\u03c8\u0001\u0000\u0000"+
		"\u0000\u03ca\u03cd\u0001\u0000\u0000\u0000\u03cb\u03c9\u0001\u0000\u0000"+
		"\u0000\u03cb\u03cc\u0001\u0000\u0000\u0000\u03cc\u03ce\u0001\u0000\u0000"+
		"\u0000\u03cd\u03cb\u0001\u0000\u0000\u0000\u03ce\u03cf\u0005\u009f\u0000"+
		"\u0000\u03cf\u03d1\u0001\u0000\u0000\u0000\u03d0\u03c3\u0001\u0000\u0000"+
		"\u0000\u03d0\u03d1\u0001\u0000\u0000\u0000\u03d1\u03d2\u0001\u0000\u0000"+
		"\u0000\u03d2\u03d3\u00036\u001b\u0000\u03d35\u0001\u0000\u0000\u0000\u03d4"+
		"\u03dc\u00030\u0018\u0000\u03d5\u03d9\u00038\u001c\u0000\u03d6\u03d8\u0005"+
		"\u00b2\u0000\u0000\u03d7\u03d6\u0001\u0000\u0000\u0000\u03d8\u03db\u0001"+
		"\u0000\u0000\u0000\u03d9\u03d7\u0001\u0000\u0000\u0000\u03d9\u03da\u0001"+
		"\u0000\u0000\u0000\u03da\u03dd\u0001\u0000\u0000\u0000\u03db\u03d9\u0001"+
		"\u0000\u0000\u0000\u03dc\u03d5\u0001\u0000\u0000\u0000\u03dc\u03dd\u0001"+
		"\u0000\u0000\u0000\u03dd\u03de\u0001\u0000\u0000\u0000\u03de\u03df\u0005"+
		"\u000f\u0000\u0000\u03df7\u0001\u0000\u0000\u0000\u03e0\u03e2\u0005\u00a4"+
		"\u0000\u0000\u03e1\u03e3\u0003>\u001f\u0000\u03e2\u03e1\u0001\u0000\u0000"+
		"\u0000\u03e2\u03e3\u0001\u0000\u0000\u0000\u03e39\u0001\u0000\u0000\u0000"+
		"\u03e4\u03e7\u0005\u00b7\u0000\u0000\u03e5\u03e7\u0003>\u001f\u0000\u03e6"+
		"\u03e4\u0001\u0000\u0000\u0000\u03e6\u03e5\u0001\u0000\u0000\u0000\u03e7"+
		";\u0001\u0000\u0000\u0000\u03e8\u040e\u0007\u0004\u0000\u0000\u03e9\u040e"+
		"\u0005\u00ad\u0000\u0000\u03ea\u040e\u0005\u00ae\u0000\u0000\u03eb\u03ec"+
		"\u0007\u0006\u0000\u0000\u03ec\u03ed\u0005\u0010\u0000\u0000\u03ed\u03ee"+
		"\u0005\u00ae\u0000\u0000\u03ee\u03f7\u0005\u0015\u0000\u0000\u03ef\u03f4"+
		"\u0003>\u001f\u0000\u03f0\u03f1\u0005\u000b\u0000\u0000\u03f1\u03f3\u0003"+
		">\u001f\u0000\u03f2\u03f0\u0001\u0000\u0000\u0000\u03f3\u03f6\u0001\u0000"+
		"\u0000\u0000\u03f4\u03f2\u0001\u0000\u0000\u0000\u03f4\u03f5\u0001\u0000"+
		"\u0000\u0000\u03f5\u03f8\u0001\u0000\u0000\u0000\u03f6\u03f4\u0001\u0000"+
		"\u0000\u0000\u03f7\u03ef\u0001\u0000\u0000\u0000\u03f7\u03f8\u0001\u0000"+
		"\u0000\u0000\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9\u040e\u0005\u0016"+
		"\u0000\u0000\u03fa\u03fb\u0007\u0011\u0000\u0000\u03fb\u03fc\u0005\u0010"+
		"\u0000\u0000\u03fc\u040e\u0005\u00ae\u0000\u0000\u03fd\u040e\u0005\u00b8"+
		"\u0000\u0000\u03fe\u040e\u0005\u00b0\u0000\u0000\u03ff\u040e\u0005\u00af"+
		"\u0000\u0000\u0400\u0401\u0007\u0006\u0000\u0000\u0401\u040a\u0005\u0015"+
		"\u0000\u0000\u0402\u0407\u0003>\u001f\u0000\u0403\u0404\u0005\u000b\u0000"+
		"\u0000\u0404\u0406\u0003>\u001f\u0000\u0405\u0403\u0001\u0000\u0000\u0000"+
		"\u0406\u0409\u0001\u0000\u0000\u0000\u0407\u0405\u0001\u0000\u0000\u0000"+
		"\u0407\u0408\u0001\u0000\u0000\u0000\u0408\u040b\u0001\u0000\u0000\u0000"+
		"\u0409\u0407\u0001\u0000\u0000\u0000\u040a\u0402\u0001\u0000\u0000\u0000"+
		"\u040a\u040b\u0001\u0000\u0000\u0000\u040b\u040c\u0001\u0000\u0000\u0000"+
		"\u040c\u040e\u0005\u0016\u0000\u0000\u040d\u03e8\u0001\u0000\u0000\u0000"+
		"\u040d\u03e9\u0001\u0000\u0000\u0000\u040d\u03ea\u0001\u0000\u0000\u0000"+
		"\u040d\u03eb\u0001\u0000\u0000\u0000\u040d\u03fa\u0001\u0000\u0000\u0000"+
		"\u040d\u03fd\u0001\u0000\u0000\u0000\u040d\u03fe\u0001\u0000\u0000\u0000"+
		"\u040d\u03ff\u0001\u0000\u0000\u0000\u040d\u0400\u0001\u0000\u0000\u0000"+
		"\u040e=\u0001\u0000\u0000\u0000\u040f\u0410\u0006\u001f\uffff\uffff\u0000"+
		"\u0410\u0411\u0005\u00ae\u0000\u0000\u0411\u041a\u0005\u0015\u0000\u0000"+
		"\u0412\u0417\u0003>\u001f\u0000\u0413\u0414\u0005\u000b\u0000\u0000\u0414"+
		"\u0416\u0003>\u001f\u0000\u0415\u0413\u0001\u0000\u0000\u0000\u0416\u0419"+
		"\u0001\u0000\u0000\u0000\u0417\u0415\u0001\u0000\u0000\u0000\u0417\u0418"+
		"\u0001\u0000\u0000\u0000\u0418\u041b\u0001\u0000\u0000\u0000\u0419\u0417"+
		"\u0001\u0000\u0000\u0000\u041a\u0412\u0001\u0000\u0000\u0000\u041a\u041b"+
		"\u0001\u0000\u0000\u0000\u041b\u041c\u0001\u0000\u0000\u0000\u041c\u0435"+
		"\u0005\u0016\u0000\u0000\u041d\u0422\u0003<\u001e\u0000\u041e\u041f\u0005"+
		"\u0010\u0000\u0000\u041f\u0421\u0005\u00ae\u0000\u0000\u0420\u041e\u0001"+
		"\u0000\u0000\u0000\u0421\u0424\u0001\u0000\u0000\u0000\u0422\u0420\u0001"+
		"\u0000\u0000\u0000\u0422\u0423\u0001\u0000\u0000\u0000\u0423\u0435\u0001"+
		"\u0000\u0000\u0000\u0424\u0422\u0001\u0000\u0000\u0000\u0425\u0426\u0005"+
		"\u00a5\u0000\u0000\u0426\u0427\u0005\u0015\u0000\u0000\u0427\u0435\u0005"+
		"\u0016\u0000\u0000\u0428\u0429\u0005\u00a6\u0000\u0000\u0429\u042b\u0005"+
		"\u0015\u0000\u0000\u042a\u042c\u0005\u00b7\u0000\u0000\u042b\u042a\u0001"+
		"\u0000\u0000\u0000\u042b\u042c\u0001\u0000\u0000\u0000\u042c\u042d\u0001"+
		"\u0000\u0000\u0000\u042d\u0435\u0005\u0016\u0000\u0000\u042e\u042f\u0005"+
		"\u0015\u0000\u0000\u042f\u0430\u0003>\u001f\u0000\u0430\u0431\u0005\u0016"+
		"\u0000\u0000\u0431\u0435\u0001\u0000\u0000\u0000\u0432\u0433\u0007#\u0000"+
		"\u0000\u0433\u0435\u0003>\u001f\n\u0434\u040f\u0001\u0000\u0000\u0000"+
		"\u0434\u041d\u0001\u0000\u0000\u0000\u0434\u0425\u0001\u0000\u0000\u0000"+
		"\u0434\u0428\u0001\u0000\u0000\u0000\u0434\u042e\u0001\u0000\u0000\u0000"+
		"\u0434\u0432\u0001\u0000\u0000\u0000\u0435\u046e\u0001\u0000\u0000\u0000"+
		"\u0436\u0437\n\t\u0000\u0000\u0437\u0439\u0007\b\u0000\u0000\u0438\u043a"+
		"\u0005\u00b2\u0000\u0000\u0439\u0438\u0001\u0000\u0000\u0000\u0439\u043a"+
		"\u0001\u0000\u0000\u0000\u043a\u043b\u0001\u0000\u0000\u0000\u043b\u046d"+
		"\u0003>\u001f\n\u043c\u043d\n\b\u0000\u0000\u043d\u043f\u0007\t\u0000"+
		"\u0000\u043e\u0440\u0005\u00b2\u0000\u0000\u043f\u043e\u0001\u0000\u0000"+
		"\u0000\u043f\u0440\u0001\u0000\u0000\u0000\u0440\u0441\u0001\u0000\u0000"+
		"\u0000\u0441\u046d\u0003>\u001f\t\u0442\u0443\n\u0007\u0000\u0000\u0443"+
		"\u0445\u0005L\u0000\u0000\u0444\u0446\u0005\u00b2\u0000\u0000\u0445\u0444"+
		"\u0001\u0000\u0000\u0000\u0445\u0446\u0001\u0000\u0000\u0000\u0446\u0447"+
		"\u0001\u0000\u0000\u0000\u0447\u046d\u0003>\u001f\u0007\u0448\u0449\n"+
		"\u0006\u0000\u0000\u0449\u044b\u0005M\u0000\u0000\u044a\u044c\u0005\u00b2"+
		"\u0000\u0000\u044b\u044a\u0001\u0000\u0000\u0000\u044b\u044c\u0001\u0000"+
		"\u0000\u0000\u044c\u044d\u0001\u0000\u0000\u0000\u044d\u046d\u0003>\u001f"+
		"\u0007\u044e\u044f\n\u0005\u0000\u0000\u044f\u0451\u0007$\u0000\u0000"+
		"\u0450\u0452\u0005\u00b2\u0000\u0000\u0451\u0450\u0001\u0000\u0000\u0000"+
		"\u0451\u0452\u0001\u0000\u0000\u0000\u0452\u0453\u0001\u0000\u0000\u0000"+
		"\u0453\u046d\u0003>\u001f\u0006\u0454\u0455\n\u0004\u0000\u0000\u0455"+
		"\u0457\u0007%\u0000\u0000\u0456\u0458\u0005\u00b2\u0000\u0000\u0457\u0456"+
		"\u0001\u0000\u0000\u0000\u0457\u0458\u0001\u0000\u0000\u0000\u0458\u0459"+
		"\u0001\u0000\u0000\u0000\u0459\u046d\u0003>\u001f\u0005\u045a\u045b\n"+
		"\u0003\u0000\u0000\u045b\u045d\u0005\\\u0000\u0000\u045c\u045e\u0005\u00b2"+
		"\u0000\u0000\u045d\u045c\u0001\u0000\u0000\u0000\u045d\u045e\u0001\u0000"+
		"\u0000\u0000\u045e\u045f\u0001\u0000\u0000\u0000\u045f\u046d\u0003>\u001f"+
		"\u0004\u0460\u0461\n\u0002\u0000\u0000\u0461\u0463\u0005`\u0000\u0000"+
		"\u0462\u0464\u0005\u00b2\u0000\u0000\u0463\u0462\u0001\u0000\u0000\u0000"+
		"\u0463\u0464\u0001\u0000\u0000\u0000\u0464\u0465\u0001\u0000\u0000\u0000"+
		"\u0465\u046d\u0003>\u001f\u0003\u0466\u0467\n\u0001\u0000\u0000\u0467"+
		"\u0469\u0005\u0002\u0000\u0000\u0468\u046a\u0005\u00b2\u0000\u0000\u0469"+
		"\u0468\u0001\u0000\u0000\u0000\u0469\u046a\u0001\u0000\u0000\u0000\u046a"+
		"\u046b\u0001\u0000\u0000\u0000\u046b\u046d\u0003>\u001f\u0002\u046c\u0436"+
		"\u0001\u0000\u0000\u0000\u046c\u043c\u0001\u0000\u0000\u0000\u046c\u0442"+
		"\u0001\u0000\u0000\u0000\u046c\u0448\u0001\u0000\u0000\u0000\u046c\u044e"+
		"\u0001\u0000\u0000\u0000\u046c\u0454\u0001\u0000\u0000\u0000\u046c\u045a"+
		"\u0001\u0000\u0000\u0000\u046c\u0460\u0001\u0000\u0000\u0000\u046c\u0466"+
		"\u0001\u0000\u0000\u0000\u046d\u0470\u0001\u0000\u0000\u0000\u046e\u046c"+
		"\u0001\u0000\u0000\u0000\u046e\u046f\u0001\u0000\u0000\u0000\u046f?\u0001"+
		"\u0000\u0000\u0000\u0470\u046e\u0001\u0000\u0000\u0000\u0471\u0475\u0005"+
		"\u000e\u0000\u0000\u0472\u0474\u0005\u00b2\u0000\u0000\u0473\u0472\u0001"+
		"\u0000\u0000\u0000\u0474\u0477\u0001\u0000\u0000\u0000\u0475\u0473\u0001"+
		"\u0000\u0000\u0000\u0475\u0476\u0001\u0000\u0000\u0000\u0476\u0478\u0001"+
		"\u0000\u0000\u0000\u0477\u0475\u0001\u0000\u0000\u0000\u0478\u0479\u0003"+
		"B!\u0000\u0479\u047d\u0005\u000f\u0000\u0000\u047a\u047c\u0005\u00b2\u0000"+
		"\u0000\u047b\u047a\u0001\u0000\u0000\u0000\u047c\u047f\u0001\u0000\u0000"+
		"\u0000\u047d\u047b\u0001\u0000\u0000\u0000\u047d\u047e\u0001\u0000\u0000"+
		"\u0000\u047e\u04a7\u0001\u0000\u0000\u0000\u047f\u047d\u0001\u0000\u0000"+
		"\u0000\u0480\u0484\u0005\u000e\u0000\u0000\u0481\u0483\u0005\u00b2\u0000"+
		"\u0000\u0482\u0481\u0001\u0000\u0000\u0000\u0483\u0486\u0001\u0000\u0000"+
		"\u0000\u0484\u0482\u0001\u0000\u0000\u0000\u0484\u0485\u0001\u0000\u0000"+
		"\u0000\u0485\u0487\u0001\u0000\u0000\u0000\u0486\u0484\u0001\u0000\u0000"+
		"\u0000\u0487\u048b\u0005\u0092\u0000\u0000\u0488\u048a\u0005\u00b2\u0000"+
		"\u0000\u0489\u0488\u0001\u0000\u0000\u0000\u048a\u048d\u0001\u0000\u0000"+
		"\u0000\u048b\u0489\u0001\u0000\u0000\u0000\u048b\u048c\u0001\u0000\u0000"+
		"\u0000\u048c\u048e\u0001\u0000\u0000\u0000\u048d\u048b\u0001\u0000\u0000"+
		"\u0000\u048e\u0499\u0003\u0014\n\u0000\u048f\u0491\u0005\u00b2\u0000\u0000"+
		"\u0490\u048f\u0001\u0000\u0000\u0000\u0491\u0492\u0001\u0000\u0000\u0000"+
		"\u0492\u0490\u0001\u0000\u0000\u0000\u0492\u0493\u0001\u0000\u0000\u0000"+
		"\u0493\u0495\u0001\u0000\u0000\u0000\u0494\u0496\u0003\u0014\n\u0000\u0495"+
		"\u0494\u0001\u0000\u0000\u0000\u0495\u0496\u0001\u0000\u0000\u0000\u0496"+
		"\u0498\u0001\u0000\u0000\u0000\u0497\u0490\u0001\u0000\u0000\u0000\u0498"+
		"\u049b\u0001\u0000\u0000\u0000\u0499\u0497\u0001\u0000\u0000\u0000\u0499"+
		"\u049a\u0001\u0000\u0000\u0000\u049a\u049d\u0001\u0000\u0000\u0000\u049b"+
		"\u0499\u0001\u0000\u0000\u0000\u049c\u049e\u0003B!\u0000\u049d\u049c\u0001"+
		"\u0000\u0000\u0000\u049d\u049e\u0001\u0000\u0000\u0000\u049e\u049f\u0001"+
		"\u0000\u0000\u0000\u049f\u04a3\u0005\u000f\u0000\u0000\u04a0\u04a2\u0005"+
		"\u00b2\u0000\u0000\u04a1\u04a0\u0001\u0000\u0000\u0000\u04a2\u04a5\u0001"+
		"\u0000\u0000\u0000\u04a3\u04a1\u0001\u0000\u0000\u0000\u04a3\u04a4\u0001"+
		"\u0000\u0000\u0000\u04a4\u04a7\u0001\u0000\u0000\u0000\u04a5\u04a3\u0001"+
		"\u0000\u0000\u0000\u04a6\u0471\u0001\u0000\u0000\u0000\u04a6\u0480\u0001"+
		"\u0000\u0000\u0000\u04a7A\u0001\u0000\u0000\u0000\u04a8\u04a9\u0005\u00a7"+
		"\u0000\u0000\u04a9\u04ae\u0005\u00ae\u0000\u0000\u04aa\u04ab\u0005\u000b"+
		"\u0000\u0000\u04ab\u04ad\u0005\u00ae\u0000\u0000\u04ac\u04aa\u0001\u0000"+
		"\u0000\u0000\u04ad\u04b0\u0001\u0000\u0000\u0000\u04ae\u04ac\u0001\u0000"+
		"\u0000\u0000\u04ae\u04af\u0001\u0000\u0000\u0000\u04af\u04b4\u0001\u0000"+
		"\u0000\u0000\u04b0\u04ae\u0001\u0000\u0000\u0000\u04b1\u04b3\u0005\u00b2"+
		"\u0000\u0000\u04b2\u04b1\u0001\u0000\u0000\u0000\u04b3\u04b6\u0001\u0000"+
		"\u0000\u0000\u04b4\u04b2\u0001\u0000\u0000\u0000\u04b4\u04b5\u0001\u0000"+
		"\u0000\u0000\u04b5C\u0001\u0000\u0000\u0000\u04b6\u04b4\u0001\u0000\u0000"+
		"\u0000\u04b7\u04bb\u0005\u000e\u0000\u0000\u04b8\u04ba\u0005\u00b2\u0000"+
		"\u0000\u04b9\u04b8\u0001\u0000\u0000\u0000\u04ba\u04bd\u0001\u0000\u0000"+
		"\u0000\u04bb\u04b9\u0001\u0000\u0000\u0000\u04bb\u04bc\u0001\u0000\u0000"+
		"\u0000\u04bc\u04d3\u0001\u0000\u0000\u0000\u04bd\u04bb\u0001\u0000\u0000"+
		"\u0000\u04be\u04c2\u0007&\u0000\u0000\u04bf\u04c1\u0005\u00b2\u0000\u0000"+
		"\u04c0\u04bf\u0001\u0000\u0000\u0000\u04c1\u04c4\u0001\u0000\u0000\u0000"+
		"\u04c2\u04c0\u0001\u0000\u0000\u0000\u04c2\u04c3\u0001\u0000\u0000\u0000"+
		"\u04c3\u04c5\u0001\u0000\u0000\u0000\u04c4\u04c2\u0001\u0000\u0000\u0000"+
		"\u04c5\u04d0\u0003\u0014\n\u0000\u04c6\u04c8\u0005\u00b2\u0000\u0000\u04c7"+
		"\u04c6\u0001\u0000\u0000\u0000\u04c8\u04c9\u0001\u0000\u0000\u0000\u04c9"+
		"\u04c7\u0001\u0000\u0000\u0000\u04c9\u04ca\u0001\u0000\u0000\u0000\u04ca"+
		"\u04cc\u0001\u0000\u0000\u0000\u04cb\u04cd\u0003\u0014\n\u0000\u04cc\u04cb"+
		"\u0001\u0000\u0000\u0000\u04cc\u04cd\u0001\u0000\u0000\u0000\u04cd\u04cf"+
		"\u0001\u0000\u0000\u0000\u04ce\u04c7\u0001\u0000\u0000\u0000\u04cf\u04d2"+
		"\u0001\u0000\u0000\u0000\u04d0\u04ce\u0001\u0000\u0000\u0000\u04d0\u04d1"+
		"\u0001\u0000\u0000\u0000\u04d1\u04d4\u0001\u0000\u0000\u0000\u04d2\u04d0"+
		"\u0001\u0000\u0000\u0000\u04d3\u04be\u0001\u0000\u0000\u0000\u04d3\u04d4"+
		"\u0001\u0000\u0000\u0000\u04d4\u04d8\u0001\u0000\u0000\u0000\u04d5\u04d7"+
		"\u0005\u00b2\u0000\u0000\u04d6\u04d5\u0001\u0000\u0000\u0000\u04d7\u04da"+
		"\u0001\u0000\u0000\u0000\u04d8\u04d6\u0001\u0000\u0000\u0000\u04d8\u04d9"+
		"\u0001\u0000\u0000\u0000\u04d9\u04dc\u0001\u0000\u0000\u0000\u04da\u04d8"+
		"\u0001\u0000\u0000\u0000\u04db\u04dd\u0003B!\u0000\u04dc\u04db\u0001\u0000"+
		"\u0000\u0000\u04dc\u04dd\u0001\u0000\u0000\u0000\u04dd\u04f3\u0001\u0000"+
		"\u0000\u0000\u04de\u04e2\u0007\'\u0000\u0000\u04df\u04e1\u0005\u00b2\u0000"+
		"\u0000\u04e0\u04df\u0001\u0000\u0000\u0000\u04e1\u04e4\u0001\u0000\u0000"+
		"\u0000\u04e2\u04e0\u0001\u0000\u0000\u0000\u04e2\u04e3\u0001\u0000\u0000"+
		"\u0000\u04e3\u04e5\u0001\u0000\u0000\u0000\u04e4\u04e2\u0001\u0000\u0000"+
		"\u0000\u04e5\u04f0\u0003\u0014\n\u0000\u04e6\u04e8\u0005\u00b2\u0000\u0000"+
		"\u04e7\u04e6\u0001\u0000\u0000\u0000\u04e8\u04e9\u0001\u0000\u0000\u0000"+
		"\u04e9\u04e7\u0001\u0000\u0000\u0000\u04e9\u04ea\u0001\u0000\u0000\u0000"+
		"\u04ea\u04ec\u0001\u0000\u0000\u0000\u04eb\u04ed\u0003\u0014\n\u0000\u04ec"+
		"\u04eb\u0001\u0000\u0000\u0000\u04ec\u04ed\u0001\u0000\u0000\u0000\u04ed"+
		"\u04ef\u0001\u0000\u0000\u0000\u04ee\u04e7\u0001\u0000\u0000\u0000\u04ef"+
		"\u04f2\u0001\u0000\u0000\u0000\u04f0\u04ee\u0001\u0000\u0000\u0000\u04f0"+
		"\u04f1\u0001\u0000\u0000\u0000\u04f1\u04f4\u0001\u0000\u0000\u0000\u04f2"+
		"\u04f0\u0001\u0000\u0000\u0000\u04f3\u04de\u0001\u0000\u0000\u0000\u04f3"+
		"\u04f4\u0001\u0000\u0000\u0000\u04f4\u04f8\u0001\u0000\u0000\u0000\u04f5"+
		"\u04f7\u0005\u00b2\u0000\u0000\u04f6\u04f5\u0001\u0000\u0000\u0000\u04f7"+
		"\u04fa\u0001\u0000\u0000\u0000\u04f8\u04f6\u0001\u0000\u0000\u0000\u04f8"+
		"\u04f9\u0001\u0000\u0000\u0000\u04f9\u04fb\u0001\u0000\u0000\u0000\u04fa"+
		"\u04f8\u0001\u0000\u0000\u0000\u04fb\u04ff\u0005\u000f\u0000\u0000\u04fc"+
		"\u04fe\u0005\u00b2\u0000\u0000\u04fd\u04fc\u0001\u0000\u0000\u0000\u04fe"+
		"\u0501\u0001\u0000\u0000\u0000\u04ff\u04fd\u0001\u0000\u0000\u0000\u04ff"+
		"\u0500\u0001\u0000\u0000\u0000\u0500E\u0001\u0000\u0000\u0000\u0501\u04ff"+
		"\u0001\u0000\u0000\u0000\u0502\u0506\u0005\u000e\u0000\u0000\u0503\u0505"+
		"\u0005\u00b2\u0000\u0000\u0504\u0503\u0001\u0000\u0000\u0000\u0505\u0508"+
		"\u0001\u0000\u0000\u0000\u0506\u0504\u0001\u0000\u0000\u0000\u0506\u0507"+
		"\u0001\u0000\u0000\u0000\u0507\u0509\u0001\u0000\u0000\u0000\u0508\u0506"+
		"\u0001\u0000\u0000\u0000\u0509\u050d\u0005\u0092\u0000\u0000\u050a\u050c"+
		"\u0005\u00b2\u0000\u0000\u050b\u050a\u0001\u0000\u0000\u0000\u050c\u050f"+
		"\u0001\u0000\u0000\u0000\u050d\u050b\u0001\u0000\u0000\u0000\u050d\u050e"+
		"\u0001\u0000\u0000\u0000\u050e\u0510\u0001\u0000\u0000\u0000\u050f\u050d"+
		"\u0001\u0000\u0000\u0000\u0510\u051b\u0003\u0014\n\u0000\u0511\u0513\u0005"+
		"\u00b2\u0000\u0000\u0512\u0511\u0001\u0000\u0000\u0000\u0513\u0514\u0001"+
		"\u0000\u0000\u0000\u0514\u0512\u0001\u0000\u0000\u0000\u0514\u0515\u0001"+
		"\u0000\u0000\u0000\u0515\u0517\u0001\u0000\u0000\u0000\u0516\u0518\u0003"+
		"\u0014\n\u0000\u0517\u0516\u0001\u0000\u0000\u0000\u0517\u0518\u0001\u0000"+
		"\u0000\u0000\u0518\u051a\u0001\u0000\u0000\u0000\u0519\u0512\u0001\u0000"+
		"\u0000\u0000\u051a\u051d\u0001\u0000\u0000\u0000\u051b\u0519\u0001\u0000"+
		"\u0000\u0000\u051b\u051c\u0001\u0000\u0000\u0000\u051c\u051e\u0001\u0000"+
		"\u0000\u0000\u051d\u051b\u0001\u0000\u0000\u0000\u051e\u0522\u0005\u000f"+
		"\u0000\u0000\u051f\u0521\u0005\u00b2\u0000\u0000\u0520\u051f\u0001\u0000"+
		"\u0000\u0000\u0521\u0524\u0001\u0000\u0000\u0000\u0522\u0520\u0001\u0000"+
		"\u0000\u0000\u0522\u0523\u0001\u0000\u0000\u0000\u0523G\u0001\u0000\u0000"+
		"\u0000\u0524\u0522\u0001\u0000\u0000\u0000\u00bbNUY^fkrx}\u0084\u008a"+
		"\u008f\u0095\u009b\u009e\u00a3\u00a9\u00b0\u00b9\u00c1\u00c7\u00cd\u00d5"+
		"\u00db\u00de\u00e4\u00ed\u00f0\u00f8\u00fe\u0105\u0107\u010b\u0110\u0113"+
		"\u0117\u011e\u012b\u0132\u013a\u0142\u0147\u014c\u014f\u0153\u0157\u0165"+
		"\u0172\u0186\u0189\u018c\u0194\u019c\u01a1\u01a7\u01ad\u01b3\u01b9\u01bf"+
		"\u01c5\u01cb\u01d1\u01d7\u01da\u01dc\u01e5\u01ee\u01f2\u01f7\u01fa\u0204"+
		"\u020b\u0211\u0217\u023b\u024a\u0254\u0261\u0268\u0274\u0282\u0285\u028a"+
		"\u0291\u0295\u02a4\u02ab\u02b2\u02b5\u02b9\u02c0\u02c5\u02ce\u02d6\u02dd"+
		"\u02e2\u02e9\u02ee\u02f4\u02f8\u0300\u0311\u0316\u0319\u031d\u0326\u032d"+
		"\u0341\u034a\u034f\u0358\u035f\u0366\u0371\u0374\u037d\u0387\u038d\u0393"+
		"\u039a\u039f\u03a5\u03ad\u03b0\u03b6\u03bc\u03c3\u03cb\u03d0\u03d9\u03dc"+
		"\u03e2\u03e6\u03f4\u03f7\u0407\u040a\u040d\u0417\u041a\u0422\u042b\u0434"+
		"\u0439\u043f\u0445\u044b\u0451\u0457\u045d\u0463\u0469\u046c\u046e\u0475"+
		"\u047d\u0484\u048b\u0492\u0495\u0499\u049d\u04a3\u04a6\u04ae\u04b4\u04bb"+
		"\u04c2\u04c9\u04cc\u04d0\u04d3\u04d8\u04dc\u04e2\u04e9\u04ec\u04f0\u04f3"+
		"\u04f8\u04ff\u0506\u050d\u0514\u0517\u051b\u0522";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}