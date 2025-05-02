public class Constantes {
    public static void main(String[] args) {

        // Definir una constante
        final double PI = 3.14159;
        final int MAX_EDAD = 100;

        // Intentar modificar una constante (esto dará error)
        // PI = 3.14;  // Error: cannot assign a value to final variable 'PI'

        // Mostrar el valor de las constantes
        System.out.println("Valor de PI: " + PI);
        System.out.println("Edad máxima: " + MAX_EDAD);

        // Usar constantes en cálculos
        double circunferencia = 2 * PI * 5;  // radio = 5
        System.out.println("Circunferencia de un círculo de radio 5: " + circunferencia);
    }
}
