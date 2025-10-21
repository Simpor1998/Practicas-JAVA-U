public class Main {
    public static void main(String[] args) {
        // Creamos un objeto tipo Perro (clase concreta)
        Perro miPerro = new Perro("Rocky");

        miPerro.respirar(); // Método heredado de la clase abstracta
        miPerro.comer();    // Método de la interfaz
        miPerro.dormir();   // Método de la interfaz
        miPerro.sonido();   // Método abstracto implementado
    }
}
