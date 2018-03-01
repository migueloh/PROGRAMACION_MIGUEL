package GUI;

import t8p1e2.Controlador;
import Excepciones.*;
import java.time.LocalTime;
import java.util.Calendar;

public class VentanaAcontecimientos extends javax.swing.JFrame {

    public VentanaAcontecimientos() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgAsisentes = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ftfHoraInicio = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        ftfHoraFin = new javax.swing.JFormattedTextField();
        bAceptar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbLugar = new javax.swing.JComboBox();
        tffAforo = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acontecimientos");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ALTA DE ACONTECIMIENTOS");

        jLabel2.setText("Nombre");

        jLabel4.setText("Fecha");

        jLabel5.setText("Hora inicio");

        ftfHoraInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("HH:mm"))));

        jLabel6.setText("Hora finalización");

        ftfHoraFin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("HH:mm"))));

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        jLabel7.setText("Aforo");

        jLabel9.setText("Lugar");

        cbLugar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Artium", "Buesa Arena", "Iradier Arena", "Mendizorroza", "Teatro Principal" }));
        cbLugar.setSelectedIndex(-1);

        tffAforo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbLugar, javax.swing.GroupLayout.Alignment.LEADING, 0, 239, Short.MAX_VALUE)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tffAforo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ftfHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(ftfHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(cbLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ftfHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(ftfHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tffAforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
       try{
           if (datosCorrectos())
           {
             javax.swing.JOptionPane.showMessageDialog(this,"Datos correctos. \nVamos a insertar en la base de  datos");
             Controlador.grabarAcontecimiento(tfNombre.getText(),(String) cbLugar.getSelectedItem(),dcFecha.getDate(),ftfHoraInicio.getText(),ftfHoraFin.getText(),Integer.parseInt(tffAforo.getText()));
             Controlador.volver(this);
           }
       }
       catch(Exception e)
       {
         javax.swing.JOptionPane.showMessageDialog(this,"Problemas con el alta "+e.getClass());
       }
    }//GEN-LAST:event_bAceptarActionPerformed

private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
  Controlador.volver(this);
}//GEN-LAST:event_bSalirActionPerformed

    private boolean datosCorrectos(){
        try{
            validarNombre();
            validarLugar();
            validarFecha();
            validarHoras();
            validarAforo();
            return true;
        }
        catch(CampoVacio e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,e.getMensaje());
            return false;
        }
        catch(NombreNoValido e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"El nombre del evento no es válido. \n Tiene que empezar con una letra y tener una longitud minima de 3");
            return false;
        }
        catch(AforoNoValido e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"El aforo no es válido");
            return false;
        }
        catch(NumberFormatException e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"El dato tecleado como aforo no es válido");
            return false;
        }
        catch(FechaNoValida e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"La fecha tecleada no es válida");
            return false;
        }
        catch(HorasNoValidas e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"Las horas indicadas no son lógicas");
            return false;
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"Problemas validando los datos de entrada " + e.getMessage());
            return false;
        }
    }
    
    private void validarNombre()throws Exception{
        String nombre = tfNombre.getText();
        if (nombre.isEmpty())
            throw new CampoVacio("El nombre del acontecimiento es un dato obligatorio");
        // Considero que debe tener un mínimo de 3 caracteres
        if (nombre.length()< 3)
            throw new NombreNoValido();
        // También se puede controlar que no exceda del tamaño indicado en la base de datos
        // También podemos validar a través de una expresión regular
    }
    
    private void validarLugar()throws Exception{
        if (cbLugar.getSelectedIndex() == -1)
            throw new CampoVacio("El lugar del acontecimiento es un dato obligatorio");
    }
    
    private void validarFecha()throws Exception{
        if (dcFecha.getCalendar()== null)
            throw new CampoVacio("El fecha del acontecimiento es un dato obligatorio");
  
        // Comprobar que es mayor que la fecha actual
        // Guardar la fecha de hoy
        Calendar hoy = Calendar.getInstance();
        Calendar fechaEvento = dcFecha.getCalendar();
        // Comparar dos fechas
        if (fechaEvento.before(hoy))
                throw new FechaNoValida();
    }
    
    private void validarHoras()throws Exception{
        if (ftfHoraInicio.getText().isEmpty())
            throw new CampoVacio("La hora de inicio del acontecimiento es un dato obligatorio");
        if (ftfHoraFin.getText().isEmpty())
            throw new CampoVacio("La hora de finalización del acontecimiento es un dato obligatorio");
        // La hora de finalización tiene que ser mayor que la del inicio
        LocalTime horaF = LocalTime.parse(ftfHoraFin.getText());
        LocalTime horaI = LocalTime.parse(ftfHoraInicio.getText());
         
         if (horaF.compareTo(horaI)<=0)
             throw new HorasNoValidas(); 
    }
    
    private void validarAforo()throws Exception{
        if (tffAforo.getText().isEmpty())
            throw new CampoVacio("El aforo del acontecimeinto es un dato obligatorio");
        if (Integer.parseInt(tffAforo.getText()) <= 0)
            throw new NumberFormatException();
        
       
    }
    
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
            java.util.logging.Logger.getLogger(VentanaAcontecimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAcontecimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAcontecimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAcontecimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VentanaAcontecimientos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bSalir;
    private javax.swing.ButtonGroup bgAsisentes;
    private javax.swing.JComboBox cbLugar;
    private javax.swing.JFormattedTextField ftfHoraFin;
    private javax.swing.JFormattedTextField ftfHoraInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JFormattedTextField tffAforo;
    // End of variables declaration//GEN-END:variables
}
