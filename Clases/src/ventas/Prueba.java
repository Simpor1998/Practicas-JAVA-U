package ventas;

public class Prueba {
    public static void main(String[] args) {
        System.out.println("***Sistema de Ventas***");
        var producto = new Producto("Blusa",350.00);
        System.out.println(producto);
        var producto2 = new Producto("Blanco",140.00);
        System.out.println(producto2);
        //Onjeto tipo orden

        var orden1 = new Orden();
        orden1.agregarProducto(producto);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto2);
        System.out.println(orden1);
//        orden1.mostrarOrden();
//        Haremos un  cambio en el metodo de mostrar orden reorganizandolo con el ToString
        var orden2 = new Orden();
        orden2.agregarProducto(producto);
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto);
        orden2.agregarProducto(producto2);

        var producto3 = new Producto("Playera",139.00);
        System.out.println(producto3);
        var producto4 = new Producto("Zapa",20.00);
        System.out.println(producto4);
        var producto5 = new Producto("corba",80.00);
    }
}
