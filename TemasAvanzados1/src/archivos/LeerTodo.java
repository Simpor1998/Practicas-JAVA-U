package archivos;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";
        try {
            // Leer todas las lineas de archivo
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            System.out.println("Contenido del Archivo: ");
//            for(String linea: lineas){
//                System.out.println(linea);
//            }
            //con la expresion lambda podemos expresar mejor la impresion
            //usamos el metodo foreach de la lista y leugo el metodo de referencia para imprimir todas
            lineas.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
            // si queremos mandar a llamar todo el detalle mandamos a llamar el metodo  printStackTrace
            e.printStackTrace();
        }
    }
}