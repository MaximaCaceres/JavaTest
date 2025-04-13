package libreriaModels;

import java.time.LocalDate;

public class Vista 
{
	public static void main(String[] args) 
	{
	  Librerita l = new Librerita("Libreria-Anita","Almafuerte 777");
	  Editorial e = new Editorial("Deitel ","Lurdes Mittchen 345 ","Manhattan ","deitel@deitel.com ","23568776549 ","+1 646-555-9123\r\n"
	  		+ "\r\n"
	  		+ "");
	  Autor a1 = new Autor("Paul J. ","Deitel ","masculino ","pauldeitel@gmail.com ");
	  Autor a2 = new Autor("Luis Joyanes ","Aguilar ","masculino ","LuisJoyanes@gmail.com ");

	  
	  Libro lib1 = new Libro("Como programar en C++ ",e,"978-1-61729-874-9",a1,4,231);
	  Libro lib2 = new Libro("Fundamentos-de-programación-4ta-Edición ",e,"146-1-76529-074-2",a2,1,150);
	  Libro lib3 = new Libro("programar en Java ",e,"978-1-61884-123-9",a1,2,251);
	  Libro lib4 = new Libro("Diagramas UML ",e,"978-1-10101-874-9",a2,1,122);
	  Libro lib5 = new Libro("Metodologias agiles ",e,"111-1-60029-874-2",a1,6,50);
	  Libro lib6 = new Libro("Problemas de Algoritmos y Diagramas de flujo ",e,"978-1-17171-800-4",a2,4,97);
	  Libro lib7 = new Libro("Programacion orientada a objetos ",e,"978-1-78765-004-0",a1,8,320);
	  Libro lib8 = new Libro("C++/ programacion III ",e,"778-1-90829-874-5",a2,5,100);
	  Libro lib9 = new Libro("Introduccion a C ",e,"908-3-60769-804-9",a1,1,105);
	  Libro lib10 = new Libro("Python avanzado ",e,"077-9-61709-874-6",a1,2,98);
	  
	  //////////////////////////////////////
	  l.comprarLibro(lib1);
	  l.comprarLibro(lib2);
	  l.comprarLibro(lib3);
	  l.comprarLibro(lib4);
	  l.comprarLibro(lib5);
	  l.comprarLibro(lib6);
	  l.comprarLibro(lib7);
	  l.comprarLibro(lib8);
	  l.comprarLibro(lib9);
	  l.comprarLibro(lib10);
	  
	  System.out.println(l.imprimirCompra());
	}

}
