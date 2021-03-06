package ast.e;

import ast.t.Tipo;
import ast.t.Tipo_Id;
import java.util.ArrayDeque;

public class ASExpresion {
      public Expresion suma(Expresion opnd1, Expresion opnd2) {return new ExpresionBin(opnd1,opnd2, Expresiones.SUM);}
      public Expresion resta(Expresion opnd1, Expresion opnd2) {return new ExpresionBin(opnd1,opnd2, Expresiones.SUB);}
      public Expresion mul(Expresion opnd1, Expresion opnd2) {return new ExpresionBin(opnd1,opnd2, Expresiones.MULT);}
      public Expresion mod(Expresion opnd1, Expresion opnd2) {return new ExpresionBin(opnd1,opnd2, Expresiones.MOD);}
      
      public Expresion and(Expresion opnd1, Expresion opnd2) {return new ExpresionBin(opnd1,opnd2, Expresiones.AND);}
      public Expresion or(Expresion opnd1, Expresion opnd2) {return new ExpresionBin(opnd1,opnd2, Expresiones.OR);}
      public Expresion equals(Expresion opnd1, Expresion opnd2) {return new ExpresionBin(opnd1,opnd2, Expresiones.EQUAL);}
      public Expresion nequals(Expresion opnd1, Expresion opnd2) {return new ExpresionBin(opnd1,opnd2, Expresiones.NOT_EQUAL);}
      public Expresion not(Expresion opnd1, Expresion opnd2) {return new ExpresionBin(opnd1,opnd2, Expresiones.NOT);}
      public Expresion lt(Expresion opnd1, Expresion opnd2) {return new ExpresionBin(opnd1,opnd2, Expresiones.LT);}
      public Expresion gt(Expresion opnd1, Expresion opnd2) {return new ExpresionBin(opnd1,opnd2, Expresiones.GT);}
      public Expresion leq(Expresion opnd1, Expresion opnd2) {return new ExpresionBin(opnd1,opnd2, Expresiones.LEQ);}
      public Expresion geq(Expresion opnd1, Expresion opnd2) {return new ExpresionBin(opnd1,opnd2, Expresiones.GEQ);}
      
      public Expresion bool_true() {return new Boolean("rue");}
      public Expresion bool_false() {return new Boolean("false");}
      public Expresion num(String n) {return new Number(n);}
      public Expresion fun(Id id, ArrayDeque<Tipo_Id> args, Tipo tipo) {return new ExpresionLlamadaFuncion(id, args, tipo);}
      public Expresion crea_iden(String id) {return new Id(id);}
     

}
