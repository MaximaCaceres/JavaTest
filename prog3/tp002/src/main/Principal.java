package main;

import java.util.ArrayList;
import java.util.List;

import model.calculador.Calculador;
import model.descuentos.BillDiscount;
import model.descuentos.Modificador;
import model.descuentos.ProductDiscount;
import model.facturas.Factura;
import model.facturas.ItemProducto;

public class Principal {

	public static void main(String[] args) {

		Factura<Modificador> caso1 = new Factura<>();
		
		caso1();
		caso2();
		caso3();
	}
	
	private static void caso1() {
		Factura<Modificador> caso1 = new Factura<>();
		
		ItemProducto bici = new ItemProducto("Bicicleta",780000.0,0.21,1);//una bici
		ProductDiscount pdBici = new ProductDiscount("Descuento Bici",0.05,bici);
		
		ItemProducto vaporera = new ItemProducto("Vaporera",94000.0,0.105,3);//una vaporera
		ProductDiscount pdVapo = new ProductDiscount("Descuento vaporera",0.03,vaporera);
		
		//descuento total de la factura
		
		BillDiscount bdCaso1 = new BillDiscount("Descuento Factura caso 1", 0, 10000, caso1);
		List<ItemProducto> listaProductos = new ArrayList<>();
		listaProductos.add(bici);
		listaProductos.add(vaporera);
		
		caso1.setListaProductos(listaProductos);
		
		// descuentos:
		
		List<Modificador> listaDescuentos = new ArrayList<>();
		listaDescuentos.add(bdCaso1);
		listaDescuentos.add(pdBici);
		listaDescuentos.add(pdVapo);
		caso1.setListaDescuentos(listaDescuentos);
		
		//salidas
		System.out.println("Monto Total Caso 1 : $"+Calculador.calcularMontoTotal(caso1));
	}

	private static void caso2() {
		Factura<Modificador> caso2 = new Factura<>();
		
		ItemProducto lavarropa = new ItemProducto("Lavarropa",510000.0,0.105,1);
		ProductDiscount pdLavarropa = new ProductDiscount("Descuento Lavarropa",0.15,lavarropa);
		
		ItemProducto tostadora = new ItemProducto("Tostadora",40000.0,0.21,2);
		ProductDiscount pdTostadora = new ProductDiscount("Descuento Tostadora",0.35,tostadora);
		
		ItemProducto heladera = new ItemProducto("Heladera",890000.0,0.105,3);
		ProductDiscount pdHeladera = new ProductDiscount("Descuento Heladera",0.25,heladera);
		
		ItemProducto ventilador = new ItemProducto("Ventilador",158000.0,0.21,4);
		ProductDiscount pdVentilador = new ProductDiscount("Descuento Ventilador",0.1,ventilador);
		
		//descuento total de la factura
		
		BillDiscount bdCaso2 = new BillDiscount("Descuento Factura caso 2", 0.05, 15000, caso2);
		List<ItemProducto> listaProductos = new ArrayList<>();
		listaProductos.add(lavarropa);
		listaProductos.add(tostadora);
		listaProductos.add(heladera);
		listaProductos.add(ventilador);
		
		caso2.setListaProductos(listaProductos);
		
		// descuentos:
		
		List<Modificador> listaDescuentos = new ArrayList<>();
		listaDescuentos.add(bdCaso2);
		listaDescuentos.add(pdLavarropa);
		listaDescuentos.add(pdTostadora);
		listaDescuentos.add(pdHeladera);
		listaDescuentos.add(pdVentilador);
		caso2.setListaDescuentos(listaDescuentos);
		
		//salidas
		System.out.println("Monto Total Caso 1 : $"+Calculador.calcularMontoTotal(caso2));
	}
	
	private static void caso3() {
		Factura<Modificador> caso3 = new Factura<>();
		
		ItemProducto notebook = new ItemProducto("Notebook",1400000.0,0.21,1);//una bici
		ProductDiscount pdNotebook = new ProductDiscount("Descuento Bici",0.0,notebook);
		
		ItemProducto musicCenter = new ItemProducto("Sony Music Center",2600000,0.21,1);//una vaporera
		ProductDiscount pdMusic = new ProductDiscount("Descuento Sony",0.18,musicCenter);
		
		//descuento total de la factura
		
		List<ItemProducto> listaProductos = new ArrayList<>();
		listaProductos.add(notebook);
		listaProductos.add(musicCenter);
		
		caso3.setListaProductos(listaProductos);
		
		// descuentos:
		
		List<Modificador> listaDescuentos = new ArrayList<>();
		listaDescuentos.add(pdNotebook);
		listaDescuentos.add(pdMusic);
		caso3.setListaDescuentos(listaDescuentos);
		
		//salidas
		System.out.println("Monto Total Caso 3 : $"+Calculador.calcularMontoTotal(caso3));
	}
}
