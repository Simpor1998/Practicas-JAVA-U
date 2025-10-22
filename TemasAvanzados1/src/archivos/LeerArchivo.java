package archivos;

import java.io.BufferedReader; // Permite leer texto de manera eficiente
import java.io.File;           // Representa archivos y rutas en el sistema
import java.io.FileReader;     // Abre archivos de texto para lectura
import java.io.IOException;    // Maneja errores de entrada/salida

public class LeerArchivo {
    public static void main(String[] args) {

        // 🔹 Nombre del archivo a leer
        var nombreArchivo = "mi_archivo.txt";

        // 🔹 Creamos un objeto File que representa el archivo en el sistema
        // Este objeto no abre ni crea el archivo, solo apunta a él
        var archivo = new File(nombreArchivo);

        // 🔹 Bloque try-with-resources: asegura que BufferedReader se cierre automáticamente
        try (BufferedReader entrada = new BufferedReader(new FileReader(archivo))) {

            System.out.println("📄 Contenido del archivo:");

            // 🔹 Variable para almacenar cada línea leída
            String linea;

            // 🔹 Leemos línea por línea hasta que readLine() devuelva null
            // null indica que se alcanzó el final del archivo
            while ((linea = entrada.readLine()) != null) {
                System.out.println(linea); // Mostramos la línea leída
            }

            // 🔹 No es necesario cerrar BufferedReader manualmente porque try-with-resources lo hace automáticamente

        } catch (IOException e) {
            // 🔹 Captura cualquier error de entrada/salida
            // Por ejemplo: archivo no encontrado, problema de permisos, etc.
            System.out.println("❌ Error al leer el archivo: " + e.getMessage());
            e.printStackTrace(); // Muestra el detalle técnico del error (opcional pero útil para depuración)
        }
    }
}

/*
───────────────────────────────────────────────
📘 EXPLICACIÓN TÉCNICA DEL PROGRAMA
───────────────────────────────────────────────

1. File archivo:
   - Representa la ruta del archivo en el sistema operativo.
   - No abre ni modifica el archivo, solo lo referencia.

2. FileReader:
   - Abre el archivo para lectura de caracteres (texto).
   - Lanza IOException si hay un error al abrir el archivo.

3. BufferedReader:
   - Envuelve FileReader para permitir leer texto línea por línea de manera eficiente.
   - Reduce llamadas directas al disco, mejorando el rendimiento.

4. try-with-resources:
   - Cierra automáticamente BufferedReader al salir del bloque, incluso si ocurre una excepción.
   - Evita errores y fugas de recursos.

5. readLine():
   - Lee una línea completa del archivo.
   - Devuelve null cuando se alcanza el final del archivo.

6. catch (IOException e):
   - Captura cualquier error de lectura de archivo.
   - Imprime un mensaje amigable y el detalle técnico con e.printStackTrace().

───────────────────────────────────────────────
💡 Resumen:
───────────────────────────────────────────────
Este programa abre un archivo de texto, lee su contenido línea por línea y lo imprime por consola.
Usa try-with-resources para manejar el cierre automático del archivo y captura posibles errores de E/S.
───────────────────────────────────────────────
*/
