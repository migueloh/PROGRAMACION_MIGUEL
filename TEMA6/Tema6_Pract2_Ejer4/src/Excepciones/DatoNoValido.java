package Excepciones;

/**
 *
 * @author 1gdaw10 MIGUEL OLMO HERNANDO
 */
public class DatoNoValido extends Exception {

    private final int numeroExcepcion;
    private String mensajeConLaExcepcion;

    public DatoNoValido(int numeroExcepcion) {
        this.numeroExcepcion = numeroExcepcion;
    }

    // FUNCIONES DE LA CLASE
    public String tipoExcepcion() {

        switch (numeroExcepcion) {
            case 1:
                mensajeConLaExcepcion = "Los campos son Obligatorios. "
                        + "\nNo puedes dejarlos en blanco.";
                break;
            case 2:
                mensajeConLaExcepcion = "El Nombre introducido no "
                        + "cumple los requisitos.";
                break;
            case 3:
                mensajeConLaExcepcion = "El Año introducido no "
                        + "cumple los requisitos.";
                break;
            case 4:
                mensajeConLaExcepcion = "El Mes introducido no "
                        + "cumple los requisitos.";
                break;
            case 5:
                mensajeConLaExcepcion = "El Dia introducido no "
                        + "cumple los requisitos.";
                break;
            case 6:
                mensajeConLaExcepcion = "La Fecha generada a partir de los "
                        + "datos introducidos no es valida.";
                break;
            case 7:
                mensajeConLaExcepcion = "La Direccion introducida "
                        + "no cumple los requisitos.";
                break;
            case 8:
                mensajeConLaExcepcion = "La Ciudad introducida "
                        + "no cumple los requisitos.";
                break;
            case 9:
                mensajeConLaExcepcion = "El Codido Postal introducida "
                        + "no cumple los requisitos.";
                break;
            case 10:
                mensajeConLaExcepcion = "Error en la validacion de la Expresion Regular.";
                break;

            default:
                mensajeConLaExcepcion = "Lo siento se ha probocado un error desconocido.";
                break;
        }
        return mensajeConLaExcepcion;
    }

}
