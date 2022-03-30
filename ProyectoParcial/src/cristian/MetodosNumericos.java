package cristian;
import oscar.Materias;
import java.util.Scanner;

public class MetodosNumericos extends Materias{
	Scanner s = new Scanner(System.in);
	static Materias m = new Materias();

	public void funcion() {
		m.leer();
	}
	@Override
	public void nombre() {
		System.out.println("Ingresa tus calificaciones de la materia de Métodos Numéricos");
	}
}