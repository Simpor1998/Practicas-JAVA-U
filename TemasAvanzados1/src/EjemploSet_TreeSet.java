import java.util.Set;
import java.util.TreeSet;

public class EjemploSet_TreeSet {
    public static void main(String[] args) {
        // Creamos un Set de tipo String usando TreeSet
        Set<String> frutas = new TreeSet<>();

        // Agregamos elementos al TreeSet
        frutas.add("Manzana");
        frutas.add("Banano");
        frutas.add("Fresa");
        frutas.add("Mango");
        frutas.add("papaya");
        frutas.add("Manzana"); // Este elemento no se agregará, ya que TreeSet no permite duplicados

        // Imprimimos todos los elementos del TreeSet
        // Nota: Los elementos se mostrarán ordenados alfabéticamente
        System.out.println("Frutas en el TreeSet: " + frutas);

        // Verificar si un elemento está en el TreeSet
        if (frutas.contains("Fresa")) {
            System.out.println("El TreeSet contiene Fresa");
        }

        // Eliminamos un elemento
        frutas.remove("Banano");

        // Recorrer el TreeSet usando for-each
        System.out.println("Frutas restantes:");
        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }

        // Recorrer el TreeSet usando lambda y método de referencia
        System.out.println("Recorrido con lambda y método de referencia:");
        frutas.forEach(System.out::println);
    }
}

/*
Explicación:

1. TreeSet:
   - No permite elementos duplicados.
   - Mantiene los elementos ordenados de forma natural:
       * Strings → alfabéticamente
       * Números → de menor a mayor
   - Operaciones de búsqueda, inserción y eliminación son más lentas que HashSet debido al ordenamiento interno (usa árbol rojo-negro).

2. Diferencia con HashSet:
   - HashSet: rápido, no mantiene orden.
   - TreeSet: mantiene orden, ligeramente más lento.
   - Ambos garantizan que no existan duplicados y implementan la interfaz Set.

3. Métodos principales usados:
   - .add(elemento): agrega un elemento al TreeSet; ignora duplicados.
   - .contains(elemento): verifica si el elemento está presente.
   - .remove(elemento): elimina un elemento.
   - for-each o .forEach(System.out::println): recorre todos los elementos de manera ordenada.

4. Lambda y método de referencia:
   - frutas.forEach(System.out::println) imprime todos los elementos sin necesidad de escribir un bucle explícito.
*/
