package Vistas;

//IMPORTS
import javax.swing.JOptionPane;
import tema7_pract1_ejer3.*;

/**
 *
 * @author MIGUEL
 */
public class Compra extends javax.swing.JFrame {

    /**
     * Creates new form Compra
     */
    public Compra() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        jLfallo.setVisible(false);
        jLok.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTproducto = new javax.swing.JTextField();
        jTunidades = new javax.swing.JTextField();
        jTprecioUnitario = new javax.swing.JTextField();
        jBvolver = new javax.swing.JButton();
        jBcomprar = new javax.swing.JButton();
        jLok = new javax.swing.JLabel();
        jLfallo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 3, 24)); // NOI18N
        jLabel1.setText("COMPRAS");

        jLabel2.setText("Producto");

        jLabel3.setText("Unidades");

        jLabel4.setText("Precio Unitario");

        jTproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTproductoActionPerformed(evt);
            }
        });

        jBvolver.setText("VOLVER");
        jBvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvolverActionPerformed(evt);
            }
        });

        jBcomprar.setText("COMPRAR");
        jBcomprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcomprarActionPerformed(evt);
            }
        });

        jLok.setForeground(new java.awt.Color(0, 102, 0));
        jLok.setText("Compra Verificada");

        jLfallo.setForeground(new java.awt.Color(204, 0, 0));
        jLfallo.setText("Compra Fallida");

        jLabel5.setForeground(new java.awt.Color(153, 153, 0));
        jLabel5.setText("ENTER");

        jLabel6.setForeground(new java.awt.Color(153, 153, 0));
        jLabel6.setText("CLICK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBvolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTprecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTunidades, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(jTproducto))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jBcomprar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLok, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLfallo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3))
                    .addComponent(jTunidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTprecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcomprar)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLfallo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLok, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jBvolver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcomprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcomprarActionPerformed
        // BOTON COMPRAR
        try {
            //PRIMERA COMPROBACION SI LOS CAMPOS ESTAN VACIOS
            if (jTproducto.getText().isEmpty() || jTunidades.getText().isEmpty() || jTprecioUnitario.getText().isEmpty()) {
                jLfallo.setVisible(true);
                JOptionPane.showMessageDialog(this, "Los campos son obligatorios");
                jLfallo.setVisible(false);

            } else {
                Controladora.buscarProducto(jTproducto.getText());
                Controladora.registrarProductos(jTproducto.getText(), jTunidades.getText(), jTprecioUnitario.getText());
                jLok.setVisible(true);
                JOptionPane.showMessageDialog(this, "Productos Comprados.");
                resetearCampos();

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error desconocido al comprar");
        }


    }//GEN-LAST:event_jBcomprarActionPerformed

    private void jBvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvolverActionPerformed
        // VOLVER AL MENU PRINCIPAL
        try {
            this.setVisible(false);
            Controladora.abrirMenu2();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jBvolverActionPerformed

    private void jTproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTproductoActionPerformed
        // BOTON ENTER COMPRA PRODUCTO

        try {

            //LE PIDO A LA CONTROLADORA QUE ME BUSQUE EL PRODUCTO
            boolean localizado = Controladora.buscarProducto(jTproducto.getText().toLowerCase());

            /*SI ME LO ENCUENTRA, LA CONTROLADRA LE DIRA QUE HA SIDO ENCONTRADO A LA VENTANA.
            PERO AHORA MANTENIENDO EL MODELO VISTA CONTROLADOR, LA VISTA LE VUELVE A PEDIR
            AL CONTROLADOR QUE AHORA LE BUSQUE LA INFORMACION DEL PRODUCTO*/
            if (localizado == true) {
                Controladora.buscarInfoProducto();
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, "Error desconocido");
        }


    }//GEN-LAST:event_jTproductoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Compra.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compra.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compra.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compra.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcomprar;
    private javax.swing.JButton jBvolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLfallo;
    private javax.swing.JLabel jLok;
    private javax.swing.JTextField jTprecioUnitario;
    private javax.swing.JTextField jTproducto;
    private javax.swing.JTextField jTunidades;
    // End of variables declaration//GEN-END:variables

    // FUNCIONES PROPIAS PARA LA VENTANA
    
    //RESETEAR CAMPOS DE TEXTO
    public void resetearCampos() {
        jTproducto.setText(null);
        jTunidades.setText(null);
        jTprecioUnitario.setText(null);
        jLok.setVisible(false);
    }

    // FUNCION QUE LE PERMITE A LA VISTA COMPRA OBTENER EL NOMBRE DEL PRODUCTO Y LAS UNIDADES DE ESTE
    public void mostrarInfoProducto(String producto, String unidades) {
        JOptionPane.showMessageDialog(this, "Se dispone de " + unidades + " " + producto);
    }
}
