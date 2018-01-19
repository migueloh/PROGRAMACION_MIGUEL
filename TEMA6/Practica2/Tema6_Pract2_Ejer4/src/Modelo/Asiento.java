package Modelo;

public class Asiento {

    //ATRIBUTOS PROPIOS DE LA CLASE
    private int NumeroDeAsiento;
    private Boolean estado;
    private String compartimento;
    
    //RELACIONES
    private Vuelo vuelo;
    private Pasajero pasajero;

    //CONSTRUCORES
    public Asiento() {
    }

    public Asiento(int NumeroDeAsiento, Boolean estado, String compartimento, Vuelo vuelo, Pasajero pasajero) {
        this.NumeroDeAsiento = NumeroDeAsiento;
        this.estado = estado;
        this.compartimento = compartimento;
        this.vuelo = vuelo;
        this.pasajero = pasajero;
    }

    //GETTERS AND SETTERS
    public int getNumeroDeAsiento() {
        return NumeroDeAsiento;
    }

    public void setNumeroDeAsiento(int NumeroDeAsiento) {
        this.NumeroDeAsiento = NumeroDeAsiento;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getCompartimento() {
        return compartimento;
    }

    public void setCompartimento(String compartimento) {
        this.compartimento = compartimento;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
    
    
    
    //METODOS PROPIOS DE LA CLASE
    public void reservar() {

    }

    public void comprar() {

    }

    public boolean mostrarDisponibilidad() {
        return this.estado;
    }

    public void desbloquear() {

    }

}
