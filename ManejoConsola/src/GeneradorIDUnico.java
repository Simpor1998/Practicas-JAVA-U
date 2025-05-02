import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnico {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);
        System.out.println("***Generado de ID Unico***");

        int id = rand.nextInt(9999) + 1;
        //Lecuta de dato
        System.out.println("Ingrese un Nombre de Usuario: ");
        var nombre = entrada.nextLine();
        System.out.println("Ingrese un Apellido del usuario: ");
        var apellido = entrada.nextLine();
        System.out.println("Ingrese Ano de nacimiento usuario: ");
        var ano = entrada.nextLine();

        //Normalizo y formateo cadenas
        var normalnom = nombre.strip().toUpperCase().substring(0,2);
        var normalapellido = apellido.strip().toUpperCase().substring(0,2);
        var normalano = ano.strip().toUpperCase().substring(2,4);

        //Imprimo valores
        var informacion = """
                +------------------------------+
                | ID NOMBRE:  %s               |
                | ID APELLIDO:  %s     |
                | ID ANO:    %s            |
                | ID RANDOM:    %04d           |
                | ID UNICO:    %s%s%s%04d          |
                +------------------------------+
                """;
        System.out.println(informacion.formatted(normalnom,normalapellido,normalano,id,normalnom,normalapellido,normalano,id));


    }
}
