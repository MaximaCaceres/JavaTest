package pt1ProgJava;

public class Alumno extends Persona{
	private int nroLE;
	private int materiasAprobadas;
	private double promedio;

	public Alumno() {
	}

	Alumno(int id, String nombre, String apellido, int edad, long dni, int nroLE, int materiasAprobadas, double promedio) {
		super.setPersona(id, nombre, apellido, edad, dni);
		this.nroLE = nroLE;
		this.materiasAprobadas = materiasAprobadas;
		this.promedio = promedio;
	}

	public int getNroLE() {
		return nroLE;
	}

	public void setNroLE(int nroLE) {
		this.nroLE = nroLE;
	}

	public int getMateriasAprobadas() {
		return this.materiasAprobadas;
	}

	public void setMateriasAprobadas(int materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}

	public void setPromedio(int promedio) {
		this.promedio = promedio;
	}

	public double getPromedio() {
		return promedio;
	}
}
