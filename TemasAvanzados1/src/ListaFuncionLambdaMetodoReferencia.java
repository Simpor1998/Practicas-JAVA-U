import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaFuncionLambdaMetodoReferencia {
    public static void main(String[] args) {
        // Creamos una lista de tipo String
        List<String> frutas = new ArrayList<>();

        // Agregamos elementos a la lista
        frutas.add("Manzana");
        frutas.add("Banano");
        frutas.add("Fresa");
        frutas.add("Mango");

        // Imprimimos la lista completa
        System.out.println("Lista de frutas: " + frutas);

        // Accedemos a un elemento por su índice
        System.out.println("Primera fruta: " + frutas.get(0));

        // Eliminamos un elemento
        frutas.remove("Banano");

        // --- Uso de método de referencia ---
        System.out.println("Frutas restantes (con método de referencia):");

        // En lugar de usar una lambda (fruta -> System.out.println(fruta))
        // usamos directamente una referencia al método println
        frutas.forEach(System.out::println);

        /*
         * Explicación:
         * - frutas.forEach(...) recorre la lista completa.
         * - System.out::println es un método de referencia.
         * - Los "::" indican que estamos haciendo referencia directa
         *   a un método existente (en este caso, println).
         * - Es equivalente a escribir:
         *     frutas.forEach(fruta -> System.out.println(fruta));
         *
         * Ventajas:
         * - Código más limpio y expresivo.
         * - Reduce errores al eliminar funciones repetitivas.
         */ // Creamos una lista de tipo String

        List<String> nombres = Arrays.asList("Pedro", "Ivonne", "Nohemi");
        System.out.println("\nLista de Nombres: ");
        nombres.forEach(System.out::println);

    }
}
