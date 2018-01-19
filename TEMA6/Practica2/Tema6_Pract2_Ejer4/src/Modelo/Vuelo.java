package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Vuelo {

    //ATRIBUTOS PROPIOS DE LA CLASE
    private int numeroDeVuelo;
    private String horaDeSalida;
    private String horaDeLlegada;
    private String lugarDeHorigen;
    private String lugarDeDestino;
    private Date fechaDeSalida;
    private Date fechaDeegreso;
    private String tipoDeVuelo;
    
    //RELACIONES
    private Ciudad ciudad;
    private Avion avion;
    private Piloto piloto;
    private ArrayList <Asiento> liAsientos;
 
    //ESTA ES MI RESPUESTA A LA RELACION MAL PLANTEADA EN EL DIAGRAMA 
    private ArrayList <Pasajero> liPasajeros;

    
    //CONSTRUCTORES
    public Vuelo() {
    }

    public Vuelo(int numeroDeVuelo, String horaDeSalida, String horaDeLlegada, String lugarDeHorigen, String lugarDeDestino, Date fechaDeSalida, Date fechaDeegreso, String tipoDeVuelo, Ciudad ciudad, Avion avion, Piloto piloto, ArrayList<Asiento> liAsientos, ArrayList<Pasajero> liPasajeros) {
        this.numeroDeVuelo = numeroDeVuelo;
        this.horaDeSalida = horaDeSalida;
        this.horaDeLlegada = horaDeLlegada;
        this.lugarDeHorigen = lugarDeHorigen;
        this.lugarDeDestino = lugarDeDestino;
        this.fechaDeSalida = fechaDeSalida;
        this.fechaDeegreso = fechaDeegreso;
        this.tipoDeVuelo = tipoDeVuelo;
        this.ciudad = ciudad;
        this.avion = avion;
        this.piloto = piloto;
        this.liAsientos = liAsientos;
        this.liPasajeros = liPasajeros;
    }
    
    // GETTERS AND SETTERS
    public int getNumeroDeVuelo() {
        return numeroDeVuelo;
    }

    public void setNumeroDeVuelo(int numeroDeVuelo) {
        this.numeroDeVuelo = numeroDeVuelo;
    }

    public String getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(String horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public String getHoraDeLlegada() {
        return horaDeLlegada;
    }

    public void setHoraDeLlegada(String horaDeLlegada) {
        this.horaDeLlegada = horaDeLlegada;
    }

    public String getLugarDeHorigen() {
        return lugarDeHorigen;
    }

    public void setLugarDeHorigen(String lugarDeHorigen) {
        this.lugarDeHorigen = lugarDeHorigen;
    }

    public String getLugarDeDestino() {
        return lugarDeDestino;
    }

    public void setLugarDeDestino(String lugarDeDestino) {
        this.lugarDeDestino = lugarDeDestino;
    }

    public Date getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(Date fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    public Date getFechaDeegreso() {
        return fechaDeegreso;
    }

    public void setFechaDeegreso(Date fechaDeegreso) {
        this.fechaDeegreso = fechaDeegreso;
    }

    public String getTipoDeVuelo() {
        return tipoDeVuelo;
    }

    public void setTipoDeVuelo(String tipoDeVuelo) {
        this.tipoDeVuelo = tipoDeVuelo;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public ArrayList<Asiento> getLiAsientos() {
        return liAsientos;
    }

    public void setLiAsientos(ArrayList<Asiento> liAsientos) {
        this.liAsientos = liAsientos;
    }

    public ArrayList<Pasajero> getLiPasajeros() {
        return liPasajeros;
    }

    public void setLiPasajeros(ArrayList<Pasajero> liPasajeros) {
        this.liPasajeros = liPasajeros;
    }
   
    

    
    //METODOS PROPIOS DE LA CLASE
    
    public void reservar() {
    }

    public void modificar() {
    }

    public void eliminar() {
    }

    public Vuelo buscar() {
        return null;
    }

}
