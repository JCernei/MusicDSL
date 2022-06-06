import time
from threading import Thread

from antlr4 import *

from ArgumentParser import ArgumentParser
from GrammarLexer import GrammarLexer
from GrammarListener import GrammarListener
from GrammarParser import GrammarParser
from notePlayer import NotePlayer
from GrammarVisitor import GrammarVisitor

class PlayVisitor(GrammarVisitor):
    
    def visitProgram(self, ctx:GrammarParser.ProgramContext):
        self.player = NotePlayer()
        self.memory = {}
        self.note_threads = []
        self.visitChildren(ctx)
        self.exitProgram()
        


    def visitPlayCommand(self, ctx: GrammarParser.PlayCommandContext):
        to_play = []
        if ctx.naturalValue():
            to_play = [ArgumentParser.extract_int(ctx.naturalValue())]
        
        if ctx.naturalList():
            to_play = ArgumentParser.extract_list(ctx.naturalList().children)

        if ctx.variableName():
            name = self.visit(ctx.variableName())
            val = self.memory[name]
            if type(val) == list:
                to_play = self.memory[name]
            else:    
                to_play = [self.memory[name]]
        
        for note in to_play:
            new_thread = Thread(target=self.player.playNote, args=(note,))
            new_thread.start()
            self.note_threads.append(new_thread)


    def visitSleepCommand(self, ctx: GrammarParser.SleepCommandContext):
        for thread in self.note_threads:
            thread.join()
        self.note_threads = []

        if ctx.floatValue():
            value = ArgumentParser.extract_float(ctx.floatValue().naturalValue())
            time.sleep(value)

    
    def visitRepeatCommand(self, ctx: GrammarParser.RepeatCommandContext):
        repetitions = 0
        if ctx.naturalValue():
            repetitions = ArgumentParser.extract_int(ctx.naturalValue())
        else: print('invalid value for repeat times')
        
        for repetition in range(repetitions):
            self.visitChildren(ctx.listOfCommands())
    
    
    def visitVariableName(self, ctx:GrammarParser.VariableNameContext):
        name = ''.join([children.symbol.text for children in ctx.children])
        return name

    
    def visitValue(self, ctx:GrammarParser.ValueContext):
        if ctx.floatValue():
            return ArgumentParser.extract_float(ctx.floatValue().naturalValue())
        if ctx.naturalValue():
            return ArgumentParser.extract_int(ctx.naturalValue())
        if ctx.naturalList():
            return ArgumentParser.extract_list(ctx.naturalList().children)
        

    def visitInitializeVariable(self, ctx:GrammarParser.InitializeVariableContext):
        name = self.visit(ctx.variableName())
        value = self.visit(ctx.value())
        self.memory[name] = value


    def visitListName(self, ctx:GrammarParser.ListNameContext):
        list_name = ''.join([children.symbol.text for children in ctx.children])
        return list_name


    def visitForEachCommand(self, ctx:GrammarParser.ForEachCommandContext):
        variable_name = self.visit(ctx.variableName())
        list_name = self.visit(ctx.listName())
        list_val = self.memory.get(list_name, [])
        for val in list_val:
            self.memory[variable_name] = val
            self.visitChildren(ctx.listOfCommands())


    def exitProgram(self):
        for thread in self.note_threads:
            thread.join()
        self.player.exit()
        

def play_program(text):
    lexer = GrammarLexer(InputStream(text))
    stream = CommonTokenStream(lexer)
    parser = GrammarParser(stream)
    tree = parser.program()
    visitor = PlayVisitor()
    # visitor.visit(tree)
    new_thread = Thread(target=visitor.visit, args=(tree,))
    new_thread.start()
    return visitor
