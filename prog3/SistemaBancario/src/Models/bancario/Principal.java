package Models.bancario;

import java.util.Date;

public class Principal {

	public static void main(String[] args) 
	{
	  Banco bna = new Banco("Banco Nacion");
      Cliente c = new Cliente(bna);
      c.setNombre("Martiniano");
      ///////
      bna.agregarCliente(c);
      Cuenta cta = new Cuenta(1,c, 2000);
      c.agregarCuenta(cta); //ACA HACEMOS REFERENCIA AL CODIGO QUE LLAMA AL BNA PARA AGREGAR LA CUENTA.
      
      Transaccion t = new Extraccion(100);
      System.out.print(c.getNombre()+ " Hizo una extraccion!!");
      
      cta.addTransaccion(t);
      System.out.print(t.toString());
      
      float total = bna.getDisponible();
      System.out.println("\n"+"Dinero total de todas las cuentas: ");
      System.out.println(total);
	}

}
