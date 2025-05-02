public class CaracteresEspeciales {
    public static void main(String[] args) {
        // Salto de línea
        System.out.println("Hola Guillermo\nBienvenido a Java");

        // Tabulación horizontal
        System.out.println("Nombre:\tGuillermo");

        // Comillas dobles dentro de un texto
        System.out.println("Frase célebre: \"La inteligencia artificial es el futuro\"");

        // Barra invertida
        System.out.println("Ruta en Windows: C:\\Usuarios\\Guillermo");

        // Retorno de carro (vuelve al inicio de la línea)
        System.out.println("Primera línea\rSobrescrita");

        // Avance de página (no visible en consola, útil en impresión)
        System.out.println("Primera parte\fSegunda parte (salto de página)");

        // Comillas simples (útil cuando trabajas con char o SQL por ejemplo)
        System.out.println("Este es un carácter: \'A\'");

        // Alarma (campana): produce un sonido en algunas consolas (puede no funcionar en todas)
        System.out.print("Alerta:\u0007");
    }
}
