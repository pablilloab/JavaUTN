package clase5;

import java.util.Scanner;


public class Supermercado {
    public static void main(String[] args) {
        Scanner red = new Scanner(System.in);

        Producto manzanas = new Producto("Manzana","Manzana Chilena","10/03/2023","50","250", 5);
        Producto peras = new Producto("Pera","Pera San Pedro", "10/03/2023","50","107", 2);
        Producto banana = new Producto("Banana","Banana Ecuador","10/03/2023","25","890", 3);

        Carrito miCarrito = new Carrito();

        miCarrito.agregarProducto(manzanas);
        miCarrito.agregarProducto(peras);
        miCarrito.agregarProducto(banana);

        miCarrito.agregarProducto(manzanas);

        miCarrito.borrarProducto("Pera");

        miCarrito.agregarProducto(manzanas);

    }
}
