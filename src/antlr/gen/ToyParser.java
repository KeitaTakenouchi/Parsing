// Generated from Toy.g4 by ANTLR 4.7.1
package antlr.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ToyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, TIMES=17, 
		DIV=18, PLUS=19, MINUS=20, IDENT=21, Whitespaces=22, Newline=23, NumLit=24;
	public static final int
		RULE_start = 0, RULE_statements = 1, RULE_stmt = 2, RULE_comparativeExpr = 3, 
		RULE_expr = 4;
	public static final String[] ruleNames = {
		"start", "statements", "stmt", "comparativeExpr", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'('", "')'", "'then'", "'else'", "'while'", "'{'", "'}'", 
		"'='", "';'", "'print'", "'<'", "'=='", "'>'", "'>='", "'<='", "'*'", 
		"'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "TIMES", "DIV", "PLUS", "MINUS", "IDENT", 
		"Whitespaces", "Newline", "NumLit"
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
	public String getGrammarFileName() { return "Toy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ToyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ToyParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			statements();
			setState(11);
			match(EOF);
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
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << IDENT))) != 0)) {
				{
				{
				setState(13);
				stmt();
				}
				}
				setState(18);
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
	public static class PrintContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitPrint(this);
		}
	}
	public static class IfThenElseContext extends StmtContext {
		public ComparativeExprContext comparativeExpr() {
			return getRuleContext(ComparativeExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public IfThenElseContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterIfThenElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitIfThenElse(this);
		}
	}
	public static class AssignmentContext extends StmtContext {
		public TerminalNode IDENT() { return getToken(ToyParser.IDENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitAssignment(this);
		}
	}
	public static class BlockContext extends StmtContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitBlock(this);
		}
	}
	public static class IfThenContext extends StmtContext {
		public ComparativeExprContext comparativeExpr() {
			return getRuleContext(ComparativeExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public IfThenContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterIfThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitIfThen(this);
		}
	}
	public static class WhileContext extends StmtContext {
		public ComparativeExprContext comparativeExpr() {
			return getRuleContext(ComparativeExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitWhile(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new IfThenElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(T__0);
				setState(20);
				match(T__1);
				setState(21);
				comparativeExpr();
				setState(22);
				match(T__2);
				setState(23);
				match(T__3);
				setState(24);
				stmt();
				setState(27);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(25);
					match(T__4);
					setState(26);
					stmt();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new IfThenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(T__0);
				setState(30);
				match(T__1);
				setState(31);
				comparativeExpr();
				setState(32);
				match(T__2);
				setState(33);
				match(T__3);
				setState(34);
				stmt();
				}
				break;
			case 3:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				match(T__5);
				setState(37);
				match(T__1);
				setState(38);
				comparativeExpr();
				setState(39);
				match(T__2);
				setState(40);
				stmt();
				}
				break;
			case 4:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				match(T__6);
				setState(43);
				statements();
				setState(44);
				match(T__7);
				}
				break;
			case 5:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				match(IDENT);
				setState(47);
				match(T__8);
				setState(48);
				expr(0);
				setState(49);
				match(T__9);
				}
				break;
			case 6:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				match(T__10);
				setState(52);
				match(T__1);
				setState(53);
				expr(0);
				setState(54);
				match(T__2);
				setState(55);
				match(T__9);
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

	public static class ComparativeExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComparativeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparativeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterComparativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitComparativeExpr(this);
		}
	}

	public final ComparativeExprContext comparativeExpr() throws RecognitionException {
		ComparativeExprContext _localctx = new ComparativeExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comparativeExpr);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				expr(0);
				setState(60);
				match(T__11);
				setState(61);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				expr(0);
				setState(64);
				match(T__12);
				setState(65);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				expr(0);
				setState(68);
				match(T__13);
				setState(69);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				expr(0);
				setState(72);
				match(T__14);
				setState(73);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				expr(0);
				setState(76);
				match(T__15);
				setState(77);
				expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(ToyParser.IDENT, 0); }
		public TerminalNode NumLit() { return getToken(ToyParser.NumLit, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(ToyParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(ToyParser.TIMES, i);
		}
		public TerminalNode DIV() { return getToken(ToyParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(ToyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ToyParser.MINUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToyListener ) ((ToyListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(82);
				match(IDENT);
				}
				break;
			case NumLit:
				{
				setState(83);
				match(NumLit);
				}
				break;
			case T__1:
				{
				setState(84);
				match(T__1);
				setState(85);
				expr(0);
				setState(86);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(106);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(90);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(91);
						match(TIMES);
						setState(92);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(94);
						match(DIV);
						setState(95);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(97);
						match(TIMES);
						setState(98);
						match(TIMES);
						setState(99);
						expr(4);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(100);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(101);
						match(PLUS);
						setState(102);
						expr(3);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(103);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(104);
						match(MINUS);
						setState(105);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32r\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\7\3\21\n\3\f\3\16\3\24\13\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\36\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6[\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\6\2\3\n\7\2\4\6\b\n\2\2\2~\2\f\3\2"+
		"\2\2\4\22\3\2\2\2\6;\3\2\2\2\bQ\3\2\2\2\nZ\3\2\2\2\f\r\5\4\3\2\r\16\7"+
		"\2\2\3\16\3\3\2\2\2\17\21\5\6\4\2\20\17\3\2\2\2\21\24\3\2\2\2\22\20\3"+
		"\2\2\2\22\23\3\2\2\2\23\5\3\2\2\2\24\22\3\2\2\2\25\26\7\3\2\2\26\27\7"+
		"\4\2\2\27\30\5\b\5\2\30\31\7\5\2\2\31\32\7\6\2\2\32\35\5\6\4\2\33\34\7"+
		"\7\2\2\34\36\5\6\4\2\35\33\3\2\2\2\35\36\3\2\2\2\36<\3\2\2\2\37 \7\3\2"+
		"\2 !\7\4\2\2!\"\5\b\5\2\"#\7\5\2\2#$\7\6\2\2$%\5\6\4\2%<\3\2\2\2&\'\7"+
		"\b\2\2\'(\7\4\2\2()\5\b\5\2)*\7\5\2\2*+\5\6\4\2+<\3\2\2\2,-\7\t\2\2-."+
		"\5\4\3\2./\7\n\2\2/<\3\2\2\2\60\61\7\27\2\2\61\62\7\13\2\2\62\63\5\n\6"+
		"\2\63\64\7\f\2\2\64<\3\2\2\2\65\66\7\r\2\2\66\67\7\4\2\2\678\5\n\6\28"+
		"9\7\5\2\29:\7\f\2\2:<\3\2\2\2;\25\3\2\2\2;\37\3\2\2\2;&\3\2\2\2;,\3\2"+
		"\2\2;\60\3\2\2\2;\65\3\2\2\2<\7\3\2\2\2=>\5\n\6\2>?\7\16\2\2?@\5\n\6\2"+
		"@R\3\2\2\2AB\5\n\6\2BC\7\17\2\2CD\5\n\6\2DR\3\2\2\2EF\5\n\6\2FG\7\20\2"+
		"\2GH\5\n\6\2HR\3\2\2\2IJ\5\n\6\2JK\7\21\2\2KL\5\n\6\2LR\3\2\2\2MN\5\n"+
		"\6\2NO\7\22\2\2OP\5\n\6\2PR\3\2\2\2Q=\3\2\2\2QA\3\2\2\2QE\3\2\2\2QI\3"+
		"\2\2\2QM\3\2\2\2R\t\3\2\2\2ST\b\6\1\2T[\7\27\2\2U[\7\32\2\2VW\7\4\2\2"+
		"WX\5\n\6\2XY\7\5\2\2Y[\3\2\2\2ZS\3\2\2\2ZU\3\2\2\2ZV\3\2\2\2[n\3\2\2\2"+
		"\\]\f\7\2\2]^\7\23\2\2^m\5\n\6\b_`\f\6\2\2`a\7\24\2\2am\5\n\6\7bc\f\5"+
		"\2\2cd\7\23\2\2de\7\23\2\2em\5\n\6\6fg\f\4\2\2gh\7\25\2\2hm\5\n\6\5ij"+
		"\f\3\2\2jk\7\26\2\2km\5\n\6\4l\\\3\2\2\2l_\3\2\2\2lb\3\2\2\2lf\3\2\2\2"+
		"li\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\13\3\2\2\2pn\3\2\2\2\t\22\35"+
		";QZln";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}