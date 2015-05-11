// Generated from /Users/msilveir/personal/Dropbox/marcos/source/sati/kase/src/main/antlr/Kase.g4 by ANTLR 4.2.2
package com.thoughtworks.kase.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KaseLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, QUOTED=2, QUOTE=3, ALPHANUMERIC=4, LEFTPARENTHESIS=5, RIGHTPARENTHESIS=6, 
		END_LINE=7, NEW_LINE=8, WS=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"ID", "QUOTED", "QUOTE", "ALPHANUMERIC", "'('", "')'", "END_LINE", "NEW_LINE", 
		"WS"
	};
	public static final String[] ruleNames = {
		"ID", "QUOTED", "QUOTE", "ALPHANUMERIC", "LEFTPARENTHESIS", "RIGHTPARENTHESIS", 
		"END_LINE", "NEW_LINE", "WS"
	};


	public KaseLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Kase.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13?\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\6\2\30\n\2\r\2\16\2\31\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\5\b/\n\b\3\b\5\b\62\n\b\3\t\5\t\65"+
		"\n\t\3\t\3\t\3\n\6\n:\n\n\r\n\16\n;\3\n\3\n\3\37\2\13\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\3\2\5\4\2$$))\20\2\62;C\\c|\u00c2\u00d8\u00da"+
		"\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02"+
		"\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\4\2\13\13\"\"D\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\33\3\2\2\2\7$\3\2\2\2\t"+
		"&\3\2\2\2\13(\3\2\2\2\r*\3\2\2\2\17\61\3\2\2\2\21\64\3\2\2\2\239\3\2\2"+
		"\2\25\27\5\t\5\2\26\30\5\t\5\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2"+
		"\2\31\32\3\2\2\2\32\4\3\2\2\2\33\37\5\7\4\2\34\36\13\2\2\2\35\34\3\2\2"+
		"\2\36!\3\2\2\2\37 \3\2\2\2\37\35\3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\5\7"+
		"\4\2#\6\3\2\2\2$%\t\2\2\2%\b\3\2\2\2&\'\t\3\2\2\'\n\3\2\2\2()\7*\2\2)"+
		"\f\3\2\2\2*+\7+\2\2+\16\3\2\2\2,.\7\60\2\2-/\5\21\t\2.-\3\2\2\2./\3\2"+
		"\2\2/\62\3\2\2\2\60\62\5\21\t\2\61,\3\2\2\2\61\60\3\2\2\2\62\20\3\2\2"+
		"\2\63\65\7\17\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\7\f"+
		"\2\2\67\22\3\2\2\28:\t\4\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<"+
		"=\3\2\2\2=>\b\n\2\2>\24\3\2\2\2\t\2\31\37.\61\64;\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}