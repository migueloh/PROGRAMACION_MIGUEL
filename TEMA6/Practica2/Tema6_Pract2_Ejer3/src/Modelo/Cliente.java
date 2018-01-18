package Modelo;

/**
 *
 * @author 1gdaw07
 */
public class Cliente extends Persona{
    
    private String telefonoContacto;

    public Cliente() {
    }

    public Cliente(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public Cliente(String telefonoContacto, String nombre, String edad) {
        super(nombre, edad);
        this.telefonoContacto = telefonoContacto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }
 
    public String mostrarCliente(){
        
        return null;
        
    }
    
}
