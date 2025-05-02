public class VariablesEjemplos {
    public static void main(String[] args) {

        // VARIABLES PRIMITIVAS

        // Entero (números sin decimales)
        int edad = 25;

        // Número decimal (flotante)
        double salario = 1050000.50;

        // Carácter (una sola letra o símbolo una sola comilla)
        char inicial = 'G';

        // Booleano (verdadero o falso)
        boolean esEstudiante = true;

        // Número pequeño (más eficiente si no necesitas un rango grande)
        byte cantidadCursos = 5;

        // Número largo (para valores muy grandes)
        long poblacionMundial = 8000000000L;

        // Número flotante de 32 bits (requiere 'f' al final)
        float temperatura = 36.5f;

        // VARIABLES DE TIPO REFERENCIA (NO PRIMITIVOS)

        // String (cadena de texto doble comillas)
        String nombre = "Guillermo";

        // Mostramos los valores por consola
        System.out.println("Nombre: " + nombre);
        System.out.println("Inicial: " + inicial);
        System.out.println("Edad: " + edad);
        System.out.println("¿Es estudiante?: " + esEstudiante);
        System.out.println("Salario: " + salario);
        System.out.println("Cantidad de cursos: " + cantidadCursos);
        System.out.println("Población mundial: " + poblacionMundial);
        System.out.println("Temperatura corporal: " + temperatura);
    }
}
