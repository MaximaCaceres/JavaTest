package Impresora.models;

import java.util.Date;

public class Mensaje {

	private Date fecha;
	private Footer f;
	private Header h;
	private Body b;
	//////////////////////////////////////////////////
	
	public Mensaje(Footer f, Header h, Body b) {
		this.f = f;
		this.h = h;
		this.b = b;
	}
    ///////////////////Getters///////////////////////////
	public Date getFecha() {
		return fecha;
	}

	
    //////////////////Setters///////////////////////////
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	//////////////////////////////////////////

	@Override
	public String toString() {
		return h.getMensajeHeader() + "\n"+ b.toString() +"\n"+ f.getMensajeFooter() ;
	}	                                  
	
	public String Completo() {
		return h.getMensajeHeader() + "\n"+ b.toString() +"\n"+"                      "+"\n"+ b.retornoP(0).getTexto()+"\n"+"                      "+"\n"+ b.retornoP(1).getTexto()+"\n"+"                      "+"\n"+ f.getMensajeFooter()+"\n"+"                      "+"\n"+"Autor anonimo" ;
	}
}
