package ar.com.frp.utn;

public class Alumno 
{
	private String Nombre;
	private String Apellido;
	private int NumDoc;
   
   //getters
   public String GetNombre()
   {
	   return Nombre;
   }
   public String GetApellido()
   {
	   return Apellido;
   }
   public int GetDoc()
   {
	   return NumDoc;
   }
   //setters
   public void SetNombre(String nom)
   {
	   Nombre = nom;
   }
   public void SetApellido(String ap)
   {
	   Apellido = ap;
   }
   public void SetDoc(int doc)
   {
	   NumDoc = doc;
   }
   //method
   public Alumno(String n, String a, int numD) 
   {
	   Nombre = n;
	   Apellido = a;
	   NumDoc = numD;
   }
   public String Data() 
   {
	   String data = Nombre+" "+ Apellido +" "+NumDoc;
	   return data;
   }
}
