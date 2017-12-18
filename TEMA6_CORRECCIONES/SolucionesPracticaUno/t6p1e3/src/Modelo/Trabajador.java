
package Modelo;

public class Trabajador {
    private String nombre;
    private String nss;
    private int antiguedad;

    public Trabajador(String nombre, String nss, int antiguedad) {
        this.nombre = nombre;
        this.nss = nss;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", nss=" + nss + ", antiguedad=" + antiguedad + '}';
    }

    
}
