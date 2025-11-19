package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;
import java.util.List;

/**
 * Interfaz que define el contrato para las operaciones de gestión de snacks.
 * Establece los métodos que deben implementar las clases de servicio concretas.
 * 
 * Nota: Todos los métodos en una interfaz son implícitamente públicos y abstractos.
 */
public interface IServicioSnacks {

    /**
     * Agrega un snack al inventario.
     * La implementación concreta determinará cómo se almacena (memoria, archivo, base de datos).
     * 
     * @param snack Parámetro de tipo Snack que representa el objeto a agregar al inventario
     */
    void agregarSnack(Snack snack);

    /**
     * Muestra todos los snacks disponibles en el inventario.
     * La implementación concreta determinará el formato de visualización.
     */
    void mostrarSnacks();

    /**
     * Retorna la lista completa de snacks disponibles en el inventario.
     * 
     * @return List<Snack> - Lista que contiene todos los objetos Snack del inventario
     */
    List<Snack> getSnacks();
}

/*
 * DOCUMENTACIÓN TÉCNICA DE LA INTERFAZ IServicioSnacks
 * =====================================================
 * 
 * PROPÓSITO:
 * Define el contrato (interfaz) que deben cumplir todas las implementaciones
 * de servicios para gestionar snacks. Permite el uso de polimorfismo y
 * facilita el cambio de implementación sin modificar el código cliente.
 * 
 * PATRÓN DE DISEÑO:
 * Esta interfaz implementa el patrón Strategy, permitiendo diferentes
 * estrategias de almacenamiento (memoria, archivos, base de datos).
 * 
 * MÉTODOS DEFINIDOS:
 * - agregarSnack(Snack snack): 
 *   Parámetro snack: objeto Snack que se agregará al inventario.
 *   Las implementaciones pueden almacenar en memoria, archivo o base de datos.
 * 
 * - mostrarSnacks(): 
 *   No recibe parámetros. Muestra el inventario según la implementación.
 * 
 * - getSnacks(): 
 *   No recibe parámetros. Retorna List<Snack> con todos los snacks.
 * 
 * IMPLEMENTACIONES CONOCIDAS:
 * - ServicioSnacksLista: Almacenamiento en memoria usando ArrayList
 * - ServicioSnacksArchivos: Persistencia en archivo de texto
 * 
 * BENEFICIOS:
 * - Polimorfismo: El código cliente puede usar IServicioSnacks sin conocer
 *   la implementación concreta.
 * - Desacoplamiento: Facilita cambios de implementación sin afectar otras capas.
 * - Testabilidad: Permite crear implementaciones mock para pruebas.
 */
