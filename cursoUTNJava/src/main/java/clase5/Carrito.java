package clase5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Carrito {
    Producto[] carrito = new Producto[3];
    int indice = 0;

    public Carrito(Producto[] carrito, int indice) {
        this.carrito = carrito;
        this.indice = indice;
    }

    public Carrito() {

    }

    public void agregarProducto (Producto producto){
        if (indice <= 2){
            carrito[this.indice] = producto;
            this.indice++;
        }else{
            System.out.println("el carrito esta lleno");
        }

    }

    public void borrarProducto (String nombre) {

        for (int i = 0; i < carrito.length; i++){
            if (carrito[i].getNombre().equals(nombre)){
                carrito[i] = null;
                indice --;
            }

        }
    }

    public void cargarDesdeArchivo() {
        String entrada = "C:\\Users\\Pablo\\Documents\\UTN Java\\Clase5\\Practica.txt";

        try {
            for (String productoLeido : Files.readAllLines(Paths.get(entrada))) {
                String[] prSplit = productoLeido.split(";");

                Producto leido = new Producto();
                leido.setNombre(prSplit[0]);
                leido.setDescripcion(prSplit[1]);
                leido.setFechaAlta(prSplit[2]);
                leido.setPesoKg(prSplit[3]);
                leido.setPrecio(prSplit[4]);
                leido.setCantidad(Integer.parseInt(prSplit[5]));

                agregarProducto(leido);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public int precio() {
        int total = 0;
        for (Producto pr : carrito){
            total += Integer.parseInt(pr.getPrecio());
        }
        return total;
    }
}
