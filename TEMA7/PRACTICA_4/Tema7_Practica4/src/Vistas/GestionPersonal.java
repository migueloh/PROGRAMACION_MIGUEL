package Vistas;

import java.awt.Color;
import javax.swing.JOptionPane;
import tema7_practica4.*;

/*
 String lista = Controladora.mostrarListaTrabajadores();
        Controladora.abrirVentanaMostrarDatos(lista);
 */
/**
 * @author 1gdaw09
 */
public class GestionPersonal extends javax.swing.JFrame {

    /**
     * Creates new form GestionPersonal
     *
     * @param nombre
     */
    public GestionPersonal(String nombre) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.white);

        jBdarAlta.setVisible(false);
        jBdarbaja.setVisible(false);
        jBdarFormato.setVisible(false);

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
        jBdarAlta = new javax.swing.JButton();
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
        jBdarbaja = new javax.swing.JButton();
        jBdarFormato = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
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
        jMbuscarDni = new javax.swing.JMenuItem();
        jMlistarDepart = new javax.swing.JMenuItem();
        jMlistarContrato = new javax.swing.JMenuItem();
        jMlistarTodo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DNI");

        jLabel2.setText("NSS");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellidos");

        jLabel5.setText("Teléfono");

        jLabel6.setText("Sexo");

        jBdarAlta.setBackground(new java.awt.Color(153, 255, 153));
        jBdarAlta.setForeground(new java.awt.Color(0, 0, 0));
        jBdarAlta.setText("DAR DE ALTA");
        jBdarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdarAltaActionPerformed(evt);
            }
        });

        jBsalir.setBackground(new java.awt.Color(255, 153, 153));
        jBsalir.setForeground(new java.awt.Color(0, 0, 0));
        jBsalir.setText("SALIR");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        sexo.add(jRhombre);
        jRhombre.setText("Hombre");

        sexo.add(jRmujer);
        jRmujer.setText("Mujer");

        estadoCivil.add(jRsolteria);
        jRsolteria.setText("Soltero / Soltera");

        estadoCivil.add(jRmatrimonio);
        jRmatrimonio.setText("Casado / Casada");

        jCtipoContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fijo", "Discontinuo" }));
        jCtipoContrato.setSelectedIndex(-1);

        jCdepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gestion Personal", "Servicio Tecnico", " " }));
        jCdepartamento.setSelectedIndex(-1);

        jTdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdniActionPerformed(evt);
            }
        });

        jLabel7.setText("Estado Civil");

        jLabel8.setText("Tipo de Contrato");

        jLabel9.setText("Departamento");

        jLabel10.setText("Fecha de Alta");

        jLabel11.setText("Nº Empleado");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("Bienvenid@");

        jLabel13.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel13.setText("Indica previamente en el el Menú superior la accion a realizar. ");

        jLbienvenida.setText("MOSTRAR_NOMBRE_USUARIO");

        jLabel14.setText("Dirección");

        jBdarbaja.setBackground(new java.awt.Color(153, 255, 153));
        jBdarbaja.setForeground(new java.awt.Color(0, 0, 0));
        jBdarbaja.setText("DAR DE BAJA");
        jBdarbaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdarbajaActionPerformed(evt);
            }
        });

        jBdarFormato.setBackground(new java.awt.Color(153, 255, 153));
        jBdarFormato.setForeground(new java.awt.Color(0, 0, 0));
        jBdarFormato.setText("DAR FORMATO");
        jBdarFormato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdarFormatoActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/img/sonic.PNG"))); // NOI18N

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
        jMalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMaltaActionPerformed(evt);
            }
        });
        jMadmin.add(jMalta);

        jMmodificar.setText("Dar Formato");
        jMmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmodificarActionPerformed(evt);
            }
        });
        jMadmin.add(jMmodificar);

        jMbaja.setText("Dar de Baja");
        jMbaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMbajaActionPerformed(evt);
            }
        });
        jMadmin.add(jMbaja);

        jMenuBar1.add(jMadmin);

        jMlistar.setText("Generar Listados");
        jMlistar.add(jSeparator2);

        jMbuscarDni.setText("Buscar Empleado por DNI");
        jMbuscarDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMbuscarDniActionPerformed(evt);
            }
        });
        jMlistar.add(jMbuscarDni);

        jMlistarDepart.setText("Listado por Departamento");
        jMlistarDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMlistarDepartActionPerformed(evt);
            }
        });
        jMlistar.add(jMlistarDepart);

        jMlistarContrato.setText("Listado por Contrato");
        jMlistarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMlistarContratoActionPerformed(evt);
            }
        });
        jMlistar.add(jMlistarContrato);

        jMlistarTodo.setText("Listado Completo de Empleados");
        jMlistarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMlistarTodoActionPerformed(evt);
            }
        });
        jMlistar.add(jMlistarTodo);

        jMenuBar1.add(jMlistar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(jRmatrimonio)))
                            .addComponent(jTnumeroEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(jDfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(86, 86, 86)
                            .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(141, 141, 141))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jBdarAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)
                            .addComponent(jBdarbaja, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(jBdarFormato)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(29, 29, 29)
                        .addComponent(jLbienvenida))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTnss, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTnss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBdarAlta)
                    .addComponent(jBdarbaja)
                    .addComponent(jBdarFormato))
                .addGap(18, 24, Short.MAX_VALUE)
                .addComponent(jBsalir)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBdarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdarAltaActionPerformed
        // ACION BOTON ACEPTAR
        try {

            String insertOk = "";

            if (jTdni.getText().isEmpty() || jTnss.getText().isEmpty()
                    || jTnombre.getText().isEmpty() || jTapellidos.getText().isEmpty()
                    || jTdireccion.getText().isEmpty() || jTtelefono.getText().isEmpty()
                    || jCtipoContrato.getSelectedIndex() == -1
                    || jCdepartamento.getSelectedIndex() == -1
                    || jTnumeroEmpleado.getText().isEmpty()) {
            } else {
                String sexo;
                String estadoCivil;

                if (jRhombre.isSelected()) {
                    sexo = "hombre";
                } else {
                    sexo = "mujer";
                }
                if (jRsolteria.isSelected()) {
                    estadoCivil = "soltero";
                } else {
                    estadoCivil = "casado";
                }
                insertOk = Controladora.insertarTrabajador(jTdni.getText(), jTnss.getText(),
                        jTnombre.getText(), jTapellidos.getText(),
                        jTdireccion.getText(), jTtelefono.getText(),
                        sexo,
                        estadoCivil,
                        jCtipoContrato.getSelectedItem().toString(),
                        jCdepartamento.getSelectedItem().toString(),
                        jDfecha.getDate().toString(),
                        jTnumeroEmpleado.getText()
                );

            }
            JOptionPane.showMessageDialog(this, insertOk);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jBdarAltaActionPerformed

    private void jMlistarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMlistarTodoActionPerformed
        // ACTION LISTA COMPLETA
        String lista = Controladora.mostrarListaTrabajadores();
        Controladora.abrirVentanaMostrarDatos(lista);
    }//GEN-LAST:event_jMlistarTodoActionPerformed

    private void jMbajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMbajaActionPerformed
        // ACTION DAR BAJA

        desactivarCampos();
        jBdarAlta.setVisible(false);
        jBdarbaja.setVisible(true);
        jBdarFormato.setVisible(false);


    }//GEN-LAST:event_jMbajaActionPerformed

    private void jBdarbajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdarbajaActionPerformed
        // ACTION DAR DE BAJA

        Integer posicionLista = Controladora.buscarPorDni(jTdni.getText());

        if (posicionLista != -1) {

            if (JOptionPane.showConfirmDialog(this, "El Trabajador con dicho DNI va a ser eliminado del Sistema. "
                    + "\n¿Esta seguro de dicha accion?") == 0) {

                Controladora.darDeBajaUsuario();
                JOptionPane.showMessageDialog(this, "El Trabajador ha sido eliminado correctamente");

            }

        } else {
            JOptionPane.showMessageDialog(null, "El DNI buscado no se encuentra en la base de datos.");
        }


    }//GEN-LAST:event_jBdarbajaActionPerformed

    private void jMlistarDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMlistarDepartActionPerformed
        // ACTION DEPART

        String lista = Controladora.buscarPorDepartamento(jCdepartamento.getSelectedItem().toString());
        Controladora.abrirVentanaMostrarDatos(lista);
        
    }//GEN-LAST:event_jMlistarDepartActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // ACTION SALIR
        if (JOptionPane.showConfirmDialog(this, "¿Deseas realmente salir?") == 0) {
            Controladora.cerrarVentanas();
        }

    }//GEN-LAST:event_jBsalirActionPerformed

    private void jMbuscarDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMbuscarDniActionPerformed
        // ACTION BUSCAR DNI

        Integer posicionLista = Controladora.buscarPorDni(jTdni.getText());

        if (posicionLista != -1) {
            Controladora.mostrarTrabajador();
        } else {
            JOptionPane.showMessageDialog(null, "El DNI buscado no se encuentra en la base de datos.");
        }
    }//GEN-LAST:event_jMbuscarDniActionPerformed

    private void jMaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMaltaActionPerformed
        // ACTION DAR ALTA:
        jBdarAlta.setVisible(true);
        jBdarbaja.setVisible(false);
        jBdarFormato.setVisible(false);
    }//GEN-LAST:event_jMaltaActionPerformed

    private void jMmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmodificarActionPerformed
        // ACTION DAR FORMATO
        jBdarAlta.setVisible(false);
        jBdarbaja.setVisible(false);
        jBdarFormato.setVisible(true);
    }//GEN-LAST:event_jMmodificarActionPerformed

    private void jTdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdniActionPerformed
        // ACTION BUSCA CAMPO DNI

        Integer posicionLista = Controladora.buscarPorDni(jTdni.getText());

        if (posicionLista != -1) {
            Controladora.mostrarTrabajador();
        } else {
            JOptionPane.showMessageDialog(null, "El DNI buscado no se encuentra en la base de datos.");
        }
    }//GEN-LAST:event_jTdniActionPerformed

    private void jBdarFormatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdarFormatoActionPerformed
        // ACTION BOTON INFERIOR DAR FORMATO

        try {

            String replaceOk = "";

            if (jTdni.getText().isEmpty() || jTnss.getText().isEmpty()
                    || jTnombre.getText().isEmpty() || jTapellidos.getText().isEmpty()
                    || jTdireccion.getText().isEmpty() || jTtelefono.getText().isEmpty()
                    || jCtipoContrato.getSelectedIndex() == -1
                    || jCdepartamento.getSelectedIndex() == -1
                    || jTnumeroEmpleado.getText().isEmpty()) {
            } else {
                String sexo;
                String estadoCivil;

                if (jRhombre.isSelected()) {
                    sexo = "hombre";
                } else {
                    sexo = "mujer";
                }
                if (jRsolteria.isSelected()) {
                    estadoCivil = "soltero";
                } else {
                    estadoCivil = "casado";
                }
                replaceOk = Controladora.actualizarDatosTrabajador(jTdni.getText(), jTnss.getText(),
                        jTnombre.getText(), jTapellidos.getText(),
                        jTdireccion.getText(), jTtelefono.getText(),
                        sexo,
                        estadoCivil,
                        jCtipoContrato.getSelectedItem().toString(),
                        jCdepartamento.getSelectedItem().toString(),
                        jDfecha.getDate().toString(),
                        jTnumeroEmpleado.getText()
                );

            }
            JOptionPane.showMessageDialog(this, replaceOk);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jBdarFormatoActionPerformed

    private void jMlistarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMlistarContratoActionPerformed
        // ACTION BUSCAR CONTRATO:
        
        String lista = Controladora.buscarPorContrato(jCtipoContrato.getSelectedItem().toString());
        Controladora.abrirVentanaMostrarDatos(lista);
    }//GEN-LAST:event_jMlistarContratoActionPerformed

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
    private javax.swing.JButton jBdarAlta;
    private javax.swing.JButton jBdarFormato;
    private javax.swing.JButton jBdarbaja;
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
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JMenuItem jMbuscarDni;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMlistar;
    private javax.swing.JMenuItem jMlistarContrato;
    private javax.swing.JMenuItem jMlistarDepart;
    private javax.swing.JMenuItem jMlistarTodo;
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

    private void desactivarCampos() {
        jBdarAlta.setVisible(false);
        /*   
        jTdni.setText(null);
        jTnss.setEnabled(false);
        jTnombre.setEditable(false);
        jTapellidos.setEditable(false);
        jTdireccion.setEditable(false);
        jTtelefono.setEditable(false);
         */
    }

    public void rellenarCamposEncontrados(String nss, String nombre, String apellidos, String direccion, String telefono, String sexo, String estadoCivil, String tipoContrato, String departamento, String fecha, String numeroEmpleado) {
        jTnss.setText(nss);
        jTnombre.setText(nombre);
        jTapellidos.setText(apellidos);
        jTdireccion.setText(direccion);
        jTtelefono.setText(telefono);
        jCtipoContrato.setSelectedItem(tipoContrato);
        jCdepartamento.setSelectedItem(departamento);
        if (sexo.equalsIgnoreCase("hombre")) {
            jRhombre.setSelected(true);
        } else {
            jRmujer.setSelected(true);
        }
        if (estadoCivil.equalsIgnoreCase("soltero")) {
            jRsolteria.setSelected(true);
        } else {
            jRmatrimonio.setSelected(true);
        }
        jDfecha.setDateFormatString(fecha);
        jTnumeroEmpleado.setText(numeroEmpleado);
    }
}
