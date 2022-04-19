grammar Grammar;

program : listOfCommands ;
listOfCommands : basicCommands+   
    | initializationCommands+
    | basicCommands+ initializationCommands+
    | initializationCommands+ basicCommands+
    ;
    
basicCommands : playCommand
    | sleepCommand 
    | useCommand 
    | repeatCommand
    | forEachCommand 
    | functionCallCommand 
    ;

playCommand : PLAY naturalValue 
    | PLAY variableName 
    | PLAY functionName
    ;			

sleepCommand : SLEEP time 
    | SLEEP variableName 
    ;

time : floatValue ;
floatValue : naturalValue dot naturalValue 
    | naturalValue 
    ;

useCommand : USE instrument 
    ;

repeatCommand : REPEAT naturalValue TIMES listOfCommands END
    ;

forEachCommand : FOR EACH variableName IN listName DO listOfCommands END
    ;

functionCallCommand : functionName 
    ;

initializationCommands : initializeFunction 
    | initializeVariable ;

initializeVariable : Var variableName equals value 
    ;
value : naturalValue 
    | floatValue 
    | Lbracket naturalList Rbracket 
    | Lbracket floatList Rbracket 
    ;
naturalList : naturalValue comma naturalList | naturalValue
    ;
floatList : floatValue comma floatList | floatValue
    ;

initializeFunction : FUNCTION functionName DO functionBody END
    ;
functionBody : listOfCommands
    ;

naturalValue : DIGIT+ ;
variableName : (LOWERCASE | UPPERCASE | '_' | DIGIT)+ ;
listName : (LOWERCASE | UPPERCASE | '_' | DIGIT)+ ;
functionName : (LOWERCASE | UPPERCASE | '_' | DIGIT)+ ;


PLAY : 'play' ;
SLEEP : 'sleep' ;
USE : 'use' ;
REPEAT : 'repeat' ;
TIMES: 'times' ;
FOR : 'for' ;
EACH : 'each' ;
IN : 'in' ;
DO : 'do' ;
END : 'end' ;
FUNCTION : 'function' ;
Var : 'var' ;

instrument : 'piano'
    | 'guitar'
    | 'violin' 
    | 'drums' ;

LOWERCASE  : [a-z] ;
UPPERCASE  : [A-Z] ;
DIGIT : [0-9] ;

BOL : (' '| '\t' | '\n' | '\r')+ -> channel(HIDDEN) ;
   
dot : '.' ;
comma : ',' ;
equals : '=' ;
Lbracket : '[' ;
Rbracket : ']' ;

