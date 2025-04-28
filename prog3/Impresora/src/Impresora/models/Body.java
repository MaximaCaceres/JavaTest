package Impresora.models;

import java.util.Vector;

public class Body {

	private Titulo titulo;
    private Vector<Parrafo> lp = new Vector<Parrafo>();
    
    //////////Getters//////////
	public Titulo getTitulo() {
		return titulo;
	}
	public Vector<Parrafo> getLp() {
		return lp;
	}
	 //////////Setters//////////
	public void setLp(Vector<Parrafo> lp) {
		this.lp = lp;
	}
	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		return titulo.getTitulo();
	}
	public Parrafo retornoP(int n) {
	Parrafo p = new Parrafo();
	p=lp.elementAt(n);//this give me the element at n
	return p;		
	}
	public void AgregarParrafo(Parrafo p) {
		lp.add(p);
	}
}
