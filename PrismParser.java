// Generated from Prism.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PrismParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, A=2, ARRAY=3, BOOL=4, CLOCK=5, CONST=6, CTMC=7, C=8, DOUBLE=9, 
		DTMC=10, E=11, ENDINIT=12, ENDINVARIANT=13, ENDMODULE=14, ENDREWARDS=15, 
		ENDSYSTEM=16, FALSE=17, FORMULA=18, FILTER=19, FUNC=20, F=21, GLOBAL=22, 
		G=23, INIT=24, INVARIANT=25, I=26, INT=27, LABEL=28, MAX=29, MDP=30, MIN=31, 
		MODULE=32, X=33, NONDETERMINISTIC=34, OF=35, PMAX=36, PMIN=37, P=38, PROBABILISTIC=39, 
		PROB=40, PTA=41, RATE=42, REWARDS=43, RMAX=44, RMIN=45, R=46, S=47, STOCHASTIC=48, 
		SYSTEM=49, TRUE=50, U=51, W=52, NOT=53, AND=54, OR=55, IMPLIES=56, IFF=57, 
		RARROW=58, COLON=59, SEMICOLON=60, COMMA=61, DOTS=62, LPARENTH=63, RPARENTH=64, 
		LBRACKET=65, RBRACKET=66, DLBRACKET=67, DRBRACKET=68, LBRACE=69, RBRACE=70, 
		EQ=71, NE=72, LT=73, GT=74, DLT=75, DGT=76, LE=77, GE=78, PLUS=79, MINUS=80, 
		TIMES=81, DIVIDE=82, PRIME=83, RENAME=84, QMARK=85, DQUOTE=86, REG_INT=87, 
		REG_DOUBLE=88, REG_IDENTPRIME=89, REG_IDENT=90, PREPROC=91, COMMENT=92;
	public static final int
		RULE_prismfile = 0, RULE_statements = 1, RULE_statement = 2, RULE_filetype = 3, 
		RULE_term = 4, RULE_const_statement = 5, RULE_const_type = 6, RULE_condition_op = 7, 
		RULE_term_op = 8, RULE_formula_statement = 9, RULE_condition = 10, RULE_atomic_condition = 11, 
		RULE_value = 12, RULE_range = 13, RULE_condition_expand = 14, RULE_module = 15, 
		RULE_entries = 16, RULE_entrie = 17, RULE_attribute = 18, RULE_transition = 19, 
		RULE_transition_rules = 20, RULE_transition_assign = 21, RULE_global = 22;
	public static final String[] ruleNames = {
		"prismfile", "statements", "statement", "filetype", "term", "const_statement", 
		"const_type", "condition_op", "term_op", "formula_statement", "condition", 
		"atomic_condition", "value", "range", "condition_expand", "module", "entries", 
		"entrie", "attribute", "transition", "transition_rules", "transition_assign", 
		"global"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'A'", "'array'", "'bool'", "'clock'", "'const'", "'ctmc'", 
		"'C'", "'double'", "'dtmc'", "'E'", "'endinit'", "'endinvariant'", "'endmodule'", 
		"'endrewards'", "'endsystem'", "'false'", "'formula'", "'filter'", "'func'", 
		"'F'", "'global'", "'G'", "'init'", "'invariant'", "'I'", "'int'", "'label'", 
		"'max'", "'mdp'", "'min'", "'module'", "'X'", "'nondeterministic'", "'of'", 
		"'Pmax'", "'Pmin'", "'P'", "'probabilistic'", "'prob'", "'pta'", "'rate'", 
		"'rewards'", "'Rmax'", "'Rmin'", "'R'", "'S'", "'stochastic'", "'system'", 
		"'true'", "'U'", "'W'", "'!'", "'&'", "'|'", "'=>'", "'<=>'", "'->'", 
		"':'", "';'", "','", "'..'", "'('", "')'", "'['", "']'", "'[['", "']]'", 
		"'{'", "'}'", "'='", "'!='", "'<'", "'>'", "'<<'", "'>>'", "'<='", "'>='", 
		"'+'", "'-'", "'*'", "'/'", "'''", "'<-'", "'?'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "A", "ARRAY", "BOOL", "CLOCK", "CONST", "CTMC", "C", 
		"DOUBLE", "DTMC", "E", "ENDINIT", "ENDINVARIANT", "ENDMODULE", "ENDREWARDS", 
		"ENDSYSTEM", "FALSE", "FORMULA", "FILTER", "FUNC", "F", "GLOBAL", "G", 
		"INIT", "INVARIANT", "I", "INT", "LABEL", "MAX", "MDP", "MIN", "MODULE", 
		"X", "NONDETERMINISTIC", "OF", "PMAX", "PMIN", "P", "PROBABILISTIC", "PROB", 
		"PTA", "RATE", "REWARDS", "RMAX", "RMIN", "R", "S", "STOCHASTIC", "SYSTEM", 
		"TRUE", "U", "W", "NOT", "AND", "OR", "IMPLIES", "IFF", "RARROW", "COLON", 
		"SEMICOLON", "COMMA", "DOTS", "LPARENTH", "RPARENTH", "LBRACKET", "RBRACKET", 
		"DLBRACKET", "DRBRACKET", "LBRACE", "RBRACE", "EQ", "NE", "LT", "GT", 
		"DLT", "DGT", "LE", "GE", "PLUS", "MINUS", "TIMES", "DIVIDE", "PRIME", 
		"RENAME", "QMARK", "DQUOTE", "REG_INT", "REG_DOUBLE", "REG_IDENTPRIME", 
		"REG_IDENT", "PREPROC", "COMMENT"
	};
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
	public String getGrammarFileName() { return "Prism.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PrismParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PrismfileContext extends ParserRuleContext {
		public FiletypeContext filetype() {
			return getRuleContext(FiletypeContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public PrismfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prismfile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterPrismfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitPrismfile(this);
		}
	}

	public final PrismfileContext prismfile() throws RecognitionException {
		PrismfileContext _localctx = new PrismfileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prismfile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			filetype();
			setState(47);
			statements();
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				statement();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << FORMULA) | (1L << GLOBAL) | (1L << MODULE))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public Const_statementContext const_statement() {
			return getRuleContext(Const_statementContext.class,0);
		}
		public Formula_statementContext formula_statement() {
			return getRuleContext(Formula_statementContext.class,0);
		}
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				const_statement();
				}
				break;
			case FORMULA:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				formula_statement();
				}
				break;
			case MODULE:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				module();
				}
				break;
			case GLOBAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				global();
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

	public static class FiletypeContext extends ParserRuleContext {
		public TerminalNode DTMC() { return getToken(PrismParser.DTMC, 0); }
		public TerminalNode CTMC() { return getToken(PrismParser.CTMC, 0); }
		public TerminalNode MDP() { return getToken(PrismParser.MDP, 0); }
		public TerminalNode PTA() { return getToken(PrismParser.PTA, 0); }
		public FiletypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filetype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterFiletype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitFiletype(this);
		}
	}

	public final FiletypeContext filetype() throws RecognitionException {
		FiletypeContext _localctx = new FiletypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_filetype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CTMC) | (1L << DTMC) | (1L << MDP) | (1L << PTA))) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public static class TermContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Term_opContext term_op() {
			return getRuleContext(Term_opContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_term);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				value();
				setState(63);
				term_op();
				setState(64);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				value();
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

	public static class Const_statementContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(PrismParser.CONST, 0); }
		public TerminalNode REG_IDENT() { return getToken(PrismParser.REG_IDENT, 0); }
		public TerminalNode SEMICOLON() { return getToken(PrismParser.SEMICOLON, 0); }
		public Const_typeContext const_type() {
			return getRuleContext(Const_typeContext.class,0);
		}
		public TerminalNode INT() { return getToken(PrismParser.INT, 0); }
		public TerminalNode EQ() { return getToken(PrismParser.EQ, 0); }
		public TerminalNode REG_INT() { return getToken(PrismParser.REG_INT, 0); }
		public TerminalNode DOUBLE() { return getToken(PrismParser.DOUBLE, 0); }
		public TerminalNode REG_DOUBLE() { return getToken(PrismParser.REG_DOUBLE, 0); }
		public Const_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterConst_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitConst_statement(this);
		}
	}

	public final Const_statementContext const_statement() throws RecognitionException {
		Const_statementContext _localctx = new Const_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_const_statement);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(CONST);
				setState(70);
				match(REG_IDENT);
				setState(71);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(CONST);
				setState(73);
				const_type();
				setState(74);
				match(REG_IDENT);
				setState(75);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(CONST);
				setState(78);
				match(INT);
				setState(79);
				match(REG_IDENT);
				setState(80);
				match(EQ);
				setState(81);
				match(REG_INT);
				setState(82);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				match(CONST);
				setState(84);
				match(DOUBLE);
				setState(85);
				match(REG_IDENT);
				setState(86);
				match(EQ);
				setState(87);
				match(REG_DOUBLE);
				setState(88);
				match(SEMICOLON);
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

	public static class Const_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PrismParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(PrismParser.DOUBLE, 0); }
		public Const_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterConst_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitConst_type(this);
		}
	}

	public final Const_typeContext const_type() throws RecognitionException {
		Const_typeContext _localctx = new Const_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_const_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==INT) ) {
			_errHandler.recoverInline(this);
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

	public static class Condition_opContext extends ParserRuleContext {
		public TerminalNode GE() { return getToken(PrismParser.GE, 0); }
		public TerminalNode EQ() { return getToken(PrismParser.EQ, 0); }
		public TerminalNode NE() { return getToken(PrismParser.NE, 0); }
		public TerminalNode LE() { return getToken(PrismParser.LE, 0); }
		public TerminalNode AND() { return getToken(PrismParser.AND, 0); }
		public TerminalNode OR() { return getToken(PrismParser.OR, 0); }
		public TerminalNode LT() { return getToken(PrismParser.LT, 0); }
		public TerminalNode GT() { return getToken(PrismParser.GT, 0); }
		public Condition_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterCondition_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitCondition_op(this);
		}
	}

	public final Condition_opContext condition_op() throws RecognitionException {
		Condition_opContext _localctx = new Condition_opContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (AND - 54)) | (1L << (OR - 54)) | (1L << (EQ - 54)) | (1L << (NE - 54)) | (1L << (LT - 54)) | (1L << (GT - 54)) | (1L << (LE - 54)) | (1L << (GE - 54)))) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public static class Term_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(PrismParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PrismParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(PrismParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(PrismParser.DIVIDE, 0); }
		public Term_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterTerm_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitTerm_op(this);
		}
	}

	public final Term_opContext term_op() throws RecognitionException {
		Term_opContext _localctx = new Term_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_term_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (PLUS - 79)) | (1L << (MINUS - 79)) | (1L << (TIMES - 79)) | (1L << (DIVIDE - 79)))) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public static class Formula_statementContext extends ParserRuleContext {
		public TerminalNode FORMULA() { return getToken(PrismParser.FORMULA, 0); }
		public TerminalNode REG_IDENT() { return getToken(PrismParser.REG_IDENT, 0); }
		public TerminalNode EQ() { return getToken(PrismParser.EQ, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PrismParser.SEMICOLON, 0); }
		public Formula_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterFormula_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitFormula_statement(this);
		}
	}

	public final Formula_statementContext formula_statement() throws RecognitionException {
		Formula_statementContext _localctx = new Formula_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_formula_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(FORMULA);
			setState(98);
			match(REG_IDENT);
			setState(99);
			match(EQ);
			setState(100);
			condition();
			setState(101);
			match(SEMICOLON);
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

	public static class ConditionContext extends ParserRuleContext {
		public Atomic_conditionContext atomic_condition() {
			return getRuleContext(Atomic_conditionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PrismParser.NOT, 0); }
		public List<Condition_expandContext> condition_expand() {
			return getRuleContexts(Condition_expandContext.class);
		}
		public Condition_expandContext condition_expand(int i) {
			return getRuleContext(Condition_expandContext.class,i);
		}
		public TerminalNode LPARENTH() { return getToken(PrismParser.LPARENTH, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPARENTH() { return getToken(PrismParser.RPARENTH, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			int _alt;
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(103);
					match(NOT);
					}
				}

				setState(106);
				atomic_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(107);
					match(NOT);
					}
				}

				setState(110);
				atomic_condition();
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(111);
						condition_expand();
						}
						} 
					}
					setState(116);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(117);
					match(NOT);
					}
				}

				setState(120);
				match(LPARENTH);
				setState(121);
				condition();
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (AND - 54)) | (1L << (OR - 54)) | (1L << (EQ - 54)) | (1L << (NE - 54)) | (1L << (LT - 54)) | (1L << (GT - 54)) | (1L << (LE - 54)) | (1L << (GE - 54)))) != 0)) {
					{
					{
					setState(122);
					condition_expand();
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				match(RPARENTH);
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(129);
						condition_expand();
						}
						} 
					}
					setState(134);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				term();
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

	public static class Atomic_conditionContext extends ParserRuleContext {
		public List<TerminalNode> REG_IDENT() { return getTokens(PrismParser.REG_IDENT); }
		public TerminalNode REG_IDENT(int i) {
			return getToken(PrismParser.REG_IDENT, i);
		}
		public Condition_opContext condition_op() {
			return getRuleContext(Condition_opContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(PrismParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PrismParser.FALSE, 0); }
		public Atomic_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterAtomic_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitAtomic_condition(this);
		}
	}

	public final Atomic_conditionContext atomic_condition() throws RecognitionException {
		Atomic_conditionContext _localctx = new Atomic_conditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atomic_condition);
		int _la;
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(REG_IDENT);
				setState(139);
				condition_op();
				setState(140);
				range();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(REG_IDENT);
				setState(143);
				condition_op();
				setState(144);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(REG_IDENT);
				setState(147);
				condition_op();
				setState(148);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				match(REG_IDENT);
				setState(151);
				condition_op();
				setState(152);
				match(REG_IDENT);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode REG_DOUBLE() { return getToken(PrismParser.REG_DOUBLE, 0); }
		public TerminalNode REG_INT() { return getToken(PrismParser.REG_INT, 0); }
		public TerminalNode REG_IDENT() { return getToken(PrismParser.REG_IDENT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (REG_INT - 87)) | (1L << (REG_DOUBLE - 87)) | (1L << (REG_IDENT - 87)))) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public static class RangeContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode DOTS() { return getToken(PrismParser.DOTS, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			term();
			setState(159);
			match(DOTS);
			setState(160);
			term();
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

	public static class Condition_expandContext extends ParserRuleContext {
		public Condition_opContext condition_op() {
			return getRuleContext(Condition_opContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Condition_expandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_expand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterCondition_expand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitCondition_expand(this);
		}
	}

	public final Condition_expandContext condition_expand() throws RecognitionException {
		Condition_expandContext _localctx = new Condition_expandContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition_expand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			condition_op();
			setState(163);
			condition();
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

	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(PrismParser.MODULE, 0); }
		public TerminalNode REG_IDENT() { return getToken(PrismParser.REG_IDENT, 0); }
		public EntriesContext entries() {
			return getRuleContext(EntriesContext.class,0);
		}
		public TerminalNode ENDMODULE() { return getToken(PrismParser.ENDMODULE, 0); }
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitModule(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(MODULE);
			setState(166);
			match(REG_IDENT);
			setState(167);
			entries();
			setState(168);
			match(ENDMODULE);
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

	public static class EntriesContext extends ParserRuleContext {
		public List<EntrieContext> entrie() {
			return getRuleContexts(EntrieContext.class);
		}
		public EntrieContext entrie(int i) {
			return getRuleContext(EntrieContext.class,i);
		}
		public EntriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterEntries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitEntries(this);
		}
	}

	public final EntriesContext entries() throws RecognitionException {
		EntriesContext _localctx = new EntriesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_entries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(170);
				entrie();
				}
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACKET || _la==REG_IDENT );
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

	public static class EntrieContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TransitionContext transition() {
			return getRuleContext(TransitionContext.class,0);
		}
		public EntrieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterEntrie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitEntrie(this);
		}
	}

	public final EntrieContext entrie() throws RecognitionException {
		EntrieContext _localctx = new EntrieContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_entrie);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REG_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				attribute();
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				transition();
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode REG_IDENT() { return getToken(PrismParser.REG_IDENT, 0); }
		public TerminalNode COLON() { return getToken(PrismParser.COLON, 0); }
		public TerminalNode LBRACKET() { return getToken(PrismParser.LBRACKET, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(PrismParser.RBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(PrismParser.SEMICOLON, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(REG_IDENT);
			setState(180);
			match(COLON);
			setState(181);
			match(LBRACKET);
			setState(182);
			range();
			setState(183);
			match(RBRACKET);
			setState(184);
			match(SEMICOLON);
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

	public static class TransitionContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(PrismParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(PrismParser.RBRACKET, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RARROW() { return getToken(PrismParser.RARROW, 0); }
		public List<Transition_rulesContext> transition_rules() {
			return getRuleContexts(Transition_rulesContext.class);
		}
		public Transition_rulesContext transition_rules(int i) {
			return getRuleContext(Transition_rulesContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(PrismParser.SEMICOLON, 0); }
		public TerminalNode REG_IDENT() { return getToken(PrismParser.REG_IDENT, 0); }
		public List<TerminalNode> PLUS() { return getTokens(PrismParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PrismParser.PLUS, i);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitTransition(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_transition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(LBRACKET);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REG_IDENT) {
				{
				setState(187);
				match(REG_IDENT);
				}
			}

			setState(190);
			match(RBRACKET);
			setState(191);
			condition();
			setState(192);
			match(RARROW);
			setState(193);
			transition_rules();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(194);
				match(PLUS);
				setState(195);
				transition_rules();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			match(SEMICOLON);
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

	public static class Transition_rulesContext extends ParserRuleContext {
		public List<TerminalNode> LPARENTH() { return getTokens(PrismParser.LPARENTH); }
		public TerminalNode LPARENTH(int i) {
			return getToken(PrismParser.LPARENTH, i);
		}
		public List<Transition_assignContext> transition_assign() {
			return getRuleContexts(Transition_assignContext.class);
		}
		public Transition_assignContext transition_assign(int i) {
			return getRuleContext(Transition_assignContext.class,i);
		}
		public List<TerminalNode> RPARENTH() { return getTokens(PrismParser.RPARENTH); }
		public TerminalNode RPARENTH(int i) {
			return getToken(PrismParser.RPARENTH, i);
		}
		public TerminalNode REG_DOUBLE() { return getToken(PrismParser.REG_DOUBLE, 0); }
		public TerminalNode COLON() { return getToken(PrismParser.COLON, 0); }
		public List<TerminalNode> AND() { return getTokens(PrismParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(PrismParser.AND, i);
		}
		public Transition_rulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterTransition_rules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitTransition_rules(this);
		}
	}

	public final Transition_rulesContext transition_rules() throws RecognitionException {
		Transition_rulesContext _localctx = new Transition_rulesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_transition_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REG_DOUBLE) {
				{
				setState(203);
				match(REG_DOUBLE);
				setState(204);
				match(COLON);
				}
			}

			setState(207);
			match(LPARENTH);
			setState(208);
			transition_assign();
			setState(209);
			match(RPARENTH);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(210);
				match(AND);
				setState(211);
				match(LPARENTH);
				setState(212);
				transition_assign();
				setState(213);
				match(RPARENTH);
				}
				}
				setState(219);
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

	public static class Transition_assignContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(PrismParser.EQ, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode REG_IDENTPRIME() { return getToken(PrismParser.REG_IDENTPRIME, 0); }
		public Transition_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterTransition_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitTransition_assign(this);
		}
	}

	public final Transition_assignContext transition_assign() throws RecognitionException {
		Transition_assignContext _localctx = new Transition_assignContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_transition_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REG_IDENTPRIME) {
				{
				setState(220);
				match(REG_IDENTPRIME);
				}
			}

			setState(223);
			match(EQ);
			setState(224);
			term();
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

	public static class GlobalContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(PrismParser.GLOBAL, 0); }
		public TerminalNode REG_IDENT() { return getToken(PrismParser.REG_IDENT, 0); }
		public TerminalNode COLON() { return getToken(PrismParser.COLON, 0); }
		public TerminalNode LBRACKET() { return getToken(PrismParser.LBRACKET, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(PrismParser.RBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(PrismParser.SEMICOLON, 0); }
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrismListener ) ((PrismListener)listener).exitGlobal(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(GLOBAL);
			setState(227);
			match(REG_IDENT);
			setState(228);
			match(COLON);
			setState(229);
			match(LBRACKET);
			setState(230);
			range();
			setState(231);
			match(RBRACKET);
			setState(232);
			match(SEMICOLON);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3^\u00ed\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\3\6\3\65\n\3\r\3\16\3\66\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\5\6F\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\\\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\5\fk\n\f\3\f\3\f\5\fo\n\f\3\f\3\f\7\fs\n"+
		"\f\f\f\16\fv\13\f\3\f\5\fy\n\f\3\f\3\f\3\f\7\f~\n\f\f\f\16\f\u0081\13"+
		"\f\3\f\3\f\7\f\u0085\n\f\f\f\16\f\u0088\13\f\3\f\5\f\u008b\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009d\n\r"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\6\22\u00ae\n\22\r\22\16\22\u00af\3\23\3\23\5\23\u00b4\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u00bf\n\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\7\25\u00c7\n\25\f\25\16\25\u00ca\13\25\3\25\3\25\3\26"+
		"\3\26\5\26\u00d0\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00da"+
		"\n\26\f\26\16\26\u00dd\13\26\3\27\5\27\u00e0\n\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\2\b\6\2\t\t\f\f  ++\4\2\13\13\35\35\5\289ILO"+
		"P\3\2QT\4\2\23\23\64\64\4\2YZ\\\\\2\u00f0\2\60\3\2\2\2\4\64\3\2\2\2\6"+
		"<\3\2\2\2\b>\3\2\2\2\nE\3\2\2\2\f[\3\2\2\2\16]\3\2\2\2\20_\3\2\2\2\22"+
		"a\3\2\2\2\24c\3\2\2\2\26\u008a\3\2\2\2\30\u009c\3\2\2\2\32\u009e\3\2\2"+
		"\2\34\u00a0\3\2\2\2\36\u00a4\3\2\2\2 \u00a7\3\2\2\2\"\u00ad\3\2\2\2$\u00b3"+
		"\3\2\2\2&\u00b5\3\2\2\2(\u00bc\3\2\2\2*\u00cf\3\2\2\2,\u00df\3\2\2\2."+
		"\u00e4\3\2\2\2\60\61\5\b\5\2\61\62\5\4\3\2\62\3\3\2\2\2\63\65\5\6\4\2"+
		"\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\5\3\2\2\2"+
		"8=\5\f\7\29=\5\24\13\2:=\5 \21\2;=\5.\30\2<8\3\2\2\2<9\3\2\2\2<:\3\2\2"+
		"\2<;\3\2\2\2=\7\3\2\2\2>?\t\2\2\2?\t\3\2\2\2@A\5\32\16\2AB\5\22\n\2BC"+
		"\5\32\16\2CF\3\2\2\2DF\5\32\16\2E@\3\2\2\2ED\3\2\2\2F\13\3\2\2\2GH\7\b"+
		"\2\2HI\7\\\2\2I\\\7>\2\2JK\7\b\2\2KL\5\16\b\2LM\7\\\2\2MN\7>\2\2N\\\3"+
		"\2\2\2OP\7\b\2\2PQ\7\35\2\2QR\7\\\2\2RS\7I\2\2ST\7Y\2\2T\\\7>\2\2UV\7"+
		"\b\2\2VW\7\13\2\2WX\7\\\2\2XY\7I\2\2YZ\7Z\2\2Z\\\7>\2\2[G\3\2\2\2[J\3"+
		"\2\2\2[O\3\2\2\2[U\3\2\2\2\\\r\3\2\2\2]^\t\3\2\2^\17\3\2\2\2_`\t\4\2\2"+
		"`\21\3\2\2\2ab\t\5\2\2b\23\3\2\2\2cd\7\24\2\2de\7\\\2\2ef\7I\2\2fg\5\26"+
		"\f\2gh\7>\2\2h\25\3\2\2\2ik\7\67\2\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2l\u008b"+
		"\5\30\r\2mo\7\67\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pt\5\30\r\2qs\5\36\20"+
		"\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\u008b\3\2\2\2vt\3\2\2\2wy"+
		"\7\67\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7A\2\2{\177\5\26\f\2|~\5\36"+
		"\20\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0082\u0086\7B\2\2\u0083\u0085\5\36\20\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u008b\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\5\n\6\2\u008a"+
		"j\3\2\2\2\u008an\3\2\2\2\u008ax\3\2\2\2\u008a\u0089\3\2\2\2\u008b\27\3"+
		"\2\2\2\u008c\u008d\7\\\2\2\u008d\u008e\5\20\t\2\u008e\u008f\5\34\17\2"+
		"\u008f\u009d\3\2\2\2\u0090\u0091\7\\\2\2\u0091\u0092\5\20\t\2\u0092\u0093"+
		"\5\n\6\2\u0093\u009d\3\2\2\2\u0094\u0095\7\\\2\2\u0095\u0096\5\20\t\2"+
		"\u0096\u0097\t\6\2\2\u0097\u009d\3\2\2\2\u0098\u0099\7\\\2\2\u0099\u009a"+
		"\5\20\t\2\u009a\u009b\7\\\2\2\u009b\u009d\3\2\2\2\u009c\u008c\3\2\2\2"+
		"\u009c\u0090\3\2\2\2\u009c\u0094\3\2\2\2\u009c\u0098\3\2\2\2\u009d\31"+
		"\3\2\2\2\u009e\u009f\t\7\2\2\u009f\33\3\2\2\2\u00a0\u00a1\5\n\6\2\u00a1"+
		"\u00a2\7@\2\2\u00a2\u00a3\5\n\6\2\u00a3\35\3\2\2\2\u00a4\u00a5\5\20\t"+
		"\2\u00a5\u00a6\5\26\f\2\u00a6\37\3\2\2\2\u00a7\u00a8\7\"\2\2\u00a8\u00a9"+
		"\7\\\2\2\u00a9\u00aa\5\"\22\2\u00aa\u00ab\7\20\2\2\u00ab!\3\2\2\2\u00ac"+
		"\u00ae\5$\23\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0#\3\2\2\2\u00b1\u00b4\5&\24\2\u00b2\u00b4"+
		"\5(\25\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4%\3\2\2\2\u00b5"+
		"\u00b6\7\\\2\2\u00b6\u00b7\7=\2\2\u00b7\u00b8\7C\2\2\u00b8\u00b9\5\34"+
		"\17\2\u00b9\u00ba\7D\2\2\u00ba\u00bb\7>\2\2\u00bb\'\3\2\2\2\u00bc\u00be"+
		"\7C\2\2\u00bd\u00bf\7\\\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\7D\2\2\u00c1\u00c2\5\26\f\2\u00c2\u00c3\7<"+
		"\2\2\u00c3\u00c8\5*\26\2\u00c4\u00c5\7Q\2\2\u00c5\u00c7\5*\26\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7>\2\2\u00cc"+
		")\3\2\2\2\u00cd\u00ce\7Z\2\2\u00ce\u00d0\7=\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7A\2\2\u00d2\u00d3\5,\27"+
		"\2\u00d3\u00db\7B\2\2\u00d4\u00d5\78\2\2\u00d5\u00d6\7A\2\2\u00d6\u00d7"+
		"\5,\27\2\u00d7\u00d8\7B\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d4\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc+\3\2\2\2"+
		"\u00dd\u00db\3\2\2\2\u00de\u00e0\7[\2\2\u00df\u00de\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7I\2\2\u00e2\u00e3\5\n\6\2\u00e3"+
		"-\3\2\2\2\u00e4\u00e5\7\30\2\2\u00e5\u00e6\7\\\2\2\u00e6\u00e7\7=\2\2"+
		"\u00e7\u00e8\7C\2\2\u00e8\u00e9\5\34\17\2\u00e9\u00ea\7D\2\2\u00ea\u00eb"+
		"\7>\2\2\u00eb/\3\2\2\2\25\66<E[jntx\177\u0086\u008a\u009c\u00af\u00b3"+
		"\u00be\u00c8\u00cf\u00db\u00df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}