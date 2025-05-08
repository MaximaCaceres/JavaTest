package model.calculador;

import model.descuentos.BillDiscount;
import model.descuentos.Modificador;
import model.descuentos.ProductDiscount;
import model.facturas.Factura;
import model.facturas.ItemProducto;

public class Calculador {

	public static <T extends Modificador> double calcularMontoTotal(Factura<T> factura) { //metodo parametrizable
		BillDiscount bd = null;
		for(Modificador m: factura.getListaDescuentos()) {
			if(m instanceof BillDiscount) {
				bd=(BillDiscount)m;//le digo a java que m es un BillDiscount
			}else {
				ProductDiscount pd =  (ProductDiscount) m;
				ItemProducto prod = pd.getItem();
				double impuesto = prod.getPrecio() * prod.getImpuesto();
				double desc = prod.getPrecio() * pd.getPorcentaje();
				double montoTotal = (prod.getPrecio() + impuesto - desc) * prod.getCantidad(); 
				System.out.println(montoTotal);
				factura.setMontoTotal(factura.getMontoTotal()+ montoTotal);
 			}
			
	}
		if(bd != null) {
			double porcentajeFactura = factura.getMontoTotal() * bd.getPorcentaje();
			factura.setMontoTotal(factura.getMontoTotal() - porcentajeFactura);
			factura.setMontoTotal(factura.getMontoTotal() - bd.getMontoFijo());
		}
		return factura.getMontoTotal();
  }
}
