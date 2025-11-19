package maquina_snacks_archivos.dominio;

import java.io.Serializable; // Permite que objetos de la clase se puedan serializar (guardar en archivo o enviar por red)
import java.util.Objects; // Utilizado para métodos utilitarios como equals() y hashCode()

/**
 * Clase que representa un snack con identificador único, nombre y precio.
 * Implementa Serializable para permitir la persistencia de objetos en archivos.
 */
public class Snack implements Serializable {

    /**
     * Contador estático de clase para generar IDs únicos secuenciales.
     * Se incrementa cada vez que se crea una nueva instancia de Snack.
     */
    private static int contadorSnack = 0;

    /**
     * Identificador único del snack, asignado automáticamente por el constructor.
     */
    private int idSnack;

    /**
     * Nombre descriptivo del snack.
     */
    private String nombre;

    /**
     * Precio del snack en formato decimal.
     */
    private double precio;

    /**
     * Constructor por defecto sin parámetros.
     * Asigna automáticamente un ID único incrementando el contador estático.
     */
    public Snack() {
        this.idSnack = ++Snack.contadorSnack;
    }

    /**
     * Constructor con parámetros para inicializar nombre y precio.
     * 
     * @param nombre Parámetro que recibe el nombre del snack (tipo String)
     * @param precio Parámetro que recibe el precio del snack (tipo double)
     * 
     *               Nota: Internamente llama al constructor por defecto para
     *               asignar el ID,
     *               luego asigna los valores de los parámetros a los atributos de
     *               instancia.
     */
    public Snack(String nombre, double precio) {
        this(); // Llama al constructor por defecto para asignar ID
        this.nombre = nombre; // Asigna el parámetro nombre al atributo nombre
        this.precio = precio; // Asigna el parámetro precio al atributo precio
    }

    /**
     * Método estático que retorna el valor actual del contador de snacks.
     * 
     * @return int - Valor del contador estático contadorSnack
     */
    public static int getContadorSnack() {
        return contadorSnack;
    }

    /**
     * Getter para obtener el ID del snack.
     * 
     * @return int - Identificador único del snack
     */
    public int getIdSnack() {
        return idSnack;
    }

    /**
     * Getter para obtener el nombre del snack.
     * 
     * @return String - Nombre del snack
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter para modificar el nombre del snack.
     * 
     * @param nombre Parámetro de tipo String que contiene el nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter para obtener el precio del snack.
     * 
     * @return double - Precio del snack
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Setter para modificar el precio del snack.
     * 
     * @param precio Parámetro de tipo double que contiene el nuevo precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Convierte el snack a formato CSV (valores separados por comas).
     * Utilizado para persistencia en archivos de texto.
     * 
     * @return String - Representación del snack en formato "id,nombre,precio"
     */
    public String escribirSnack() {
        return idSnack + "," + nombre + "," + precio;
    }

    /**
     * Sobrescribe el método toString() de Object.
     * Retorna una representación legible del objeto Snack.
     * 
     * @return String - Representación formateada del snack con todos sus atributos
     */
    @Override
    public String toString() {
        return "Snack{ " +
                "IdSnack=" + idSnack +
                ", Nombre='" + nombre + '\'' +
                ", Precio=" + precio +
                '}';
    }

    /**
     * Sobrescribe el método equals() de Object.
     * Compara dos objetos Snack basándose en idSnack, nombre y precio.
     * 
     * @param o Parámetro de tipo Object que representa el objeto a comparar
     * @return boolean - true si los objetos son iguales, false en caso contrario
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Snack snack))
            return false;
        return idSnack == snack.idSnack &&
                Double.compare(precio, snack.precio) == 0 &&
                Objects.equals(nombre, snack.nombre);
    }

    /**
     * Sobrescribe el método hashCode() de Object.
     * Genera un código hash basado en idSnack, nombre y precio.
     * Necesario para el correcto funcionamiento con colecciones como HashSet y
     * HashMap.
     * 
     * @return int - Código hash del objeto basado en sus atributos
     */
    @Override
    public int hashCode() {
        return Objects.hash(idSnack, nombre, precio);
    }
}

/*
 * DOCUMENTACIÓN TÉCNICA DE LA CLASE Snack
 * =======================================
 * 
 * PROPÓSITO:
 * Clase de dominio que modela un snack con identificador único, nombre y
 * precio.
 * Implementa Serializable para permitir la serialización de objetos.
 * 
 * ATRIBUTOS:
 * - contadorSnack (static int): Variable de clase que mantiene el conteo global
 * de snacks creados. Se incrementa con cada instancia nueva.
 * 
 * - idSnack (int): Identificador único de instancia, asignado automáticamente
 * mediante el contador estático.
 * 
 * - nombre (String): Nombre descriptivo del producto.
 * 
 * - precio (double): Valor monetario del snack.
 * 
 * CONSTRUCTORES:
 * - Snack(): Constructor por defecto que asigna ID automáticamente.
 * 
 * - Snack(String nombre, double precio): Constructor parametrizado que recibe
 * nombre y precio como argumentos. Internamente invoca this() para asignar ID.
 * 
 * MÉTODOS PRINCIPALES:
 * - escribirSnack(): Serializa el objeto a formato CSV para persistencia.
 * 
 * - toString(): Retorna representación legible del objeto.
 * 
 * - equals(Object o): Compara objetos basándose en idSnack, nombre y precio.
 * 
 * - hashCode(): Genera código hash para uso en colecciones basadas en hash.
 * 
 * USO:
 * Esta clase se utiliza como modelo de datos en la capa de dominio.
 * Los objetos Snack pueden ser almacenados en listas, archivos y colecciones.
 */
