package archivos;

import java.io.File;       // Representa archivos y rutas en el sistema
import java.io.FileWriter; // Permite escribir caracteres en un archivo de texto
import java.io.PrintWriter;// Proporciona métodos para escribir líneas completas de texto

public class AgregarContenidoArchivo {
    public static void main(String[] args) {

        // 🔹 Variable para determinar si se debe anexar al archivo existente
        boolean anexar = false;

        // 🔹 Nombre del archivo a modificar
        var nombreArchivo = "mi_archivo.txt";

        // 🔹 Creamos un objeto File que representa el archivo en el sistema
        var archivo = new File(nombreArchivo);

        try {
            // 🔹 Revisamos si el archivo ya existe
            anexar = archivo.exists();

            // 🔹 Bloque try-with-resources: PrintWriter se cierra automáticamente
            // Esto evita tener que llamar a close() manualmente
            try (PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar))) {

                // 🔹 Contenido a agregar
                var nuevoContenido = "Nuevo \ncontenido";

                // 🔹 Escribimos el contenido en el archivo
                salida.println(nuevoContenido);

                // 🔹 Mensaje indicando que se agregó contenido
                System.out.println("✅ Se agregó contenido al archivo...");

            } // 🔹 PrintWriter se cierra automáticamente al salir del bloque

        } catch (Exception e) {
            // 🔹 Captura cualquier error al escribir en el archivo
            System.out.println("❌ Error al escribir en el archivo: " + e.getMessage());

            // 🔹 Imprime detalle técnico completo del error
            e.printStackTrace();
        }
    }
}

/*
───────────────────────────────────────────────
📘 EXPLICACIÓN TÉCNICA DEL PROGRAMA
───────────────────────────────────────────────

1. File archivo:
   - Representa la ruta del archivo en el sistema.
   - No abre ni modifica el archivo automáticamente, solo lo referencia.

2. FileWriter:
   - Permite escribir texto en el archivo.
   - El segundo parámetro indica si se debe anexar (true) o sobrescribir (false).

3. PrintWriter:
   - Envuelve FileWriter para ofrecer métodos más fáciles de usar, como println().
   - Con try-with-resources, se cierra automáticamente al terminar el bloque.

4. archivo.exists():
   - Verifica si el archivo ya existe en el sistema.

5. salida.println(nuevoContenido):
   - Escribe el contenido en el archivo seguido de un salto de línea.

6. try-with-resources:
   - Garantiza que PrintWriter se cierre correctamente, incluso si ocurre un error.
   - Mejora la seguridad y evita fugas de recursos.

7. catch (Exception e):
   - Captura cualquier error de escritura (archivo inexistente, permisos, etc.).
   - e.getMessage() muestra un resumen del error.
   - e.printStackTrace() da detalle técnico completo para depuración.

───────────────────────────────────────────────
💡 Resumen:
───────────────────────────────────────────────
Este programa agrega nuevo contenido a un archivo existente o lo crea si no existe.
Usa try-with-resources para cerrar automáticamente el flujo de escritura y PrintWriter para escribir líneas completas de manera sencilla y segura.
───────────────────────────────────────────────
*/
