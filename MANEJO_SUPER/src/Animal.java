// Clase base o padre
class Animal {
    // Atributo del padre
    protected String nombre;

    // Constructor del padre
    public Animal(String nombre) {
        this.nombre = nombre;
        System.out.println("Constructor de Animal: el animal se llama " + nombre);
    }

    // Método del padre
    public void sonido() {
        System.out.println("El animal hace un sonido genérico.");
    }
}
