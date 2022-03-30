package getzemani;
import oscar.Materias;

import java.util.Scanner;

public class BaseDeDatos extends Materias{
	Scanner s = new Scanner(System.in);
	static Materias m = new Materias();

	public void funcion() {
		m.leer();
	}
	@Override
	public void nombre() {
		System.out.println("Ingresa tus calificaciones de la materia de Base de Datos");
	}
}