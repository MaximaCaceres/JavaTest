package Models.bancario;

import java.util.Vector;

public class Cliente 
{
  private String apellido;
  private String nombre;
  private int clienteNum;
  private Vector<Cuenta> listaCuentas = new Vector<Cuenta>();
  public Cliente(String n, String a, int num) 
  {
	  nombre = n;
	  apellido = a;
	  clienteNum += num;
  }
  public void agregarCuenta(Cuenta c) 
  {
	  listaCuentas.add(c);
  }
  //getters ///////////////////////////////////////////////
public String getApellido() 
{
	return apellido;
}
public String getNombre() 
{
	return nombre;
}
public int getClienteNum() 
{
	return clienteNum;
}
public float getMontoCuenta() 
{
	float tot = 0;
	for (Cuenta cuenta : listaCuentas) 
	{
		tot += cuenta.getSaldo();
	};
	return tot;
}
//setters /////////////////////////////////////////////////
public void setApellido(String apellido) 
{
	this.apellido = apellido;
}
public void setNombre(String nombre) 
{
	this.nombre = nombre;
}

public void setClienteNum(int clienteNum) {
	this.clienteNum = clienteNum;
}

}
