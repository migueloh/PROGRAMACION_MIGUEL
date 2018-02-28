package ModeloUML;

import java.sql.Time;

public class AcontecimientoUML {
    
    private String nombre;
    private String lugar;
    private java.sql.Time fechaAcontecimiento;
    private java.sql.Time horaInicio;
    private java.sql.Time horaFin;

    public AcontecimientoUML() {
    }

    public AcontecimientoUML(String nombre, String lugar, Time fechaAcontecimiento, Time horaInicio, Time horaFin) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fechaAcontecimiento = fechaAcontecimiento;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
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

    public Time getFechaAcontecimiento() {
        return fechaAcontecimiento;
    }

    public void setFechaAcontecimiento(Time fechaAcontecimiento) {
        this.fechaAcontecimiento = fechaAcontecimiento;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }
    

    
}
