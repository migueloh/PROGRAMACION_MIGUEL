package Modelo;

/**
 *
 * @author 1gdaw09
 */
public class Multa {
    
private String dinero;
private String infraccion;

    public Multa() {
    }

    public Multa(String dinero, String infraccion) {
        this.dinero = dinero;
        this.infraccion = infraccion;
    }

    public String getDinero() {
        return dinero;
    }

    public void setDinero(String dinero) {
        this.dinero = dinero;
    }

    public String getInfraccion() {
        return infraccion;
    }

    public void setInfraccion(String infraccion) {
        this.infraccion = infraccion;
    }




}
