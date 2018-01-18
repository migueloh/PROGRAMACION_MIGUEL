package Modelo;

public class Directivo extends Empleado{
    
    private String categoria;

    public Directivo() {
    }

    public Directivo(String categoria) {
        this.categoria = categoria;
    }

    public Directivo(String categoria, double sueldoBruto) {
        super(sueldoBruto);
        this.categoria = categoria;
    }

    public Directivo(String categoria, double sueldoBruto, String nombre, String edad) {
        super(sueldoBruto, nombre, edad);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
    //METODOS PROPIOS DE LA CLASE
    public String mostrarDirectivo(){
        
        return null;
    }
}
