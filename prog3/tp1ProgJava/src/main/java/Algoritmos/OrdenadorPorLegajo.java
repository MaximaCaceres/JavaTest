package Algoritmos;

import java.util.Comparator;

import pt1ProgJava.Profesor;
// Asegúrate de importar la clase Profesor si está en otro paquete
// import paquete.donde.esta.Profesor;

public class OrdenadorPorLegajo implements Comparator<Profesor> {

    @Override
    public int compare(Profesor arg0, Profesor arg1) {
        // Paso 1: Obtener el legajo de cada profesor.
        int legajo1 = arg0.getLegajo();
        int legajo2 = arg1.getLegajo();

        // Paso 2: Comparar los legajos numéricamente.
        // El método Integer.compare(a, b) devuelve:
        //   - un número negativo si a < b
        //   - cero si a == b
        //   - un número positivo si a > b
        return Integer.compare(legajo1, legajo2);

        /*
        // Alternativa si el legajo fuera un String:
        String legajoStr1 = arg0.getLegajo(); // Asumiendo que getLegajo() devuelve String
        String legajoStr2 = arg1.getLegajo();
        return legajoStr1.compareTo(legajoStr2);
        */

        /*
        // Alternativa simple para int (menos recomendada por posible overflow si los números son muy grandes):
        return legajo1 - legajo2;
        */
    }
}
