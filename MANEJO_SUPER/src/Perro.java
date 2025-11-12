// Clase hija que hereda de Animal
class Perro extends Animal {
    // Atributo propio de la clase hija
    private String raza;

    // Constructor de la clase hija
    public Perro(String nombre, String raza) {
        // 1️⃣ Llamamos al constructor del padre con 'super(nombre)'
        // Esto inicializa el atributo 'nombre' que pertenece a la clase padre.
        super(nombre);
        this.raza = raza;
        System.out.println("Constructor de Perro: la raza es " + raza);
    }

    // Método que sobrescribe al del padre
    @Override
    public void sonido() {
        // 2️⃣ Llamamos al método del padre con 'super.sonido()'
        // Así mantenemos el comportamiento base y luego agregamos algo nuevo.
        super.sonido();
        System.out.println("El perro ladra: ¡Guau guau!");
    }

    // Método que muestra el nombre heredado desde el padre
    public void mostrarInfo() {
        // 3️⃣ Accedemos al atributo del padre usando 'super.nombre'
        System.out.println("El nombre del perro (desde super) es: " + super.nombre);
        System.out.println("La raza del perro es: " + this.raza);
    }
}