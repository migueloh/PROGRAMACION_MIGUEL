package Vistas;

import Modelo.*;
import tema7_practica4.*;

/**
 * @author 1gdaw09
 */
public class GestionPersonal extends javax.swing.JFrame {

    /**
     * Creates new form GestionPersonal
     * @param nombre
     */
    public GestionPersonal(String nombre) {
        initComponents();

        jLbienvenida.setText(nombre);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        estadoCivil = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBaceptar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jRhombre = new javax.swing.JRadioButton();
        jRmujer = new javax.swing.JRadioButton();
        jRsolteria = new javax.swing.JRadioButton();
        jRmatrimonio = new javax.swing.JRadioButton();
        jCtipoContrato = new javax.swing.JComboBox<>();
        jCdepartamento = new javax.swing.JComboBox<>();
        jTdni = new javax.swing.JTextField();
        jTnss = new javax.swing.JTextField();
        jTnombre = new javax.swing.JTextField();
        jTapellidos = new javax.swing.JTextField();
        jTtelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTnumeroEmpleado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jDfecha = new com.toedter.calendar.JDateChooser();
        jLbienvenida = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTdireccion = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMsesion = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMsalir = new javax.swing.JMenuItem();
        jMadmin = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMalta = new javax.swing.JMenuItem();
        jMmodificar = new javax.swing.JMenuItem();
        jMbaja = new javax.swing.JMenuItem();
        jMlistar = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DNI");

        jLabel2.setText("NSS");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellidos");

        jLabel5.setText("Teléfono");

        jLabel6.setText("Sexo");

        jBaceptar.setText("Aceptar");
        jBaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaceptarActionPerformed(evt);
            }
        });

        jBsalir.setText("SALIR");

        sexo.add(jRhombre);
        jRhombre.setText("Hombre");

        sexo.add(jRmujer);
        jRmujer.setText("Mujer");

        estadoCivil.add(jRsolteria);
        jRsolteria.setText("Soltero / Soltera");

        estadoCivil.add(jRmatrimonio);
        jRmatrimonio.setText("Casado / Casada");

        jCtipoContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCdepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Estado Civil");

        jLabel8.setText("Tipo de Contrato");

        jLabel9.setText("Departamento");

        jLabel10.setText("Fecha de Alta");

        jLabel11.setText("Nº Empleado");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("Bienvenid@");

        jLabel13.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel13.setText("Indica previamente en el el Menú superior la accion a realizar. ");

        jLbienvenida.setText("nope");

        jLabel14.setText("Dirección");

        jMsesion.setText("Archivo");
        jMsesion.add(jSeparator3);

        jMenuItem1.setText("Cerrar Sesion");
        jMsesion.add(jMenuItem1);

        jMsalir.setText("Salir del Programa");
        jMsesion.add(jMsalir);

        jMenuBar1.add(jMsesion);

        jMadmin.setText("Administrar Personal");
        jMadmin.add(jSeparator1);

        jMalta.setText("Dar de Alta");
        jMadmin.add(jMalta);

        jMmodificar.setText("Modificar Empleado");
        jMadmin.add(jMmodificar);

        jMbaja.setText("Dar de Baja");
        jMadmin.add(jMbaja);

        jMenuBar1.add(jMadmin);

        jMlistar.setText("Generar Listados");
        jMlistar.add(jSeparator2);

        jMenuItem2.setText("Listado por Nº Empleado");
        jMlistar.add(jMenuItem2);

        jMenuItem3.setText("Listado por Departamento");
        jMlistar.add(jMenuItem3);

        jMenuItem4.setText("Listado por Contrato");
        jMlistar.add(jMenuItem4);

        jMenuItem5.setText("Listado Completo de Empleados");
        jMenuItem5.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jMenuItem5MenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        jMenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem5MouseClicked(evt);
            }
        });
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMlistar.add(jMenuItem5);

        jMenuBar1.add(jMlistar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jBaceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jCtipoContrato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCdepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRsolteria)
                                        .addComponent(jRhombre))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRmujer)
                                        .addComponent(jRmatrimonio))))
                            .addComponent(jTnumeroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(29, 29, 29)
                        .addComponent(jLbienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel14))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTnss, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(jTnombre)
                            .addComponent(jTapellidos)
                            .addComponent(jTdni)
                            .addComponent(jTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLbienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTnss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRmujer)
                        .addComponent(jRhombre)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRsolteria)
                    .addComponent(jRmatrimonio)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCtipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTnumeroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBaceptar)
                    .addComponent(jBsalir)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaceptarActionPerformed
        // ACION BOTON ACEPTAR
        
        try {
            if (jTdni.getText().isEmpty() || jTnss.getText().isEmpty() || 
                jTnombre.getText().isEmpty() || jTapellidos.getText().isEmpty() ||
                jTdireccion.getText().isEmpty() || jTtelefono.getText().isEmpty() || 
                jCtipoContrato.getSelectedIndex() == -1 ||
                jCdepartamento.getSelectedIndex() == -1 ||
                jTnumeroEmpleado.getText().isEmpty()) {   
            } else{
                
                Controladora.insertarTrabajador(jTdni.getText(), jTnss.getText(), 
                                                jTnombre.getText(), jTapellidos.getText(),
                                                jTdireccion.getText(), jTtelefono.getText(),
                                                sexo.getSelection().toString(),
                                                estadoCivil.getSelection().toString(),
                                                jCtipoContrato.getSelectedItem().toString(),
                                                jCdepartamento.getSelectedItem().toString(),
                                                jDfecha.getDate().toString(),
                                                jTnumeroEmpleado.getText());
  
            }
            
            System.out.println("ok");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jBaceptarActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // ACTION TODOS
        
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem5MouseClicked

    private void jMenuItem5MenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jMenuItem5MenuKeyPressed
        // TODO add your handling code here:
        Departamento d = new Departamento();
        d.mostrarListaTrabajadores();
    }//GEN-LAST:event_jMenuItem5MenuKeyPressed

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
            java.util.logging.Logger.getLogger(GestionPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionPersonal("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup estadoCivil;
    private javax.swing.JButton jBaceptar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<String> jCdepartamento;
    private javax.swing.JComboBox<String> jCtipoContrato;
    private com.toedter.calendar.JDateChooser jDfecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLbienvenida;
    private javax.swing.JMenu jMadmin;
    private javax.swing.JMenuItem jMalta;
    private javax.swing.JMenuItem jMbaja;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu jMlistar;
    private javax.swing.JMenuItem jMmodificar;
    private javax.swing.JMenuItem jMsalir;
    private javax.swing.JMenu jMsesion;
    private javax.swing.JRadioButton jRhombre;
    private javax.swing.JRadioButton jRmatrimonio;
    private javax.swing.JRadioButton jRmujer;
    private javax.swing.JRadioButton jRsolteria;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTextField jTapellidos;
    private javax.swing.JTextField jTdireccion;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTnss;
    private javax.swing.JTextField jTnumeroEmpleado;
    private javax.swing.JTextField jTtelefono;
    private javax.swing.ButtonGroup sexo;
    // End of variables declaration//GEN-END:variables
}
