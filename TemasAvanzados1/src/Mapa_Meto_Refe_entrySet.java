import java.util.HashMap;
import java.util.Map;

public class Mapa_Meto_Refe_entrySet {

    public static void main(String[] args) {

        // Creamos un Map de tipo <String, Integer>
        Map<String, Integer> frutas = new HashMap<>();
        frutas.put("Manzana", 10);
        frutas.put("Banano", 5);
        frutas.put("Fresa", 20);
        frutas.put("Mango", 15);

        // Recorrer el Map usando entrySet y for-each tradicional
        System.out.println("Recorrido con entrySet y for-each:");
        for (Map.Entry<String, Integer> entrada : frutas.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        // Recorrer el Map usando entrySet y lambda
        System.out.println("\nRecorrido con entrySet y lambda:");
        frutas.entrySet().forEach(entrada ->
                System.out.println(entrada.getKey() + ": " + entrada.getValue())
        );

        // Recorrer el Map usando entrySet y método de referencia
        System.out.println("\nRecorrido con entrySet y método de referencia:");
        frutas.entrySet().forEach(Mapa_Meto_Refe_entrySet::imprimirEntrada);

        // Ejemplo de entrySet con System.out::println directo
        System.out.println("\nRecorrido con entrySet y System.out::println directo:");
        frutas.entrySet().forEach(System.out::println); // Imprime "clave=valor" por defecto
    }

    // Método que recibe un Map.Entry y lo imprime con formato
    public static void imprimirEntrada(Map.Entry<String, Integer> entrada) {
        System.out.println(entrada.getKey() + ": " + entrada.getValue());
    }
}

/*
Explicación:

1. entrySet():
   - Devuelve un conjunto de entradas (Set<Map.Entry<K,V>>).
   - Cada entrada tiene getKey() y getValue().
   - Útil cuando quieres recorrer claves y valores juntos como objetos.

2. Formas de recorrer:
   - For-each tradicional: recorre cada Map.Entry y accede a clave y valor.
   - Lambda: entrySet().forEach(entrada -> ...).
   - Método de referencia: entrySet().forEach(MapEntrySet::imprimirEntrada).

3. Por qué no usar entrySet().forEach(System.out::println) directamente:
   - Funciona técnicamente y mostrará algo como "Manzana=10".
   - No permite **personalizar el formato** de salida.
   - No se puede aplicar lógica adicional a cada entrada fácilmente.
   - Por eso, en proyectos reales es más recomendable usar lambda o método de referencia que reciba Map.Entry.

4. Diferencia con Map.forEach(BiConsumer):
   - Map.forEach((clave, valor) -> ...) recibe directamente clave y valor.
   - entrySet() te da Map.Entry, útil si necesitas pasar toda la entrada a un método o manipularla.

5. Ventajas de entrySet() con lambda/método de referencia:
   - Permite filtrado, transformación y procesamiento avanzado.
   - Mantiene claridad y legibilidad.
   - Combina bien con streams para operaciones más complejas.
*/

