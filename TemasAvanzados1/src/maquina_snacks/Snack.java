package maquina_snacks;

import jdk.dynalink.beans.StaticClass;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {
    private static int contadorSnack; // Contador global de snacks creados
    private int idSnack;              // Identificador único del snack
    private String nombre;            // Nombre del snack
    private double precio;            // Precio del snack

    public Snack() {
        this.idSnack = ++Snack.contadorSnack;
    }

    public Snack(String nombre, double precio) {
        //con este this() mando a llamar el constructor vacio, que tiene el contador
        // se debe ser la primera linea la llamada al constructor
        this();
        this.nombre = nombre;
        this.precio = precio;
    }
    /*
Clase Snack – Resumen rápido:

1. Getters y setters:
   - Permiten acceder y modificar los atributos de forma controlada (encapsulamiento).
   - Ejemplo: getNombre() retorna el nombre, setPrecio(double precio) lo modifica.

2. toString():
   - Convierte el objeto en un String legible.
   - Útil para imprimir objetos rápidamente.
   - Ejemplo de salida: Snack{IdSnack=1, Nombre='Chips', Precio=2.5}

3. equals() y hashCode():
   - equals: determina si dos objetos Snack son "iguales" comparando su contenido (idSnack, nombre, precio).
   - hashCode: genera un valor hash único basado en los mismos atributos.
   - Importante para colecciones como HashSet o HashMap, donde la igualdad y el hash determinan almacenamiento y búsqueda.
*/


    // Getter estático para el contador de snacks
    public static int getContadorSnack() {
        return contadorSnack;
    }

    // Getter para el ID del snack
    public int getIdSnack() {
        return idSnack;
    }

    // Getter y setter del nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y setter del precio
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Convierte el objeto Snack en un String legible
    @Override
    public String toString() {
        return "Snack{ " +
                "IdSnack=" + idSnack +
                ", Nombre='" + nombre + '\'' +
                ", Precio=" + precio +
                '}';
    }

    // Compara si dos objetos Snack son iguales según su contenido
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Snack snack)) return false;
        return idSnack == snack.idSnack &&
                Double.compare(precio, snack.precio) == 0 &&
                Objects.equals(nombre, snack.nombre);
    }

    // Genera un hash basado en los atributos del Snack
    @Override
    public int hashCode() {
        return Objects.hash(idSnack, nombre, precio);
    }
}
