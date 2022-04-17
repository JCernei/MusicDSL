from antlr4 import *
from GrammarLexer import GrammarLexer
from GrammarListener import GrammarListener
from GrammarParser import GrammarParser
from notePlayer import NotePlayer

player = NotePlayer()

class GrammarPrintListener(GrammarListener):
    def enterProgram(self, ctx):
        print(f'Hello: {ctx.listOfCommands()}')

    def enterPlayCommand(self, ctx: GrammarParser.PlayCommandContext):
        naturalValue = [i.symbol.text for i in ctx.naturalValue().children]
        naturalValue = int(''.join(naturalValue))
        player.playNote(naturalValue) 
        
        print(naturalValue)

def main():
    lexer = GrammarLexer(StdinStream())
    stream = CommonTokenStream(lexer)
    parser = GrammarParser(stream)
    tree = parser.program()
    printer = GrammarPrintListener()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

if __name__ == '__main__':
    main()
    player.exit()