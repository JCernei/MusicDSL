// Generated from .\Grammar.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, PLAY=9, 
		SLEEP=10, USE=11, REPEAT=12, TIMES=13, FOR=14, EACH=15, IN=16, DO=17, 
		END=18, FUNCTION=19, Var=20, LOWERCASE=21, UPPERCASE=22, DIGIT=23, BOL=24, 
		Lbracket=25, Rbracket=26;
	public static final int
		RULE_program = 0, RULE_listOfCommands = 1, RULE_basicCommands = 2, RULE_playCommand = 3, 
		RULE_sleepCommand = 4, RULE_time = 5, RULE_floatValue = 6, RULE_useCommand = 7, 
		RULE_repeatCommand = 8, RULE_forEachCommand = 9, RULE_functionCallCommand = 10, 
		RULE_initializationCommands = 11, RULE_initializeVariable = 12, RULE_value = 13, 
		RULE_naturalList = 14, RULE_floatList = 15, RULE_initializeFunction = 16, 
		RULE_functionBody = 17, RULE_naturalValue = 18, RULE_variableName = 19, 
		RULE_listName = 20, RULE_functionName = 21, RULE_instrument = 22, RULE_dot = 23, 
		RULE_comma = 24, RULE_equals = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "listOfCommands", "basicCommands", "playCommand", "sleepCommand", 
			"time", "floatValue", "useCommand", "repeatCommand", "forEachCommand", 
			"functionCallCommand", "initializationCommands", "initializeVariable", 
			"value", "naturalList", "floatList", "initializeFunction", "functionBody", 
			"naturalValue", "variableName", "listName", "functionName", "instrument", 
			"dot", "comma", "equals"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'_'", "'piano'", "'guitar'", "'violin'", "'drums'", "'.'", "','", 
			"'='", "'play'", "'sleep'", "'use'", "'repeat'", "'times'", "'for'", 
			"'each'", "'in'", "'do'", "'end'", "'function'", "'var'", null, null, 
			null, null, "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "PLAY", "SLEEP", 
			"USE", "REPEAT", "TIMES", "FOR", "EACH", "IN", "DO", "END", "FUNCTION", 
			"Var", "LOWERCASE", "UPPERCASE", "DIGIT", "BOL", "Lbracket", "Rbracket"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ListOfCommandsContext listOfCommands() {
			return getRuleContext(ListOfCommandsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			listOfCommands();
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

	public static class ListOfCommandsContext extends ParserRuleContext {
		public List<BasicCommandsContext> basicCommands() {
			return getRuleContexts(BasicCommandsContext.class);
		}
		public BasicCommandsContext basicCommands(int i) {
			return getRuleContext(BasicCommandsContext.class,i);
		}
		public List<InitializationCommandsContext> initializationCommands() {
			return getRuleContexts(InitializationCommandsContext.class);
		}
		public InitializationCommandsContext initializationCommands(int i) {
			return getRuleContext(InitializationCommandsContext.class,i);
		}
		public ListOfCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listOfCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterListOfCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitListOfCommands(this);
		}
	}

	public final ListOfCommandsContext listOfCommands() throws RecognitionException {
		ListOfCommandsContext _localctx = new ListOfCommandsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listOfCommands);
		int _la;
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(54);
					basicCommands();
					}
					}
					setState(57); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << PLAY) | (1L << SLEEP) | (1L << USE) | (1L << REPEAT) | (1L << FOR) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(59);
					initializationCommands();
					}
					}
					setState(62); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==FUNCTION || _la==Var );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(64);
					basicCommands();
					}
					}
					setState(67); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << PLAY) | (1L << SLEEP) | (1L << USE) | (1L << REPEAT) | (1L << FOR) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(69);
					initializationCommands();
					}
					}
					setState(72); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==FUNCTION || _la==Var );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(74);
					initializationCommands();
					}
					}
					setState(77); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==FUNCTION || _la==Var );
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(79);
					basicCommands();
					}
					}
					setState(82); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << PLAY) | (1L << SLEEP) | (1L << USE) | (1L << REPEAT) | (1L << FOR) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
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

	public static class BasicCommandsContext extends ParserRuleContext {
		public PlayCommandContext playCommand() {
			return getRuleContext(PlayCommandContext.class,0);
		}
		public SleepCommandContext sleepCommand() {
			return getRuleContext(SleepCommandContext.class,0);
		}
		public UseCommandContext useCommand() {
			return getRuleContext(UseCommandContext.class,0);
		}
		public RepeatCommandContext repeatCommand() {
			return getRuleContext(RepeatCommandContext.class,0);
		}
		public ForEachCommandContext forEachCommand() {
			return getRuleContext(ForEachCommandContext.class,0);
		}
		public FunctionCallCommandContext functionCallCommand() {
			return getRuleContext(FunctionCallCommandContext.class,0);
		}
		public BasicCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBasicCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBasicCommands(this);
		}
	}

	public final BasicCommandsContext basicCommands() throws RecognitionException {
		BasicCommandsContext _localctx = new BasicCommandsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_basicCommands);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				playCommand();
				}
				break;
			case SLEEP:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				sleepCommand();
				}
				break;
			case USE:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				useCommand();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				repeatCommand();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				forEachCommand();
				}
				break;
			case T__0:
			case LOWERCASE:
			case UPPERCASE:
			case DIGIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				functionCallCommand();
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

	public static class PlayCommandContext extends ParserRuleContext {
		public TerminalNode PLAY() { return getToken(GrammarParser.PLAY, 0); }
		public NaturalValueContext naturalValue() {
			return getRuleContext(NaturalValueContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public PlayCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPlayCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPlayCommand(this);
		}
	}

	public final PlayCommandContext playCommand() throws RecognitionException {
		PlayCommandContext _localctx = new PlayCommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_playCommand);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(PLAY);
				setState(95);
				naturalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(PLAY);
				setState(97);
				variableName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(PLAY);
				setState(99);
				functionName();
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

	public static class SleepCommandContext extends ParserRuleContext {
		public TerminalNode SLEEP() { return getToken(GrammarParser.SLEEP, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public SleepCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sleepCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSleepCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSleepCommand(this);
		}
	}

	public final SleepCommandContext sleepCommand() throws RecognitionException {
		SleepCommandContext _localctx = new SleepCommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sleepCommand);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(SLEEP);
				setState(103);
				time();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(SLEEP);
				setState(105);
				variableName();
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

	public static class TimeContext extends ParserRuleContext {
		public FloatValueContext floatValue() {
			return getRuleContext(FloatValueContext.class,0);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			floatValue();
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

	public static class FloatValueContext extends ParserRuleContext {
		public List<NaturalValueContext> naturalValue() {
			return getRuleContexts(NaturalValueContext.class);
		}
		public NaturalValueContext naturalValue(int i) {
			return getRuleContext(NaturalValueContext.class,i);
		}
		public DotContext dot() {
			return getRuleContext(DotContext.class,0);
		}
		public FloatValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFloatValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFloatValue(this);
		}
	}

	public final FloatValueContext floatValue() throws RecognitionException {
		FloatValueContext _localctx = new FloatValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_floatValue);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				naturalValue();
				setState(111);
				dot();
				setState(112);
				naturalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				naturalValue();
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

	public static class UseCommandContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(GrammarParser.USE, 0); }
		public InstrumentContext instrument() {
			return getRuleContext(InstrumentContext.class,0);
		}
		public UseCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterUseCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitUseCommand(this);
		}
	}

	public final UseCommandContext useCommand() throws RecognitionException {
		UseCommandContext _localctx = new UseCommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_useCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(USE);
			setState(118);
			instrument();
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

	public static class RepeatCommandContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(GrammarParser.REPEAT, 0); }
		public NaturalValueContext naturalValue() {
			return getRuleContext(NaturalValueContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(GrammarParser.TIMES, 0); }
		public ListOfCommandsContext listOfCommands() {
			return getRuleContext(ListOfCommandsContext.class,0);
		}
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public RepeatCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRepeatCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRepeatCommand(this);
		}
	}

	public final RepeatCommandContext repeatCommand() throws RecognitionException {
		RepeatCommandContext _localctx = new RepeatCommandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_repeatCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(REPEAT);
			setState(121);
			naturalValue();
			setState(122);
			match(TIMES);
			setState(123);
			listOfCommands();
			setState(124);
			match(END);
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

	public static class ForEachCommandContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GrammarParser.FOR, 0); }
		public TerminalNode EACH() { return getToken(GrammarParser.EACH, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode IN() { return getToken(GrammarParser.IN, 0); }
		public ListNameContext listName() {
			return getRuleContext(ListNameContext.class,0);
		}
		public TerminalNode DO() { return getToken(GrammarParser.DO, 0); }
		public ListOfCommandsContext listOfCommands() {
			return getRuleContext(ListOfCommandsContext.class,0);
		}
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public ForEachCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEachCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterForEachCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitForEachCommand(this);
		}
	}

	public final ForEachCommandContext forEachCommand() throws RecognitionException {
		ForEachCommandContext _localctx = new ForEachCommandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forEachCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(FOR);
			setState(127);
			match(EACH);
			setState(128);
			variableName();
			setState(129);
			match(IN);
			setState(130);
			listName();
			setState(131);
			match(DO);
			setState(132);
			listOfCommands();
			setState(133);
			match(END);
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

	public static class FunctionCallCommandContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionCallCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunctionCallCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunctionCallCommand(this);
		}
	}

	public final FunctionCallCommandContext functionCallCommand() throws RecognitionException {
		FunctionCallCommandContext _localctx = new FunctionCallCommandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionCallCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			functionName();
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

	public static class InitializationCommandsContext extends ParserRuleContext {
		public InitializeFunctionContext initializeFunction() {
			return getRuleContext(InitializeFunctionContext.class,0);
		}
		public InitializeVariableContext initializeVariable() {
			return getRuleContext(InitializeVariableContext.class,0);
		}
		public InitializationCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializationCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInitializationCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInitializationCommands(this);
		}
	}

	public final InitializationCommandsContext initializationCommands() throws RecognitionException {
		InitializationCommandsContext _localctx = new InitializationCommandsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_initializationCommands);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				initializeFunction();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				initializeVariable();
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

	public static class InitializeVariableContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public EqualsContext equals() {
			return getRuleContext(EqualsContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public InitializeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInitializeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInitializeVariable(this);
		}
	}

	public final InitializeVariableContext initializeVariable() throws RecognitionException {
		InitializeVariableContext _localctx = new InitializeVariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_initializeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(Var);
			setState(142);
			variableName();
			setState(143);
			equals();
			setState(144);
			value();
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
		public NaturalValueContext naturalValue() {
			return getRuleContext(NaturalValueContext.class,0);
		}
		public FloatValueContext floatValue() {
			return getRuleContext(FloatValueContext.class,0);
		}
		public TerminalNode Lbracket() { return getToken(GrammarParser.Lbracket, 0); }
		public NaturalListContext naturalList() {
			return getRuleContext(NaturalListContext.class,0);
		}
		public TerminalNode Rbracket() { return getToken(GrammarParser.Rbracket, 0); }
		public FloatListContext floatList() {
			return getRuleContext(FloatListContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				naturalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				floatValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(Lbracket);
				setState(149);
				naturalList();
				setState(150);
				match(Rbracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(Lbracket);
				setState(153);
				floatList();
				setState(154);
				match(Rbracket);
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

	public static class NaturalListContext extends ParserRuleContext {
		public NaturalValueContext naturalValue() {
			return getRuleContext(NaturalValueContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public NaturalListContext naturalList() {
			return getRuleContext(NaturalListContext.class,0);
		}
		public NaturalListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naturalList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNaturalList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNaturalList(this);
		}
	}

	public final NaturalListContext naturalList() throws RecognitionException {
		NaturalListContext _localctx = new NaturalListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_naturalList);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				naturalValue();
				setState(159);
				comma();
				setState(160);
				naturalList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				naturalValue();
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

	public static class FloatListContext extends ParserRuleContext {
		public FloatValueContext floatValue() {
			return getRuleContext(FloatValueContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public FloatListContext floatList() {
			return getRuleContext(FloatListContext.class,0);
		}
		public FloatListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFloatList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFloatList(this);
		}
	}

	public final FloatListContext floatList() throws RecognitionException {
		FloatListContext _localctx = new FloatListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_floatList);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				floatValue();
				setState(166);
				comma();
				setState(167);
				floatList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				floatValue();
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

	public static class InitializeFunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(GrammarParser.FUNCTION, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode DO() { return getToken(GrammarParser.DO, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public InitializeFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializeFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInitializeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInitializeFunction(this);
		}
	}

	public final InitializeFunctionContext initializeFunction() throws RecognitionException {
		InitializeFunctionContext _localctx = new InitializeFunctionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_initializeFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(FUNCTION);
			setState(173);
			functionName();
			setState(174);
			match(DO);
			setState(175);
			functionBody();
			setState(176);
			match(END);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public ListOfCommandsContext listOfCommands() {
			return getRuleContext(ListOfCommandsContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			listOfCommands();
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

	public static class NaturalValueContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(GrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GrammarParser.DIGIT, i);
		}
		public NaturalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naturalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNaturalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNaturalValue(this);
		}
	}

	public final NaturalValueContext naturalValue() throws RecognitionException {
		NaturalValueContext _localctx = new NaturalValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_naturalValue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(180);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(183); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class VariableNameContext extends ParserRuleContext {
		public List<TerminalNode> LOWERCASE() { return getTokens(GrammarParser.LOWERCASE); }
		public TerminalNode LOWERCASE(int i) {
			return getToken(GrammarParser.LOWERCASE, i);
		}
		public List<TerminalNode> UPPERCASE() { return getTokens(GrammarParser.UPPERCASE); }
		public TerminalNode UPPERCASE(int i) {
			return getToken(GrammarParser.UPPERCASE, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(GrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GrammarParser.DIGIT, i);
		}
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVariableName(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(185);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(188); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ListNameContext extends ParserRuleContext {
		public List<TerminalNode> LOWERCASE() { return getTokens(GrammarParser.LOWERCASE); }
		public TerminalNode LOWERCASE(int i) {
			return getToken(GrammarParser.LOWERCASE, i);
		}
		public List<TerminalNode> UPPERCASE() { return getTokens(GrammarParser.UPPERCASE); }
		public TerminalNode UPPERCASE(int i) {
			return getToken(GrammarParser.UPPERCASE, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(GrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GrammarParser.DIGIT, i);
		}
		public ListNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterListName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitListName(this);
		}
	}

	public final ListNameContext listName() throws RecognitionException {
		ListNameContext _localctx = new ListNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_listName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(190);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
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

	public static class FunctionNameContext extends ParserRuleContext {
		public List<TerminalNode> LOWERCASE() { return getTokens(GrammarParser.LOWERCASE); }
		public TerminalNode LOWERCASE(int i) {
			return getToken(GrammarParser.LOWERCASE, i);
		}
		public List<TerminalNode> UPPERCASE() { return getTokens(GrammarParser.UPPERCASE); }
		public TerminalNode UPPERCASE(int i) {
			return getToken(GrammarParser.UPPERCASE, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(GrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GrammarParser.DIGIT, i);
		}
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(195);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(198); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class InstrumentContext extends ParserRuleContext {
		public InstrumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInstrument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInstrument(this);
		}
	}

	public final InstrumentContext instrument() throws RecognitionException {
		InstrumentContext _localctx = new InstrumentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_instrument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
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

	public static class DotContext extends ParserRuleContext {
		public DotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDot(this);
		}
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__5);
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

	public static class CommaContext extends ParserRuleContext {
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitComma(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__6);
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

	public static class EqualsContext extends ParserRuleContext {
		public EqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEquals(this);
		}
	}

	public final EqualsContext equals() throws RecognitionException {
		EqualsContext _localctx = new EqualsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__7);
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
		"\u0004\u0001\u001a\u00d1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0001\u0004"+
		"\u00018\b\u0001\u000b\u0001\f\u00019\u0001\u0001\u0004\u0001=\b\u0001"+
		"\u000b\u0001\f\u0001>\u0001\u0001\u0004\u0001B\b\u0001\u000b\u0001\f\u0001"+
		"C\u0001\u0001\u0004\u0001G\b\u0001\u000b\u0001\f\u0001H\u0001\u0001\u0004"+
		"\u0001L\b\u0001\u000b\u0001\f\u0001M\u0001\u0001\u0004\u0001Q\b\u0001"+
		"\u000b\u0001\f\u0001R\u0003\u0001U\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002]\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003e\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004k\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006t\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u008c\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u009d\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00a4\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ab"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012\u00b6\b\u0012\u000b"+
		"\u0012\f\u0012\u00b7\u0001\u0013\u0004\u0013\u00bb\b\u0013\u000b\u0013"+
		"\f\u0013\u00bc\u0001\u0014\u0004\u0014\u00c0\b\u0014\u000b\u0014\f\u0014"+
		"\u00c1\u0001\u0015\u0004\u0015\u00c5\b\u0015\u000b\u0015\f\u0015\u00c6"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0000\u0000\u001a\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02\u0000\u0002\u0002\u0000\u0001\u0001\u0015\u0017\u0001\u0000\u0002"+
		"\u0005\u00d2\u00004\u0001\u0000\u0000\u0000\u0002T\u0001\u0000\u0000\u0000"+
		"\u0004\\\u0001\u0000\u0000\u0000\u0006d\u0001\u0000\u0000\u0000\bj\u0001"+
		"\u0000\u0000\u0000\nl\u0001\u0000\u0000\u0000\fs\u0001\u0000\u0000\u0000"+
		"\u000eu\u0001\u0000\u0000\u0000\u0010x\u0001\u0000\u0000\u0000\u0012~"+
		"\u0001\u0000\u0000\u0000\u0014\u0087\u0001\u0000\u0000\u0000\u0016\u008b"+
		"\u0001\u0000\u0000\u0000\u0018\u008d\u0001\u0000\u0000\u0000\u001a\u009c"+
		"\u0001\u0000\u0000\u0000\u001c\u00a3\u0001\u0000\u0000\u0000\u001e\u00aa"+
		"\u0001\u0000\u0000\u0000 \u00ac\u0001\u0000\u0000\u0000\"\u00b2\u0001"+
		"\u0000\u0000\u0000$\u00b5\u0001\u0000\u0000\u0000&\u00ba\u0001\u0000\u0000"+
		"\u0000(\u00bf\u0001\u0000\u0000\u0000*\u00c4\u0001\u0000\u0000\u0000,"+
		"\u00c8\u0001\u0000\u0000\u0000.\u00ca\u0001\u0000\u0000\u00000\u00cc\u0001"+
		"\u0000\u0000\u00002\u00ce\u0001\u0000\u0000\u000045\u0003\u0002\u0001"+
		"\u00005\u0001\u0001\u0000\u0000\u000068\u0003\u0004\u0002\u000076\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:U\u0001\u0000\u0000\u0000;=\u0003\u0016\u000b"+
		"\u0000<;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?U\u0001\u0000\u0000\u0000@B\u0003"+
		"\u0004\u0002\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000"+
		"\u0000EG\u0003\u0016\u000b\u0000FE\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IU\u0001"+
		"\u0000\u0000\u0000JL\u0003\u0016\u000b\u0000KJ\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000NP\u0001\u0000\u0000\u0000OQ\u0003\u0004\u0002\u0000PO\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000T7\u0001\u0000\u0000\u0000"+
		"T<\u0001\u0000\u0000\u0000TA\u0001\u0000\u0000\u0000TK\u0001\u0000\u0000"+
		"\u0000U\u0003\u0001\u0000\u0000\u0000V]\u0003\u0006\u0003\u0000W]\u0003"+
		"\b\u0004\u0000X]\u0003\u000e\u0007\u0000Y]\u0003\u0010\b\u0000Z]\u0003"+
		"\u0012\t\u0000[]\u0003\u0014\n\u0000\\V\u0001\u0000\u0000\u0000\\W\u0001"+
		"\u0000\u0000\u0000\\X\u0001\u0000\u0000\u0000\\Y\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]\u0005\u0001\u0000"+
		"\u0000\u0000^_\u0005\t\u0000\u0000_e\u0003$\u0012\u0000`a\u0005\t\u0000"+
		"\u0000ae\u0003&\u0013\u0000bc\u0005\t\u0000\u0000ce\u0003*\u0015\u0000"+
		"d^\u0001\u0000\u0000\u0000d`\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000e\u0007\u0001\u0000\u0000\u0000fg\u0005\n\u0000\u0000gk\u0003\n"+
		"\u0005\u0000hi\u0005\n\u0000\u0000ik\u0003&\u0013\u0000jf\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000k\t\u0001\u0000\u0000\u0000lm\u0003"+
		"\f\u0006\u0000m\u000b\u0001\u0000\u0000\u0000no\u0003$\u0012\u0000op\u0003"+
		".\u0017\u0000pq\u0003$\u0012\u0000qt\u0001\u0000\u0000\u0000rt\u0003$"+
		"\u0012\u0000sn\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000t\r\u0001"+
		"\u0000\u0000\u0000uv\u0005\u000b\u0000\u0000vw\u0003,\u0016\u0000w\u000f"+
		"\u0001\u0000\u0000\u0000xy\u0005\f\u0000\u0000yz\u0003$\u0012\u0000z{"+
		"\u0005\r\u0000\u0000{|\u0003\u0002\u0001\u0000|}\u0005\u0012\u0000\u0000"+
		"}\u0011\u0001\u0000\u0000\u0000~\u007f\u0005\u000e\u0000\u0000\u007f\u0080"+
		"\u0005\u000f\u0000\u0000\u0080\u0081\u0003&\u0013\u0000\u0081\u0082\u0005"+
		"\u0010\u0000\u0000\u0082\u0083\u0003(\u0014\u0000\u0083\u0084\u0005\u0011"+
		"\u0000\u0000\u0084\u0085\u0003\u0002\u0001\u0000\u0085\u0086\u0005\u0012"+
		"\u0000\u0000\u0086\u0013\u0001\u0000\u0000\u0000\u0087\u0088\u0003*\u0015"+
		"\u0000\u0088\u0015\u0001\u0000\u0000\u0000\u0089\u008c\u0003 \u0010\u0000"+
		"\u008a\u008c\u0003\u0018\f\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u0017\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0005\u0014\u0000\u0000\u008e\u008f\u0003&\u0013\u0000\u008f\u0090"+
		"\u00032\u0019\u0000\u0090\u0091\u0003\u001a\r\u0000\u0091\u0019\u0001"+
		"\u0000\u0000\u0000\u0092\u009d\u0003$\u0012\u0000\u0093\u009d\u0003\f"+
		"\u0006\u0000\u0094\u0095\u0005\u0019\u0000\u0000\u0095\u0096\u0003\u001c"+
		"\u000e\u0000\u0096\u0097\u0005\u001a\u0000\u0000\u0097\u009d\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0005\u0019\u0000\u0000\u0099\u009a\u0003\u001e"+
		"\u000f\u0000\u009a\u009b\u0005\u001a\u0000\u0000\u009b\u009d\u0001\u0000"+
		"\u0000\u0000\u009c\u0092\u0001\u0000\u0000\u0000\u009c\u0093\u0001\u0000"+
		"\u0000\u0000\u009c\u0094\u0001\u0000\u0000\u0000\u009c\u0098\u0001\u0000"+
		"\u0000\u0000\u009d\u001b\u0001\u0000\u0000\u0000\u009e\u009f\u0003$\u0012"+
		"\u0000\u009f\u00a0\u00030\u0018\u0000\u00a0\u00a1\u0003\u001c\u000e\u0000"+
		"\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a4\u0003$\u0012\u0000\u00a3"+
		"\u009e\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4"+
		"\u001d\u0001\u0000\u0000\u0000\u00a5\u00a6\u0003\f\u0006\u0000\u00a6\u00a7"+
		"\u00030\u0018\u0000\u00a7\u00a8\u0003\u001e\u000f\u0000\u00a8\u00ab\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ab\u0003\f\u0006\u0000\u00aa\u00a5\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u001f\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0005\u0013\u0000\u0000\u00ad\u00ae\u0003*\u0015"+
		"\u0000\u00ae\u00af\u0005\u0011\u0000\u0000\u00af\u00b0\u0003\"\u0011\u0000"+
		"\u00b0\u00b1\u0005\u0012\u0000\u0000\u00b1!\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0003\u0002\u0001\u0000\u00b3#\u0001\u0000\u0000\u0000\u00b4\u00b6"+
		"\u0005\u0017\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b8%\u0001\u0000\u0000\u0000\u00b9\u00bb\u0007"+
		"\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bd\'\u0001\u0000\u0000\u0000\u00be\u00c0\u0007\u0000"+
		"\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c2)\u0001\u0000\u0000\u0000\u00c3\u00c5\u0007\u0000\u0000"+
		"\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c7+\u0001\u0000\u0000\u0000\u00c8\u00c9\u0007\u0001\u0000\u0000"+
		"\u00c9-\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u0006\u0000\u0000\u00cb"+
		"/\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0007\u0000\u0000\u00cd1\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0005\b\u0000\u0000\u00cf3\u0001\u0000"+
		"\u0000\u0000\u00139>CHMRT\\djs\u008b\u009c\u00a3\u00aa\u00b7\u00bc\u00c1"+
		"\u00c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}