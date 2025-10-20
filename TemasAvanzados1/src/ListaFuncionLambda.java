import java.util.ArrayList;
import java.util.List;

public class ListaFuncionLambda {
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
        // Programacion funcional
        //aqui usamos el metodo o funcion forEach Asociado al objeto miLista
        // primero recibo los parametros en elemento, con la flecha indico que inicia la funcion
        //lambda

        //en resumen uso el metodo forEach en la lista que necesito,
        // primero paso la variable que llevara los datos de la lista
        miLista.forEach(elemento -> {
            System.out.println("Elemento: " + elemento);
        });


    }
}
