package Excepciones;

/**
 *
 * @author MIGUEL
 */
public class CampoVacio {
    
    private String message;
    
    public CampoVacio(){
        
    }
    public CampoVacio(String mensajeAlerta){
        message=mensajeAlerta;
    }
    public String getMessage(){
        return message;
    }




    
}
