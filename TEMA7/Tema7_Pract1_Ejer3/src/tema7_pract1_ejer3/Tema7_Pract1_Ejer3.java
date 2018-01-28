package tema7_pract1_ejer3;

import Modelo.*;
import Vistas.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MIGUEL
 */
public class Tema7_Pract1_Ejer3 {

    private static Menu menu;
    private static Compra compra;
    private static Venta venta;
    
    private static int posicion = 0;

    private static ArrayList<Producto> listaProducto;

    public static void main(String[] args) {

        // INICIO MAIN
        listaProducto = new ArrayList<>();
        
        abrirMenu(menu = new Menu());

    }

    public static void abrirMenu(Menu menu) {

        menu.setVisible(true);
    }

    public static void abrirVentanaComprar() {
        compra = new Compra();
        compra.setVisible(true);
    }

    public static void abrirVentanaVenta() {
        venta = new Venta();
        venta.setVisible(true);
    }

    public static void registrarProductos(String producto, String unidades, String precioUnidad) {
        Producto p = new Producto(producto, Double.parseDouble(unidades), Double.parseDouble(precioUnidad));
        listaProducto.add(p);

    }

    public static Producto buscarProducto(String producto) {
        boolean encontrado = false;

        try {
            for (int i = 0; i < listaProducto.size() ||  encontrado==true; i++) {
                if (listaProducto.get(i).getNombre().equalsIgnoreCase(producto)) {
                    posicion = i;
                    System.out.println("Producto localizado");
                    encontrado=true;
                } else {
                    System.out.println("Producto NO localizado");
                    return null;
                }
            }
           
        } catch (Exception e) {
        }
  
        return listaProducto.get(posicion);

    }

    public static Boolean comprobarUnidades(String unidades) {
        
        boolean okUnidades = true;
       if(listaProducto.get(posicion).getCantidad() < Double.parseDouble(unidades)){
            System.out.println("No tengo suficientes");
            okUnidades = false;
       }else{
           
            System.out.println("ok, me sobran");
       }
       
       return okUnidades;
    }

    public static Double calcularImporte(String unidades) {
       Double importeTotal = listaProducto.get(posicion).getPrecioUnidad()* Double.parseDouble(unidades);
       return importeTotal;
        
    }

}
