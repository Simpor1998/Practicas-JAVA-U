public class ConcatenacionCadenas {
    public static void main(String[] args) {
        // Forma 1: Usando el operador +
        String nombre = "Guillermo";
        String apellido = "Hernández";
        String completo1 = nombre + " " + apellido;
        System.out.println("Concatenación con +: " + completo1);

        // Forma 2: Usando el método concat()
        String completo2 = nombre.concat(" ").concat(apellido);
        System.out.println("Concatenación con concat(): " + completo2);

        // Forma 3: Usando StringBuilder (más eficiente si hay muchas concatenaciones)
        StringBuilder sb = new StringBuilder();
        sb.append("Hola, ");
        sb.append(nombre);
        sb.append(" ");
        sb.append(apellido);
        sb.append("!");
        System.out.println("Concatenación con StringBuilder: " + sb.toString());

        // Forma 4: Usando String.format()
        String completo4 = String.format("Bienvenido %s %s", nombre, apellido);
        System.out.println("Concatenación con format(): " + completo4);

        // Forma 5: Usando printf (para impresión directa formateada) con el %s llamo la variable y con %n doy salto de linea
        System.out.print("Concatenación con printf(): ");
        System.out.printf("Tu nombre completo es: %s %s%n", nombre, apellido);

        // Forma 6: Usando StringBuffer, lo uedo mandar a llamar de manera encadenada seguido por el punto
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Hola, ").append(nombre).append(" ").append(apellido);
        String resultado = sb2.toString();
        System.out.println("resultado string buffer = " + resultado);

        // Forma 7:
        String resultado2 = String.join(" ",nombre,apellido);
        System.out.println("resultado2 por join = " + resultado2);
    }
}
