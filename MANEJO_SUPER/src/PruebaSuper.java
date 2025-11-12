// Clase principal para ejecutar el programa
public class PruebaSuper {
    public static void main(String[] args) {
        // Creamos un objeto de tipo Perro
        Perro miPerro = new Perro("Firulais", "Labrador");

        System.out.println("\n--- Llamando al método sonido() ---");
        miPerro.sonido();

        System.out.println("\n--- Mostrando información del perro ---");
        miPerro.mostrarInfo();
    }
}