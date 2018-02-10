package Modelo;

/**
 * @author 1gdaw09
 */
public class Contrato {
    
    //ATRIBUTOS PROPIOS DE LA CLASE
    private String tipoDeContrato;
    
    
    //CONTRUCTORES
    public Contrato() {
    }

    public Contrato(String tipoDeContrato) {
        this.tipoDeContrato = tipoDeContrato;
    }
    
    //GETTERS & SETTERS
    public String getTipoDeContrato() {
        return tipoDeContrato;
    }

    public void setTipoDeContrato(String tipoDeContrato) {
        this.tipoDeContrato = tipoDeContrato;
    }
    
    
   
    
    
    
    
}
