package Algoritmos;
import java.util.Comparator;

import pt1ProgJava.Alumno;
import pt1ProgJava.Persona;
public class OrdenadorPorEdad implements Comparator<Persona>{

	@Override
	public int compare(Persona p1, Persona p2) {

		return p2.getEdad() - p1.getEdad();
	}

}
