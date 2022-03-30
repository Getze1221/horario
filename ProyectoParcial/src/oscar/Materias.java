package oscar;

import java.util.Scanner;

public class Materias {
	Scanner s = new Scanner(System.in);

	private float parcial1;
	private float parcial2;
	private float parcial3;
	private float ordinario;
	private float result;
	private float calif =0.0f;
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getResult() {
		return result;
	}

	public void setResult(float result) {
		this.result = result;
	}

	public float getCalif() {
		return calif;
	}

	public void setCalif(float calif) {
		this.calif = calif;
	}

	public float getParcial1() {
		return parcial1;
	}

	public void setParcial1(float parcial1) {
		this.parcial1 = parcial1;
	}

	public float getParcial2() {
		return parcial2;
	}

	public void setParcial2(float parcial2) {
		this.parcial2 = parcial2;
	}

	public float getParcial3() {
		return parcial3;
	}

	public void setParcial3(float parcial3) {
		this.parcial3 = parcial3;
	}

	public float getOrdinario() {
		return ordinario;
	}

	public void setOrdinario(float ordinario) {
		this.ordinario = ordinario;
	}

	public void leer() {

		System.out.println("Primer parcial");
		parcial1 = s.nextInt();
		System.out.println("Segundo parcial");
		parcial2 = s.nextInt();
		System.out.println("Tercer parcial");
		parcial3 = s.nextInt();
		System.out.println("Ordinario");
		ordinario = s.nextInt();
		parcialesOpe(parcial1, parcial2, parcial3, ordinario);
		System.out.println();

	}

	public void parcialesOpe(float parcial1, float parcial2, float parcial3, float ordinario) {
		result = (parcial1 + parcial2 + parcial3) / 3;
		calif = (result + ordinario) / 2;
		System.out.println("tu calificacion final: " + calif);

	}

	public void nombre() {
		System.out.println("materias");
	}

}