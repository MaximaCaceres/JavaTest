package com.vaadin.test1;

import java.util.Scanner;//needed for reading

public class Vista {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner lectura = new Scanner (System.in);

		System.out.print("Ingrese los datos de la moto: Marca, modelo y valor de fabricacion (En orden)");
		
		String marca = lectura.next(); //reading
		int modelo = lectura.nextInt();//reading number
		double valF = lectura.nextDouble();//reading DoubleNumber
		
		Moto moto = new Moto(marca,modelo,valF);
		
		System.out.print("Ingrese año a calcular, tasa de depreciacion y vida util (En orden)");
		int anioC = lectura.nextInt();
		double tasaD = lectura.nextDouble();
		int vidaU = lectura.nextInt();
		
		moto.CalcularDeprAnual(anioC, tasaD);
		moto.CalcularDeprLineal(anioC, vidaU);
		
		//view
		System.out.print("Datos:"+ "\n"+ moto.VerDescripcion());
	}

}
