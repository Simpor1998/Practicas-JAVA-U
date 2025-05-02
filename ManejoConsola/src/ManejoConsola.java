import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {
        // Crear el objeto Scanner para leer desde la consola
        Scanner scanner = new Scanner(System.in);

        // Leer una cadena de texto
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // nextLine() lee líneas completas

        // Leer un número entero
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt(); // nextInt() lee números enteros

        // Leer un número decimal
        System.out.print("Ingresa tu estatura en metros: ");
        double estatura = scanner.nextDouble(); // nextDouble() lee decimales

        // Mostrar la información recogida
        System.out.println("\nResumen:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura + " metros");

        System.out.println("""
                ⚠️ Recomendación
                Después de usar nextInt() o nextDouble(), 
                es buena práctica usar un scanner.nextLine(); 
                adicional si después vas a pedir una línea de texto, 
                porque esos métodos no consumen el salto de línea final, 
                lo que puede causar errores.
                """);

        System.out.print("Ingresa tu edad: ");
        int edad1 = scanner.nextInt();

        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.print("Ingresa tu nombre: ");
        String nombre1 = scanner.nextLine(); // Ahora sí funciona

        System.out.println("Nombre: " + nombre1 + ", Edad: " + edad1);

        // Cerrar el scanner (buena práctica)
        scanner.close();
    }
}
