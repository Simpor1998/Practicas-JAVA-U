package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de IServicioSnacks que utiliza una lista en memoria
 * para almacenar el inventario de snacks.
 * 
 * Los datos se pierden al finalizar la ejecución del programa.
 */
public class ServicioSnacksLista implements IServicioSnacks {

    /**
     * Lista estática y final que almacena todos los snacks.
     * - static: Compartida por todas las instancias de la clase
     * - final: La referencia no puede cambiar (aunque el contenido sí puede modificarse)
     */
    private static final List<Snack> snacks;

    /**
     * Bloque de inicialización estática.
     * Se ejecuta una sola vez cuando la clase se carga en memoria,
     * antes de crear cualquier instancia.
     */
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 70));
        snacks.add(new Snack("Refresco", 50));
        snacks.add(new Snack("Sandwich", 120));
    }

    /**
     * Agrega un snack a la lista en memoria.
     * 
     * @param snack Parámetro de tipo Snack que representa el objeto a agregar
     */
    @Override
    public void agregarSnack(Snack snack) {
        snacks.add(snack);
    }

    /**
     * Muestra todos los snacks disponibles en consola.
     * Recorre la lista y concatena la representación toString() de cada snack.
     */
    @Override
    public void mostrarSnacks() {
        String inventarioSnacks = "";
        for (Snack snack : snacks) {
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println("--- Snacks en el Inventario ---");
        System.out.println(inventarioSnacks);
    }

    /**
     * Retorna la referencia a la lista completa de snacks.
     * 
     * @return List<Snack> - Lista que contiene todos los snacks del inventario
     */
    @Override
    public List<Snack> getSnacks() {
        return snacks;
    }
}

/*
 * DOCUMENTACIÓN TÉCNICA DE LA CLASE ServicioSnacksLista
 * ======================================================
 * 
 * PROPÓSITO:
 * Implementación concreta de IServicioSnacks que almacena snacks en memoria
 * utilizando una ArrayList. Los datos no persisten entre ejecuciones.
 * 
 * CARACTERÍSTICAS:
 * - Almacenamiento en memoria: Los datos se mantienen solo durante la ejecución
 * - Lista estática: Todas las instancias comparten el mismo inventario
 * - Inicialización automática: Se cargan snacks por defecto al cargar la clase
 * 
 * ATRIBUTOS:
 * - snacks (static final List<Snack>): 
 *   Lista estática compartida por todas las instancias.
 *   El modificador final impide reasignar la referencia, pero permite modificar
 *   el contenido de la lista (agregar, eliminar elementos).
 * 
 * BLOQUE ESTÁTICO:
 * Se ejecuta una vez cuando la JVM carga la clase, antes de cualquier instanciación.
 * Inicializa la lista y carga snacks predeterminados.
 * 
 * MÉTODOS:
 * - agregarSnack(Snack snack):
 *   Parámetro snack: objeto Snack pasado como argumento al invocar el método.
 *   Agrega el snack a la lista estática.
 * 
 * - mostrarSnacks():
 *   No recibe parámetros. Itera sobre la lista e imprime cada snack.
 * 
 * - getSnacks():
 *   No recibe parámetros. Retorna la referencia a la lista estática.
 * 
 * VENTAJAS:
 * - Acceso rápido a los datos (sin I/O)
 * - Implementación simple
 * - Útil para pruebas y prototipos
 * 
 * DESVENTAJAS:
 * - Los datos se pierden al finalizar el programa
 * - No es adecuado para aplicaciones que requieren persistencia
 */
