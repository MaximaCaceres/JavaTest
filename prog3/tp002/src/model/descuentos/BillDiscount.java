package model.descuentos;

import model.facturas.Factura;

public class BillDiscount extends Modificador {

	private double montoFijo;
	private Factura<Modificador> factura;
	
	public BillDiscount(String nombreDescuento, double d, double montoFijo, Factura<Modificador> factura) {
		super(nombreDescuento, d);
		this.montoFijo = montoFijo;
		this.factura = factura;
	}
	//getters
	public double getMontoFijo() {
		return montoFijo;
	}

	public Factura<Modificador> getFactura() {
		return factura;
	}

	
}
