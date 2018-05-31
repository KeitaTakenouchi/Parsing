// Generated from Toy.g4 by ANTLR 4.7.1
package antlr.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ToyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, TIMES=17, 
		DIV=18, PLUS=19, MINUS=20, IDENT=21, Whitespaces=22, Newline=23, NumLit=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "TIMES", 
		"DIV", "PLUS", "MINUS", "Char", "IDENT", "Whitespaces", "Newline", "NumLit"
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


	public ToyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Toy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u008b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\6\27s\n\27\r\27\16\27t\3\30\6\30x\n\30\r\30\16\30y\3\30\3\30\3\31"+
		"\3\31\5\31\u0080\n\31\3\31\5\31\u0083\n\31\3\31\3\31\3\32\6\32\u0088\n"+
		"\32\r\32\16\32\u0089\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\27/\30\61\31"+
		"\63\32\3\2\5\4\2C\\c|\4\2\13\13\"\"\3\2\62;\2\u008e\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3"+
		"\65\3\2\2\2\58\3\2\2\2\7:\3\2\2\2\t<\3\2\2\2\13A\3\2\2\2\rF\3\2\2\2\17"+
		"L\3\2\2\2\21N\3\2\2\2\23P\3\2\2\2\25R\3\2\2\2\27T\3\2\2\2\31Z\3\2\2\2"+
		"\33\\\3\2\2\2\35_\3\2\2\2\37a\3\2\2\2!d\3\2\2\2#g\3\2\2\2%i\3\2\2\2\'"+
		"k\3\2\2\2)m\3\2\2\2+o\3\2\2\2-r\3\2\2\2/w\3\2\2\2\61\u0082\3\2\2\2\63"+
		"\u0087\3\2\2\2\65\66\7k\2\2\66\67\7h\2\2\67\4\3\2\2\289\7*\2\29\6\3\2"+
		"\2\2:;\7+\2\2;\b\3\2\2\2<=\7v\2\2=>\7j\2\2>?\7g\2\2?@\7p\2\2@\n\3\2\2"+
		"\2AB\7g\2\2BC\7n\2\2CD\7u\2\2DE\7g\2\2E\f\3\2\2\2FG\7y\2\2GH\7j\2\2HI"+
		"\7k\2\2IJ\7n\2\2JK\7g\2\2K\16\3\2\2\2LM\7}\2\2M\20\3\2\2\2NO\7\177\2\2"+
		"O\22\3\2\2\2PQ\7?\2\2Q\24\3\2\2\2RS\7=\2\2S\26\3\2\2\2TU\7r\2\2UV\7t\2"+
		"\2VW\7k\2\2WX\7p\2\2XY\7v\2\2Y\30\3\2\2\2Z[\7>\2\2[\32\3\2\2\2\\]\7?\2"+
		"\2]^\7?\2\2^\34\3\2\2\2_`\7@\2\2`\36\3\2\2\2ab\7@\2\2bc\7?\2\2c \3\2\2"+
		"\2de\7>\2\2ef\7?\2\2f\"\3\2\2\2gh\7,\2\2h$\3\2\2\2ij\7\61\2\2j&\3\2\2"+
		"\2kl\7-\2\2l(\3\2\2\2mn\7/\2\2n*\3\2\2\2op\t\2\2\2p,\3\2\2\2qs\5+\26\2"+
		"rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u.\3\2\2\2vx\t\3\2\2wv\3\2\2\2"+
		"xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\b\30\2\2|\60\3\2\2\2}\177\7"+
		"\17\2\2~\u0080\7\f\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\3\2"+
		"\2\2\u0081\u0083\7\f\2\2\u0082}\3\2\2\2\u0082\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0085\b\31\2\2\u0085\62\3\2\2\2\u0086\u0088\t\4\2\2\u0087"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\64\3\2\2\2\b\2ty\177\u0082\u0089\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}