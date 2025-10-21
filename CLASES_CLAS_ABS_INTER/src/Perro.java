// La clase Perro hereda de Mamifero y debe implementar los métodos abstractos
// 3) Clase concreta: completa todo y se puede instanciar
public class Perro extends Mamifero {

    public Perro(String nombre) {
        super(nombre); // Llama al constructor de Mamifero
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo croquetas.");
    }

    @Override
    public void dormir() {
        System.out.println(nombre + " está durmiendo en su cama.");
    }

    @Override
    public void sonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }
}
