package tema7_pract1_ejer3;

//IMPORTS
import Modelo.*;
import Vistas.*;
import java.util.ArrayList;

/**
 *
 * @author MIGUEL
 */
public class Controladora {

    //VARIBLES GLOBALES PARA OBJETOS
    private static Menu menu;
    private static Compra compra;
    private static Venta venta;
    
    //POSICION DEL OBJETO PRODUCTO
    private static int posicion = 0;

    //PRODUCTO NUEVO
    private static Producto p;
    //SOBRE EL PRODUCTO NUEVO - QUE SERA EL VIEJO AHORA
    private static Producto v;

    //ARRAYLIST PRODUCTO
    private static ArrayList<Producto> listaProducto;
    
    //POSIBLE IVA
    //private static Double iVa = 0.21;
    
    // INICIO MAIN
    public static void main(String[] args) {

        // INICIALIZO ARRAYLIST PRODUCTO
        listaProducto = new ArrayList<>();

        abrirMenu(menu = new Menu());

    }

    //ABRIR VENTANA MENU
    public static void abrirMenu(Menu menu) {
        menu.setVisible(true);
    }

    //ABRIR VENTANA COMPRAS
    public static void abrirVentanaComprar() {
        compra = new Compra();
        compra.setVisible(true);
    }

    //ABRIR VENTANA VENTAS
    public static void abrirVentanaVenta() {
        venta = new Venta();
        venta.setVisible(true);
    }

    //RETROCEDER
    public static void abrirMenu2() {
        menu.setVisible(true);
    }

    //SALIR DE LA APP
    public static void salirAPP() {
        System.exit(0);
    }

    // FUNCION REGISTRAR PRODUCTO
    
    /* NOTA:
    No ley bien el enunciado y me fije despues que tenia que tener los productos ya creados, con
    un numero de unidades disponibles y un precio por unidad.
    
    Ejemplo:
    p = new Producto ("bolis",10,1);
    listaProductos.add(p);
    p = new Producto ("gomas",5,2);
    listaProductos.add(p);
    
    Yo lo que he hecho ha sido que el usuario tiene que registrar el producto inicialmente, las unidades
    y el precio por unidad que quiera. En este caso ese producto es el objeto P
    
    Que pasa si ahora quiero comprar mas bolis?, pues con el "if (v == null)" compruebo si ese objeto P ya existe,
    como ya exite ese producto pasa a ser V el objeto producto viejo y P se queda para el nuevo producto que se
    registre.
    
    NOTA 2:
    Para que esto se cumpla primero realizo una busqueda que si o si se tiene que hacer, 
    la funcion esta debajo de esta. 
   
    */
    public static void registrarProductos(String producto, String unidades, String precioUnidad) {

        if (v == null) {
            //CREO EL OBJETO P CON LOS DATOS PASADOS DE LA VENTANA, HAGO LOS PARSES CORRESPONDIENTES
            p = new Producto(producto, Double.parseDouble(unidades), Double.parseDouble(precioUnidad));
            //GUARDO P EN EL ARRAYLIS
            listaProducto.add(p);
        } else {
            
            /*EN ESTA VARIABLE GUARDO LA COMPROBACION QUE ME SACO DEL 
            PRECIO DE LAS UNIDADES DEL PRODUCTO REGISTRADO POR PRIMERA VEZ*/
            Double unidadesProductoViejo = v.getCantidad() * v.getPrecioUnidad();
            
            /*EN ESTA VARIBLE GUARDO LA NUEVA COMPROBACION QUE ME SACO DEL PRECIO DE 
            LAS NUEVAS UNIDADES DEL PRODUCTO QUE HE REPUESTO*/
            Double unidadesProductoNuevo = Double.parseDouble(unidades) * Double.parseDouble(precioUnidad);
            
            /*COJO LA CANTIDAD INICIAL DE UNIDADES, LE SUMO LA NUEVA CANTIDAD REPUESTA 
            Y ASI YA TENGO LA NUEVA CANTIDAD DE UNIDADES DE ESE PRODUCTO*/
            v.setCantidad(v.getCantidad() + Double.parseDouble(unidades));
            
            /*EN ESTA VARIABLE REALIZO LA SUMA "LA MEDIA QUE ME COMENTASTE" DEL PRECIO DE LAS PRIMERAS UNIDADES ADQUIRIDA  
            MAS LA SUMA DE LAS SEGUNDAS UNIDADES ADQUIRIDAS ENTRE LA CANTIDAD TOTAL DE UNIDADES DEL MISMO PRODUCTO
            
            SI QUISIERA GANAR MAS AUN CON CADA UNIDAD VENDIDA DEL PRODUCTO PODRIA AÑADIRLE UN IVA
            (((unidadesProductoViejo + unidadesProductoNuevo)/v.getCantidad())*iVa);
            */
            Double unidadesProductosMedia = (unidadesProductoViejo + unidadesProductoNuevo)/v.getCantidad();
      
            //AHORA QUE SE LA MEDIA DEL PRECIO POR UNIDADES DEL PRODUCTO, ALTERO EL PRECIO/UNIDAD 
            v.setPrecioUnidad(unidadesProductosMedia);
        }

    }

    //BUSCAR PRODUCTO - GUARDO SU POSICION Y LE DIGO A LAS VENTANAS SI EL PRODUCTO EXITE O NO
    public static boolean buscarProducto(String producto) {
        
        //CONDICION PARA SALIR 
        boolean encontrado = false;
        
        try {
            //RECORRO LA LISTA DE PRODUCTO
            for (int i = 0; i < listaProducto.size() && encontrado == false; i++) {
                if (listaProducto.get(i).getNombre().equalsIgnoreCase(producto)) {
                    //
                    posicion = i;
                    System.out.println("Producto localizado");
                    //SIEMPRE VOY A TENER QUE MOSTRAR EL PRODUCTO V "VIEJO"
                    v=listaProducto.get(posicion);
                    encontrado = true;
                }
            }
            if (encontrado == false) {
                /*
                AL NO TENER NINGUN PRODUCTO PREVIO EN EL ALMACEN, EL PROGRAMA SIEMPRE 
                ME VA A DECIR QUE EL PRODUCTO NO HA SIDO LOCALIZADO, DE ESTA FORMA ASI
                SE TIENE QUE CREAR UN PRODUCTO SI O SI. UNA VEZ YA CREADO EN LA COMPRA
                SI QUIERO AGREGAR MAS UNIDADES DE ESE PRODCUTO ME REALIZARA DE NUEVO
                UNA BUSQUEDA Y ME INIDICARA ESTA VEZ LAS UNIDAES EXISTENTES.
                
                EN LA VENTA LO MISMO, NO PUEDO VENDER UNIDADES SI NO EXISTE EL PRODUCTO
                POR ESO SE HACE UNA BUSQUEDA Y ASI SE LE INDICA AL USUARIO CUANTOS
                ARTICULOS HAY DISPONIBLES
                */
                System.out.println("Producto NO localizado");
            }
        } catch (Exception e) {
            System.out.println("Error desconocido");
        }

        return encontrado;

    }

    //COMPROBAR UNIDADES
    public static Boolean comprobarUnidades(String unidades) {

        boolean okUnidades = true;

        try {

            if (listaProducto.get(posicion).getCantidad() < Double.parseDouble(unidades)) {
                System.out.println("No tengo suficientes unidades");
                okUnidades = false;
            } else {

                System.out.println("Ok, me sobran unidades");
            }

            return okUnidades;
        } catch (Exception e) {
            System.out.println("Error desconocido");
        }

        return okUnidades;
    }

    //CALCULAR IMPORTE
    public static Double calcularImporte(String unidades) {
        double importeTotal = 0;

        try {

            importeTotal = listaProducto.get(posicion).getPrecioUnidad() * Double.parseDouble(unidades);
            return importeTotal;
        } catch (Exception e) {
        }
        return importeTotal;

    }

    /* RECALCULAR UNIDADES DISPONIBLES
    ESTA FUNCION CREADA EN CLASE ME PERMITE HACER LA RESTA ENTRE LAS UNIDADES DISPONIBLES
    Y LAS ADQUIRIDAS*/
    public static void recalcularUnidadesDisponibles(String unidades) {

        v.setCantidad(v.getCantidad() - Double.parseDouble(unidades));
        System.out.println("Cantidad actual disponible: " + p.getCantidad() + " " + v.getNombre());

    }

    /*
    FUNCION PARA QUE LA VENTANA COMPRA OBTENGA LA INFO DEL PRODUCTO
    
    1- LA CONTROLADORA HA BUSCADO EL PRODUCTO QUE LA VISTA LE HA SOLICITADO.
    2- LA VISTA AHORA LE PIDE QUE LE PASE LA INFORMACION DE ESE PRODUCTO
    */
    public static void buscarInfoProducto() {
        //3- LA CONTROLADA PASA ESA INFORMACION A LA VISTA COMPRA
        compra.mostrarInfoProducto(v.getNombre(), v.getCantidad().toString());

    }

    //TAL Y COMO ME PIDE LA VISTA VENTA LE FACILITO LA CANTIDAD DISPONIBLE DEL PRODUCTO
    public static String comprobarDisponilibilidad() {
        //COMO ESPERA UNA CADENA DE TEXTO LO CONVIERTO
        return v.getCantidad().toString();
    }
}
