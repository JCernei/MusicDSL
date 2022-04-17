// Generated from Grammar.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, PLAY=11, SLEEP=12, USE=13, REPEAT=14, TIMES=15, FOR=16, EACH=17, 
		IN=18, DO=19, END=20, FUNCTION=21, Var=22, LOWERCASE=23, UPPERCASE=24, 
		DIGIT=25, BOL=26;
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
			null, "'['", "']'", "'_'", "'piano'", "'guitar'", "'violin'", "'drums'", 
			"'.'", "','", "'='", "'play'", "'sleep'", "'use'", "'repeat'", "'times'", 
			"'for'", "'each'", "'in'", "'do'", "'end'", "'function'", "'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "PLAY", 
			"SLEEP", "USE", "REPEAT", "TIMES", "FOR", "EACH", "IN", "DO", "END", 
			"FUNCTION", "Var", "LOWERCASE", "UPPERCASE", "DIGIT", "BOL"
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
		public ListOfCommandsContext listOfCommands() {
			return getRuleContext(ListOfCommandsContext.class,0);
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
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << PLAY) | (1L << SLEEP) | (1L << USE) | (1L << REPEAT) | (1L << FOR) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
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
				setState(64);
				basicCommands();
				setState(65);
				listOfCommands();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				initializationCommands();
				setState(68);
				listOfCommands();
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
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				playCommand(0);
				}
				break;
			case SLEEP:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				sleepCommand(0);
				}
				break;
			case USE:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				useCommand(0);
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				repeatCommand(0);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				forEachCommand(0);
				}
				break;
			case T__2:
			case LOWERCASE:
			case UPPERCASE:
			case DIGIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				functionCallCommand(0);
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
		public PlayCommandContext playCommand() {
			return getRuleContext(PlayCommandContext.class,0);
		}
		public BasicCommandsContext basicCommands() {
			return getRuleContext(BasicCommandsContext.class,0);
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
		return playCommand(0);
	}

	private PlayCommandContext playCommand(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PlayCommandContext _localctx = new PlayCommandContext(_ctx, _parentState);
		PlayCommandContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_playCommand, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(81);
				match(PLAY);
				setState(82);
				naturalValue();
				}
				break;
			case 2:
				{
				setState(83);
				match(PLAY);
				setState(84);
				variableName();
				}
				break;
			case 3:
				{
				setState(85);
				match(PLAY);
				setState(86);
				functionName();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PlayCommandContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_playCommand);
					setState(89);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(90);
					basicCommands();
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class SleepCommandContext extends ParserRuleContext {
		public TerminalNode SLEEP() { return getToken(GrammarParser.SLEEP, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public SleepCommandContext sleepCommand() {
			return getRuleContext(SleepCommandContext.class,0);
		}
		public BasicCommandsContext basicCommands() {
			return getRuleContext(BasicCommandsContext.class,0);
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
		return sleepCommand(0);
	}

	private SleepCommandContext sleepCommand(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SleepCommandContext _localctx = new SleepCommandContext(_ctx, _parentState);
		SleepCommandContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_sleepCommand, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(97);
				match(SLEEP);
				setState(98);
				time();
				}
				break;
			case 2:
				{
				setState(99);
				match(SLEEP);
				setState(100);
				variableName();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SleepCommandContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sleepCommand);
					setState(103);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(104);
					basicCommands();
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(110);
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
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				naturalValue();
				setState(113);
				dot();
				setState(114);
				naturalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
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
		public UseCommandContext useCommand() {
			return getRuleContext(UseCommandContext.class,0);
		}
		public BasicCommandsContext basicCommands() {
			return getRuleContext(BasicCommandsContext.class,0);
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
		return useCommand(0);
	}

	private UseCommandContext useCommand(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UseCommandContext _localctx = new UseCommandContext(_ctx, _parentState);
		UseCommandContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_useCommand, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(120);
			match(USE);
			setState(121);
			instrument();
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new UseCommandContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_useCommand);
					setState(123);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(124);
					basicCommands();
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class RepeatCommandContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(GrammarParser.REPEAT, 0); }
		public NaturalValueContext naturalValue() {
			return getRuleContext(NaturalValueContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(GrammarParser.TIMES, 0); }
		public BasicCommandsContext basicCommands() {
			return getRuleContext(BasicCommandsContext.class,0);
		}
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public RepeatCommandContext repeatCommand() {
			return getRuleContext(RepeatCommandContext.class,0);
		}
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
		return repeatCommand(0);
	}

	private RepeatCommandContext repeatCommand(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RepeatCommandContext _localctx = new RepeatCommandContext(_ctx, _parentState);
		RepeatCommandContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_repeatCommand, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(131);
			match(REPEAT);
			setState(132);
			naturalValue();
			setState(133);
			match(TIMES);
			setState(134);
			basicCommands();
			setState(135);
			match(END);
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RepeatCommandContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_repeatCommand);
					setState(137);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(138);
					basicCommands();
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public BasicCommandsContext basicCommands() {
			return getRuleContext(BasicCommandsContext.class,0);
		}
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public ForEachCommandContext forEachCommand() {
			return getRuleContext(ForEachCommandContext.class,0);
		}
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
		return forEachCommand(0);
	}

	private ForEachCommandContext forEachCommand(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ForEachCommandContext _localctx = new ForEachCommandContext(_ctx, _parentState);
		ForEachCommandContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_forEachCommand, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(145);
			match(FOR);
			setState(146);
			match(EACH);
			setState(147);
			variableName();
			setState(148);
			match(IN);
			setState(149);
			listName();
			setState(150);
			match(DO);
			setState(151);
			basicCommands();
			setState(152);
			match(END);
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ForEachCommandContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_forEachCommand);
					setState(154);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(155);
					basicCommands();
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class FunctionCallCommandContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionCallCommandContext functionCallCommand() {
			return getRuleContext(FunctionCallCommandContext.class,0);
		}
		public BasicCommandsContext basicCommands() {
			return getRuleContext(BasicCommandsContext.class,0);
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
		return functionCallCommand(0);
	}

	private FunctionCallCommandContext functionCallCommand(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FunctionCallCommandContext _localctx = new FunctionCallCommandContext(_ctx, _parentState);
		FunctionCallCommandContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_functionCallCommand, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(162);
			functionName();
			}
			_ctx.stop = _input.LT(-1);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionCallCommandContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_functionCallCommand);
					setState(164);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(165);
					basicCommands();
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				initializeFunction();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
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
			setState(175);
			match(Var);
			setState(176);
			variableName();
			setState(177);
			equals();
			setState(178);
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
		public NaturalListContext naturalList() {
			return getRuleContext(NaturalListContext.class,0);
		}
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
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				naturalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				floatValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(T__0);
				setState(183);
				naturalList();
				setState(184);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				match(T__0);
				setState(187);
				floatList();
				setState(188);
				match(T__1);
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
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				naturalValue();
				setState(193);
				comma();
				setState(194);
				naturalList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				naturalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				floatValue();
				setState(201);
				comma();
				setState(202);
				floatList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				floatValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
			setState(208);
			match(FUNCTION);
			setState(209);
			functionName();
			setState(210);
			match(DO);
			setState(211);
			functionBody();
			setState(212);
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
		public BasicCommandsContext basicCommands() {
			return getRuleContext(BasicCommandsContext.class,0);
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
			setState(214);
			basicCommands();
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
			setState(217); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(216);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(219); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
			setState(222); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(221);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) ) {
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
				setState(224); 
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
			setState(227); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(226);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0) );
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
			setState(232); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(231);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) ) {
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
				setState(234); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
			setState(236);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
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
			setState(238);
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
			setState(240);
			match(T__8);
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
			setState(242);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return playCommand_sempred((PlayCommandContext)_localctx, predIndex);
		case 4:
			return sleepCommand_sempred((SleepCommandContext)_localctx, predIndex);
		case 7:
			return useCommand_sempred((UseCommandContext)_localctx, predIndex);
		case 8:
			return repeatCommand_sempred((RepeatCommandContext)_localctx, predIndex);
		case 9:
			return forEachCommand_sempred((ForEachCommandContext)_localctx, predIndex);
		case 10:
			return functionCallCommand_sempred((FunctionCallCommandContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean playCommand_sempred(PlayCommandContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sleepCommand_sempred(SleepCommandContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean useCommand_sempred(UseCommandContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean repeatCommand_sempred(RepeatCommandContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean forEachCommand_sempred(ForEachCommandContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean functionCallCommand_sempred(FunctionCallCommandContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00f7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\3\6\3:\n\3\r\3\16\3;\3\3\6\3?\n\3\r\3\16"+
		"\3@\3\3\3\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4Q\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Z\n\5\3\5\3\5\7\5^\n\5\f\5\16\5a\13\5"+
		"\3\6\3\6\3\6\3\6\3\6\5\6h\n\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\5\bx\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0080\n\t\f"+
		"\t\16\t\u0083\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u008e\n\n\f"+
		"\n\16\n\u0091\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\7\13\u009f\n\13\f\13\16\13\u00a2\13\13\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u00a9\n\f\f\f\16\f\u00ac\13\f\3\r\3\r\5\r\u00b0\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c1"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c9\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00d1\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\6\24\u00dc\n\24\r\24\16\24\u00dd\3\25\6\25\u00e1\n\25\r\25\16\25\u00e2"+
		"\3\26\6\26\u00e6\n\26\r\26\16\26\u00e7\3\27\6\27\u00eb\n\27\r\27\16\27"+
		"\u00ec\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\2\b\b\n\20\22\24\26"+
		"\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\4\4\2\5"+
		"\5\31\33\3\2\6\t\2\u00fc\2\66\3\2\2\2\4H\3\2\2\2\6P\3\2\2\2\bY\3\2\2\2"+
		"\ng\3\2\2\2\fp\3\2\2\2\16w\3\2\2\2\20y\3\2\2\2\22\u0084\3\2\2\2\24\u0092"+
		"\3\2\2\2\26\u00a3\3\2\2\2\30\u00af\3\2\2\2\32\u00b1\3\2\2\2\34\u00c0\3"+
		"\2\2\2\36\u00c8\3\2\2\2 \u00d0\3\2\2\2\"\u00d2\3\2\2\2$\u00d8\3\2\2\2"+
		"&\u00db\3\2\2\2(\u00e0\3\2\2\2*\u00e5\3\2\2\2,\u00ea\3\2\2\2.\u00ee\3"+
		"\2\2\2\60\u00f0\3\2\2\2\62\u00f2\3\2\2\2\64\u00f4\3\2\2\2\66\67\5\4\3"+
		"\2\67\3\3\2\2\28:\5\6\4\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<I\3"+
		"\2\2\2=?\5\30\r\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AI\3\2\2\2BC"+
		"\5\6\4\2CD\5\4\3\2DI\3\2\2\2EF\5\30\r\2FG\5\4\3\2GI\3\2\2\2H9\3\2\2\2"+
		"H>\3\2\2\2HB\3\2\2\2HE\3\2\2\2I\5\3\2\2\2JQ\5\b\5\2KQ\5\n\6\2LQ\5\20\t"+
		"\2MQ\5\22\n\2NQ\5\24\13\2OQ\5\26\f\2PJ\3\2\2\2PK\3\2\2\2PL\3\2\2\2PM\3"+
		"\2\2\2PN\3\2\2\2PO\3\2\2\2Q\7\3\2\2\2RS\b\5\1\2ST\7\r\2\2TZ\5&\24\2UV"+
		"\7\r\2\2VZ\5(\25\2WX\7\r\2\2XZ\5,\27\2YR\3\2\2\2YU\3\2\2\2YW\3\2\2\2Z"+
		"_\3\2\2\2[\\\f\3\2\2\\^\5\6\4\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2"+
		"\2`\t\3\2\2\2a_\3\2\2\2bc\b\6\1\2cd\7\16\2\2dh\5\f\7\2ef\7\16\2\2fh\5"+
		"(\25\2gb\3\2\2\2ge\3\2\2\2hm\3\2\2\2ij\f\3\2\2jl\5\6\4\2ki\3\2\2\2lo\3"+
		"\2\2\2mk\3\2\2\2mn\3\2\2\2n\13\3\2\2\2om\3\2\2\2pq\5\16\b\2q\r\3\2\2\2"+
		"rs\5&\24\2st\5\60\31\2tu\5&\24\2ux\3\2\2\2vx\5&\24\2wr\3\2\2\2wv\3\2\2"+
		"\2x\17\3\2\2\2yz\b\t\1\2z{\7\17\2\2{|\5.\30\2|\u0081\3\2\2\2}~\f\3\2\2"+
		"~\u0080\5\6\4\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\21\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\b\n\1"+
		"\2\u0085\u0086\7\20\2\2\u0086\u0087\5&\24\2\u0087\u0088\7\21\2\2\u0088"+
		"\u0089\5\6\4\2\u0089\u008a\7\26\2\2\u008a\u008f\3\2\2\2\u008b\u008c\f"+
		"\3\2\2\u008c\u008e\5\6\4\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\23\3\2\2\2\u0091\u008f\3\2\2"+
		"\2\u0092\u0093\b\13\1\2\u0093\u0094\7\22\2\2\u0094\u0095\7\23\2\2\u0095"+
		"\u0096\5(\25\2\u0096\u0097\7\24\2\2\u0097\u0098\5*\26\2\u0098\u0099\7"+
		"\25\2\2\u0099\u009a\5\6\4\2\u009a\u009b\7\26\2\2\u009b\u00a0\3\2\2\2\u009c"+
		"\u009d\f\3\2\2\u009d\u009f\5\6\4\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2"+
		"\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\25\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a3\u00a4\b\f\1\2\u00a4\u00a5\5,\27\2\u00a5\u00aa\3\2\2\2\u00a6"+
		"\u00a7\f\3\2\2\u00a7\u00a9\5\6\4\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\27\3\2\2\2\u00ac\u00aa"+
		"\3\2\2\2\u00ad\u00b0\5\"\22\2\u00ae\u00b0\5\32\16\2\u00af\u00ad\3\2\2"+
		"\2\u00af\u00ae\3\2\2\2\u00b0\31\3\2\2\2\u00b1\u00b2\7\30\2\2\u00b2\u00b3"+
		"\5(\25\2\u00b3\u00b4\5\64\33\2\u00b4\u00b5\5\34\17\2\u00b5\33\3\2\2\2"+
		"\u00b6\u00c1\5&\24\2\u00b7\u00c1\5\16\b\2\u00b8\u00b9\7\3\2\2\u00b9\u00ba"+
		"\5\36\20\2\u00ba\u00bb\7\4\2\2\u00bb\u00c1\3\2\2\2\u00bc\u00bd\7\3\2\2"+
		"\u00bd\u00be\5 \21\2\u00be\u00bf\7\4\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00b6"+
		"\3\2\2\2\u00c0\u00b7\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1"+
		"\35\3\2\2\2\u00c2\u00c3\5&\24\2\u00c3\u00c4\5\62\32\2\u00c4\u00c5\5\36"+
		"\20\2\u00c5\u00c9\3\2\2\2\u00c6\u00c9\5&\24\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c2\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\37\3\2\2"+
		"\2\u00ca\u00cb\5\16\b\2\u00cb\u00cc\5\62\32\2\u00cc\u00cd\5 \21\2\u00cd"+
		"\u00d1\3\2\2\2\u00ce\u00d1\5\16\b\2\u00cf\u00d1\3\2\2\2\u00d0\u00ca\3"+
		"\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1!\3\2\2\2\u00d2\u00d3"+
		"\7\27\2\2\u00d3\u00d4\5,\27\2\u00d4\u00d5\7\25\2\2\u00d5\u00d6\5$\23\2"+
		"\u00d6\u00d7\7\26\2\2\u00d7#\3\2\2\2\u00d8\u00d9\5\6\4\2\u00d9%\3\2\2"+
		"\2\u00da\u00dc\7\33\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\'\3\2\2\2\u00df\u00e1\t\2\2\2"+
		"\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3)\3\2\2\2\u00e4\u00e6\t\2\2\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8+\3\2\2\2"+
		"\u00e9\u00eb\t\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed-\3\2\2\2\u00ee\u00ef\t\3\2\2\u00ef"+
		"/\3\2\2\2\u00f0\u00f1\7\n\2\2\u00f1\61\3\2\2\2\u00f2\u00f3\7\13\2\2\u00f3"+
		"\63\3\2\2\2\u00f4\u00f5\7\f\2\2\u00f5\65\3\2\2\2\27;@HPY_gmw\u0081\u008f"+
		"\u00a0\u00aa\u00af\u00c0\u00c8\u00d0\u00dd\u00e2\u00e7\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}