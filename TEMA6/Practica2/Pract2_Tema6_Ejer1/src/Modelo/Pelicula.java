package Modelo;

/**
 * @author 1gdaw12 MIGUEL OLMO HERNANDO
 */

public class Pelicula {
    
    private String titulo;
    private double duracion;
    private String tipo;
    
    
    private char[] anio;

    public Pelicula(String titulo, double duracion, String tipo) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public char[] getAnio() {
        return anio;
    }

    public void setAnio(char[] anio) {
        this.anio = anio;
        this.anio = new char[4];
    }
    
    
}
