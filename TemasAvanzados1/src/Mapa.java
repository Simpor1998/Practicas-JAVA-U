import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        // Creamos un Map de tipo <String, Integer>
        // La clave será el nombre de la fruta y el valor será la cantidad
        Map<String, Integer> frutas = new HashMap<>();

        // Agregamos elementos al Map usando put(clave, valor)
        frutas.put("Manzana", 10);
        frutas.put("Banano", 5);
        frutas.put("Fresa", 20);
        frutas.put("Mango", 15);
        frutas.put("Banano", 8); // Si la clave ya existe, reemplaza el valor

        // Imprimimos todo el Map
        System.out.println("Frutas con sus cantidades: " + frutas);

        // Accedemos a un valor usando su clave
        System.out.println("Cantidad de Fresas: " + frutas.get("Fresa"));

        // Verificar si una clave existe
        if (frutas.containsKey("Mango")) {
            System.out.println("El Map contiene Mango");
        }

        // Verificar si un valor existe
        if (frutas.containsValue(8)) {
            System.out.println("Al menos una fruta tiene 8 unidades");
        }

        // Eliminar un elemento usando la clave
        frutas.remove("Manzana");

        // Recorrer el Map usando for-each sobre entrySet()
        System.out.println("Frutas restantes:");
        for (Map.Entry<String, Integer> entry : frutas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Recorrer el Map usando lambda y método de referencia
        System.out.println("Recorrido con lambda:");
        frutas.forEach((clave, valor) -> System.out.println(clave + ": " + valor));
    }
}

/*
Explicación:

1. Map:
   - Almacena pares clave-valor.
   - Cada clave es única, pero los valores pueden repetirse.
   - HashMap:
       * No mantiene orden.
       * Permite claves y valores nulos.
       * Acceso rápido a los elementos por clave.
   - TreeMap:
       * Mantiene las claves ordenadas de forma natural.
       * No permite claves nulas.
       * Operaciones ligeramente más lentas que HashMap debido al ordenamiento interno.

2. Métodos principales:
   - .put(clave, valor): agrega o reemplaza un elemento.
   - .get(clave): obtiene el valor asociado a la clave.
   - .containsKey(clave): verifica si existe la clave.
   - .containsValue(valor): verifica si existe el valor.
   - .remove(clave): elimina el par clave-valor.
   - .entrySet(): devuelve un conjunto de entradas (clave-valor) para recorrer con for-each.
   - .forEach((clave, valor) -> …): recorre el Map de manera funcional usando lambda.

3. Observaciones:
   - HashMap es más rápido cuando el orden no importa.
   - TreeMap es útil cuando necesitas claves ordenadas.
   - Lambda y método de referencia permiten recorrer de forma concisa.
*/
