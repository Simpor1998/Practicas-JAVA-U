import java.util.HashSet;
import java.util.Set;

public class EjemploSet_HashSet {
    public static void main(String[] args) {

        // Creamos un Set de tipo String usando HashSet
        Set<String> frutas = new HashSet<>();

        // Agregamos elementos al Set
        frutas.add("Manzana");
        frutas.add("Banano");
        frutas.add("Fresa");
        frutas.add("Mango");
        frutas.add("Manzana"); // Este elemento no se agregará, ya existe

        // Imprimimos todos los elementos del Set
        System.out.println("Frutas en el Set: " + frutas);

        // Verificar si un elemento está en el Set
        if (frutas.contains("Fresa")) {
            System.out.println("El Set contiene Fresa");
        }

        // Eliminamos un elemento del Set
        frutas.remove("Banano");

        // Recorrer el Set usando for-each
        System.out.println("Frutas restantes:");
        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }

        // Recorrer el Set usando lambda y método de referencia
        System.out.println("Recorrido con lambda y método de referencia:");
        frutas.forEach(System.out::println);
    }
}

/*
Explicación:

1. HashSet vs TreeSet:
   - HashSet:
     * No permite elementos duplicados.
     * No mantiene el orden de inserción.
     * Es más rápido para operaciones de búsqueda, inserción y eliminación.
   - TreeSet:
     * No permite duplicados.
     * Mantiene los elementos ordenados de forma natural (alfabéticamente para Strings, de menor a mayor para números).
     * Es más lento que HashSet debido a la ordenación interna.

2. Métodos principales:
   - .add(elemento): agrega un elemento al Set; ignora duplicados.
   - .contains(elemento): verifica si el Set contiene un elemento.
   - .remove(elemento): elimina un elemento del Set.
   - for-each o .forEach(System.out::println): recorre todos los elementos.

3. Observaciones:
   - HashSet es ideal cuando el orden no importa y se requiere rapidez.
   - TreeSet es útil cuando necesitas mantener los elementos siempre ordenados.
   - Ambos implementan la interfaz Set, lo que garantiza que no existan duplicados.
*/
