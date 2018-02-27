package BD;

/**
 * @author MIGUEL
 */
public class AcontecimientoBD extends ConexionBD{
    
    
    //INSERT INTO `acontecimientos`( nombre, `lugar`, `fecha`, `hora_i`, `hora_f`, `aforo`) VALUES ([?,?,?,?,?,?)
    ps.setStrig(1, nombre);
}
