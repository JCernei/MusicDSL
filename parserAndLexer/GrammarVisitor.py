# Generated from .\Grammar.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .GrammarParser import GrammarParser
else:
    from GrammarParser import GrammarParser

# This class defines a complete generic visitor for a parse tree produced by GrammarParser.

class GrammarVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by GrammarParser#program.
    def visitProgram(self, ctx:GrammarParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#listOfCommands.
    def visitListOfCommands(self, ctx:GrammarParser.ListOfCommandsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#basicCommands.
    def visitBasicCommands(self, ctx:GrammarParser.BasicCommandsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#playCommand.
    def visitPlayCommand(self, ctx:GrammarParser.PlayCommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#sleepCommand.
    def visitSleepCommand(self, ctx:GrammarParser.SleepCommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#floatValue.
    def visitFloatValue(self, ctx:GrammarParser.FloatValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#useCommand.
    def visitUseCommand(self, ctx:GrammarParser.UseCommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#repeatCommand.
    def visitRepeatCommand(self, ctx:GrammarParser.RepeatCommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#forEachCommand.
    def visitForEachCommand(self, ctx:GrammarParser.ForEachCommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#functionCallCommand.
    def visitFunctionCallCommand(self, ctx:GrammarParser.FunctionCallCommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#initializationCommands.
    def visitInitializationCommands(self, ctx:GrammarParser.InitializationCommandsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#initializeVariable.
    def visitInitializeVariable(self, ctx:GrammarParser.InitializeVariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#value.
    def visitValue(self, ctx:GrammarParser.ValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#naturalList.
    def visitNaturalList(self, ctx:GrammarParser.NaturalListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#floatList.
    def visitFloatList(self, ctx:GrammarParser.FloatListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#initializeFunction.
    def visitInitializeFunction(self, ctx:GrammarParser.InitializeFunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#functionBody.
    def visitFunctionBody(self, ctx:GrammarParser.FunctionBodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#naturalValue.
    def visitNaturalValue(self, ctx:GrammarParser.NaturalValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#variableName.
    def visitVariableName(self, ctx:GrammarParser.VariableNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#listName.
    def visitListName(self, ctx:GrammarParser.ListNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#functionName.
    def visitFunctionName(self, ctx:GrammarParser.FunctionNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#instrument.
    def visitInstrument(self, ctx:GrammarParser.InstrumentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#dot.
    def visitDot(self, ctx:GrammarParser.DotContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#comma.
    def visitComma(self, ctx:GrammarParser.CommaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#equals.
    def visitEquals(self, ctx:GrammarParser.EqualsContext):
        return self.visitChildren(ctx)



del GrammarParser