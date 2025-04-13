package libreriaModels;
import java.time.LocalDate; //using LocalDate.of

public class Autor 
{
	private String nombre;
	private String apellido;
	private String sexo;
	private String email;
	private LocalDate fechaNacimiento;

	/* ========================================================================
	 * methods
	 * ======================================================================== */
	public Autor(String n,String a, String s, String e) 
	{
		nombre = n;
		apellido = a;
		sexo = s;
		email = e;
		fechaNacimiento = LocalDate.of(2025, 1, 1);
	}
	/* ========================================================================
	 * getters
	 * ======================================================================== */

	public String getNombre() 
	{
		return nombre;
	}
	public String getApellido() 
	{
		return apellido;
	}
	public String getSexo() 
	{
		return sexo;
	}
	public String getEmail() 
	{
		return email;
	}
	public LocalDate getFechaNacimiento() 
	{
		return fechaNacimiento;
	}
	/* ========================================================================
	 * setters
	 * ======================================================================== */
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public void setApellido(String apellido) 
	{
		this.apellido = apellido;
	}
	public void setSexo(String sexo) 
	{
		this.sexo = sexo;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) 
	{
		this.fechaNacimiento = fechaNacimiento;
	}
}
