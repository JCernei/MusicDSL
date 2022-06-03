from antlr4 import *
from GrammarLexer import GrammarLexer
from GrammarListener import GrammarListener
from GrammarParser import GrammarParser
from notePlayer import NotePlayer
from concurrent.futures import ThreadPoolExecutor, as_completed

player = NotePlayer()

class GrammarPrintListener(GrammarListener):
    def enterProgram(self, ctx):
        print(f'Hello: {ctx.listOfCommands()}')

    def _extract_int(self, naturalValue):
        naturalValue = [i.symbol.text for i in naturalValue.children]
        naturalValue = int(''.join(naturalValue))
        return naturalValue
    
    def _extract_list(self, listChildren):
        to_parse = listChildren
        values = []
        while len(to_parse) > 0:
            if len(to_parse) == 1:
                values.append(self._extract_int(to_parse[0]))
                break
            values.append(self._extract_int(to_parse[0]))
            to_parse = to_parse[2].children

        return values
            

    def enterPlayCommand(self, ctx: GrammarParser.PlayCommandContext):
        to_play = []
        if ctx.naturalValue():
            to_play = [self._extract_int(ctx.naturalValue())]
        
        if ctx.naturalList():
            to_play = self._extract_list(ctx.naturalList().children)

        with ThreadPoolExecutor(max_workers=10) as executor:
            future_to_note = {executor.submit(player.playNote, note): note for note in to_play}
            for future in as_completed(future_to_note):
                note = future_to_note[future]
                data = future.result()
                print(note)
                
              

test_program = \
    '''play 80
play [50]
play 80'''

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