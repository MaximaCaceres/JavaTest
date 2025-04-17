package Models.bancario;

import java.util.Vector;

public class Banco 
{
  private String nombre;
  private float disponible;
  

private Vector<Cuenta> cuentas = new Vector<>();
private Vector<Cliente> clientes = new Vector<Cliente>();

//getters
public float getDisponible() ////////////////////////////////////ESTO HIZO LA DIFERENCIA.
{
	for (Cuenta cuenta : cuentas) //VOY A DE CUENTA EN CUANTA OBTENIENDO SU SALDO.
	{
		disponible += cuenta.getSaldo();
	}
	return disponible;
}

public Vector<Cuenta> getCuentas() 
{
	return cuentas;
}

public Vector<Cliente> getListaClientes()/////////////////////
{
	return clientes;
}
//setters
public void setCuentas(Vector<Cuenta> cuentas) {
	this.cuentas = cuentas;
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
