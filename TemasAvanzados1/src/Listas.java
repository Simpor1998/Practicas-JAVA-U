// Importamos las clases necesarias del paquete java.util
import java.util.ArrayList; // Permite crear listas dinámicas
import java.util.List;      // Es la interfaz que implementa ArrayList

public class Listas {
    public static void main(String[] args) {

        // Creamos una lista de tipo String llamada "frutas"
        // List es la interfaz y ArrayList es la clase que la implementa
        // Dentro de los picos parentesis indicamos que tipos de datos
        // va a almacenar nuestra list,
        // y ya no se hace necesario indicar de que
        // tipo sera nuestra arraylist ya que lo indicamos en el tipo de
        // dato que se ha especificado para nuestra lista al inicio


        List<String> frutas = new ArrayList<>();

        // Agregamos elementos a la lista con el método add()
        frutas.add("Manzana");
        frutas.add("Banano");
        frutas.add("Fresa");
        frutas.add("Mango");

        // Imprimimos toda la lista completa
        System.out.println("Lista de frutas: " + frutas);

        // Accedemos a un elemento específico usando su índice
        // Recordar que los índices comienzan desde 0
        // Iniciamos desde el primero
        System.out.println("Primera fruta: " + frutas.getFirst());
        // Iniciamos desde el ultimo
        System.out.println("Segunda fruta: " + frutas.getLast());
        // Iniciamos desde el segundo elemento
        System.out.println("Fazera fruta: " + frutas.get(1));

        // Eliminamos un elemento de la lista con remove()
        frutas.remove("Banano"); // Elimina el elemento "Banano"

        // Recorremos la lista usando un bucle for-each
        // Este bucle imprime cada fruta restante en la lista
        System.out.println("Frutas restantes:");
        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }
    }
}
