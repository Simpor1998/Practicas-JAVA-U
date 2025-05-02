import java.util.Scanner;

public class ConversiondeTipos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer un entero desde consola usando nextLine()
        System.out.print("Ingresa tu edad: ");
        String edadTexto = scanner.nextLine(); // Recibe un String
        int edad = Integer.parseInt(edadTexto); // Se convierte a int

        // Leer un número decimal usando nextLine()
        System.out.print("Ingresa tu estatura: ");
        String estaturaTexto = scanner.nextLine();
        double estatura = Double.parseDouble(estaturaTexto); // Conversión a double

        System.out.print("Ingresa un valor float: ");
        String flotantetexto = scanner.nextLine();
        var flotante = Float.parseFloat(flotantetexto); // Conversión a double

        // Leer un valor booleano
        System.out.print("¿Estás activo? (true/false): ");
        String activoTexto = scanner.nextLine();
        boolean activo = Boolean.parseBoolean(activoTexto); // Conversión a boolean

        System.out.println("\nResultado:");
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("Activo: " + activo);

        scanner.close();
    }
}
