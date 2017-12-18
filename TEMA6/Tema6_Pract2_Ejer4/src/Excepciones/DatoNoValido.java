package Excepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw10 MIGUEL OLMO HERNANDO
 */
public class DatoNoValido extends Exception {

    private int numeroExcepcion;
    private String mensajeConLaExcepcion;

    public int getNumeroExcepcion() {
        return numeroExcepcion;
    }

    public void setNumeroExcepcion(int numeroExcepcion) {
        this.numeroExcepcion = numeroExcepcion;
    }

    public String getMensajeConLaExcepcion() {
        return mensajeConLaExcepcion;
    }

    public void setMensajeConLaExcepcion(String mensajeConLaExcepcion) {
        this.mensajeConLaExcepcion = mensajeConLaExcepcion;
    }

    // FUNCIONES DE LA CLASE
    public String SwitchMensajesErrores() {

        switch (numeroExcepcion) {
            case 1:
                mensajeConLaExcepcion = "Los campos son Obligatorios."
                                        + "\nNo puedes dejarlos en blanco.";
                break;
            case 2:
                mensajeConLaExcepcion = "La fecha generada a partir de los "
                                      + "datos introducidos no es valida.";
                break;
            case 3:
                mensajeConLaExcepcion = "";
                break;
            case 4:
                mensajeConLaExcepcion = "";
                break;
            case 5:
                mensajeConLaExcepcion = "";
                break;
            case 6:
                mensajeConLaExcepcion = "";
                break;

            default:
                mensajeConLaExcepcion = "";
                break;         
        }
        return mensajeConLaExcepcion;
    }


}
