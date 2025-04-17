package Models.bancario;

public abstract class Transaccion 
{
 protected static float monto;

 public Transaccion(float monto) 
 {
	 this.monto = monto;
 }
public float getMonto() 
{
	return monto;
}

 

}
