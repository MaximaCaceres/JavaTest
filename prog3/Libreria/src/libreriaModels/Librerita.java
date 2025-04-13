package libreriaModels;
import java.util.Vector;

public class Librerita 
{
	private String nombreL;
	private String direccionL;
	private int cantidadLibros;
	private Vector<Libro> libros = new Vector<Libro>();
	
	/* ========================================================================
	 * methods
	 * ======================================================================== */
	public Librerita(String n, String dir) 
	{
	 nombreL = n;
	 direccionL = dir;
	}
	public void comprarLibro(Libro l) 
	{
		libros.add(l);
		cantidadLibros = +1;
	}
	public String imprimirCompra() 
	{
		String ticket = "";
		
		for (Libro libro : libros) 
		{
			ticket += libro.verDetalle();
		}
		 return ticket;
	}
	/* ========================================================================
	 * getters
	 * ======================================================================== */
	public String getNombreL() 
	{
		return nombreL;
	}
	public String getDireccionL() 
	{
		return direccionL;
	}
	public int getCantidadLibros() 
	{
		return cantidadLibros;
	}

	/* ========================================================================
	 * setters
	 * ======================================================================== */
	public void setNombreL(String nombreL) 
	{
		this.nombreL = nombreL;
	}
	public void setDireccionL(String direccionL) 
	{
		this.direccionL = direccionL;
	}
	public void setCantidadLibros(int cantidadLibros) 
	{
		this.cantidadLibros = cantidadLibros;
	}
}
