package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack; // Importa la clase Snack para crear y manejar objetos snack
import java.util.ArrayList;                   // Importa ArrayList para almacenar snacks dinámicamente
import java.util.List;                        // Importa List para definir listas de snacks

// 🔹 Clase que implementa IServicioSnacks usando una lista como inventario
public class ServicioSnacksLista implements IServicioSnacks {

    // 🔹 Lista estática de snacks, compartida por todas las instancias de la clase
    private static final List<Snack> snacks;

    // 🔹 Bloque static inicializador
    // Se ejecuta una sola vez al cargar la clase
    static {
        snacks = new ArrayList<>(); // Inicializa la lista

        // 🔹 Agrega snacks iniciales al inventario
        snacks.add(new Snack("Papas", 70));
        snacks.add(new Snack("Refresco", 50));
        snacks.add(new Snack("Sandwich", 120));
    }

    // 🔹 Agrega un nuevo snack al inventario
    @Override
    public void agregarSnack(Snack snack) {
        snacks.add(snack); // Se agrega el snack a la lista
    }

    // 🔹 Muestra todos los snacks disponibles en consola
    @Override
    public void mostrarSnacks() {
        var inventarioSnacks = ""; // Variable para concatenar los snacks
        for (var snack : snacks) {
            inventarioSnacks += snack.toString() + "\n"; // Convertimos cada snack a texto
        }
        System.out.println("--- Snacks en el Inventario ---");
        System.out.println(inventarioSnacks); // Imprime todos los snacks
    }

    // 🔹 Devuelve la lista completa de snacks
    @Override
    public List<Snack> getSnacks() {
        return snacks;
    }
}

/*
───────────────────────────────────────────────
📘 EXPLICACIÓN GENERAL DE LA CLASE ServicioSnacksLista
───────────────────────────────────────────────

1. Propósito:
   - Implementar IServicioSnacks usando una lista en memoria para manejar el inventario de snacks.
   - Permite agregar snacks, mostrar el inventario y obtener la lista completa.

2. snacks (static final):
   - Es estática, por lo que todas las instancias de la clase comparten la misma lista.
   - Es final, la referencia no cambia, aunque el contenido sí puede modificarse.

3. Bloque static:
   - Se ejecuta una vez al cargar la clase.
   - Inicializa la lista y agrega algunos snacks iniciales.

4. Métodos:
   - agregarSnack(Snack snack): agrega un snack nuevo al inventario.
   - mostrarSnacks(): imprime todos los snacks en consola.
   - getSnacks(): devuelve la lista completa de snacks.

5. Ventaja de esta implementación:
   - Fácil y rápida para manejar inventario en memoria.
   - Puede usarse directamente en la máquina de snacks sin necesidad de bases de datos.

───────────────────────────────────────────────
💡 Resumen:
───────────────────────────────────────────────
ServicioSnacksLista es la implementación concreta del inventario de snacks usando listas.
Permite agregar, mostrar y obtener snacks de manera sencilla, y se inicializa con algunos productos predefinidos.
───────────────────────────────────────────────
*/
