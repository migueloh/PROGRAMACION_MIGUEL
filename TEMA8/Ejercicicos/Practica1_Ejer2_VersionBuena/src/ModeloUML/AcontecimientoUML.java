package ModeloUML;

import java.sql.Date;
import java.time.LocalTime;

public class AcontecimientoUML {
    
    private String nombre;
    private String lugar;
    private Date fechaAcontecimiento;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String aforo;

    public AcontecimientoUML() {
    }

    public AcontecimientoUML(String nombre, String lugar, Date fechaAcontecimiento, LocalTime horaInicio, LocalTime horaFin, String aforo) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fechaAcontecimiento = fechaAcontecimiento;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
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

    public Date getFechaAcontecimiento() {
        return fechaAcontecimiento;
    }

    public void setFechaAcontecimiento(Date fechaAcontecimiento) {
        this.fechaAcontecimiento = fechaAcontecimiento;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public String getAforo() {
        return aforo;
    }

    public void setAforo(String aforo) {
        this.aforo = aforo;
    }

    
    
    
    

    
    
    

    
    
    

   
    
}
