import java.util.TreeSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        // Los set noll manjean un orden en especial
        //pero cuando usamos TreeSet , se maneja el orden de insercion de los elementos
        //treeset
        Set<String> conjunto = new TreeSet<>();
        // como carlos esta dos veces no admite elementos duplicados
        conjunto.add("Carlos");
        conjunto.add("Carlos");
        conjunto.add("Karla");
        conjunto.add("Victoria");

        System.out.println("Elementos del Set");
        conjunto.forEach(System.out::println);

        // Remover elemento
        conjunto.remove("Karla");
        System.out.println("\nNuevos Elementos del Set");
        conjunto.forEach(System.out::println);
    }
}