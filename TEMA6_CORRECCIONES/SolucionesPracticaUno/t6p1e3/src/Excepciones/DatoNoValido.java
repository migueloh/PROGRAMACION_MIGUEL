
package Excepciones;

public class DatoNoValido extends Exception{
    private int tipo;
    private String mensaje;

    public DatoNoValido(int tipo) {
        this.tipo = tipo;
    }
    
    public String getMessage(){
        
        switch(tipo)
        {
            case 1:
                mensaje =  "El nombre no es válido";
                break;
            case 2:
                mensaje =  "El número de la seguridad social no es válido";
                break;   
            case 3:
                mensaje =  "Antiguedad no válida";
                break;
        }
        return mensaje;
    }
    
}
