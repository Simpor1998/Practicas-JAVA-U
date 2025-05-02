public class NumeroInverso {
    public static void main(String[] args) {
        System.out.println("*** Ciclo do-while ***");

        var contador = 10;
        // como si usas punto inicial y final se debe usar llaves {}
        do {
            System.out.println(contador--);
        } while (contador > 0);
    }
}
