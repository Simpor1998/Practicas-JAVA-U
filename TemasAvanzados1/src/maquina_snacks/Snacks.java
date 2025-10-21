package maquina_snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {

    // Lista estática que contiene todos los snacks disponibles en la máquina
    // Es final para que no se pueda reasignar la referencia, pero sí se pueden agregar/eliminar elementos
    private static final List<Snack> snacks;

    // Bloque estático inicializador
    // Se ejecuta una única vez cuando se carga la clase en memoria
    // Ideal para inicializar la lista con algunos snacks predeterminados
    static {
        snacks = new ArrayList<>();           // Creamos la lista de snacks
        snacks.add(new Snack("Papas", 70));   // Agregamos un snack inicial
        snacks.add(new Snack("Refresco", 50));
        snacks.add(new Snack("Sandwich", 120));
    }

    // Método estático para agregar un nuevo snack a la lista
    public static void agregarSnack(Snack snack) {
        snacks.add(snack); // Se agrega el snack recibido como parámetro
    }

    // Método estático para mostrar todos los snacks en la lista
    public static void mostrarSnacks() {
        var inventarioSnacks = "";            // String que contendrá la información de todos los snacks
        for (var snack : snacks) {            // Recorremos la lista
            inventarioSnacks += snack.toString() + "\n"; // Concatenamos cada snack como String
        }
        System.out.println("--- ServicioSnacksLista en el Inventario ---");
        System.out.println(inventarioSnacks);  // Imprimimos todo el inventario
    }

    // Getter estático para obtener la lista completa de snacks
    // Retorna la referencia de la lista, por lo que se puede modificar desde fuera si se quiere
    public static List<Snack> getSnacks() {
        return snacks;
    }
}

/*
Explicación general:

1. Bloque estático:
   - Se ejecuta solo una vez cuando se carga la clase en memoria.
   - Se usa para inicializar la lista de snacks predeterminada sin necesidad de un constructor.

2. Lista estática final:
   - La referencia de la lista no se puede cambiar (no se puede reasignar a otro ArrayList),
     pero sí se pueden agregar o quitar elementos.
   - Esto permite tener un inventario común compartido por toda la clase.

3. Métodos estáticos:
   - agregarSnack(): añade un snack al inventario global.
   - mostrarSnacks(): recorre e imprime todos los snacks usando toString() de cada Snack.
   - getSnacks(): devuelve la lista de snacks para uso externo (útil para consultar o manipular).

4. Observaciones:
   - Se usa `var` en el for-each y en la declaración de inventarioSnacks para simplificar la sintaxis.
   - La clase funciona como un **servicio o repositorio de snacks**, centralizando la lista en un solo lugar.
*/
