import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaFuncionLambdaMetodoReferencia {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

        //for(String elemento: miLista){
        //    System.out.println("Dia de la semana: " + elemento );
        //}

        // Funciones lambda (funcion anonima de un codigo muy compacto)
//        miLista.forEach( elemento -> {
//            System.out.println("Elemento: " + elemento);
//        } );

        //Simplificacion funcion lambda, oculata mas el metodo debo saber como se maneja hago uso de mi lista por el metodo forEach y solo imprimo el metodo
        //de referencia ya que lo que hace es tomar la informacion de esa lista
        // e usar el meto de referencia y con la funcion lambda llamamos al print
        miLista.forEach(System.out::println);

        List<String> nombres = Arrays.asList("Pedro", "Ivonne", "Nohemi");
        System.out.println("\nLista de Nombres: ");
        nombres.forEach(System.out::println);

    }
}
