package persona.prueba;

import persona.Persona;

public class pruebapersona {
    //    con new se esta resevando espacio de memoria del tipo de la clase que estamos utilizando
    public static void main(String[] args) {
        System.out.println("*** Creacion de Clase y Objetos persona.Persona ***");
        //es mejor acceder a la variable directamente desde la clase y no desde el objeto que se crea, ejemplo: objeto1.contadorPersona
        //funcionaria pero no seria lo adecuado
        System.out.println("Variable estatica: " + Persona.getContadorPersona());// el metodo get ahora se asocia con nuestra clase en si misma no con los objetos
        var objeto1 = new Persona("Layla", "Acosta");
        // como regresa una cadena y no imprime directamente el valor hare uso del print.
        // ademas como imprimo un objeto dentro del metodo println automaticamente se manda a llamar el metodo to.string
        // si no se sobre escribe el metodo toString imprime la ubicacion de memoria del objeto
        System.out.println(objeto1);
        System.out.println("Variable estatica: " + Persona.getContadorPersona());
        //Nueva persona
        var objeto2 = new Persona("Ian", "Lozano");
        System.out.println(objeto2);
        System.out.println("Variable estatica: " + Persona.getContadorPersona());


    }
}
