package Modelo;

import java.time.LocalDate;
import java.util.Calendar;

public class Persona {
    
    private String nombre;
    // int o String
    private int dNacimiento;
    private int mNacimiento;
    private int aNacimiento;
    
    //private Date fechaNacimiento;
    private String direccion;
    private String codigoPostal;
    private String ciudad;

    public Persona(String nombre, int dNacimiento, int mNacimiento, int aNacimiento, String direccion, String codigoPostal, String ciudad) {
        this.nombre = nombre;
        this.dNacimiento = dNacimiento;
        this.mNacimiento = mNacimiento;
        this.aNacimiento = aNacimiento;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }

    public int getaNacimiento() {
        return aNacimiento;
    }

    public void setaNacimiento(int aNacimiento) {
        this.aNacimiento = aNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getdNacimiento() {
        return dNacimiento;
    }

    public void setdNacimiento(int dNacimiento) {
        this.dNacimiento = dNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getmNacimiento() {
        return mNacimiento;
    }

    public void setmNacimiento(int mNacimiento) {
        this.mNacimiento = mNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int calcularEdadv1(){
        // Si la fecha de nacimiento es 28/11/1990
        // Fecha del sistema
        Calendar c = Calendar.getInstance();
        // 2017 - 1990
        int años = c.get(Calendar.YEAR)- aNacimiento;
        // Va de 0 a 11
        // Marzo (03) - 11 < 0  Diciembre (12) -11 > 0
        int mes = (c.get(Calendar.MONTH)+1) - mNacimiento;
        
        if (mes < 0)
        {
            // Todavía no ha sido el cumpleaños
            años = años - 1;
        } 
        else
            if (mes == 0)
            {
                // Este mes es su cumpleaños
                // 11 - 28 < 0   30 - 28
                int dia = c.get(Calendar.DAY_OF_MONTH) - dNacimiento;
                if (dia < 0)
                {
                    años = años - 1;
                 }
            }
        return años;
    }
    
    /*public long calcularEdadv2(){
        LocalDate hoy = LocalDate.now();   
        LocalDate nacimiento = usuarioActivo.getFechaNacimiento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); 
        long edad = ChronoUnit.YEARS.between(nacimiento, hoy); 
    }*/
}
