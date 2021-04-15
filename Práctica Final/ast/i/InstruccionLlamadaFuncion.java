package ast.i;

import ast.e.Expresion;
import ast.t.Tipo;
import java.util.ArrayDeque;

public class InstruccionLlamadaFuncion extends Instruccion {
    private Expresion id;
    private ArrayDeque<Argumento> argumentos;
    
   public InstruccionLlamadaFuncion(Expresion id, ArrayDeque<Argumento> argumentos) {
       this.id = id;
       this.argumentos = argumentos;
   }
   
   public String toString() {
       String s = "{{_LlamadaFunc_}{" + id.toString() + ',' + '{';
       for(Argumento arg: argumentos) {
           s += arg.toString() + ',';
       }
       s = s.substring(0, s.length()-1);
       s += "}}}";
       return s;
   }
    
}
