import java.util.Scanner;

public class FuncionPar {
    // Funcion para saber si un numero es par
    static boolean esPar(int numero) {
//       ------------Condicional largo-----------------
//        if(numero % 2 == 0)
//            return true;
//        else
//            return false;

//  ----------En este caso retorno directamente el valor ya que uso solo una linea con el operador ternario----
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.print("Proporciona un valor numérico: ");
//        Se resume el escaner para solicitar informacion al usuario
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Número par? " + esPar(numero));
    }
}