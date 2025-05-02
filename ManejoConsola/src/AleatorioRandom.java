import java.util.Random;

public class AleatorioRandom {
    public static void main(String[] args) {
        Random rand = new Random();

        // Entero entre 0 y 99
        int numero = rand.nextInt(100); // 0 - 99
        System.out.println("Entero entre 0 y 99: " + numero);

        // Entero entre 50 y 100
        int entre50y100 = rand.nextInt(51) + 50; // 0–50 + 50 = 50–100
        System.out.println("Entero entre 50 y 100: " + entre50y100);

        // Número decimal entre 0.0 y 1.0
        double decimal = rand.nextDouble();
        System.out.println("Decimal aleatorio: " + decimal);

        //Un dado de 6 caras
        var dado = rand.nextInt(6)+1;
        System.out.println("Dado aleatorio: " + dado);
    }
}
