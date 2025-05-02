import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        // se usa como un mapa o diccionario osea es de estilo llave cadena
        //usamos la clase hhashmap y la interface map
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", "Diego");
        persona.put("apellido", "Flores");
        persona.put("edad", "31");
        persona.put("edad", "31"); // no se permiten duplicados
        System.out.println("Valores del mapa: ");
        // no mandamos a llamar al for each si no primero mandamos a generar un tipo set con
        // entryset, tendra los valores de llave o valor, no almacenara orden ni duplicados
        // despues por cada una de los elementos de tipo set que vamos a recuperar, se imprimira
        //cada uno de los elementos de este set en forma de llave valor
        persona.entrySet().forEach(System.out::println);
        persona.put("edad", "35"); // Modificar el valor de la llave existente
        persona.remove("apellido"); // se remueven por la llave
        System.out.println("\nNuevos valores del mapa:");
        persona.entrySet().forEach(System.out::println);

        //Iterar sobres los elementos del mapa por separado
        System.out.println("\nIterando los elementos (llave, valor)");
        //itera entre la dualidad de las llaves y valor , las variabels que estan ahi
        //solo sirven para recibir los elmentos a  imprimir
        persona.forEach((llave, valor) -> {
            System.out.println("Llave: " + llave + ", Valor: " + valor);
        });
    }
}