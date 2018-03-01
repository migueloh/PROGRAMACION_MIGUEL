package Modelo.UML;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalTime;

// http://www.oracle.com/technetwork/es/articles/java/paquete-java-time-2390472-esa.html

public class Acontecimiento {
    // No pongo id
    private String nombre;
    private String lugar;
    private Date fecha;
    // Notación camel
    private LocalTime horaI;
    private LocalTime horaF;
    private Integer aforo;

    public Acontecimiento() {
    }

    public Acontecimiento(String nombre, String lugar, Date fecha, LocalTime horaI, LocalTime horaF, Integer aforo) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.horaI = horaI;
        this.horaF = horaF;
        this.aforo = aforo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    public LocalTime getHoraI(){
        return horaI;
    }

    public void setHoraI(LocalTime horaI) {
        this.horaI = horaI;
    }
    
    public LocalTime getHoraF(){
        return horaF;
    }

    public void setHoraF(LocalTime horaF) {
        this.horaF = horaF;
    }

    public Integer getAforo() {
        return aforo;
    }

    public void setAforo(Integer numeroAsistentes) {
        this.aforo = numeroAsistentes;
    }
    
    @Override
    public String toString(){
        return nombre + " " + lugar + " " + fecha + " " + getHoraI() + " " + getHoraF() + " "  + aforo;
    }
}
