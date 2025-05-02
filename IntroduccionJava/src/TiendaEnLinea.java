public class TiendaEnLinea {
    public static void main(String[] args) {
        String nombreProducto;
        double precio;
        int cantidadDisponible;
        boolean diponibleVenta;

        nombreProducto = "Pan";
        precio = 50;
        cantidadDisponible = 2;
        diponibleVenta = true;
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio del producto: " + precio);
        System.out.println("Cantidad de disponible: " + cantidadDisponible);
        System.out.println("Diponible Venta: " + diponibleVenta);

        nombreProducto = "azucar";
        precio = 10;
        cantidadDisponible = 5;
        diponibleVenta = false;
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio del producto: " + precio);
        System.out.println("Cantidad de disponible: " + cantidadDisponible);
        System.out.println("Diponible Venta: " + diponibleVenta);

        nombreProducto = "maiz";
        precio = 20;
        cantidadDisponible = 10;
        diponibleVenta = false;
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio del producto: " + precio);
        System.out.println("Cantidad de disponible: " + cantidadDisponible);
        System.out.println("Diponible Venta: " + diponibleVenta);


    }
}
