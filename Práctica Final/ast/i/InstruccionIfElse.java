package ast.i;

import ast.e.Expresion;
import ast.f.Cuerpo;

public class InstruccionIfElse extends Instruccion {
    private Expresion condicion;
    private Cuerpo cuerpo_then;
    private Cuerpo cuerpo_else;
    
    //Constructora
    public InstruccionIfElse(Expresion condicion, Cuerpo cuerpo_then) {
        this.condicion = condicion;
        this.cuerpo_then = cuerpo_then;
        this.cuerpo_else = null;
    }
    public InstruccionIfElse(Expresion condicion, Cuerpo cuerpo_then, Cuerpo cuerpo_else) {
        this.condicion = condicion;
        this.cuerpo_then = cuerpo_then;
        this.cuerpo_else = cuerpo_else;
    }
    
    public String toString() {
        String s = "{{_If_}{" + condicion.toString() + "}" + "{";
        for(Instruccion inst: cuerpo_then.getInstr()) {
            s += inst.toString();
        }
        s += " }";
        if(cuerpo_else != null) {
            s += "{{_Else_}{";
            for(Instruccion inst: cuerpo_else.getInstr()){
                s += inst.toString();
            }
            s += " }";
        }
        s += " }";
        return s;
    }
    
}
