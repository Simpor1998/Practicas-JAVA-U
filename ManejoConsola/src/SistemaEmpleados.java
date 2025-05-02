import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("***Sistema de Empleados***");

        //Leer datos del usuario
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido del empleado: ");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese el edad del empleado: ");
        int edad = entrada.nextInt();
        System.out.println("Ingrese el salario del empleado: ");
        double salario = entrada.nextDouble();

        entrada.nextLine();
        // Consumir el salto de línea pendiente porque paso de trabajar de numero a string

        // cuando uso este metodo puedo usar el punto por decimal,
        // pero al usar el otro metodo solo me acepta la coma , para el decimal
        System.out.println("Ingrese el salario1 del empleado: ");
        String texSalario1 = entrada.nextLine();
        var salario1 = Double.parseDouble(texSalario1);


        System.out.println("Ingrese si es jefe del departamento true\\false: ");
        boolean esJefe = entrada.nextBoolean();

        //iMPRIMIR DATOS, paras mejor manejo de salto de linea usar %n
        // y el %s es para llamar el objeto de la variable
        System.out.printf("Nombre completo: %s %s%n ", nombre, apellido);
        System.out.printf("Edad completo: %s%n ", edad);
        System.out.printf("Salario completo: %.2f%n ", salario);
        System.out.printf("Salario completo: %.2f%n ", salario1);
        System.out.println("esJefe = " + esJefe);
    }
}
