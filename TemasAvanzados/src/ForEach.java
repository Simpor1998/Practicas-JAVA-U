public class ForEach {
    public static void main(String[] args) {
        int edades[] = {5, 10, 30, 45, 60};
        // foreach,
        // la primer variable edad esta almacenando las referencias de cada uno de los elemenos
        // que vamos a
        // la segunda variables es el arreglo de donde sacaremos la info: edades,
        // por eso la variable de edad no maneja un indice por que imprimira
        //conforme este ciclo for avanza
        for (int edad : edades) {
            // osea imprimira primeo el indice 0 luego el 1 luego el 2 y asi susecivamente
            System.out.println("edad = " + edad);
        }
    }
}
