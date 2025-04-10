package ar.com.frp.utn;

public class Profesor 
{
	private String Apellido;
	private int Legajo;
  
  //getters
  public String GetApellido()
  {
	   return Apellido;
  }
  public int GetLegajo()
  {
	   return Legajo;
  }
  //setters
  public void SetApellido(String ap)
  {
	   Apellido = ap;
  }
  public void SetDoc(int legajo)
  {
	   Legajo = legajo;
  }
  //method
  public Profesor(String a, int l) 
  {
	   Apellido = a;
	   Legajo = l; 
  }
}
