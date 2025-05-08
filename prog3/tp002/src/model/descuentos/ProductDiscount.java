package model.descuentos;

import model.facturas.ItemProducto;

public class ProductDiscount extends Modificador {

	private ItemProducto item;
	
	public ProductDiscount(String nombreDescuento, double porcentaje, ItemProducto item) {
		super(nombreDescuento, porcentaje);
		this.item = item;
	}
	
	//getters and setters
	public ItemProducto getItem() {
		return item;
	}

	public void setItem(ItemProducto item) {
		this.item = item;
	}

	
}
