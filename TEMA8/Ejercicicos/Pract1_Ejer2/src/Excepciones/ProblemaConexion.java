package Excepciones;

public class ProblemaConexion extends Exception{

    private String mensaje = "";
    
    public ProblemaConexion(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
