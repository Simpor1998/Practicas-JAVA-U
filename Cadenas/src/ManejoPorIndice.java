public class ManejoPorIndice {
    public static void main(String[] args) {
        String texto = "Java";

        // Acceder a cada carácter por índice con el charAt
        char primeraLetra = texto.charAt(0); // J
        char segundaLetra = texto.charAt(1); // a

        System.out.println("Primera letra: " + primeraLetra);
        System.out.println("Segunda letra: " + segundaLetra);

        String frase = "Inteligencia Artificial";

        // Substring desde el índice 0 al 12 (excluye el 12)
        String sub1 = frase.substring(0, 12); // "Inteligencia"

        // Substring desde el índice 13 hasta el final
        String sub2 = frase.substring(13);    // "Artificial"

        System.out.println("Subcadena 1: " + sub1);
        System.out.println("Subcadena 2: " + sub2);

        String texto1 = "c1b3rs3guridad";

        // Reemplazar todos los números por letras
        String nuevoTexto = texto1.replace('1', 'i')
                .replace('3', 'e');

        System.out.println("Texto original: " + texto1);
        System.out.println("Texto corregido: " + nuevoTexto);
    }
}
