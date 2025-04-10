package Models.bancario;

import java.util.Date;

public class Principal {

	public static void main(String[] args) 
	{
	  Banco bna = new Banco("Banco Nacion");
      Cliente c = new Cliente("Martiniano","Espeleta",1);
      ///////
      bna.agregarCliente(c);
      Cuenta cta = new Cuenta(1,c, 2000);
      c.agregarCuenta(cta);
      Transaccion t = new Extraccion(100);
      cta.addTransaccion(t);
      System.out.print(t.toString());
	}

}
