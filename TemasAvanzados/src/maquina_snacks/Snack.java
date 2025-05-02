package maquina_snacks;

import jdk.dynalink.beans.StaticClass;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {
    private static int contadorSnack = 0;
    private int idSnack;
    private String nombre;
    private double precio;

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

    public static int getContadorSnack() {
        return contadorSnack;
    }

    public int getIdSnack() {
        return idSnack;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Snack{ " +
                "IdSnack=" + idSnack +
                ", Nombre='" + nombre + '\'' +
                ", Precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Snack snack)) return false;
        return idSnack == snack.idSnack &&
                Double.compare(precio, snack.precio) == 0 &&
                Objects.equals(nombre, snack.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSnack, nombre, precio);
    }
}
