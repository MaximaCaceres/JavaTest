package pt1ProgJava;

public class Profesor extends Persona {
	private int legajo;
	private String titulo;

	public Profesor() {
	}

	Profesor(int id, String nombre, String apellido, int edad, long dni, int legajo, String titulo) {
		super.setPersona(id, nombre, apellido, edad, dni);
		this.legajo = legajo;
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getLegajo() {
		return legajo;
	}
	
	/*@Override
	public int compareTo(Persona p) {
		Profesor paramProf = (Profesor) p;
		return paramProf.legajo - this.legajo;
	}*/
	
	@Override 
	public String toString() {
		return "LE: "+ this.legajo + "-" + this.getApellido() + ", " + this.getNombre() + "-" + this.titulo+ "- Edad: " + this.getEdad();
	}
}
