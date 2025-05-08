package pt1ProgJava;

import java.util.*;

public abstract class Persona implements Comparator<Persona>, Comparable<Persona> {

	protected int id;
	protected String nombre;
	protected String apellido;
	protected int edad;	
	protected long dni;

	Persona() {
	}

	public void setPersona(int id,String nombre, String apellido, int edad, long dni) {
		this.id=id;
		this.nombre = nombre;
		this.apellido=apellido;
		this.edad = edad;
		this.dni=dni;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getApellido() {
		return this.apellido;
	}

	@Override
	public int compareTo(Persona p) {
		return (this.nombre).compareTo(p.nombre);
	}
		
	@Override
	public int compare(Persona p1, Persona p2) {
		if(p1.getApellido().compareTo(p2.getApellido()) == 0)
			return p1.getNombre().compareTo(p2.getNombre());
		else 
			return p1.getApellido().compareTo(p2.getApellido());
	}

}
