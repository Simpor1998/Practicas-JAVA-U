package maquina_snacks_archivos.dominio;

import java.io.Serializable; // Permite que objetos de la clase se puedan serializar (guardar en archivo o enviar por red)
import java.util.Objects;     // Utilizado para métodos utilitarios como equals() y hashCode()

public class Snack implements Serializable {

    // 🔹 Contador estático para asignar IDs únicos a cada snack
    private static int contadorSnack = 0;

    // 🔹 ID único de cada snack
    private int idSnack;

    // 🔹 Nombre del snack
    private String nombre;

    // 🔹 Precio del snack
    private double precio;

    // 🔹 Constructor vacío: asigna un ID único automáticamente
    public Snack() {
        this.idSnack = ++Snack.contadorSnack; // Incrementa el contador y asigna ID
    }

    // 🔹 Constructor con parámetros: nombre y precio
    public Snack(String nombre, double precio) {
        this();                // Llama al constructor vacío para asignar ID (debe ser la primera línea)
        this.nombre = nombre;  // Asigna el nombre del snack
        this.precio = precio;  // Asigna el precio del snack
    }

    // 🔹 Obtener el contador de snacks
    public static int getContadorSnack() {
        return contadorSnack;
    }

    // 🔹 Obtener el ID del snack
    public int getIdSnack() {
        return idSnack;
    }

    // 🔹 Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // 🔹 Getter y Setter para precio
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

//    metodo para reescribir snack dejando de igual  manera el toString
    public String escribirSnack() {
            return idSnack + "," + nombre + "," + precio;
    }
    // 🔹 Representación en texto del objeto Snack
    @Override
    public String toString() {
        return "Snack{ " +
                "IdSnack=" + idSnack +
                ", Nombre='" + nombre + '\'' +
                ", Precio=" + precio +
                '}';
    }

    // 🔹 Compara objetos Snack para determinar si son iguales
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Snack snack)) return false; // Si no es un Snack, retorna false
        return idSnack == snack.idSnack &&            // Compara ID
                Double.compare(precio, snack.precio) == 0 && // Compara precio
                Objects.equals(nombre, snack.nombre);       // Compara nombre
    }

    // 🔹 Genera un hash único basado en idSnack, nombre y precio
    @Override
    public int hashCode() {
        return Objects.hash(idSnack, nombre, precio);
    }
}

/*
───────────────────────────────────────────────
📘 EXPLICACIÓN GENERAL DE LA CLASE Snack
───────────────────────────────────────────────

1. Serializable:
   - Permite guardar objetos de Snack en archivos o enviarlos por red.

2. contadorSnack (static):
   - Llevamos un conteo de todos los snacks creados para generar IDs únicos automáticamente.

3. Constructores:
   - Snack() → Asigna automáticamente un ID.
   - Snack(String nombre, double precio) → Llama al constructor vacío para ID, luego asigna nombre y precio.

4. Getters y Setters:
   - Permiten acceder y modificar los atributos nombre y precio.

5. toString():
   - Devuelve una representación en texto del snack, útil para imprimirlo en consola o tickets.

6. equals() y hashCode():
   - Permiten comparar objetos Snack y usarlos correctamente en colecciones como HashSet o HashMap.
   - equals compara ID, nombre y precio.
   - hashCode genera un valor basado en los mismos atributos.

───────────────────────────────────────────────
💡 Resumen:
───────────────────────────────────────────────
Esta clase representa un snack con ID único, nombre y precio.
Es serializable, permite comparaciones, y está preparada para usarse en listas, tickets y almacenamiento persistente.
───────────────────────────────────────────────
*/
