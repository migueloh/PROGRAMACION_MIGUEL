package tema7_pract1_ejer3;

import Modelo.*;
import Vistas.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MIGUEL
 */
public class Controladora {

    private static Menu menu;
    private static Compra compra;
    private static Venta venta;

    private static int posicion = 0;

    private static Producto p;

    private static ArrayList<Producto> listaProducto;

    public static void main(String[] args) {

        // INICIO MAIN
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

    //REGISTRAR PRODUCTO
    public static void registrarProductos(String producto, String unidades, String precioUnidad) {
        Producto p = new Producto(producto, Double.parseDouble(unidades), Double.parseDouble(precioUnidad));
        listaProducto.add(p);

    }

    //BUSCAR PRODUCTO
    public static Producto buscarProducto(String producto) {

        try {

            boolean encontrado = false;

            for (int i = 0; i < listaProducto.size() && encontrado == false; i++) {
                if (listaProducto.get(i).getNombre().equalsIgnoreCase(producto)) {
                    posicion = i;
                    System.out.println("Producto localizado");
                    encontrado = true;
            }
            }
            if (encontrado == false)
                 System.out.println("Producto NO localizado");
        }
       catch (Exception e) {
            System.out.println("Error desconocido");
        }

        return listaProducto.get(posicion);

    }

    //COMPROBAR UNIDADES
    public static Boolean comprobarUnidades(String unidades) {

        boolean okUnidades = true;
        if (listaProducto.get(posicion).getCantidad() < Double.parseDouble(unidades)) {
            System.out.println("No tengo suficientes unidades");
            okUnidades = false;
        } else {

            System.out.println("Ok, me sobran unidades");
        }

        return okUnidades;
    }

    //CALCULAR IMPORTE
    public static Double calcularImporte(String unidades) {
        Double importeTotal = listaProducto.get(posicion).getPrecioUnidad() * Double.parseDouble(unidades);
        return importeTotal;

    }

    // RECALCULAR UNIDADES DISPONIBLES
    public static void recalcularUnidadesDisponibles(String unidades) {

        p.setCantidad(p.getCantidad() - Double.parseDouble(unidades));

        
    }
    
    // UNIDADES ACTUALES

    /*
    
    public static Double unidadesActuales(String unidades) {
        Double unidadesTotal = p.setCantidad(Double.parseDouble(unidades));
        return unidadesTotal;
    }
*/
    
    

}
