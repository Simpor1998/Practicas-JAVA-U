public class MatrizSimplificada {
    public static void main(String[] args) {
        // Definimos una matriz
        var matriz = new int[][]{
                {100, 200, 300},
                {400, 500, 600}
        };
        // Recorrer una matriz
        // 1. Ciclo mas externo. Recorrer los renglones
        for (var ren = 0; ren < matriz.length; ren++) {
            // 2. Ciclo interno. Recorrer las columnas, se usa la matriz con un renglon y
            // luego calculo el tamano del renglon ---> matriz[ren].length
            for (var col = 0; col < matriz[ren].length; col++) {
                System.out.println("Valor[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }

    }
}
