package Models.bancario;

import java.util.Date;

public class Deposito extends Transaccion
{
	private float deposito;
	private Date fechaD;
	public Deposito(float m)
	{
		super(m);
		deposito = m;

    }
	@Override
	public float getMonto() 
	{
		return deposito;
	}

	@Override
    public String toString() 
	{
        return "Retiro de $" + getMonto();
    }
}
