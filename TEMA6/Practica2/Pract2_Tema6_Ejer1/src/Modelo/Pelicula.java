package Modelo;

import java.util.ArrayList;

/**
 * @author 1gdaw12 MIGUEL OLMO HERNANDO
 */

public class Pelicula {
    
    private String titulo;
    private double duracion;
    private String tipo;
    
    
    private char[] anio;
    
    private ArrayList<Estudio> listaEstudios;

    public Pelicula() {
    }

    public Pelicula(String titulo, double duracion, String tipo, char[] anio) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.tipo = tipo;
        this.anio = anio;
        this.listaEstudios = listaEstudios;  
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
    }

    public ArrayList<Estudio> getListaEstudios() {
        return listaEstudios;
    }

    public void setListaEstudios(ArrayList<Estudio> listaEstudios) {
        this.listaEstudios = listaEstudios;
    }
    
    

    
    
    
    

    
    
    
}
