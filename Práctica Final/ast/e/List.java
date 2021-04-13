package ast.e;

import java.util.ArrayDeque;

public class List extends Expresion {
	private ArrayDeque<Expresion> l;

    public List() {
        l = new ArrayDeque<Expresion>();
    }

    public void addElem(Expresion e) {
        l.addFirst(e);
    }
   
    public ArrayDeque<Expresion> valores() {
        return l;
    }

    public String toString() {
        return l.toString();
    }

}
