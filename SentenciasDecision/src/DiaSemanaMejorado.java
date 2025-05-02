import java.util.Scanner;

public class DiaSemanaMejorado {
    public static void main(String[] args) {
        System.out.println("*** Día de la Semana con Switch ***");
        Scanner consola = new Scanner(System.in);

        System.out.print("Digite un dia: ");
        int dia = consola.nextInt();

//        var dia = 1; // Suponiendo que 1 - Lunes, 2 - Martes, etc

        //eN ESTE CASO DE SWITCH se puede decir que si no hago uso de una sub variable de almacenaje
        // si no que imprimo de una no necesitare terminar con punto y coma ;
        // ademas si necesito colocar mas de dos lineas por respuesta de los casos si debo hacer uso de {} corchetes en cualquiera de los switch
        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Día inválido: " + dia);
            //ademas si se usa el operador flecha se debe cambiar todos su dos puntos
        }
    }
}