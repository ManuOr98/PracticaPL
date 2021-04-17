package ast.f;

import ast.e.Id;
import ast.t.Tipo;
import ast.t.Tipo_Id;

public class Argumento extends Tipo_Id {
	//podriamos añadir una variable "tipo de argumento"
	//para pasar por valor o referencia
	
	public Argumento(Tipo t, Id id) {
		super(t, id);
	}
	
	public Id getIdentificador(){
		return super.getNombre();
	}
}
