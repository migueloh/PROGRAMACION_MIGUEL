package Excepciones;

public class ProblemasConexion extends Exception{
    
    private String mensaje;

    public ProblemasConexion() {
    }

    public ProblemasConexion(String mensaje) {
        mensaje = "Problemas con la conexion";
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    
}
