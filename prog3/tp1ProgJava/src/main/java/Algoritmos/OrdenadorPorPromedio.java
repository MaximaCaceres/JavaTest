package Algoritmos;

import java.util.Comparator;

import pt1ProgJava.Alumno;

public class OrdenadorPorPromedio implements Comparator<Alumno>{

	@Override
	public int compare(Alumno o1, Alumno o2) {
		
		return (int) Math.round(o1.getPromedio() - o2.getPromedio())*100;			
	}

}
