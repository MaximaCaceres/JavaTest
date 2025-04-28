package pt1ProgJava;

import java.util.ArrayList;

import java.util.List;
import com.github.javafaker.Faker;

public class GeneradorLista {
	Faker faker;
	private static int limitAlumnos=25;
	private static int limitProfesor=2;
	private static String[] profesiones = {"Ing. en Sistemas","Lic. en Sistemas","Desarrollador"};
	
		
	public GeneradorLista() {
		this.faker = new Faker();
	}
	
	public List<Alumno> getListaAlumnos(){
		
		List<Alumno> listaAlumnos = new ArrayList<>();
		for(int i=0;i<limitAlumnos;i++ ) {
			int edad = faker.number().numberBetween(20, 40);
			long dni = faker.number().numberBetween(30000000, 50000000);
			String nombre = faker.name().firstName();
			String apellido = faker.name().lastName();
			int nroLE = faker.number().numberBetween(1000, 50000);
			int materiasAprobadas = faker.number().numberBetween(1, 40);
			Double promedio = faker.number().randomDouble(3, 1, 10);
			listaAlumnos.add(new Alumno(i+1,nombre,apellido,edad,dni,nroLE,materiasAprobadas,promedio));
		}
		
		return listaAlumnos;
	}
	
public List<Profesor> getListaProfesores(){
		
		List<Profesor> listaProfesores = new ArrayList<>();
		for(int i=0;i<limitProfesor;i++ ) {
			int edad = faker.number().numberBetween(30, 70);
			long dni = faker.number().numberBetween(15000000, 30000000);
			String nombre = faker.name().firstName();
			String apellido = faker.name().lastName();
			int legajo = faker.number().numberBetween(1000, 50000);
			String titulo = profesiones[faker.number().numberBetween(0, profesiones.length)];
						
			listaProfesores.add(new Profesor(i+1,nombre,apellido,edad,dni,legajo,titulo));
		}
		
		return listaProfesores;
	}
}
