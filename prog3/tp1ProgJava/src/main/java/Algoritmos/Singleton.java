package Algoritmos;

public class Singleton {

	public static Singleton getInstance() {
		if(instance == null) 
			instance = new Singleton();
			return instance;
		
	}
	private static Singleton instance = null;
	//De esta manera, no importa cuántas veces llames a Singleton.getInstance() en tu aplicación
	// siempre obtendrás una referencia al mismo y único objeto Singleton.
}

/*
-----------------------------------------------------------------------------------
CÓDIGO PROBLEMÁTICO (SINGLETON GENÉRICO) Y POR QUÉ ESTÁ MAL:
-----------------------------------------------------------------------------------

// public class Singleton<T> { // Clase genérica con tipo T
//
//    public static T getInstance() { // T aquí es problemático en un método estático
//        if (instance == null) {
//            instance = new Singleton<T>(); // NO COMPILA: No se puede usar T de la clase en un contexto estático para crear una nueva instancia.
//        }
//        return instance;
//    }
//
//    private static T instance = null; // NO COMPILA: Un campo estático no puede ser del tipo genérico T de la clase.
// }

Explicación:

Los miembros `static` (como la variable `instance` y el método `getInstance`) pertenecen a la clase en sí, no a un objeto específico.
El parámetro de tipo `<T>` se define cuando creas un objeto (ej. `new Singleton<String>()`).

Por lo tanto:
1.  `private static T instance = null;`  -> **MAL**. Un campo `static` no puede usar `T` de la clase porque `instance` es único para todas las `Singleton<CualquierCosa>`, mientras que `T` cambia.
2.  `public static T getInstance()` y `new Singleton<T>()` -> **MAL**. Un método `static` no sabe qué es `T` (porque no hay un objeto específico), por lo que no puede devolver `T` ni crear `new Singleton<T>()`.

**En resumen: Lo `static` es de la clase, lo genérico `<T>` (de la clase) es del objeto. No se pueden mezclar directamente de esta manera.**
*/
