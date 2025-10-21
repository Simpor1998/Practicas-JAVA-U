// 2) Clase abstracta: puede implementar parte del contrato y añadir cosas
// Esta clase no puede instanciarse directamente
public abstract class Mamifero implements Animal {
    protected String nombre;

    // Constructor
    public Mamifero(String nombre) {
        this.nombre = nombre;
    }

    // Método común para todos los mamíferos
    public void respirar() {
        System.out.println(nombre + " está respirando.");
    }

    // Método abstracto: las subclases deben implementarlo
    public abstract void sonido();
}
