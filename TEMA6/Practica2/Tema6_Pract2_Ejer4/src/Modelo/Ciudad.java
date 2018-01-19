package Modelo;

import java.util.ArrayList;

public class Ciudad {

    //ATRIBUTOS PROPIOS DE LA CLASE
    private String codigoCiudad;
    private String nombre;

    // RELACIONES
    private ArrayList<Vuelo> liVuelos;
    
    
    //CONSTRUCTORES
    public Ciudad() {
    }

    public Ciudad(String codigoCiudad, String nombre, ArrayList<Vuelo> liVuelos) {
        this.codigoCiudad = codigoCiudad;
        this.nombre = nombre;
        this.liVuelos = liVuelos;
    }

    // GETTERS AND SETTERS
    public String getCodigoCiudad() {
        return codigoCiudad;
    }

    public void setCodigoCiudad(String codigoCiudad) {
        this.codigoCiudad = codigoCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Ciudad obtener() {
        return null;
    }
}
