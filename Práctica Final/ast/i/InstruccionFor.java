package ast.i;

import ast.e.Expresion;
import ast.f.Cuerpo;

public class InstruccionFor extends Instruccion {
    private Expresion valor_ini;
    private Expresion condicion;
    private Expresion paso;
    private Cuerpo cuerpo_for;
    
    public InstruccionFor(Expresion valor_ini, Expresion condicion, Expresion paso, Cuerpo cuerpo_for) {
        this.valor_ini = valor_ini;
        this.condicion = condicion;
        this.paso = paso;
        this.cuerpo_for = cuerpo_for;
    }
    
    public String toString(){
        String s = "{{_For_}{" + valor_ini.toString() + ';' + condicion.toString() + ';' + paso.toString() + "}{";
        for(Instruccion inst: cuerpo_for.getInstr()) {
            s += inst.toString();
        }
        s += "}}";
        return s;
    }
}
