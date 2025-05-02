public class FormateoCadenas {
    public static void main(String[] args) {
        // 1. String.format() – Retorna una cadena formateada, FormateoConFormat
        String nombre = "Guillermo";
        int edad = 25;
        double promedio = 4.756;

        // Formateo de texto, entero y decimal con dos cifras decimales
        String mensaje = String.format("Nombre: %s | Edad: %d | Promedio: %.2f", nombre, edad, promedio);
        System.out.println(mensaje);
        // %s = cadena
        //🔹 %d = entero
        //🔹 %.2f = número flotante con 2 decimales

        // 2. System.out.printf() – Imprime directamente con formato
        String producto = "Teclado";
        int cantidad = 3;
        double precio = 24500.5;

        // Alineación y formato
        System.out.printf("Producto: %-10s | Cantidad: %5d | Precio: $%,10.2f%n", producto, cantidad, precio);
        // %-10s → texto alineado a la izquierda en 10 espacios
        //%5d → número entero alineado a la derecha con 5 espacios
        //%,10.2f → decimal con separador de miles y 2 decimales
        //%n → salto de línea portable

        // Ejemplo: combinación de Text Block + String.format()

        nombre = "Guillermo";
        edad = 25;
        promedio = 4.75;

        // Text block con placeholders de formato
        String plantilla = """
                -------------------------
                INFORME DE ESTUDIANTE
                -------------------------
                Nombre   : %s
                Edad     : %d años
                Promedio : %.2f
                -------------------------
                """;

        // 📋 Otro ejemplo: reporte de producto tabulado
        // Se aplica el formato al text block
        String resultado = String.format(plantilla, nombre, edad, promedio);
        System.out.println(resultado);

        plantilla = """
                +------------------------------+
                | PRODUCTO:  %-15s     |
                | CANTIDAD:  %03d unidades     |
                | PRECIO:    $%,.2f            |
                +------------------------------+
                """;

        String reporte = String.format(plantilla, "Monitor LED", 7, 489900.99);
        System.out.println(reporte);

        // Ejemplo 1: Formateo con formatted()

        nombre = "Guillermo";
        edad = 25;
        double nota = 4.85;

        plantilla = """
                ---------------------------
                Estudiante : %s
                Edad       : %d años
                Nota Final : %.2f
                ---------------------------
                """;

        resultado = plantilla.formatted(nombre, edad, nota);
        System.out.println(resultado);

        // .formatted(...) recibe los argumentos en el mismo
        // orden que los % dentro del string.

        //🔧 Ejemplo 2: Reporte con alineación
        producto = "Laptop";
        cantidad = 14;
        precio = 4550000.50;

        plantilla = """
                +-------------------------------+
                | PRODUCTO : %-6s             |
                | CANTIDAD : %04d unidades     |
                | PRECIO   : $%,.2f            |
                +-------------------------------+
                """;

        System.out.println(plantilla.formatted(producto, cantidad, precio));

        //🎯 ¿Cuándo usar .formatted()?
        //Usa .formatted() cuando:
        //Ya tienes un text block definido.
        //Quieres mantener el código más fluido y legible.
        //No necesitas usar String.format() externamente.
    }
}
