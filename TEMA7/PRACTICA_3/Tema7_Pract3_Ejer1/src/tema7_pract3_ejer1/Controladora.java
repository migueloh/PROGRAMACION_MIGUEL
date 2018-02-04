package tema7_pract3_ejer1;

import Vistas.*;
import Modelo.*;
import java.util.ArrayList;


/**
 *
 * @author 1gdaw09 MIGUEL OLMO
 */
public class Controladora {

    private static ArrayList listaClientes;
    private static ArrayList listaProveedores;
    private static ArrayList listaProductos;
    
    // VARIABLES PARA OBJETOS
    private static Almacen aVa;
    
    private static Cliente objetoCliente;
    private static Proveedor objetoProveedor;
    
    private static Producto objetoProducto;
    
    
    //DESCUENTOS
    private final static Double descuentoVolumen = 0.20;
    private final static Double descuentoProntoPago = 0.30;

    public static void main(String[] args) {

        // INICIO MAIN
        
        listaClientes = new ArrayList<>();
        listaProveedores = new ArrayList<>();
        listaProductos = new ArrayList<>();
        crearBaseDatosInterna();
        abirVentanaAlmacen(aVa = new Almacen());

    }

    //MI BASE DE DATOS INTERNA
    public static void crearBaseDatosInterna() {
        
        objetoCliente.(0, "Miguel");
        listaProductos.add(objetoCliente);
    }

    //ABRIR VENTANA ALMACEN
    public static void abirVentanaAlmacen(Almacen almacen) {
        aVa.setVisible(true);
    }

    // VALIDAR NOMBRE DEL PRODUCTO
    public static void validarProducto(String nombreProducto) {

    }

}
