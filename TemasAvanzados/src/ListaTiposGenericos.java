import java.util.ArrayList;
import java.util.List;

public class ListaTiposGenericos {
    public static void main(String[] args) {
        // generico significa que le vamos a indicar
        // el tipo de dato que puede almacenar nuestra variable

        // del lado izquierdo indico la variable que va a almacenar una lista de tipo String
        //del lado derecho indico el tipo de dato que va a almacenar nuestra variable
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        // miLista.add(1);
        // arroja error porque el tipo de dato ya indicamos que solo seran String

        //aqui ya no usamos el tipo Object si no el String
        // por que sabemos que tipo de datoa va almacenar
        for(String elemento: miLista){
            System.out.println("Dia de la semana: " + elemento );
        }


    }
}