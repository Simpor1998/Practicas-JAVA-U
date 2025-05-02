package persona;

public class Persona {
    //Como prueba esta un nivel mas abajo de paquetes que la clase persona
    // me toca hacer la variable publica para poder darle acceso a traves del paquete que agarra prueba

    //Nota el contador no se puede asociar con this como si fuera un atributo mas de nuestra clase porque se volveria dinamica
    //si no un atributo que se asocia con cualquier objeto y ya no aplicaria su funcion de contar
    private static int contadorPersona= 0;
    private int idPersona;
    private String nombre;
    private String apellido;

    // EEL MEETODO CONSTRCUTOR SIRVE DE LA FORMA QUE YO PUEDA INGREESAR LOS VALORES O ARGUMENTOS A LOS METODOS CREADOS
    // COSNTRUCTOR VACIO
    public Persona() {
    }

    //CONSTRUCTOR PARA LOS ARGUMENTOS
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        // incrementar el atributo estatico
        //se ingresa en el metodo construtor ya que cada vez que se cree un objeto se manda a llamar el metodo constructor de nuestra clase
        //Se llama la clase y luego se aumenta la variables
// ------ Persona.contadorPersona++;
        //me apalanco en el valor de el contador y uso el pre incrmento para acceder de una

        //asignamos el id unico con la ayuda de la variable estatica
        this.idPersona = ++Persona.contadorPersona;
    }

    @Override
    public String toString() {
        // como buena practica para acceder a los atributos de nuestra clase hago uso de this
        return "Persona{"  + "Id Persona=" + this.idPersona
                + ", Nombre=" + this.nombre
                + ", Apellido=" + this.apellido
                + ", Ubicacion de memoria con toString= " + super.toString() + '}';
    }


    //Metodos gest and sett llamar y setear
    public int getIdPersona() {
        return idPersona;
    }
    //No se usara SET para el ID debido el id solo se llevara desde el sistema sin ninguna modificacion

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static int getContadorPersona() {
        //retornar el valor de la variable statica accediendo a la vvariables atraves del nombre de la clase
        return Persona.contadorPersona;
    }
}