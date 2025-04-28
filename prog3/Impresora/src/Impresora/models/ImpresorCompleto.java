package Impresora.models;

public class ImpresorCompleto implements Impresor{

	@Override
	public void imprimirMensaje(Mensaje mj) {
		
		System.out.println(mj.Completo());
	}

}
