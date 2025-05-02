public class ConcatenacionCadenas {
    public static void main(String[] args) {
        String nombre = "Guillermo";
        String apellido = "Hernández";

        // Concatenación básica
        String nombreCompleto = nombre + " " + apellido;

        System.out.println("Nombre completo: " + nombreCompleto);

        String saludo = "Hola ";
        nombre = "Guillermo";

        String mensaje = saludo.concat(nombre);
        System.out.println("Mensaje: " + mensaje);

        StringBuilder sb = new StringBuilder();

        sb.append("Hola ");
        sb.append("Guillermo ");
        sb.append("desde Java");

        String resultado = sb.toString();
        System.out.println("Resultado: " + resultado);

        nombre = "Guillermo";
        int edad = 25;

        mensaje = String.format("Mi nombre es %s y tengo %d años.", nombre, edad);
        System.out.println(mensaje);
    }
}
