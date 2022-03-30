package oscar;

import java.util.Scanner;

public class DiseñoWeb extends Materias{
	Scanner s = new Scanner(System.in);
	static Materias m = new Materias();

	public void funcion() {
		m.leer();
	}
	@Override
	public void nombre() {
		System.out.println("Ingresa tus calificaciones de la materia de Diseño Web");
	}
}