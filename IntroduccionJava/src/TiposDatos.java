public class TiposDatos {
    public static void main(String[] args) {
        //Parte 1
        //ENTEROS
        // BYTE: 8 bits → rango de -128 a 127
        byte edad = 25;

        // SHORT: 16 bits → rango de -32,768 a 32,767
        short alturaEnCm = 170;

        // INT: 32 bits → rango de -2^31 a 2^31-1
        int poblacionCiudad = 1200000;

        // LONG: 64 bits → rango de -2^63 a 2^63-1
        long poblacionMundial = 8000000000L;  // se debe usar la 'L' al final

        // Mostrar los valores
        System.out.println("Edad (byte): " + edad);
        System.out.println("Altura (short): " + alturaEnCm + " cm");
        System.out.println("Población de la ciudad (int): " + poblacionCiudad);
        System.out.println("Población mundial (long): " + poblacionMundial);

        // Operaciones entre ellos (se promueven al tipo más grande)
        long sumaPoblaciones = poblacionCiudad + poblacionMundial;
        System.out.println("Suma total de poblaciones: " + sumaPoblaciones);

        // PUNTO FLOTANTE--------------------------------------------

        // FLOAT: 32 bits, precisión de aproximadamente 7 cifras decimales
        float temperatura = 36.6f;  // ¡IMPORTANTE! se debe usar la 'f' al final

        // DOUBLE: 64 bits, precisión de aproximadamente 15 cifras decimales
        double pi = 3.141592653589793;
        double salario = 1050000.75;

        // Mostrar los valores
        System.out.println("Temperatura corporal (float): " + temperatura);
        System.out.println("Valor de PI (double): " + pi);
        System.out.println("Salario mensual (double): " + salario);

        // Operaciones con decimales
        double suma = temperatura + pi;
        double multiplicacion = salario * 1.10; // aumento del 10%
        double division = pi / 2;

        System.out.println("Temperatura + PI: " + suma);
        System.out.println("Salario con aumento del 10%: " + multiplicacion);
        System.out.println("PI dividido entre 2: " + division);

        // PARTE 2

        // Declaración de caracteres individuales
        char letra = 'A';               // Letra mayúscula
        char numeroComoChar = '7';     // Aunque parece un número, es un carácter
        char simbolo = '$';            // Un símbolo
        char espacio = ' ';            // Espacio en blanco
        char saltoLinea = '\n';        // Carácter especial: salto de línea
        char unicodeChar = '\u00A9';   // Código Unicode para el símbolo ©

        // Imprimir los caracteres
        System.out.println("Letra: " + letra);
        System.out.println("Número como carácter: " + numeroComoChar);
        System.out.println("Símbolo: " + simbolo);
        System.out.println("Espacio: [" + espacio + "]");
        System.out.println("Salto de línea (no visible):" + saltoLinea + "Después del salto");
        System.out.println("Carácter Unicode (©): " + unicodeChar);

        // Operaciones con caracteres
        char siguienteLetra = (char)(letra + 1);  // 'A' + 1 = 'B'
        System.out.println("Letra siguiente a '" + letra + "': " + siguienteLetra);

        // Declaración de variables booleanas
        boolean esMayorDeEdad = true;
        boolean tienePermiso = false;

        // Mostrar valores
        System.out.println("¿Es mayor de edad?: " + esMayorDeEdad);
        System.out.println("¿Tiene permiso?: " + tienePermiso);

        // Uso en una condición
        if (esMayorDeEdad && tienePermiso) {
            System.out.println("Puede ingresar al evento.");
        } else {
            System.out.println("No puede ingresar al evento.");
        }

        // Evaluar una expresión lógica
        int edad1 = 17;
        boolean puedeVotar = edad >= 18;

        System.out.println("Edad: " + edad1);
        System.out.println("¿Puede votar?: " + puedeVotar);
    }
}
