package Models.bancario;

import java.util.Date;

public class Extraccion extends Transaccion
{
	public float retiro;
	private Date fechaE;
	
	public Extraccion(float m) 
	{  
		super(m);
		retiro = m;

    }
	@Override
	public float getMonto() 
	{
		return retiro;
	}

	@Override
    public String toString() 
	{
        return "Retiro de $" + getMonto();
    }
}
