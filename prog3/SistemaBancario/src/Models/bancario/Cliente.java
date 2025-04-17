package Models.bancario;

import java.util.Vector;

public class Cliente 
{
  private String apellido;
  private String nombre;
  private int clienteNum;
  private Banco banco;
  
  private Vector<Cuenta> listaCuentas = new Vector<Cuenta>();
  
  public Cliente(Banco banco) 
  {
	  this.listaCuentas = new Vector<>();
	  this.banco = banco;//RECONOCE AL BANCO
	  banco.getListaClientes().add(this);//AGREGA AL CLIENTE CREADO EN LA LISTA DE CLIENTES DEL BANCO
  }
  public void agregarCuenta(Cuenta c) 
  {
	  this.listaCuentas.add(c);
	  this.banco.getCuentas().add(c);//TENGO QUE AGREGAR ASI LA CUENTA DEL CLIENTE// SE VINCULA CON EL BANCO
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
//SE FUE EL GETMONTOCUENTAS

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
