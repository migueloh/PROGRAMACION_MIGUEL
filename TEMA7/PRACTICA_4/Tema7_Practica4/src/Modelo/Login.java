package Modelo;

/**
 * @author 1gdaw09
 */
public class Login {
    
    //ATRIBUTOS PROPIOS DE LA CLASE
    private String usuario;
    private String contrasena;
    
    //CONTRUCTORES
    public Login() {
    }
        public Login(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    //GETTERS & SETTERS
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }



    
    
    
    
}
