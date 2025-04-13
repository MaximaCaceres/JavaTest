package libreriaModels;

public class Editorial 
{
	private String nombreEditorial;
	private String direccion;
	private String localidad;
	private String emailEditorial;
	private String cuit;
	private String telefono;
	
	/* ========================================================================
	 * methods
	 * ======================================================================== */
	public Editorial(String n, String dir, String l, String e, String c, String tel) 
	{
	  nombreEditorial = n;
	  direccion = dir;
	  localidad = l;
	  emailEditorial = e;
	  cuit = c;
	  telefono = tel;
	}
	/* ========================================================================
	 * getters
	 * ======================================================================== */
	public String getNombreEditorial() 
	{
		return nombreEditorial;
	}
	public String getDireccion() 
	{
		return direccion;
	}
	public String getLocalidad() 
	{
		return localidad;
	}
	public String getEmailEditorial() 
	{
		return emailEditorial;
	}
	public String getCuit() 
	{
		return cuit;
	}
	public String getTelefono() 
	{
		return telefono;
	}
	/* ========================================================================
	 * setters
	 * ======================================================================== */
	public void setNombreEditorial(String nombreEditorial) 
	{
		this.nombreEditorial = nombreEditorial;
	}
	public void setDireccion(String direccion) 
	{
		this.direccion = direccion;
	}
	public void setLocalidad(String localidad) 
	{
		this.localidad = localidad;
	}
	public void setEmailEditorial(String emailEditorial) 
	{
		this.emailEditorial = emailEditorial;
	}
	public void setCuit(String cuit) 
	{
		this.cuit = cuit;
	}
	public void setTelefono(String telefono) 
	{
		this.telefono = telefono;
	}
}
