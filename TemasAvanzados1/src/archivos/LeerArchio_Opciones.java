package archivos;

import java.io.BufferedReader; // Permite leer texto de manera eficiente línea por línea
import java.io.File;           // Representa archivos y rutas en el sistema operativo
import java.io.FileReader;     // Abre archivos de texto para lectura
import java.io.IOException;    // Maneja errores de entrada/salida
import java.util.Scanner;      // Permite leer la entrada del usuario desde consola

public class LeerArchio_Opciones {

    public static void main(String[] args) {

        // 🔹 Nombre del archivo a leer
        var nombreArchivo = "mi_archivo.txt";

        // 🔹 Creamos un objeto File que representa el archivo en el sistema
        // Este objeto no abre ni crea el archivo, solo apunta a él
        var archivo = new File(nombreArchivo);

        // 🔹 Scanner para leer la opción del usuario y controlar pausas
        Scanner sc = new Scanner(System.in);

        // 🔹 Preguntamos al usuario cómo quiere leer el archivo
        System.out.println("¿Cómo quieres leer el archivo?");
        System.out.println("1 - Línea por línea");
        System.out.println("2 - Todo el archivo de una vez");
        System.out.print("Ingresa opción (1 o 2): ");
        int opcion = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente

        // 🔹 Bloque try-with-resources: asegura que BufferedReader se cierre automáticamente
        try (BufferedReader entrada = new BufferedReader(new FileReader(archivo))) {

            if (opcion == 1) {
                // 🔹 Lectura línea por línea según el usuario presione ENTER
                System.out.println("\n📄 Lectura línea por línea. Presiona ENTER para la siguiente línea...");
                String linea;
                int numeroLinea = 1;

                while ((linea = entrada.readLine()) != null) {
                    System.out.println("Línea " + numeroLinea + ": " + linea);
                    numeroLinea++;

                    // Espera que el usuario presione ENTER para continuar
                    sc.nextLine();
                }

                System.out.println("✅ Fin del archivo.");

            } else if (opcion == 2) {
                // 🔹 Lectura de todo el archivo de una sola vez
                System.out.println("\n📄 Contenido completo del archivo:");
                StringBuilder contenido = new StringBuilder();
                String linea;

                while ((linea = entrada.readLine()) != null) {
                    contenido.append(linea).append("\n"); // Agrega cada línea + salto de línea
                }

                // 🔹 Imprime todo el contenido de golpe
                System.out.println(contenido);

            } else {
                System.out.println("❌ Opción inválida. Ejecuta de nuevo y elige 1 o 2.");
            }

        } catch (IOException e) {
            // 🔹 Captura cualquier error de lectura del archivo
            System.out.println("❌ Error al leer el archivo: " + e.getMessage());
            e.printStackTrace(); // Muestra detalle técnico del error
        }
    }
}

/*
───────────────────────────────────────────────
📘 EXPLICACIÓN TÉCNICA DEL PROGRAMA
───────────────────────────────────────────────

1. import:
   - BufferedReader: permite leer texto de manera eficiente.
   - File: representa rutas y archivos del sistema operativo.
   - FileReader: abre archivos de texto para lectura.
   - IOException: maneja errores de entrada/salida.
   - Scanner: permite leer entradas del usuario desde consola.

2. File archivo:
   - Representa la ruta del archivo.
   - No abre ni modifica el archivo, solo lo referencia.

3. Scanner sc:
   - Permite leer la opción del usuario y controlar pausas en la lectura línea por línea.

4. try-with-resources:
   - Cierra automáticamente BufferedReader al salir del bloque, incluso si ocurre un error.
   - Evita fugas de recursos.

5. Opción 1 - Línea por línea:
   - readLine() devuelve una línea del archivo o null si se llega al final.
   - Se espera que el usuario presione ENTER para continuar.

6. Opción 2 - Todo el archivo:
   - Se almacenan todas las líneas en un StringBuilder.
   - Se imprime todo el contenido de una vez.

7. catch (IOException e):
   - Captura errores de lectura (archivo no encontrado, permisos, etc.).
   - Imprime mensaje amigable y detalle técnico.

───────────────────────────────────────────────
💡 Resumen:
───────────────────────────────────────────────
Este programa permite al usuario elegir entre leer un archivo línea por línea o leerlo todo de una sola vez.
Usa try-with-resources para manejar automáticamente el cierre del archivo y captura posibles errores de E/S.
───────────────────────────────────────────────
*/

