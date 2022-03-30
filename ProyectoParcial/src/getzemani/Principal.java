package getzemani;

import cristian.Paradigmas1;
import oscar.DiseñoWeb;
import getzemani.BaseDeDatos;
import cristian.MetodosNumericos;
import oscar.ProgramacionDeSistemas;

public class Principal {
	static Paradigmas1 paradigmas = new Paradigmas1();
	static DiseñoWeb diseñoWeb = new DiseñoWeb();
	static MetodosNumericos metodos = new MetodosNumericos();
	static BaseDeDatos base = new BaseDeDatos();
	static ProgramacionDeSistemas pSistemas = new ProgramacionDeSistemas();
	package getzemani;

	public class Principal {

	}

	public static void main(String[] args) {
		paradigmas.nombre();
		paradigmas.funcion();
		
		diseñoWeb.nombre();
		diseñoWeb.funcion();
		
		metodos.nombre();
		metodos.funcion();
		
		base.nombre();
		base.funcion();
		
		pSistemas.nombre();
		pSistemas.funcion();		
	}

}