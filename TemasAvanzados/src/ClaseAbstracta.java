public class ClaseAbstracta {
    public static void main(String[] args) {
        //FiguraGeometrica figuraGeometrica = new FiguraGeometrica(); // error, no se puede instanciar
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();
    }
}

// Clase abstracta
abstract class FiguraGeometrica { // No se pueden instancia
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica {
    @Override
    //no se conoce como sobre escritura si no como implementacion
    public void dibujar() {
        System.out.println("Se debe dibujar un Rectangulo");
    }
}

class Circulo extends FiguraGeometrica {
    public void dibujar() {
        System.out.println("Se debe dibujar un Circulo");
    }
}
class Triangulo extends FiguraGeometrica {
    public void dibujar() {
        System.out.println("Se debe dibujar un Triangulo");
    }
}