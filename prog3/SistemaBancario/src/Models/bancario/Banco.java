package Models.bancario;

import java.util.Vector;

public class Banco 
{
  private String nombre;
  private float disponible;
  private Vector<Cliente> clientes = new Vector<Cliente>();

//getters
public float getDisponible() 
{
	for (Cliente cliente2 : clientes) 
	{
		disponible += cliente2.getMontoCuenta();
	}
	return disponible;
}
//methods
public Banco(String n) 
{
	nombre = n;
}
public void agregarCliente(Cliente c) 
{
	clientes.add(c);
}

}
