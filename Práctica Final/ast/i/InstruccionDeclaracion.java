package ast.i;

import ast.e.Expresion;
import ast.t.Tipo;

public class InstruccionDeclaracion extends Instruccion {
    private Tipo tipo;
    private Expresion id;
    private Expresion valor;
    
    public InstruccionDeclaracion(Tipo tipo, Expresion id) {
        this.tipo = tipo;
        this.id = id;
        this.valor = null;
    }
    
     public InstruccionDeclaracion(Tipo tipo, Expresion id, Expresion valor) {
        this.tipo = tipo;
        this.id = id;
        this.valor = valor;
    }
     
     public String toString() {
         String s = "{{_Declaracion_}{" + tipo.toString() + ',' + id.toString();
         if(valor != null) {
             s += ',' + valor.toString();
         }
         s += "}}";
         return s;
     }
    
}
