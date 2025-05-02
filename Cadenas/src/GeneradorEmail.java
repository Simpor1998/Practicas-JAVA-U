public class GeneradorEmail {
    public static void main(String[] args) {
        System.out.println("***Generador de Email***");
        var nombre = "Guillermo Andres";
        var apellido = "Hernandez Hoyos";
        var nombreEmpresa = "Global Mentoring";
        var extensionDominio = ".com.mx";

        //Normalizar datos
        var fullNombre = nombre +" "+ apellido;
        System.out.println("fullNombre = " + fullNombre);
        var normalName = fullNombre.strip().toLowerCase().replace(" ", ".");
        System.out.println("normalName = " + normalName);
        var normalEmpresa = nombreEmpresa.strip().toLowerCase().replace(" ", "");
        System.out.println("normalEmpresa = " + normalEmpresa);

        //Concatenacion final

        var email = new StringBuilder();
        email.append(normalName).append("@").append(normalEmpresa).append(extensionDominio);
        System.out.println("Email final Generado = " + email.toString());

    }
}
