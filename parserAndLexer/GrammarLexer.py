# Generated from Grammar.g4 by ANTLR 4.10.1
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,26,164,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,
        2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,
        13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,
        19,2,20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,1,
        0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,3,1,
        3,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,4,1,5,1,5,1,6,1,6,1,
        7,1,7,1,8,1,8,1,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,9,1,10,1,10,1,10,
        1,10,1,11,1,11,1,11,1,11,1,11,1,11,1,11,1,12,1,12,1,12,1,12,1,12,
        1,12,1,13,1,13,1,13,1,13,1,14,1,14,1,14,1,14,1,14,1,15,1,15,1,15,
        1,16,1,16,1,16,1,17,1,17,1,17,1,17,1,18,1,18,1,18,1,18,1,18,1,18,
        1,18,1,18,1,18,1,19,1,19,1,19,1,19,1,20,1,20,1,21,1,21,1,22,1,22,
        1,23,4,23,155,8,23,11,23,12,23,156,1,23,1,23,1,24,1,24,1,25,1,25,
        0,0,26,1,1,3,2,5,3,7,4,9,5,11,6,13,7,15,8,17,9,19,10,21,11,23,12,
        25,13,27,14,29,15,31,16,33,17,35,18,37,19,39,20,41,21,43,22,45,23,
        47,24,49,25,51,26,1,0,4,1,0,97,122,1,0,65,90,1,0,48,57,3,0,9,10,
        13,13,32,32,164,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,
        0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,0,
        0,19,1,0,0,0,0,21,1,0,0,0,0,23,1,0,0,0,0,25,1,0,0,0,0,27,1,0,0,0,
        0,29,1,0,0,0,0,31,1,0,0,0,0,33,1,0,0,0,0,35,1,0,0,0,0,37,1,0,0,0,
        0,39,1,0,0,0,0,41,1,0,0,0,0,43,1,0,0,0,0,45,1,0,0,0,0,47,1,0,0,0,
        0,49,1,0,0,0,0,51,1,0,0,0,1,53,1,0,0,0,3,55,1,0,0,0,5,61,1,0,0,0,
        7,68,1,0,0,0,9,75,1,0,0,0,11,81,1,0,0,0,13,83,1,0,0,0,15,85,1,0,
        0,0,17,87,1,0,0,0,19,92,1,0,0,0,21,98,1,0,0,0,23,102,1,0,0,0,25,
        109,1,0,0,0,27,115,1,0,0,0,29,119,1,0,0,0,31,124,1,0,0,0,33,127,
        1,0,0,0,35,130,1,0,0,0,37,134,1,0,0,0,39,143,1,0,0,0,41,147,1,0,
        0,0,43,149,1,0,0,0,45,151,1,0,0,0,47,154,1,0,0,0,49,160,1,0,0,0,
        51,162,1,0,0,0,53,54,5,95,0,0,54,2,1,0,0,0,55,56,5,112,0,0,56,57,
        5,105,0,0,57,58,5,97,0,0,58,59,5,110,0,0,59,60,5,111,0,0,60,4,1,
        0,0,0,61,62,5,103,0,0,62,63,5,117,0,0,63,64,5,105,0,0,64,65,5,116,
        0,0,65,66,5,97,0,0,66,67,5,114,0,0,67,6,1,0,0,0,68,69,5,118,0,0,
        69,70,5,105,0,0,70,71,5,111,0,0,71,72,5,108,0,0,72,73,5,105,0,0,
        73,74,5,110,0,0,74,8,1,0,0,0,75,76,5,100,0,0,76,77,5,114,0,0,77,
        78,5,117,0,0,78,79,5,109,0,0,79,80,5,115,0,0,80,10,1,0,0,0,81,82,
        5,46,0,0,82,12,1,0,0,0,83,84,5,44,0,0,84,14,1,0,0,0,85,86,5,61,0,
        0,86,16,1,0,0,0,87,88,5,112,0,0,88,89,5,108,0,0,89,90,5,97,0,0,90,
        91,5,121,0,0,91,18,1,0,0,0,92,93,5,115,0,0,93,94,5,108,0,0,94,95,
        5,101,0,0,95,96,5,101,0,0,96,97,5,112,0,0,97,20,1,0,0,0,98,99,5,
        117,0,0,99,100,5,115,0,0,100,101,5,101,0,0,101,22,1,0,0,0,102,103,
        5,114,0,0,103,104,5,101,0,0,104,105,5,112,0,0,105,106,5,101,0,0,
        106,107,5,97,0,0,107,108,5,116,0,0,108,24,1,0,0,0,109,110,5,116,
        0,0,110,111,5,105,0,0,111,112,5,109,0,0,112,113,5,101,0,0,113,114,
        5,115,0,0,114,26,1,0,0,0,115,116,5,102,0,0,116,117,5,111,0,0,117,
        118,5,114,0,0,118,28,1,0,0,0,119,120,5,101,0,0,120,121,5,97,0,0,
        121,122,5,99,0,0,122,123,5,104,0,0,123,30,1,0,0,0,124,125,5,105,
        0,0,125,126,5,110,0,0,126,32,1,0,0,0,127,128,5,100,0,0,128,129,5,
        111,0,0,129,34,1,0,0,0,130,131,5,101,0,0,131,132,5,110,0,0,132,133,
        5,100,0,0,133,36,1,0,0,0,134,135,5,102,0,0,135,136,5,117,0,0,136,
        137,5,110,0,0,137,138,5,99,0,0,138,139,5,116,0,0,139,140,5,105,0,
        0,140,141,5,111,0,0,141,142,5,110,0,0,142,38,1,0,0,0,143,144,5,118,
        0,0,144,145,5,97,0,0,145,146,5,114,0,0,146,40,1,0,0,0,147,148,7,
        0,0,0,148,42,1,0,0,0,149,150,7,1,0,0,150,44,1,0,0,0,151,152,7,2,
        0,0,152,46,1,0,0,0,153,155,7,3,0,0,154,153,1,0,0,0,155,156,1,0,0,
        0,156,154,1,0,0,0,156,157,1,0,0,0,157,158,1,0,0,0,158,159,6,23,0,
        0,159,48,1,0,0,0,160,161,5,91,0,0,161,50,1,0,0,0,162,163,5,93,0,
        0,163,52,1,0,0,0,2,0,156,1,0,1,0
    ]

class GrammarLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    T__3 = 4
    T__4 = 5
    T__5 = 6
    T__6 = 7
    T__7 = 8
    PLAY = 9
    SLEEP = 10
    USE = 11
    REPEAT = 12
    TIMES = 13
    FOR = 14
    EACH = 15
    IN = 16
    DO = 17
    END = 18
    FUNCTION = 19
    Var = 20
    LOWERCASE = 21
    UPPERCASE = 22
    DIGIT = 23
    BOL = 24
    Lbracket = 25
    Rbracket = 26

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'_'", "'piano'", "'guitar'", "'violin'", "'drums'", "'.'", 
            "','", "'='", "'play'", "'sleep'", "'use'", "'repeat'", "'times'", 
            "'for'", "'each'", "'in'", "'do'", "'end'", "'function'", "'var'", 
            "'['", "']'" ]

    symbolicNames = [ "<INVALID>",
            "PLAY", "SLEEP", "USE", "REPEAT", "TIMES", "FOR", "EACH", "IN", 
            "DO", "END", "FUNCTION", "Var", "LOWERCASE", "UPPERCASE", "DIGIT", 
            "BOL", "Lbracket", "Rbracket" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "T__7", "PLAY", "SLEEP", "USE", "REPEAT", "TIMES", "FOR", 
                  "EACH", "IN", "DO", "END", "FUNCTION", "Var", "LOWERCASE", 
                  "UPPERCASE", "DIGIT", "BOL", "Lbracket", "Rbracket" ]

    grammarFileName = "Grammar.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.10.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


