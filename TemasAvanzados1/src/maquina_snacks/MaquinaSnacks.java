package maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {

    public static void main(String[] args) {
        // Inicia la simulación de la máquina de snacks
        maquinaSnacks();
    }

    public static void maquinaSnacks() {
        var salir = false;                  // Variable para controlar el ciclo principal
        var consola = new Scanner(System.in); // Scanner para leer entrada del usuario
        List<Snack> productos = new ArrayList<>(); // Lista de snacks que el usuario comprará
        System.out.println("*** Maquina de ServicioSnacksLista ***");

        Snacks.mostrarSnacks();             // Muestra el inventario inicial de snacks

        // Ciclo principal del programa
        while (!salir) {
            try {
                var opcion = mostrarMenu(consola);                  // Muestra menú y recibe opción
                salir = ejecutarOpciones(opcion, consola, productos); // Ejecuta acción según opción
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage()); // Captura errores de entrada
            } finally {
                System.out.println(); // Salto de línea para separar iteraciones
            }
        }
    }

    // Muestra el menú y retorna la opción elegida por el usuario
    private static int mostrarMenu(Scanner consola) {
        System.out.print("""
                Menu:
                1. Comprar snack
                2. Mostrar ticket
                3. Agregar Nuevo Snack
                4. Salir
                Elige una opcion:\s""");

        // Lee la opción como String y la convierte a entero
        return Integer.parseInt(consola.nextLine());
    }

    // Ejecuta la opción elegida
    private static boolean ejecutarOpciones(int opcion, Scanner consola,
                                            List<Snack> productos) {
        var salir = false; // Controla si se sale del ciclo principal
        switch (opcion) {
            case 1 -> comprarSnack(consola, productos);   // Opción para comprar snack
            case 2 -> mostrarTicket(productos);           // Opción para mostrar ticket
            case 3 -> agregarSnack(consola);              // Opción para agregar snack al inventario
            case 4 -> {                                   // Opción para salir
                System.out.println("Regresa pronto!");
                salir = true;
            }
            default -> System.out.println("Opcion invalida: " + opcion); // Manejo de opción inválida
        }
        return salir; // Retorna si se debe salir del ciclo
    }

    // Permite comprar un snack
    private static void comprarSnack(Scanner consola, List<Snack> productos) {
        System.out.print("Que snack quieres comprar (id)? ");
        var idSnack = Integer.parseInt(consola.nextLine()); // Lee el id del snack

        var snackEncontrado = false; // Controla si el snack existe
        for (var snack : Snacks.getSnacks()) {             // Recorre inventario
            if (idSnack == snack.getIdSnack()) {          // Verifica si el id coincide
                productos.add(snack);                     // Agrega el snack a la lista de compras
                System.out.println("Ok, Snack agregado: " + snack);
                snackEncontrado = true;
                break;                                     // Sale del ciclo al encontrarlo
            }
        }

        if (!snackEncontrado) {
            System.out.println("Id de snack no encontrado: " + idSnack); // Mensaje si no existe
        }
    }

    // Muestra el ticket de venta con el total
    private static void mostrarTicket(List<Snack> productos) {
        var ticket = "*** Ticket de Venta ***"; // Encabezado del ticket
        var total = 0.0;                        // Acumula el total
        for (var producto : productos) {        // Recorre los productos comprados
            ticket += "\n\t- " + producto.getNombre() + " - $" + producto.getPrecio(); // Añade línea al ticket
            total += producto.getPrecio();      // Suma el precio al total
        }
        ticket += "\n\tTotal -> $" + total;     // Añade total al final
        System.out.println(ticket);             // Muestra ticket completo
    }

    // Permite agregar un nuevo snack al inventario
    private static void agregarSnack(Scanner consola) {
        System.out.print("Nombre del snack: ");
        var nombre = consola.nextLine();          // Lee el nombre del snack
        System.out.print("Precio del snack: ");
        var precio = Double.parseDouble(consola.nextLine()); // Lee el precio
        Snacks.agregarSnack(new Snack(nombre, precio));     // Agrega el snack a la lista
        System.out.println("Tu snack se ha agregado correctamente");
        Snacks.mostrarSnacks();                   // Muestra el inventario actualizado
    }
}

/*
Explicación general:

1. Lógica principal:
   - La máquina de snacks simula un menú interactivo usando Scanner.
   - Un ciclo while(!salir) mantiene el programa activo hasta que el usuario elija salir.

2. Manejo de opciones:
   - Usando switch con la sintaxis moderna (case ->) para mayor claridad.
   - Cada opción llama a un método específico: comprar, mostrar ticket, agregar snack o salir.

3. Compra de snacks:
   - Se verifica que el id exista en el inventario de Snacks.
   - Si existe, se agrega a la lista de compras del usuario (productos).

4. Mostrar ticket:
   - Recorre la lista de compras y acumula el total.
   - Genera un ticket en formato legible.

5. Agregar nuevo snack:
   - Permite extender el inventario dinámicamente.
   - Se reutiliza la clase Snacks para mantener un inventario centralizado.

6. Buenas prácticas:
   - Uso de métodos privados para separar la lógica.
   - Uso de Scanner con try/catch para manejar entradas inválidas.
   - Uso de listas para manejar productos comprados dinámicamente.
*/
