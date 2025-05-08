package model.facturas;

public class ItemProducto {

	private String nombre;
	private double precio;
	private double impuesto;
	private int cantidad;
	
	public ItemProducto(String nombre, double precio, double impuesto, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.impuesto = impuesto;
		this.cantidad = cantidad;	
	}
	
	//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
}
