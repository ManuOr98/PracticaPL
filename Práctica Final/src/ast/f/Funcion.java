package ast.f;

import java.util.ArrayDeque;

import ast.e.Id;
import ast.t.Tipo;

public class Funcion {
	private Tipo tipo;
    private Id id;
    private ArrayDeque<Argumento> argumentos;
    private Cuerpo cuerpo;
    
    public Funcion(Tipo tipo, Id id, ArrayDeque<Argumento> args, Cuerpo cuerpo) {
        this.tipo = tipo;
        this.id = id;
        this.argumentos = args;
        this.cuerpo = cuerpo;
    }
    
    public Id getIdentificador(){
        return this.id;
    }
    
    public ArrayDeque<Argumento> getArgumentos(){
        return this.argumentos;
    }
    
    public Tipo getTipo(){
        return this.tipo;
    }
}
