public class ComparacionCadenas {
    public static void main(String[] args) {
        // 🔵 Cadenas creadas como literales: van al String Pool
        String texto1 = "Java";
        String texto2 = "Java";

        // 🔴 Cadenas creadas con new: se crea un nuevo objeto en memoria
        String texto3 = new String("Java");

        // ✅ Comparación con == (compara referencias de memoria)
        System.out.println("texto1 == texto2: " + (texto1 == texto2));  // true, misma referencia en el pool
        System.out.println("texto1 == texto3: " + (texto1 == texto3));  // false, texto3 es nuevo objeto

        // ✅ Comparación con equals() (compara contenido de texto)
        System.out.println("texto1.equals(texto3): " + texto1.equals(texto3));  // true, el contenido es igual

        // ✅ Intern() fuerza que una cadena creada con new apunte al pool
        String texto4 = texto3.intern(); // Fuerza que se use el mismo objeto del pool

        System.out.println("texto1 == texto4: " + (texto1 == texto4));  // true, ahora comparten referencia
    }
}

