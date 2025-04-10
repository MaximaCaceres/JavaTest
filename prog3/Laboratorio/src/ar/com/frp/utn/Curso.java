package ar.com.frp.utn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Curso 
{
  private String NombreCurso;
  private Profesor Profe;
  private ArrayList<Alumno> ListaA = new ArrayList<Alumno>();
  
  //getters
  public String GetNombreC() 
  {
	return NombreCurso;  
  }
  public Profesor GetProfe() 
  {
	return Profe;  
  }
  //setters
  public void SetNombreC(String n) 
  {
	  NombreCurso = n;
  }
  public void SetNProfe(Profesor p) 
  {
	 Profe  = p;
  }
  //method
  public Curso(String n, Profesor p) 
  {
	  Profe = p;
	  NombreCurso = n;	  
  }
  public Vector<String> Imprimir() 
  {
	  Iterator i = ListaA.iterator(); 
	  Vector<String> vec = new Vector<>();
	  while(i.hasNext()) //while elements exist
	  {
		  Alumno alumno = (Alumno)i.next();
		  vec.add(alumno.Data());
	  }
	  return vec;
  }
  public void AgregarAlumno(Alumno a) 
  {
	  ListaA.add(a);
  }
}
