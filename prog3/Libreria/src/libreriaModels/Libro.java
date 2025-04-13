package libreriaModels;
import java.time.LocalDate; //using LocalDate.of
public class Libro 
{

	private String nombreLibro;
	private Editorial editorial;
	private Autor autor;
	private LocalDate publicacion;
	private int cantidadEjemplares;
	private double costo;
	private String isbn;
	/* ========================================================================
	 * methods
	 * ======================================================================== */
	public Libro(String n, Editorial edit, String isbn, Autor a,int cantE, double cost) 
	{
      nombreLibro = n;
      editorial = edit;
      this.isbn = isbn;
      autor = a;
      publicacion = LocalDate.now();
      cantidadEjemplares = cantE;
      costo = cost;
	}
	public String verDetalle() 
	{
		return String.format("Título: %-20s | Editorial: %-15s | ISBN: %-15s | Autor: %-20s | Publicación: %-10s | Cant: %3d | P. Unit: %8.2f | Subtotal: %8.2f | Email Autor: %s%n",
                nombreLibro,
                editorial.getNombreEditorial(),
                isbn,
                autor.getNombre() + " " + autor.getApellido(),
                publicacion.toString(),
                cantidadEjemplares,
                costo,
                cantidadEjemplares * costo,
                autor.getEmail())+"\n";
	}
	/* ========================================================================
	 * getters
	 * ======================================================================== */
	public String getNombreLibro() {
		return nombreLibro;
	}
	public Editorial getEditorial() {
		return editorial;
	}
	public Autor getAutor() {
		return autor;
	}
	public LocalDate getPublicacion() {
		return publicacion;
	}
	public int getCantidadEjemplares() {
		return cantidadEjemplares;
	}
	public double getCosto() {
		return costo;
	}
	public String getIsbn() {
		return isbn;
	}
	/* ========================================================================
	 * setters
	 * ======================================================================== */
	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}
	
	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}
	
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public void setPublicacion(LocalDate publicacion) {
		this.publicacion = publicacion;
	}
	
	public void setCantidadEjemplares(int cantidadEjemplares) {
		this.cantidadEjemplares = cantidadEjemplares;
	}
	
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	
}
