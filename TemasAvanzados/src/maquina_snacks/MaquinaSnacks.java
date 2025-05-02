package maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks() {
        var salir = false;
        var consola = new Scanner(System.in);
        // Creamos la lista de productos de tipo snack
        List<Snack> productos = new ArrayList<>();
        System.out.println("*** Maquina de Snacks ***");
        Snacks.mostrarSnacks(); // Mostrar inventario de snacks disponibles
        while (!salir) {
            try {
                var opcion = mostrarMenu(consola);
                //salir = ejecutarOpciones(opcion, consola, productos);
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            } finally {
                System.out.println();// Imprime un salto de linea con cada iteracion
            }
        }
    }

    private static int mostrarMenu(Scanner consola) {
        System.out.print("""
                Menu:
                1. Comprar snack
                2. Mostrar ticket
                3. Agregar Nuevo Snack
                4. Salir
                Elige una opcion:\s""");
        // Leemos y retornamos la opcion seleccionada
        return Integer.parseInt(consola.nextLine());
    }


}
