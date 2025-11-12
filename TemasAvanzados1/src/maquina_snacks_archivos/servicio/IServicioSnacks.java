package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack; // Importa la clase Snack para usarla como tipo en los métodos
import java.util.List;                         // Importa List para manejar colecciones de snacks

// 🔹 Interfaz que define el contrato para manejar snacks
public interface IServicioSnacks {

    /*
     * 🔹 Agrega un snack al inventario.
     * @param snack: objeto de tipo Snack que se agregará
     * Nota: Por defecto, los métodos en interfaces son públicos y abstractos,
     *       por eso no es necesario escribir 'public abstract'.
     */
    void agregarSnack(Snack snack);

    /*
     * 🔹 Muestra todos los snacks disponibles en el inventario.
     * Puede imprimirlos en consola o mostrarlos de la forma que implemente la clase concreta.
     */
    void mostrarSnacks();

    /*
     * 🔹 Retorna la lista de snacks disponibles en el inventario.
     * @return List<Snack>: lista de objetos Snack
     */
    List<Snack> getSnacks();
}

/*
───────────────────────────────────────────────
📘 EXPLICACIÓN GENERAL DE LA INTERFAZ IServicioSnacks
───────────────────────────────────────────────

1. Propósito:
   - Definir las operaciones que cualquier servicio de snacks debe implementar.
   - Permite que diferentes implementaciones (por ejemplo, con lista, con base de datos o con archivos) tengan la misma interfaz.

2. Métodos:
   - agregarSnack(Snack snack): agrega un nuevo snack al inventario.
   - mostrarSnacks(): muestra el inventario de snacks.
   - getSnacks(): devuelve la lista de snacks para poder manipularla o consultarla.

3. Beneficios de usar interfaces:
   - Permite **polimorfismo**, es decir, se puede cambiar la implementación sin modificar el código que la usa.
   - Facilita la mantenibilidad y escalabilidad del sistema.

───────────────────────────────────────────────
💡 Resumen:
───────────────────────────────────────────────
IServicioSnacks define qué operaciones se pueden realizar sobre un inventario de snacks,
pero no dice cómo se implementan. La implementación concreta se hace en clases como ServicioSnacksLista.
───────────────────────────────────────────────
*/
