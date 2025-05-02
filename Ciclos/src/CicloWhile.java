public class CicloWhile {
    public static void main(String[] args) {
        System.out.println("*** Ciclo while ***");

        var contador = 1;
        //Si solo uso una linea no es necesario el uso de llaves
        while (contador <= 5)
            System.out.println(contador++);
    }
}