import java.util.ArrayList;
import java.util.List;

public class ListaFuncionLambda {
    public static void main(String[] args) {

        // Creamos una lista de tipo String
        List<String> frutas = new ArrayList<>();

        // Agregamos elementos a la lista
        frutas.add("Manzana");
        frutas.add("Banano");
        frutas.add("Fresa");
        frutas.add("Mango");
        frutas.add("Papaya");

        // Imprimimos toda la lista completa
        System.out.println("Lista de frutas: " + frutas);

        // Accedemos al primer elemento (índice 0)
        System.out.println("Primera fruta: " + frutas.get(0));

        // Eliminamos un elemento por su valor
        frutas.remove("Banano");

        // --- Uso de función lambda ---
        // forEach() recorre cada elemento de la lista
        // La expresión lambda (fruta -> ...) indica la acción a realizar con cada elemento
        System.out.println("Frutas restantes (con lambda):");
        frutas.forEach(fruta ->
                System.out.println("- " + fruta));

        /*
         * Explicación:
         * - frutas.forEach(...) recorre todos los elementos.
         * - "fruta" es el parámetro que representa cada elemento de la lista.
         * - La flecha "->" separa el parámetro de la acción a ejecutar.
         * - System.out.println("- " + fruta) imprime cada elemento con un guion.
         *
         * Es equivalente al bucle for-each tradicional, pero más conciso y legible.
         */
    }
}
