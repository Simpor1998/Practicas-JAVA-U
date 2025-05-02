package aritmetica.prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmetica ***");

        var aritmetica1 = new Aritmetica(5, 7);
        aritmetica1.sumar();
        aritmetica1.restar();
        //llamare el operando 1 con el methods get  y luego lo modifico con el set
        System.out.println("Atributo opeerando1: " + aritmetica1.getOperando1());
        aritmetica1.setOperando1(2);
        aritmetica1.setOperando2(3);

        aritmetica1.sumar();
        aritmetica1.restar();

        // constructor vacio
        System.out.println();

        // Creamos un segundo objeto
        var aritmetica2 = new Aritmetica(12, 16);
        aritmetica2.sumar();
    }
}
