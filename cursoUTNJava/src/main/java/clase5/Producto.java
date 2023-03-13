package clase5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Producto {
    private String nombre;
    private String descripcion;
    private String fechaAlta;
    private String pesoKg;
    private String precio;
    private int cantidad;



    public Producto(String nombre, String descripcion, String fechaAlta, String pesoKg, String precio, int cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaAlta = fechaAlta;
        this.pesoKg = pesoKg;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(String pesoKg) {
        this.pesoKg = pesoKg;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }



}
