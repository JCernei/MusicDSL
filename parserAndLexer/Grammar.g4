grammar Grammar;

program : listOfCommands ;
listOfCommands : basicCommands+   
    | initializationCommands+
    | basicCommands listOfCommands
    | initializationCommands listOfCommands ;

basicCommands : playCommand
    | sleepCommand 
    | useCommand 
    | repeatCommand
    | forEachCommand 
    | functionCallCommand ;

playCommand : PLAY naturalValue 
    | PLAY variableName 
    | PLAY functionName
    | playCommand basicCommands ;			

sleepCommand : SLEEP time 
    | SLEEP variableName 
    | sleepCommand basicCommands ;

time : floatValue ;
floatValue : naturalValue dot naturalValue 
    | naturalValue ;

useCommand : USE instrument 
    | useCommand basicCommands ;

repeatCommand : REPEAT naturalValue TIMES basicCommands END
    | repeatCommand basicCommands;

forEachCommand : FOR EACH variableName IN listName DO basicCommands END
    | forEachCommand basicCommands ;

functionCallCommand : functionName 
    | functionCallCommand basicCommands ;

initializationCommands : initializeFunction 
    | initializeVariable ;

initializeVariable : Var variableName equals value ;
value : naturalValue 
    | floatValue 
    | '['naturalList']' 
    | '['floatList']' ;
naturalList : naturalValue comma naturalList | naturalValue |  ;
floatList : floatValue comma floatList | floatValue |  ;

initializeFunction : FUNCTION functionName DO functionBody END ;
functionBody : basicCommands ;

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

