public class FuncionSumar {
    // Definimos la funcion sumar, como regreesara un valor ya no es de tipo VOID
    // si no que se le dara un tipo como INT y finalizando se regresa el resultado con la palabra return y el tipo de dato que especifique
    static int sumar(int a, int b) {
        return a + b;

    }

    public static void main(String[] args) {
        int arg1 = 3, arg2 = 8;
        var resultado_funcion = sumar(arg1, arg2);
        System.out.println("resultado_funcion = " + resultado_funcion);
        resultado_funcion = sumar(10, 20);
        System.out.println("resultado_funcion = " + resultado_funcion);
    }
}
