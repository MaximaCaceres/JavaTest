package com.vaadin.test1;

public class Moto {
	
	//properties
	String Marca = "";
	public String getMarca() 
	{
		return Marca;
	}
	
	public int Modelo = 0;
	public int getModelo() 
	{
		return Modelo;
	}
	
    public double ValorF = 0;
    public double GetValor() 
    {
    	return ValorF;
    }
    public double deprL = 0;
    public double deprA = 0;
    
    public Moto(String marca, int modelo, double valf) 
    {
    	Marca = marca;
    	Modelo = modelo;
    	ValorF = valf;
    }
    
    //Methods
    public double CalcularDeprLineal(int anioC, int vidaU)
    {
    	double totalL = ValorF - (ValorF * (AniosDeUso(anioC)/vidaU));
    	deprL = totalL;
    	return totalL;
    }
    
    public double CalcularDeprAnual(int anioC, double tasaD)
    {
    	double totalA = ValorF *Math.pow(1-tasaD,AniosDeUso(anioC));
    	deprA = totalA;
    	return totalA;
    }	
    	
    public int AniosDeUso(int AnioC) 
    {
    	int total = AnioC - Modelo;
    	return total;
    }
    
    public String VerDescripcion() 
    {
    	String data = "Marca: "+ Marca + "|| Modelo:" + Modelo + "|| Valor de fabricacion: " + ValorF + "\n" +"Depreciacion lineal "+ deprL + "\n"+"Depreciacion anual " + deprA;
    	return data;
    }
    
    }
