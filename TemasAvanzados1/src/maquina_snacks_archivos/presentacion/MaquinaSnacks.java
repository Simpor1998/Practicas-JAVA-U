package maquina_snacks_archivos.presentacion;

import maquina_snacks_archivos.dominio.Snack;
import maquina_snacks_archivos.servicio.IServicioSnacks;
import maquina_snacks_archivos.servicio.ServicioSnacksArchivos;
import maquina_snacks_archivos.servicio.ServicioSnacksLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase principal de presentación que gestiona la interfaz de usuario
 * para la máquina de snacks mediante menú interactivo en consola.
 */
public class MaquinaSnacks {

    /**
     * Punto de entrada principal del programa.
     * 
     * @param args Parámetros de línea de comandos (no utilizados en esta
     *             aplicación)
     */
    public static void main(String[] args) {
        maquinaSnacks();
    }

    /**
     * Método principal que controla el flujo de la aplicación.
     * Inicializa los componentes necesarios y ejecuta el bucle del menú.
     */
    public static void maquinaSnacks() {
        boolean salir = false;
        Scanner consola = new Scanner(System.in);

        // Instancia del servicio de snacks usando persistencia en archivos
        // Alternativa comentada: IServicioSnacks servicioSnacks = new
        // ServicioSnacksLista();
        IServicioSnacks servicioSnacks = new ServicioSnacksArchivos();

        // Lista para almacenar temporalmente los productos comprados por el usuario
        List<Snack> productos = new ArrayList<>();

        System.out.println("*** Maquina de ServicioSnacks ARCHIVO ***");

        // Muestra el inventario inicial de snacks disponibles
        servicioSnacks.mostrarSnacks();

        // Bucle principal del menú que se ejecuta hasta que el usuario elija salir
        while (!salir) {
            try {
                int opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos, servicioSnacks);
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            } finally {
                System.out.println();
            }
        }
    }

    /**
     * Muestra el menú de opciones y lee la selección del usuario.
     * 
     * @param consola Parámetro de tipo Scanner que permite leer entrada del usuario
     * @return int - Opción numérica seleccionada por el usuario
     */
    private static int mostrarMenu(Scanner consola) {
        System.out.print("""
                Menu:
                1. Comprar snack
                2. Mostrar ticket
                3. Agregar Nuevo Snack
                4. Inventario Snacks
                5. Salir
                Elige una opcion:\s""");
        return Integer.parseInt(consola.nextLine());
    }

    /**
     * Ejecuta la acción correspondiente según la opción seleccionada.
     * 
     * @param opcion         Parámetro int que representa la opción del menú
     *                       seleccionada
     * @param consola        Parámetro Scanner para leer entrada del usuario
     * @param productos      Parámetro List<Snack> que contiene los productos
     *                       comprados
     * @param servicioSnacks Parámetro IServicioSnacks que proporciona acceso al
     *                       inventario
     * @return boolean - true si el usuario eligió salir, false en caso contrario
     */
    private static boolean ejecutarOpciones(int opcion, Scanner consola,
            List<Snack> productos, IServicioSnacks servicioSnacks) {
        boolean salir = false;

        switch (opcion) {
            case 1 -> comprarSnack(consola, productos, servicioSnacks);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola, servicioSnacks);
            case 4 -> listarInventarioSnacks(consola, servicioSnacks);
            case 5 -> {
                System.out.println("Regresa pronto!");
                salir = true;
            }
            default -> System.out.println("Opcion invalida: " + opcion);
        }

        return salir;
    }

    /**
     * Muestra el inventario completo de snacks disponibles.
     * 
     * @param consola        Parámetro Scanner (no utilizado, mantenido por
     *                       consistencia)
     * @param servicioSnacks Parámetro IServicioSnacks que contiene el inventario a
     *                       mostrar
     */
    private static void listarInventarioSnacks(Scanner consola, IServicioSnacks servicioSnacks) {
        servicioSnacks.mostrarSnacks();
    }

    /**
     * Permite al usuario comprar un snack identificándolo por su ID.
     * Busca el snack en el inventario y lo agrega a la lista de productos
     * comprados.
     * 
     * @param consola        Parámetro Scanner para leer el ID ingresado por el
     *                       usuario
     * @param productos      Parámetro List<Snack> donde se agregará el snack
     *                       comprado
     * @param servicioSnacks Parámetro IServicioSnacks que contiene el inventario de
     *                       snacks
     */
    private static void comprarSnack(Scanner consola,
            List<Snack> productos, IServicioSnacks servicioSnacks) {
        System.out.print("Que snack quieres comprar (id)? ");
        int idSnack = Integer.parseInt(consola.nextLine());

        boolean snackEncontrado = false;
        for (Snack snack : servicioSnacks.getSnacks()) {
            if (idSnack == snack.getIdSnack()) {
                productos.add(snack);
                System.out.println("Ok, Snack agregado: " + snack);
                snackEncontrado = true;
                break;
            }
        }

        if (!snackEncontrado) {
            System.out.println("Id de snack no encontrado: " + idSnack);
        }
    }

    /**
     * Genera y muestra un ticket de venta con los productos comprados y el total.
     * 
     * @param productos Parámetro List<Snack> que contiene los snacks comprados
     */
    private static void mostrarTicket(List<Snack> productos) {
        String ticket = "*** Ticket de Venta ***";
        double total = 0.0;

        for (Snack producto : productos) {
            ticket += "\n\t- " + producto.getNombre() + " - $" + producto.getPrecio();
            total += producto.getPrecio();
        }

        ticket += "\n\tTotal -> $" + total;
        System.out.println(ticket);
    }

    /**
     * Permite agregar un nuevo snack al inventario.
     * Solicita nombre y precio al usuario, crea el objeto Snack y lo agrega al
     * servicio.
     * 
     * @param consola        Parámetro Scanner para leer nombre y precio ingresados
     * @param servicioSnacks Parámetro IServicioSnacks donde se agregará el nuevo
     *                       snack
     */
    private static void agregarSnack(Scanner consola, IServicioSnacks servicioSnacks) {
        System.out.print("Nombre del snack: ");
        String nombre = consola.nextLine();

        System.out.print("Precio del snack: ");
        double precio = Double.parseDouble(consola.nextLine());

        // Se crea un nuevo Snack pasando nombre y precio como argumentos al constructor
        servicioSnacks.agregarSnack(new Snack(nombre, precio));

        System.out.println("Tu snack se ha agregado correctamente");
        servicioSnacks.mostrarSnacks();
    }
}

/*
 * DOCUMENTACIÓN TÉCNICA DE LA CLASE MaquinaSnacks
 * ===============================================
 * 
 * PROPÓSITO:
 * Clase de presentación que implementa la interfaz de usuario mediante
 * un menú interactivo en consola para gestionar una máquina de snacks.
 * 
 * ARQUITECTURA:
 * Esta clase pertenece a la capa de presentación y utiliza:
 * - Capa de Dominio: Snack.java (modelo de datos)
 * - Capa de Servicio: IServicioSnacks y sus implementaciones
 * (ServicioSnacksArchivos, ServicioSnacksLista)
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. main() invoca maquinaSnacks()
 * 2. Se inicializa el servicio de snacks (persistencia en archivos)
 * 3. Se muestra el inventario inicial
 * 4. Bucle while que muestra menú y ejecuta opciones hasta salir
 * 
 * MÉTODOS PRINCIPALES:
 * - maquinaSnacks(): Controla el flujo principal de la aplicación
 * - mostrarMenu(Scanner): Presenta opciones y lee selección del usuario
 * - ejecutarOpciones(int, Scanner, List<Snack>, IServicioSnacks):
 * Ejecuta la acción correspondiente según la opción
 * - comprarSnack(Scanner, List<Snack>, IServicioSnacks):
 * Procesa la compra de un snack por ID
 * - mostrarTicket(List<Snack>): Genera y muestra el ticket de venta
 * - agregarSnack(Scanner, IServicioSnacks): Permite agregar nuevos snacks
 * 
 * MANEJO DE ERRORES:
 * El bucle principal está envuelto en try-catch para capturar excepciones
 * de formato (NumberFormatException) y otras excepciones durante la ejecución.
 * 
 * NOTA SOBRE PARÁMETROS Y ARGUMENTOS:
 * - Parámetro: Variable definida en la firma del método (ej: Scanner consola)
 * - Argumento: Valor concreto pasado al invocar el método (ej: new
 * Scanner(System.in))
 */
