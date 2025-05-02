public class MetodosCadena {
    public static void main(String[] args) {
        String texto = "  Inteligencia Artificial  ";

        // length(): obtiene la longitud de la cadena
        System.out.println("Longitud: " + texto.length());

        // toUpperCase(): convierte todo a mayúsculas
        System.out.println("Mayúsculas: " + texto.toUpperCase());

        // toLowerCase(): convierte todo a minúsculas
        System.out.println("Minúsculas: " + texto.toLowerCase());

        // strip(): elimina espacios al inicio y al final
        System.out.println("Texto sin espacios: '" + texto.strip() + "'");

        // charAt(int index): devuelve el carácter en la posición dada
        System.out.println("Carácter en posición 5: " + texto.charAt(5));

        // substring(icio, fin): extrae subcadenas
        System.out.println("Subcadena (13 a 24): " + texto.substring(13, 24)); // "Artificial"

        // contains(): verifica si contiene una subcadena
        System.out.println("¿Contiene 'IA'? " + texto.contains("IA")); // false

        // startsWith() y endsWith(): verifica cómo inicia y termina
        System.out.println("¿Empieza con 'Int'? " + texto.trim().startsWith("Int"));
        System.out.println("¿Termina con 'ial'? " + texto.trim().endsWith("ial"));

        // indexOf(): devuelve la posición de un carácter o texto de la primera aparicion,
        // Para encontrar la ultima aparicion de un  caracter o texto subcadena se usa lastIndexOf()
        //s si no se encuentra ninguna similitud devuelve el valor de 1
        System.out.println("Posición de 'g': " + texto.indexOf("g"));

        // replace(): reemplaza caracteres o palabras
        String reemplazada = texto.replace("Artificial", "Humana");
        System.out.println("Reemplazo: " + reemplazada.trim());

        // isEmpty(): verifica si está vacía
        String vacia = "";
        System.out.println("¿Texto vacío? " + vacia.isEmpty());

        // equals() y equalsIgnoreCase(): compara contenido
        String otro = "inteligencia artificial";
        System.out.println("¿Iguales (sensible)? " + texto.trim().equals(otro));
        System.out.println("¿Iguales (ignorando mayúsculas)? " + texto.trim().equalsIgnoreCase(otro));
    }
}
