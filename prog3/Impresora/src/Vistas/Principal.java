package Vistas;

import Impresora.models.Body;
import Impresora.models.Footer;
import Impresora.models.Header;
import Impresora.models.ImpresorCompleto;
import Impresora.models.ImpresorResumen;
import Impresora.models.Mensaje;
import Impresora.models.Parrafo;
import Impresora.models.Titulo;

public class Principal {

	public static void main(String[] args) {
	
		Header h = new Header();
		h.setMensajeHeader("Hola mundo!");
		Body b = new Body();
		Titulo t = new Titulo("Los chanchos de Canada");
		b.setTitulo(t);
		Parrafo p = new Parrafo();
		Parrafo p2 = new Parrafo();
		
		p.setTexto("Recientemente dos radares y localizadores puestos en los animales que fueron utilizados con fines medicinales"+"\n"+"fueron ubicdos en Canada despues de las lluvias");
		b.AgregarParrafo(p);
		///////
		p2.setTexto("Dichos animales fueron rescatados y enviados a un campo de cuidados"+"\n"+", esto permitira su rehabilitacion al 100%");
		b.AgregarParrafo(p2);
		
		Footer f = new Footer();
		f.setMensajeFooter("Los cerditos de Mexico estan invadiendo Canada debido a grandes tormentas. ");
		Mensaje m = new Mensaje(f,h,b);
		ImpresorResumen impr = new ImpresorResumen();
		ImpresorCompleto imcomp = new ImpresorCompleto();
		impr.imprimirMensaje(m);
		System.out.println("\n");
		imcomp.imprimirMensaje(m);

	}

}
