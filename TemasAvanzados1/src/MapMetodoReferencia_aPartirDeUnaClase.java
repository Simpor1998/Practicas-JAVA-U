import java.util.HashMap;
import java.util.Map;

public class MapMetodoReferencia_aPartirDeUnaClase {

    public static void main(String[] args) {

        // Creamos un Map de tipo <String, Integer>
        Map<String, Integer> frutas = new HashMap<>();
        frutas.put("Manzana", 10);
        frutas.put("Banano", 5);
        frutas.put("Fresa", 20);

        // Usamos forEach con método de referencia a un método que acepta clave y valor
        System.out.println("Recorrido del Map con método de referencia:");
        frutas.forEach(MapMetodoReferencia_aPartirDeUnaClase::imprimirEntrada);
    }

    // Método que recibe clave y valor e imprime la entrada
    public static void imprimirEntrada(String clave, Integer valor) {
        System.out.println(clave + ": " + valor);
    }
}

/*
Explicación:

1. forEach en Map:
   - Espera un BiConsumer<K, V> (dos parámetros: clave y valor).
   - No se puede usar directamente System.out::println, porque solo acepta un parámetro.

2. Solución con método de referencia:
   - Creamos un método estático 'imprimirEntrada' que recibe clave y valor.
   - Pasamos el método al forEach: frutas.forEach(MapMetodoReferencia_aPartirDeUnaClase::imprimirEntrada);
   - Esto hace que cada par clave-valor se imprima de forma limpia.

3. Ventajas:
   - Código más legible y organizado.
   - Evita lambdas largas dentro del forEach.
   - Perfecto para proyectos grandes donde quieres mantener la limpieza del código.
*/

