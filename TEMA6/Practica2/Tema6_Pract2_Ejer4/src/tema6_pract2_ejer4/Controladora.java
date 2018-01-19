package tema6_pract2_ejer4;

//IMPORT NECESARIO PARA UTILIZAR LAS CLASES DEL MODELO
import Modelo.*;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

/**
 * @author 1gdaw07 Miguel Olmo Hernando
 */
public class Controladora {

    public static void main(String[] args) {
        // INICIO MAIN

        JOptionPane.showMessageDialog(null, "Sera abierta una pagina web con un manual en PDF sobre las relaciones en JAVA");

        if (java.awt.Desktop.isDesktopSupported()) {
            try {
                Desktop dk = Desktop.getDesktop();
                dk.browse(new URI("http://www.vc.ehu.es/jiwotvim/ISOFT2007-2008/Teoria/BloqueII/6.%20UML%20a%20Codigo%20Java.pdf"));
            } catch (Exception e) {
                System.out.println("Error al abrir URL: " + e.getMessage());
            }
        }

    }

}
