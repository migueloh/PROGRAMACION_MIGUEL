package Modelo;

import java.util.ArrayList;

public class Piloto {

    //ATRIBUTOS PROPIOS DE LA CLASE
    private String codigoDePiloto;
    private String nombre;
    private String apellido;
    private Integer numeroDeLiencia;
    
    //RELACIONES
    private ArrayList <Vuelo> liVuelos;

    //CONSTRUCTORES
    public Piloto() {
    }

    public Piloto(String codigoDePiloto, String nombre, String apellido, Integer numeroDeLiencia, ArrayList<Vuelo> liVuelos) {
        this.codigoDePiloto = codigoDePiloto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeLiencia = numeroDeLiencia;
        this.liVuelos = liVuelos;
    }
    
    // GETTERS AND SETTERS
    public String getCodigoDePiloto() {
        return codigoDePiloto;
    }

    public void setCodigoDePiloto(String codigoDePiloto) {
        this.codigoDePiloto = codigoDePiloto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNumeroDeLiencia() {
        return numeroDeLiencia;
    }

    public void setNumeroDeLiencia(Integer numeroDeLiencia) {
        this.numeroDeLiencia = numeroDeLiencia;
    }

    public ArrayList<Vuelo> getLiVuelos() {
        return liVuelos;
    }

    public void setLiVuelos(ArrayList<Vuelo> liVuelos) {
        this.liVuelos = liVuelos;
    }

    
    
    //METODOS PROPIOS DE LA CLASE
    public void agregarNuevo() {

    }

    public void asignarVuelo() {

    }

    public void cancelarVuelo() {

    }

    public void modificar() {

    }

    public Piloto buscar() {
        return null;
    }

}
