import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        System.out.println("*** Juego de Adivinanzas ***");
        var consola = new Scanner(System.in);
        var random = new Random();

        // Generamos un número aleatorio entre 1 y 50
        var numeroSecreto = random.nextInt(50) + 1;
        var intentos = 0;
        var adivinanza = 0;

        System.out.println("Ingrese el numero de intentos: ");
        var intentos_maximos = consola.nextInt();
//        final var INTENTOS_MAXIMOS = 5;

        while (adivinanza != numeroSecreto && intentos < intentos_maximos) {
            System.out.print("Adivina el número secreto (1-50): ");
            adivinanza = consola.nextInt();

            // Agregar una ayuda para orientar al jugador
            if (adivinanza < numeroSecreto)
                System.out.println("El número secreto es mayor");
            else if (adivinanza > numeroSecreto)
                System.out.println("El número secreto es menor");

            // Incrementamos la variable de intentos
            intentos++;
        }

        // Conclusión del juego
        if (adivinanza == numeroSecreto) {
            System.out.printf("Felicidades, " +
                    "advinaste el número secreto en %d intentos%n", intentos);
        } else {
            System.out.printf("Lo siento, has agotado tus intentos máximos: %d%n",
                    intentos_maximos);
            System.out.printf("El número secreto era: %d%n", numeroSecreto);
        }
    }
}