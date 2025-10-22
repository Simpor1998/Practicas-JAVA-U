package archivos;

import java.io.File;          // Clase para representar archivos o directorios en el sistema
import java.io.FileWriter;    // Permite escribir caracteres en un archivo
import java.io.IOException;   // Excepción para manejar errores de entrada/salida
import java.io.PrintWriter;   // Facilita la escritura de texto en formato legible (println, printf, etc.)

public class CrearArchivo {
    public static void main(String[] args) {

        // 🔹 Nombre del archivo que deseamos crear (se guarda en la carpeta del proyecto)
        var nombreArchivo = "mi_archivo.txt";

        // 🔹 Creamos un objeto File que representa la ruta del archivo en el sistema operativo
        // Este objeto no crea el archivo, solo lo "apunta" o referencia
        var archivo = new File(nombreArchivo);

        // 🔹 Manejo de posibles errores con try-catch
        // Esto es necesario porque trabajar con archivos puede generar excepciones (errores de E/S)
        try {
            // 🔹 Verificamos si el archivo ya existe usando el método exists()
            if (archivo.exists()) {
                System.out.println("⚠️ El archivo ya existe!");
            } else {
                // 🔹 try-with-resources: estructura moderna de Java que cierra automáticamente los recursos
                // Evita tener que usar salida.close() manualmente
                try (PrintWriter salida = new PrintWriter(new FileWriter(archivo))) {
                    // Dentro de este bloque ya podemos escribir en el archivo
                    salida.println("Archivo creado exitosamente."); // Escribe texto dentro del archivo
                    // Cuando termina el bloque, el recurso (archivo) se guarda y se cierra automáticamente
                }

                // Mostramos la ruta absoluta del archivo creado
                System.out.println("✅ Archivo creado correctamente en: " + archivo.getAbsolutePath());
            }

            // 🔹 Captura de errores de entrada/salida
        } catch (IOException e) {
            System.out.println("❌ Error al crear el archivo: " + e.getMessage());
            e.printStackTrace(); // Muestra el error técnico detallado
        }
    }
}

/*
───────────────────────────────────────────────
📘 EXPLICACIÓN TÉCNICA DEL PROGRAMA
───────────────────────────────────────────────

1. File:
   - Representa un archivo o carpeta en disco.
   - Por sí solo NO crea el archivo, solo lo referencia.
   - Se usa para verificar existencia o ubicación con métodos como exists(), getName(), getAbsolutePath().

2. FileWriter:
   - Se encarga de crear físicamente el archivo y permitir escribir caracteres en él.
   - Si el archivo no existe, lo crea automáticamente.

3. PrintWriter:
   - Facilita la escritura con métodos como print(), println() o printf().
   - En este caso se combina con FileWriter para escribir texto en el archivo.

4. try-with-resources:
   - Cierra automáticamente el flujo al salir del bloque.
   - Evita fugas de memoria o errores por archivos sin cerrar.

5. exists():
   - Permite comprobar si el archivo ya existe antes de crearlo, para no sobrescribirlo accidentalmente.

───────────────────────────────────────────────
💡 En resumen:
───────────────────────────────────────────────
Este programa crea un archivo de texto llamado "mi_archivo.txt" en el directorio actual.
Si el archivo ya existe, muestra un aviso; si no, lo crea e imprime su ruta absoluta.
───────────────────────────────────────────────
*/
