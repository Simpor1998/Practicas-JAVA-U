package animales;

public class Animal {
    // Si quiero que mis metodos no sean accedidos de cualquier lado si no solo de mis clases hijas
    // siendo mi clase animal una super clase, usare el modifciador de acceso protected
//    protected void comer() {
//        System.out.println("Como muchas veces al dia: ");
//    }
//
//    protected void dormir() {
//        System.out.println("Duermo muchas horas");
//    }

    protected void hacerSonido() {
        System.out.println("Hacer sonido");
    }
}

// con extends para indicar cual es la clase padre y aplico el concepto de herencia
class Perro extends Animal {
    // si deseo tener mas clases hijas de mi clase perro ya no usaria el modificador de acceso public si no eel protected tambien
    // O en caso final le quitaria el modifciador  y solo quedaria con void eso indicaria que el metodo quedaria como default osea
    // solo se podria acceder dentro de este mismo archivo, dentro de la misma clase

    @Override
    protected void hacerSonido() {
        System.out.println("El perro hacer wuaf");
    }

    //uso la misma firma o en resumen todo el contexto del metodo y asi sobre escribo el metodo heredado de la clase padre---> "Animal"
    // el override  indica que la clase padre se esta sobre escribiendo en la clase hijo perro
//    @Override
//    protected void dormir() {
//        System.out.println("--------Método sobre escrito en la clase hijo del padre:--------- ");
//        System.out.println("Duermo 15 horas el dia");
//        //Aunque se haya sobre escrito el metodo en la clase hijo podemos ingresar a el origen de la clase padre usando el metodo super.
//        // Podremos acceder al metodo definido primeramente en la clase padre .
//        System.out.println("--------Método clase padre:--------- ");
//        super.dormir();
//    }
}

class Gato extends Animal {
    @Override
    protected void hacerSonido() {
        System.out.println("El gato hacer miau");
    }
}

class PruebaAnima {

    //Metodo polimorfico.
    //Como el metodo se llamara desde el Main usaremos el static
    static void imprimirSonido(Animal animal) {
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        //Objeto de la clase padre(animal)
//        Animal animal = new Animal();
        //usare el objeto perro
        var animal = new Animal();
        imprimirSonido(animal);


    }
}
