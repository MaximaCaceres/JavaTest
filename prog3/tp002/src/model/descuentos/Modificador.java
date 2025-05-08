package model.descuentos;

public abstract class Modificador {

	private String nombreDescuento;
	private double porcentaje;
	
	public Modificador(String nombreDescuento, double porcentaje) {
		this.nombreDescuento = nombreDescuento;
		this.porcentaje = porcentaje;
	}
	
	//getters and setters
	public String getNombreDescuento() {
		return nombreDescuento;
	}
	public void setNombreDescuento(String nombreDescuento) {
		this.nombreDescuento = nombreDescuento;
	}
	public double getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	
}
