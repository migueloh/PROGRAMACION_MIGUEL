package Modelo;

/**
 * @author 1gdaw07
 */

public class Empleado extends Persona{
    
    private double sueldoBruto;

    public Empleado() {
    }

    public Empleado(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public Empleado(double sueldoBruto, String nombre, String edad) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    

    //METODOS PROPIOS DE LA CLASE
    
    public String mostrarEmpleado(){
        
        return null;
    }
    
    public void calcularSalarioNeto(){
        
    }
   
    
    
    
}
