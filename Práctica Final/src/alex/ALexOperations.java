package alex;

public class ALexOperations {
  private AnalizadorLexicoTiny alex;
  public ALexOperations(AnalizadorLexicoTiny alex) {
   this.alex = alex;   
  }
  public UnidadLexica unidadEnt() {
     return new UnidadLexicaMultivaluada(alex.fila(),ClaseLexica.ENT,alex.lexema()); 
  } 
  public UnidadLexica unidadReal() {
     return new UnidadLexicaMultivaluada(alex.fila(),ClaseLexica.REAL,alex.lexema()); 
  }  
  public UnidadLexica unidadEof() {
     return new UnidadLexicaUnivaluada(alex.fila(),ClaseLexica.EOF); 
  }  
  public UnidadLexica unidadPal() {
     return new UnidadLexicaMultivaluada(alex.fila(),ClaseLexica.PAL,alex.lexema()); 
  }
  public UnidadLexica unidadPatron() {
     return new UnidadLexicaMultivaluada(alex.fila(),ClaseLexica.PAT,alex.lexema()); 
  }
  public UnidadLexica unidadOtro() {
     return new UnidadLexicaMultivaluada(alex.fila(),ClaseLexica.OTRO,alex.lexema()); 
  }
  public void error() {
    System.err.println("***"+alex.fila()+" Caracter inexperado: "+alex.lexema());
  }
}
