import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        System.out.println("***Recetas de Cocina***");
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del receta: ");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese los ingredientes: ");
        String ingredientes = entrada.nextLine();

        System.out.println("Ingrese el tiempo de preparacion: ");
//       int tiempo = entrada.nextInt();
//
//        entrada.nextLine(); // Consumir el salto de línea pendiente
//        para no hacer el salto de linea ahi puedo manejar el Integer.ParseInt(entrada.nextLine())
        int tiempo = Integer.parseInt(entrada.nextLine());

        System.out.println("Ingrese la dificultad ");
        String dificultad = entrada.nextLine();

        System.out.println("---Receta de Cocina---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ingrediente: " + ingredientes);
        System.out.println("Tiempo de preparacion: " + tiempo);
        System.out.println("Dificultad: " + dificultad);

    }
}
