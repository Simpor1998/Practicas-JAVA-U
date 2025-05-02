public class FuncionRecursiva {
    // Imprimir 1 al 5 usando una funcion recursiva
    // Funcion recursiva
    // No va a regresar ningun tipo de informacion, solo estara imprimiendom un valor
    // el valor que estaremos llamando de manera recursiva
    static void funcionRecursiva(int numero) {
        // Caso Base
        if (numero == 1)
            System.out.print(numero + " ");
        else {
            // Caso recursivo
            funcionRecursiva(numero - 1);
            System.out.print(numero + " ");
        }
    }

    public static void main(String[] args) {
        funcionRecursiva(10);
    }
}