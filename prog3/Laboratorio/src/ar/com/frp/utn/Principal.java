package ar.com.frp.utn;

public class Principal {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Profesor profe = new Profesor("Carpio", 12223);
        Alumno alu1 = new Alumno("Maxima","Caceres",45755453);
        Alumno alu2 = new Alumno("Carlitos","Manzanilla",2976654);
        Curso cursoP = new Curso("Programacion",profe);
        
        cursoP.AgregarAlumno(alu1);
        cursoP.AgregarAlumno(alu2);
        
        System.out.print(cursoP.Imprimir());
	}

}
