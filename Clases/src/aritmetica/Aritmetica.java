package aritmetica;

public class Aritmetica {
    private int operando1;
    private int operando2;

    // Constructor vacio para no genera error si llamo la clase sin argumentos para luego asignar valores
    public Aritmetica(){
    }
    // Constructor ya solicitando argumento
    public Aritmetica(int operando1, int operando2){
        // para hacer diferencia entre las variables locales y los atributos de nuestra clase uso el this
        // puedo acceder a los atributos y metodos de nuestra classe,  solo  se usa dentro de la clase
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public void sumar(){
        var resultado = operando1 + operando2;
        System.out.println("Resultado Suma: " + resultado);
    }

    public void restar(){
        var resultado = operando1 - operando2;
        System.out.println("Resultado Resta: " + resultado);
    }

    public int getOperando1() {
        //es una buena practica usar this para sabeer
        // sin necesidad necesidad de revisar mas que este es un atributo de nuestra clase
        return this.operando1;
    }
    //El set como si va a recibir una variable entonces se llama igual que el nombre del atributo de nuestra clase
    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }
    public int getOperando2() {
        return this.operando2;
    }
    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
}