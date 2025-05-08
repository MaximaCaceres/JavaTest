package Algoritmos;

import java.util.Comparator;
import pt1ProgJava.Alumno; // Asegúrate que la importación sea correcta

public class OrdenadorApellidoNombre implements Comparator<Alumno> {

    @Override
    public int compare(Alumno arg0, Alumno arg1) {
        // Paso 1: Obtener los apellidos de ambos alumnos.
        String apellido1 = arg0.getApellido();
        String apellido2 = arg1.getApellido();

        // Paso 2: Comparar los apellidos.
        // El método compareTo() devuelve:
        //   - un número negativo si apellido1 va antes que apellido2.
        //   - cero si son iguales.
        //   - un número positivo si apellido1 va después que apellido2.
        int comparacionApellidos = apellido1.compareTo(apellido2);

        // Paso 3: Verificar si los apellidos son diferentes.
        if (comparacionApellidos != 0) {
            // Si son diferentes, ya tenemos el orden. Devolvemos el resultado.
            return comparacionApellidos;
        } else {
            // Paso 4: Si los apellidos son iguales, necesitamos comparar por nombre.
            String nombre1 = arg0.getNombre();
            String nombre2 = arg1.getNombre();

            // Paso 5: Comparar los nombres y devolver el resultado.
            int comparacionNombres = nombre1.compareTo(nombre2);
            return comparacionNombres;
        }
    }
}
