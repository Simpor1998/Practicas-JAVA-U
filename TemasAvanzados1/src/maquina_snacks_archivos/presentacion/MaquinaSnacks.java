package maquina_snacks_archivos.presentacion;

import maquina_snacks_archivos.dominio.Snack; // Clase que representa un snack con nombre, precio e ID
import maquina_snacks_archivos.servicio.IServicioSnacks; // Interfaz que define operaciones sobre snacks
import maquina_snacks_archivos.servicio.ServicioSnacksArchivos;
import maquina_snacks_archivos.servicio.ServicioSnacksLista; // Implementación concreta de IServicioSnacks usando lista

import java.util.ArrayList; // Permite crear listas dinámicas
import java.util.List;      // Interfaz de listas
import java.util.Scanner;   // Permite leer entrada del usuario desde consola

public class MaquinaSnacks {

    public static void main(String[] args) {
        // 🔹 Inicia la máquina de snacks
        maquinaSnacks();
    }

    public static void maquinaSnacks() {
        var salir = false;              // Controla el bucle principal del menú
        var consola = new Scanner(System.in); // Scanner para leer entradas del usuario

        // 🔹 Creamos el servicio de snacks usando lista
//        IServicioSnacks servicioSnacks = new ServicioSnacksLista();

        IServicioSnacks servicioSnacks = new ServicioSnacksArchivos();

        // 🔹 Lista para almacenar los productos comprados por el usuario
        List<Snack> productos = new ArrayList<>();

        System.out.println("*** Maquina de ServicioSnacks ARCHIVO ***");

        // 🔹 Mostrar el inventario inicial de snacks disponibles
        servicioSnacks.mostrarSnacks();

        // 🔹 Bucle principal del menú
        while (!salir) {
            try {
                // 🔹 Mostrar menú y leer opción del usuario
                var opcion = mostrarMenu(consola);

                // 🔹 Ejecutar la acción correspondiente según la opción
                salir = ejecutarOpciones(opcion, consola, productos, servicioSnacks);

            } catch (Exception e) {
                // 🔹 Captura cualquier error durante la ejecución (ej: formato de número incorrecto)
                System.out.println("Ocurrio un error: " + e.getMessage());
            } finally {
                System.out.println(); // 🔹 Salto de línea en cada iteración para mayor claridad
            }
        }
    }

    // 🔹 Muestra el menú y retorna la opción seleccionada por el usuario
    private static int mostrarMenu(Scanner consola) {
        System.out.print("""
                Menu:
                1. Comprar snack
                2. Mostrar ticket
                3. Agregar Nuevo Snack
                4. Salir
                Elige una opcion:\s""");
        return Integer.parseInt(consola.nextLine()); // Convertimos la entrada a entero
    }

    // 🔹 Ejecuta la acción según la opción del menú
    private static boolean ejecutarOpciones(int opcion, Scanner consola,
                                            List<Snack> productos, IServicioSnacks servicioSnacks) {
        var salir = false;

        switch (opcion) {
            case 1 -> comprarSnack(consola, productos, servicioSnacks); // Comprar snack
            case 2 -> mostrarTicket(productos);                            // Mostrar ticket
            case 3 -> agregarSnack(consola, servicioSnacks);              // Agregar nuevo snack
            case 4 -> {                                                    // Salir del programa
                System.out.println("Regresa pronto!");
                salir = true;
            }
            default -> System.out.println("Opcion invalida: " + opcion);  // Validación de opción
        }

        return salir; // Retorna true si se quiere salir del bucle
    }

    // 🔹 Permite comprar un snack según el ID ingresado por el usuario
    private static void comprarSnack(Scanner consola,
                                     List<Snack> productos, IServicioSnacks servicioSnacks) {
        System.out.print("Que snack quieres comprar (id)? ");
        var idSnack = Integer.parseInt(consola.nextLine()); // Leer ID

        // 🔹 Validar que el snack exista en el inventario
        var snackEncontrado = false;
        for (var snack : servicioSnacks.getSnacks()) {
            if (idSnack == snack.getIdSnack()) {
                productos.add(snack); // Agregamos el snack a la lista de productos comprados
                System.out.println("Ok, Snack agregado: " + snack);
                snackEncontrado = true;
                break; // Salimos del bucle después de encontrar el snack
            }
        }

        if (!snackEncontrado) {
            System.out.println("Id de snack no encontrado: " + idSnack);
        }
    }

    // 🔹 Muestra un ticket con los productos comprados y el total a pagar
    private static void mostrarTicket(List<Snack> productos) {
        var ticket = "*** Ticket de Venta ***";
        var total = 0.0;

        for (var producto : productos) {
            ticket += "\n\t- " + producto.getNombre() + " - $" + producto.getPrecio();
            total += producto.getPrecio(); // Suma los precios para calcular el total
        }

        ticket += "\n\tTotal -> $" + total;
        System.out.println(ticket); // Imprime el ticket completo
    }

    // 🔹 Permite agregar un nuevo snack al inventario
    private static void agregarSnack(Scanner consola, IServicioSnacks servicioSnacks) {
        System.out.print("Nombre del snack: ");
        var nombre = consola.nextLine();

        System.out.print("Precio del snack: ");
        var precio = Double.parseDouble(consola.nextLine());

        // 🔹 Agregamos el nuevo snack al servicio
        servicioSnacks.agregarSnack(new Snack(nombre, precio));

        System.out.println("Tu snack se ha agregado correctamente");

        // 🔹 Mostramos el inventario actualizado
        servicioSnacks.mostrarSnacks();
    }
}

/*
───────────────────────────────────────────────
📘 EXPLICACIÓN GENERAL DEL PROGRAMA
───────────────────────────────────────────────

Este programa simula una máquina de snacks con un menú interactivo en consola.

1. Permite:
   - Comprar snacks por su ID.
   - Mostrar un ticket con los productos comprados y el total.
   - Agregar nuevos snacks al inventario.

2. Arquitectura:
   - Presentación: MaquinaSnacks.java (interacción con usuario)
   - Dominio: Snack.java (modelo de datos)
   - Servicio: IServicioSnacks.java y ServicioSnacksLista.java (gestión del inventario)

3. Uso de listas:
   - List<Snack> productos almacena los snacks comprados.
   - ServicioSnacksLista mantiene la lista de snacks disponibles.

4. Manejo de errores:
   - Se captura cualquier excepción al leer entradas o ejecutar opciones.
   - Se imprime un mensaje amigable y el programa sigue funcionando.

5. Flujo:
   - Mostrar inventario inicial → mostrar menú → ejecutar acción → repetir hasta salir.
───────────────────────────────────────────────
*/
