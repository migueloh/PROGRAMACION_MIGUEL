package Excepciones;

public class ProblemasFecha extends Exception {

    private String mensaje;

    public ProblemasFecha (String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

}
