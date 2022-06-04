from antlr4 import *
from GrammarLexer import GrammarLexer
from GrammarListener import GrammarListener
from GrammarParser import GrammarParser
from notePlayer import NotePlayer
from threading import Thread
import time
from ArgumentParser import ArgumentParser

player = NotePlayer()

class GrammarPrintListener(GrammarListener):
    def enterProgram(self, ctx):
        self.note_threads = []


    def enterPlayCommand(self, ctx: GrammarParser.PlayCommandContext):
        to_play = []
        if ctx.naturalValue():
            to_play = [ArgumentParser.extract_int(ctx.naturalValue())]
        
        if ctx.naturalList():
            to_play = ArgumentParser.extract_list(ctx.naturalList().children)
        
        for note in to_play:
            new_thread = Thread(target=player.playNote, args=(note,))
            new_thread.start()
            self.note_threads.append(new_thread)


    def enterSleepCommand(self, ctx: GrammarParser.SleepCommandContext):
        for thread in self.note_threads:
            thread.join()
        self.note_threads = []

        if ctx.floatValue():
            value = ArgumentParser.extract_float(ctx.floatValue().naturalValue())
            time.sleep(value)


    def exitProgram(self, ctx: GrammarParser.ProgramContext):
        for thread in self.note_threads:
            thread.join()
              

test_program = \
    '''play 50
play 60
play 40'''


def main():
    # lexer = GrammarLexer(StdinStream())
    lexer = GrammarLexer(InputStream(test_program))
    stream = CommonTokenStream(lexer)
    parser = GrammarParser(stream)
    tree = parser.program()
    printer = GrammarPrintListener()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

if __name__ == '__main__':
    main()
    player.exit()