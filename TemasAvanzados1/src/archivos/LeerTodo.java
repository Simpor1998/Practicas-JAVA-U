package archivos;

import java.nio.file.Files;  // Permite trabajar con archivos y directorios de manera sencilla
import java.nio.file.Paths;  // Permite representar rutas de archivos en el sistema
import java.util.List;        // Permite manejar listas, aquí se usa para guardar todas las líneas del archivo

public class LeerTodo {
    public static void main(String[] args) {

        // 🔹 Nombre del archivo a leer
        var nombreArchivo = "mi_archivo.txt";

        try {
            // 🔹 Leemos todas las líneas del archivo en una sola vez y las guardamos en una lista
            // Files.readAllLines devuelve List<String> con todas las líneas del archivo
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));

            System.out.println("📄 Contenido del Archivo:");

            // 🔹 Imprimimos todas las líneas usando una expresión lambda
            // lineas.forEach(System.out::println) es equivalente a recorrer la lista con un for
            lineas.forEach(System.out::println);

        } catch (Exception e) {
            // 🔹 Captura cualquier excepción (archivo no encontrado, permisos, etc.)
            System.out.println("❌ Error al leer archivo: " + e.getMessage());

            // 🔹 Imprime detalle técnico completo del error, útil para depuración
            e.printStackTrace();
        }
    }
}

/*
───────────────────────────────────────────────
📘 EXPLICACIÓN TÉCNICA DEL PROGRAMA
───────────────────────────────────────────────

1. import Files y Paths:
   - Files: ofrece métodos estáticos para manipular archivos, como leerlos completos.
   - Paths: permite crear un objeto que representa la ruta del archivo en el sistema.

2. import List:
   - Representa una lista de elementos. Aquí se usa para almacenar todas las líneas del archivo.

3. var nombreArchivo:
   - Contiene la ruta/nombre del archivo a leer.

4. Files.readAllLines(Paths.get(nombreArchivo)):
   - Lee todo el contenido del archivo y lo devuelve como una lista de cadenas (List<String>), donde cada elemento es una línea.

5. lineas.forEach(System.out::println):
   - Recorre cada línea de la lista e imprime su contenido.
   - System.out::println es un método de referencia que reemplaza un bucle for tradicional.

6. try-catch:
   - Captura errores al intentar leer el archivo.
   - e.getMessage() muestra un mensaje resumido del error.
   - e.printStackTrace() muestra detalle completo del error, útil para depuración.

───────────────────────────────────────────────
💡 Resumen:
───────────────────────────────────────────────
Este programa lee un archivo completo en memoria y lo imprime en consola línea por línea.
Es más compacto y moderno que usar BufferedReader y es útil para archivos de tamaño moderado.
───────────────────────────────────────────────
*/
