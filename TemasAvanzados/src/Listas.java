import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        // La lista de tipo arraylist permite elementos duplicados
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        //miLista.add("Domingo");


        // Uso un foreach para iterar cada uno de los elementos,
        // defi9no variable que accede a cada uno de los elementos,
        // y selecciono la lista que vamos a iterar

        for (Object elemento : miLista) {
            System.out.println("Dia de la semana: " + elemento);
        }


    }
}
