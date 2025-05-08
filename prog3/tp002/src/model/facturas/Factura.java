package model.facturas;

import java.util.ArrayList;
import java.util.List;

import model.descuentos.Modificador;

public class Factura<D extends Modificador> { //cualquier clase que extienda de Modificador.

	private List<D> listaDescuentos;
	private List<ItemProducto> listaProductos;
	private double montoTotal = 0.0;
	
	public Factura() {

	}
	
	//getters and setters
	public List<D> getListaDescuentos() {
		return listaDescuentos;
	}
	public void setListaDescuentos(List<D> listaDescuentos) {
		this.listaDescuentos = listaDescuentos;
	}
	public List<ItemProducto> getListaProductos() {
		return listaProductos;
	}
	public void setListaProductos(List<ItemProducto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	public double getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
}
