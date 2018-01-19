package Modelo;

import java.util.ArrayList;

public class Avion {

    //ATRIBUTOS PROPIOS DE LA CLASE
    private String aerolinea;
    private String codigoDeAvion;
    private int numeroDeAsientos;
    private String compartimentos;
    
    //RELACIONES
    private ArrayList <Vuelo> liVuelos;

    //CONSTRUCTORES
    public Avion() {
    }

    public Avion(String aerolinea, String codigoDeAvion, int numeroDeAsientos, String compartimentos, ArrayList<Vuelo> liVuelos) {
        this.aerolinea = aerolinea;
        this.codigoDeAvion = codigoDeAvion;
        this.numeroDeAsientos = numeroDeAsientos;
        this.compartimentos = compartimentos;
        this.liVuelos = liVuelos;
    }

    //GETTERS AND SETTERS
    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getCodigoDeAvion() {
        return codigoDeAvion;
    }

    public void setCodigoDeAvion(String codigoDeAvion) {
        this.codigoDeAvion = codigoDeAvion;
    }

    public int getNumeroDeAsientos() {
        return numeroDeAsientos;
    }

    public void setNumeroDeAsientos(int numeroDeAsientos) {
        this.numeroDeAsientos = numeroDeAsientos;
    }

    public String getCompartimentos() {
        return compartimentos;
    }

    public void setCompartimentos(String compartimentos) {
        this.compartimentos = compartimentos;
    }

    public ArrayList<Vuelo> getLiVuelos() {
        return liVuelos;
    }

    public void setLiVuelos(ArrayList<Vuelo> liVuelos) {
        this.liVuelos = liVuelos;
    }
    
    
    
    //METODOS PROPIOS DE LA CLASE

    public void asignarAvuelo() {

    }

    public Avion obtener() {
        return null;
    }

    public void cancelarVuelo() {

    }

}
