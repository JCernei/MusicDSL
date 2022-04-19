# Generated from Grammar.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .GrammarParser import GrammarParser
else:
    from GrammarParser import GrammarParser

# This class defines a complete listener for a parse tree produced by GrammarParser.
class GrammarListener(ParseTreeListener):

    # Enter a parse tree produced by GrammarParser#program.
    def enterProgram(self, ctx:GrammarParser.ProgramContext):
        pass

    # Exit a parse tree produced by GrammarParser#program.
    def exitProgram(self, ctx:GrammarParser.ProgramContext):
        pass


    # Enter a parse tree produced by GrammarParser#listOfCommands.
    def enterListOfCommands(self, ctx:GrammarParser.ListOfCommandsContext):
        pass

    # Exit a parse tree produced by GrammarParser#listOfCommands.
    def exitListOfCommands(self, ctx:GrammarParser.ListOfCommandsContext):
        pass


    # Enter a parse tree produced by GrammarParser#basicCommands.
    def enterBasicCommands(self, ctx:GrammarParser.BasicCommandsContext):
        pass

    # Exit a parse tree produced by GrammarParser#basicCommands.
    def exitBasicCommands(self, ctx:GrammarParser.BasicCommandsContext):
        pass


    # Enter a parse tree produced by GrammarParser#playCommand.
    def enterPlayCommand(self, ctx:GrammarParser.PlayCommandContext):
        pass

    # Exit a parse tree produced by GrammarParser#playCommand.
    def exitPlayCommand(self, ctx:GrammarParser.PlayCommandContext):
        pass


    # Enter a parse tree produced by GrammarParser#sleepCommand.
    def enterSleepCommand(self, ctx:GrammarParser.SleepCommandContext):
        pass

    # Exit a parse tree produced by GrammarParser#sleepCommand.
    def exitSleepCommand(self, ctx:GrammarParser.SleepCommandContext):
        pass


    # Enter a parse tree produced by GrammarParser#time.
    def enterTime(self, ctx:GrammarParser.TimeContext):
        pass

    # Exit a parse tree produced by GrammarParser#time.
    def exitTime(self, ctx:GrammarParser.TimeContext):
        pass


    # Enter a parse tree produced by GrammarParser#floatValue.
    def enterFloatValue(self, ctx:GrammarParser.FloatValueContext):
        pass

    # Exit a parse tree produced by GrammarParser#floatValue.
    def exitFloatValue(self, ctx:GrammarParser.FloatValueContext):
        pass


    # Enter a parse tree produced by GrammarParser#useCommand.
    def enterUseCommand(self, ctx:GrammarParser.UseCommandContext):
        pass

    # Exit a parse tree produced by GrammarParser#useCommand.
    def exitUseCommand(self, ctx:GrammarParser.UseCommandContext):
        pass


    # Enter a parse tree produced by GrammarParser#repeatCommand.
    def enterRepeatCommand(self, ctx:GrammarParser.RepeatCommandContext):
        pass

    # Exit a parse tree produced by GrammarParser#repeatCommand.
    def exitRepeatCommand(self, ctx:GrammarParser.RepeatCommandContext):
        pass


    # Enter a parse tree produced by GrammarParser#forEachCommand.
    def enterForEachCommand(self, ctx:GrammarParser.ForEachCommandContext):
        pass

    # Exit a parse tree produced by GrammarParser#forEachCommand.
    def exitForEachCommand(self, ctx:GrammarParser.ForEachCommandContext):
        pass


    # Enter a parse tree produced by GrammarParser#functionCallCommand.
    def enterFunctionCallCommand(self, ctx:GrammarParser.FunctionCallCommandContext):
        pass

    # Exit a parse tree produced by GrammarParser#functionCallCommand.
    def exitFunctionCallCommand(self, ctx:GrammarParser.FunctionCallCommandContext):
        pass


    # Enter a parse tree produced by GrammarParser#initializationCommands.
    def enterInitializationCommands(self, ctx:GrammarParser.InitializationCommandsContext):
        pass

    # Exit a parse tree produced by GrammarParser#initializationCommands.
    def exitInitializationCommands(self, ctx:GrammarParser.InitializationCommandsContext):
        pass


    # Enter a parse tree produced by GrammarParser#initializeVariable.
    def enterInitializeVariable(self, ctx:GrammarParser.InitializeVariableContext):
        pass

    # Exit a parse tree produced by GrammarParser#initializeVariable.
    def exitInitializeVariable(self, ctx:GrammarParser.InitializeVariableContext):
        pass


    # Enter a parse tree produced by GrammarParser#value.
    def enterValue(self, ctx:GrammarParser.ValueContext):
        pass

    # Exit a parse tree produced by GrammarParser#value.
    def exitValue(self, ctx:GrammarParser.ValueContext):
        pass


    # Enter a parse tree produced by GrammarParser#naturalList.
    def enterNaturalList(self, ctx:GrammarParser.NaturalListContext):
        pass

    # Exit a parse tree produced by GrammarParser#naturalList.
    def exitNaturalList(self, ctx:GrammarParser.NaturalListContext):
        pass


    # Enter a parse tree produced by GrammarParser#floatList.
    def enterFloatList(self, ctx:GrammarParser.FloatListContext):
        pass

    # Exit a parse tree produced by GrammarParser#floatList.
    def exitFloatList(self, ctx:GrammarParser.FloatListContext):
        pass


    # Enter a parse tree produced by GrammarParser#initializeFunction.
    def enterInitializeFunction(self, ctx:GrammarParser.InitializeFunctionContext):
        pass

    # Exit a parse tree produced by GrammarParser#initializeFunction.
    def exitInitializeFunction(self, ctx:GrammarParser.InitializeFunctionContext):
        pass


    # Enter a parse tree produced by GrammarParser#functionBody.
    def enterFunctionBody(self, ctx:GrammarParser.FunctionBodyContext):
        pass

    # Exit a parse tree produced by GrammarParser#functionBody.
    def exitFunctionBody(self, ctx:GrammarParser.FunctionBodyContext):
        pass


    # Enter a parse tree produced by GrammarParser#naturalValue.
    def enterNaturalValue(self, ctx:GrammarParser.NaturalValueContext):
        pass

    # Exit a parse tree produced by GrammarParser#naturalValue.
    def exitNaturalValue(self, ctx:GrammarParser.NaturalValueContext):
        pass


    # Enter a parse tree produced by GrammarParser#variableName.
    def enterVariableName(self, ctx:GrammarParser.VariableNameContext):
        pass

    # Exit a parse tree produced by GrammarParser#variableName.
    def exitVariableName(self, ctx:GrammarParser.VariableNameContext):
        pass


    # Enter a parse tree produced by GrammarParser#listName.
    def enterListName(self, ctx:GrammarParser.ListNameContext):
        pass

    # Exit a parse tree produced by GrammarParser#listName.
    def exitListName(self, ctx:GrammarParser.ListNameContext):
        pass


    # Enter a parse tree produced by GrammarParser#functionName.
    def enterFunctionName(self, ctx:GrammarParser.FunctionNameContext):
        pass

    # Exit a parse tree produced by GrammarParser#functionName.
    def exitFunctionName(self, ctx:GrammarParser.FunctionNameContext):
        pass


    # Enter a parse tree produced by GrammarParser#instrument.
    def enterInstrument(self, ctx:GrammarParser.InstrumentContext):
        pass

    # Exit a parse tree produced by GrammarParser#instrument.
    def exitInstrument(self, ctx:GrammarParser.InstrumentContext):
        pass


    # Enter a parse tree produced by GrammarParser#dot.
    def enterDot(self, ctx:GrammarParser.DotContext):
        pass

    # Exit a parse tree produced by GrammarParser#dot.
    def exitDot(self, ctx:GrammarParser.DotContext):
        pass


    # Enter a parse tree produced by GrammarParser#comma.
    def enterComma(self, ctx:GrammarParser.CommaContext):
        pass

    # Exit a parse tree produced by GrammarParser#comma.
    def exitComma(self, ctx:GrammarParser.CommaContext):
        pass


    # Enter a parse tree produced by GrammarParser#equals.
    def enterEquals(self, ctx:GrammarParser.EqualsContext):
        pass

    # Exit a parse tree produced by GrammarParser#equals.
    def exitEquals(self, ctx:GrammarParser.EqualsContext):
        pass



del GrammarParser