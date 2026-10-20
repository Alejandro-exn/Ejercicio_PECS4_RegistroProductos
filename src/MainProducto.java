public class MainProducto {

    public static void main(String[] args) {

        Producto producto1 = new Producto("Mouse", 25.50, 10);
        Producto producto2 = new Producto("Teclado", 40.00, 15);
        Producto producto3 = new Producto("Monitor", 180.00, 5);
        Producto producto4 = new Producto("Audifonos", 30.00, 20);
        Producto producto5 = new Producto("Parlante", 50.00, 8);

        System.out.println("Total de productos: " + Producto.getContadorProductos());
    }
}