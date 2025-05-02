import java.util.Scanner;

public class ValorRangoEjemplo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Valor dentro del Rango");

        final var MIN =0;
        final var MAX =5;

        //Solicito un valor
        System.out.println("Digite un valor enter 0 y 5: ");
        var valor = Integer.parseInt(teclado.nextLine());

        //Verificar si el dato esta dentreo del rango

        var estaDentro = MIN <= valor && valor <= MAX;
        System.out.println("estaDentro = " + estaDentro);
    }
}
