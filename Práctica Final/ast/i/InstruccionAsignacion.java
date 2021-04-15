package ast.i;

import ast.e.Expresion;

public class InstruccionAsignacion extends Instruccion {
    private Expresion identificador;
    private Expresion valor;
    
    public InstruccionAsignacion(Expresion identificador, Expresion valor) {
        this.identificador = identificador;
        this.valor = valor;
    }
    
    public String toString() {
        String s = "{{_Asignacion_}{" + identificador.toString() + ',' + valor.toString() + "}}";
        return s;
    }
    
}
