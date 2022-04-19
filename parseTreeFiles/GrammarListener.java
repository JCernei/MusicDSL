// Generated from .\Grammar.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#listOfCommands}.
	 * @param ctx the parse tree
	 */
	void enterListOfCommands(GrammarParser.ListOfCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#listOfCommands}.
	 * @param ctx the parse tree
	 */
	void exitListOfCommands(GrammarParser.ListOfCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#basicCommands}.
	 * @param ctx the parse tree
	 */
	void enterBasicCommands(GrammarParser.BasicCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#basicCommands}.
	 * @param ctx the parse tree
	 */
	void exitBasicCommands(GrammarParser.BasicCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#playCommand}.
	 * @param ctx the parse tree
	 */
	void enterPlayCommand(GrammarParser.PlayCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#playCommand}.
	 * @param ctx the parse tree
	 */
	void exitPlayCommand(GrammarParser.PlayCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#sleepCommand}.
	 * @param ctx the parse tree
	 */
	void enterSleepCommand(GrammarParser.SleepCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#sleepCommand}.
	 * @param ctx the parse tree
	 */
	void exitSleepCommand(GrammarParser.SleepCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(GrammarParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(GrammarParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#floatValue}.
	 * @param ctx the parse tree
	 */
	void enterFloatValue(GrammarParser.FloatValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#floatValue}.
	 * @param ctx the parse tree
	 */
	void exitFloatValue(GrammarParser.FloatValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#useCommand}.
	 * @param ctx the parse tree
	 */
	void enterUseCommand(GrammarParser.UseCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#useCommand}.
	 * @param ctx the parse tree
	 */
	void exitUseCommand(GrammarParser.UseCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#repeatCommand}.
	 * @param ctx the parse tree
	 */
	void enterRepeatCommand(GrammarParser.RepeatCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#repeatCommand}.
	 * @param ctx the parse tree
	 */
	void exitRepeatCommand(GrammarParser.RepeatCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#forEachCommand}.
	 * @param ctx the parse tree
	 */
	void enterForEachCommand(GrammarParser.ForEachCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#forEachCommand}.
	 * @param ctx the parse tree
	 */
	void exitForEachCommand(GrammarParser.ForEachCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionCallCommand}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallCommand(GrammarParser.FunctionCallCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionCallCommand}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallCommand(GrammarParser.FunctionCallCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#initializationCommands}.
	 * @param ctx the parse tree
	 */
	void enterInitializationCommands(GrammarParser.InitializationCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#initializationCommands}.
	 * @param ctx the parse tree
	 */
	void exitInitializationCommands(GrammarParser.InitializationCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#initializeVariable}.
	 * @param ctx the parse tree
	 */
	void enterInitializeVariable(GrammarParser.InitializeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#initializeVariable}.
	 * @param ctx the parse tree
	 */
	void exitInitializeVariable(GrammarParser.InitializeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(GrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(GrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#naturalList}.
	 * @param ctx the parse tree
	 */
	void enterNaturalList(GrammarParser.NaturalListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#naturalList}.
	 * @param ctx the parse tree
	 */
	void exitNaturalList(GrammarParser.NaturalListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#floatList}.
	 * @param ctx the parse tree
	 */
	void enterFloatList(GrammarParser.FloatListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#floatList}.
	 * @param ctx the parse tree
	 */
	void exitFloatList(GrammarParser.FloatListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#initializeFunction}.
	 * @param ctx the parse tree
	 */
	void enterInitializeFunction(GrammarParser.InitializeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#initializeFunction}.
	 * @param ctx the parse tree
	 */
	void exitInitializeFunction(GrammarParser.InitializeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(GrammarParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(GrammarParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#naturalValue}.
	 * @param ctx the parse tree
	 */
	void enterNaturalValue(GrammarParser.NaturalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#naturalValue}.
	 * @param ctx the parse tree
	 */
	void exitNaturalValue(GrammarParser.NaturalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(GrammarParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(GrammarParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#listName}.
	 * @param ctx the parse tree
	 */
	void enterListName(GrammarParser.ListNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#listName}.
	 * @param ctx the parse tree
	 */
	void exitListName(GrammarParser.ListNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(GrammarParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(GrammarParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#instrument}.
	 * @param ctx the parse tree
	 */
	void enterInstrument(GrammarParser.InstrumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#instrument}.
	 * @param ctx the parse tree
	 */
	void exitInstrument(GrammarParser.InstrumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#dot}.
	 * @param ctx the parse tree
	 */
	void enterDot(GrammarParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#dot}.
	 * @param ctx the parse tree
	 */
	void exitDot(GrammarParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(GrammarParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(GrammarParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#equals}.
	 * @param ctx the parse tree
	 */
	void enterEquals(GrammarParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#equals}.
	 * @param ctx the parse tree
	 */
	void exitEquals(GrammarParser.EqualsContext ctx);
}