
package Modelo;

/**
 *
 * @author MIGUEL
 */
public class Producto {
    
    private String nombre;
    private Double cantidad;
    private Double precioUnidad;

    public Producto() {
    }

    public Producto(String nombre, Double cantidad, Double precioUnidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(Double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
    
    
    
}
