package oscar;

import java.util.Scanner;

public class ProgramacionDeSistemas extends Materias {
	Scanner s = new Scanner(System.in);
	static Materias m = new Materias();

	public void funcion() {
		m.leer();
	}
	@Override
	public void nombre() {
		System.out.println("Ingresa tus calificaciones de la materia de programacion de sistemas");
	}
	
}