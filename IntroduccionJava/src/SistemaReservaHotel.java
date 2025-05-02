public class SistemaReservaHotel {
    public static void main(String[] args) {
        var nombreCliente = "Guillermo Hernandez";
        var diasEstancia = 15;
        final var tarifaDiaria = 15.50;
        var habitacionVistaMar = true;

        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("habitacionVistaMar = " + habitacionVistaMar);

        //cambio de variables

        nombreCliente = "Luis Bedoya";
        diasEstancia = 19;
        habitacionVistaMar = false;
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("habitacionVistaMar = " + habitacionVistaMar);
    }
}
