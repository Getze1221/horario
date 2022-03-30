package cristian;
import oscar.Materias;


public class Paradigmas1 extends Materias {

	static Materias paradigmas = new Materias();

	public void funcion() {
		paradigmas.leer();
		
	}
	@Override
	public void nombre() {
		System.out.println("Ingresa tus calificaciones de la materia de Paradigmas 1");
		
	}
	
	
}