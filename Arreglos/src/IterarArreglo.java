public class IterarArreglo {
    public static void main(String[] args) {

        // Arreglos
        var enteros = new int[]{100, 200, 300, 400, 500};
        // Iterar los elementos de arreglo, por numero con metodo length
        for (var i = 0; i < enteros.length; i++)
            System.out.println("Valor del indice: " + i + " = " + enteros[i]);
    }
}
