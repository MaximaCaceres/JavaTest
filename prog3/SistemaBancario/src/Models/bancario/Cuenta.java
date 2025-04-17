package Models.bancario;

import java.util.Vector;

public class Cuenta 
{
	private int nroCuenta;
	  private Cliente cliente;
	  private float saldo;
	  private Vector<Transaccion> listaTrans= new Vector<Transaccion>();
	  
	  public Cuenta(int n,Cliente c, float s) 
	  {
		  nroCuenta = n;
		  cliente = c;
		  saldo  = s;
	  }
	  //getters ////////////////////////////////////////////////////////////
	public int getNroCuenta() 
	{
		return nroCuenta;
	}
	public float getSaldo() 
	{
		return saldo;
	}
	  
	//setters /////////////////////////////////////////////////////////////
	public void setNroCuenta(int nroCuenta) 
	{
		this.nroCuenta = nroCuenta;
	}

	public void setSaldo(float saldo) 
	{
		this.saldo = saldo;
	}
	//method
	public void addTransaccion(Transaccion t) //CAMBIO A FORMA CORTA (CON UN TERNARIO)
	{	
		this.saldo += (t instanceof Deposito) ? t.getMonto() : (-1) * t.getMonto();
	}
}
