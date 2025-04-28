package Impresora.models;

public class ImpresorResumen implements Impresor{

	@Override
	public void imprimirMensaje(Mensaje mj) {
		
		System.out.println(mj.toString());

	}

	
}
