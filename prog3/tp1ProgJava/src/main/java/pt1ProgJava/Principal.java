package pt1ProgJava;
import java.util.Collections;
import java.util.List;

import Algoritmos.OrdenadorApellidoNombre;
import Algoritmos.OrdenadorPorEdad;
import Algoritmos.OrdenadorPorLegajo;
import Algoritmos.OrdenadorPorPromedio;

public class Principal {

	public static void main(String[] args) {
		
		GeneradorLista genList = new  GeneradorLista();
		List<Alumno> listaAlumnos = genList.getListaAlumnos();
		List<Profesor> listaProfesores = genList.getListaProfesores();
		//punto A
		System.out.println("----------------------------");
		System.out.println("Punto A: ");
		System.out.println("----------------------------");
		
		Collections.sort(listaAlumnos, new OrdenadorApellidoNombre());
		
		for(Alumno a : listaAlumnos) {
			
			System.out.println(a);
		}
		
		//punto B //prueba de algo
		System.out.println("----------------------------");
		System.out.println("Punto B: ");
		System.out.println("----------------------------");
		
		Collections.sort(listaProfesores, new OrdenadorPorLegajo());
		for(Profesor p : listaProfesores) {
			System.out.println(p);
		}
		
		//punto C //segunda prueba de algo
		System.out.println("----------------------------");
		System.out.println("Punto C: ");
		System.out.println("----------------------------");
		
		Alumno a = Collections.max(listaAlumnos, new OrdenadorPorPromedio());
		System.out.println(a);
		
		//punto d
		System.out.println("----------------------------");
		System.out.println("Punto D: ");
		System.out.println("----------------------------");
		
		a = Collections.min(listaAlumnos, new OrdenadorPorPromedio());
		System.out.println(a);
		
		//punto e
		System.out.println("----------------------------");
		System.out.println("Punto E: ");
		System.out.println("----------------------------");
		
		Collections.sort(listaAlumnos, Collections.reverseOrder());
		for(Alumno al: listaAlumnos) {//pasa por cada alumno
			if(al.getPromedio()>=7) System.out.println(al); // es que si encuentra un prom mayor o igual a 7 lo muestra.
		}
		
		//punto f
		System.out.println("----------------------------");
		System.out.println("Punto F: ");
		System.out.println("----------------------------");
		
		for(Profesor p : listaProfesores) {
			if(p.getTitulo()=="Ing. en Sistemas") System.out.println(p);
		}
		
		//punto g
				System.out.println("----------------------------");
				System.out.println("Punto G: ");
				System.out.println("----------------------------");
				
		Collections.sort(listaProfesores, new OrdenadorPorEdad());
		
		for(Profesor p : listaProfesores) {
			System.out.println(p);
		}
		
		//punto h
		System.out.println("----------------------------");
		System.out.println("Punto H: ");
		System.out.println("----------------------------");
		
		int sumaEdades = 0;
		
		for(Profesor p: listaProfesores) {
			sumaEdades += p.getEdad();
		}
		
		System.out.println("Edades sumadas: " + sumaEdades);
		
		//punto i
				System.out.println("----------------------------");
				System.out.println("Punto I: ");
				System.out.println("----------------------------");
				
				int cont = 0;
				float promGral = 0.0f;
				float promBestStudent = 0.0f;
				
				for(Alumno al: listaAlumnos) {
					promGral += al.getPromedio();
					if(al.getPromedio()> 7 ) {
						promBestStudent += al.getPromedio();
						cont++;
					}
				}
				System.out.println("Promedio GRAL: "+ (promGral/50));		
				System.out.println("Promedio Meores alumnos: "+ (promBestStudent/cont));	
	}
	

}
