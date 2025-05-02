public class Cadenas {
    public static void main(String[] args) {
        System.out.println("*** Manejo de Cadenas en Java ***");
        var cadena1 = "Hola";
        System.out.println("cadenal = " + cadena1) ;
        var cadena2 = new String ("Mundo") ;
        System.out.println("cadena2 =" + cadena2) ;
        var cadena3 = cadena1 + "" + cadena2;
        System.out.println ("cadena3 = " + cadena3) ;

        var cadena4 = """
                Este es un texto
                multilinea
                mas
                Lineas
                """;
        System.out.println("cadena4 =" + cadena4);
    }
}
