public class Funciones {

//    Va a recibir un parametro de tipo string llamado mensaje
    static void saludar(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }

    public static void main(String[] args) {
//        se llama la funcion las veces que sea y se le da un argumento cuando se llama
        saludar("Hola desde Java");
        saludar("Adios");
    }
}