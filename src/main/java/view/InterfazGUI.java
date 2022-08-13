package view;

import controller.InformesController;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import model.vo.Compra;
import model.vo.Lider;
import model.vo.Proyecto;

public class InterfazGUI extends javax.swing.JFrame {

    DefaultTableModel informe1;
    DefaultTableModel informe2;
    DefaultTableModel informe3;
    InformesController controlador;

    public InterfazGUI() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("RETO 5");
        String[] titlei1 = {"ID", "NOMBRE", "APELLIDO", "CIUDAD"};
        String[] titlei2 = {"ID", "CONSTRUCTORA", "NUMERO HABITACIONES", "CIUDAD"};
        String[] titlei3 = {"ID", "CONSTRUCTORA", "BANCO"};
        informe1 = new DefaultTableModel(null, titlei1);
        informe2 = new DefaultTableModel(null, titlei2);
        informe3 = new DefaultTableModel(null, titlei3);

        tbInforme1.setModel(informe1);
        tbinforme2.setModel(informe2);
        Tbinforme3.setModel(informe3);

        controlador = new InformesController();

        informeLideres();
        informeProyectos();
        informeCompras();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RETO5 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbInforme1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnexportar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbinforme2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtdescripInfo2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tbinforme3 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtDescrInfo3 = new javax.swing.JLabel();
        BTNREPORTE3NEW = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        RETO5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbInforme1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbInforme1);

        jLabel1.setText("LIDERES");

        btnexportar.setBackground(new java.awt.Color(153, 255, 255));
        btnexportar.setText("EXPORTAR");
        btnexportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexportarActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 153));
        jButton4.setText("CONSULTAR LIDER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(383, 383, 383)
                        .addComponent(btnexportar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnexportar)
                    .addComponent(jButton4))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        RETO5.addTab("Informe1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tbinforme2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbinforme2);

        jLabel2.setText("PROYECTOS");

        jButton2.setBackground(new java.awt.Color(255, 255, 51));
        jButton2.setText("EXPORTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtdescripInfo2.setText("DESCRIPCION DEL INFORME:  clasificación :  “Casa Campestre” ; Ciudades : “Santa Marta”, “Cartagena” y “Barranquilla”. ");

        jButton1.setText("New Reporte");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(439, 439, 439)
                                .addComponent(jButton2))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2)
                                .addComponent(txtdescripInfo2)))))
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtdescripInfo2)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        RETO5.addTab("Informe2", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        Tbinforme3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(Tbinforme3);

        jLabel4.setText("COMPRAS");

        jButton3.setBackground(new java.awt.Color(0, 255, 204));
        jButton3.setText("EXPORTAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtDescrInfo3.setText("DESCRIPCION: compras realizadas por los proyectos con el proveedor “Homecenter” y para la ciudad “Salento");

        BTNREPORTE3NEW.setBackground(new java.awt.Color(255, 255, 204));
        BTNREPORTE3NEW.setText("NEW REPORTE");
        BTNREPORTE3NEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNREPORTE3NEWActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(BTNREPORTE3NEW)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3))
                                .addComponent(txtDescrInfo3, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDescrInfo3)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(BTNREPORTE3NEW))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        RETO5.addTab("Informe3", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RETO5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RETO5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnexportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexportarActionPerformed

        try {
            guardar(controlador.listadoLiders(), "Lider");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InterfazGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnexportarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            var lista = controlador.listadoProyects();
            guardar(lista, "Proyectos");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InterfazGUI.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            var listado = controlador.listadobuys();
            guardar(listado, "Compras");
        } catch (SQLException ex) {
            Logger.getLogger(InterfazGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InterfazGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        var identificacion = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL ID DEL LIDER A BUSCAR"));

        try {
            Lider l = controlador.infoLider(identificacion);

            if (l != null) {
                JOptionPane.showMessageDialog(null, l.toString());
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra registro");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        var clasificacion = JOptionPane.showInputDialog("DIGITE LA CLASIFICACION");
        var ciudad = JOptionPane.showInputDialog("DIGITE LA CIUDAD A BUSCAR");
        try {
            var l = controlador.generarinforme2(clasificacion, ciudad);
            System.out.println(informe2.getColumnCount());
            while (informe2.getRowCount() > 0) {
                informe2.removeRow(0);
            }
            for (Proyecto p : l) {
                Object[] proyecto = {p.getIdProyecto(), p.getContructora(), p.getnHabitaciones(), p.getCiudad()};
                this.informe2.addRow(proyecto);
            }
            txtdescripInfo2.setText(String.format("DESCRIPCION DEL INFORME:  clasificación : '%s' ; Ciudades : '%s'.", clasificacion, ciudad));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BTNREPORTE3NEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNREPORTE3NEWActionPerformed
        var proveedor = JOptionPane.showInputDialog("DIGITE EL PROVEEDOR");
        var ciudad = JOptionPane.showInputDialog("DIGITE LA CIUDAD A BUSCAR");
        try {
            var l = controlador.generarinforme3(proveedor, ciudad);
            System.out.println(informe3.getColumnCount());
            while (informe3.getRowCount() > 0) {
                informe3.removeRow(0);
            }
            for (Compra compra : l) {
                Object[] c = {compra.getIdCompra(), compra.getConstructora(), compra.getBanco()};
                this.informe3.addRow(c);
            }
            txtDescrInfo3.setText(String.format("DESCRIPCION: compras realizadas por los proyectos con el proveedor '%s' y para la ciudad '%s'", proveedor, ciudad));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_BTNREPORTE3NEWActionPerformed

    public void informeLideres() throws SQLException {
        var informe1 = controlador.listadoLiders();
        for (Lider lider : informe1) {
            Object[] l = {lider.getIdLider(), lider.getNombre(), lider.getApellido(), lider.getCiudad()};
            this.informe1.addRow(l);
        }
    }

    public void informeProyectos() throws SQLException {
        var informe2 = controlador.listadoProyects();
        for (Proyecto p : informe2) {
            Object[] proyecto = {p.getIdProyecto(), p.getContructora(), p.getnHabitaciones(), p.getCiudad()};
            this.informe2.addRow(proyecto);
        }
    }

    public void informeCompras() throws SQLException {
        var informe3 = controlador.listadobuys();
        for (Compra compra : informe3) {
            Object[] c = {compra.getIdCompra(), compra.getConstructora(), compra.getBanco()};
            this.informe3.addRow(c);
        }
    }

    public void guardar(List elementos, String clase) throws IOException, SQLException {

        JFileChooser explorador = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo csv", "csv");
        explorador.setFileFilter(filtro);

        int seleccionar = explorador.showSaveDialog(this);

        if (seleccionar == JFileChooser.APPROVE_OPTION) {

            File archivo = explorador.getSelectedFile(); //nombre del archivo o ruta 
            FileWriter fichero = null;
            PrintWriter pw = null;

            try {
                fichero = new FileWriter(archivo);
                pw = new PrintWriter(fichero); //pintar el documento 

                if (clase.equals("Lider")) {
                    String encabezados
                            = "ID" + "," + "Nombre" + "," + "Apellido" + "," + "Ciudad";
                    pw.println(encabezados);
                    ArrayList<Lider> lista = (ArrayList<Lider>) elementos;
                    for (Lider l : lista) {
                        String linea = l.getIdLider() + "," + l.getNombre() + "," + l.getApellido() + "," + l.getCiudad();
                        pw.println(linea);
                    }

                } else if (clase.equals("Compras")) {

                    String encabezados
                            = "ID" + "," + "Constructora" + "," + "Ciudad";
                    pw.println(encabezados);
                    ArrayList<Compra> lista = (ArrayList<Compra>) elementos;
                    for (Compra c : lista) {
                        String linea = c.getIdCompra() + "," + c.getConstructora() + "," + c.getBanco();
                        pw.println(linea);
                    }

                } else if (clase.equals("Proyectos")) {

                    String encabezados
                            = "ID" + "," + "Constructora" + "," + "N. Habitaciones" + "," + "Ciudad";
                    pw.println(encabezados);
                    ArrayList<Proyecto> lista = (ArrayList<Proyecto>) elementos;
                    for (Proyecto p : lista) {
                        String linea = p.getIdProyecto() + "," + p.getContructora() + "," + p.getnHabitaciones() + "," + p.getCiudad();
                        pw.println(linea);
                    }

                }

            } finally {
                JOptionPane.showMessageDialog(this, "Archivo Guardado Con exito");
                if (fichero != null) {
                    fichero.close();
                }

            }

        }
    }

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
            java.util.logging.Logger.getLogger(InterfazGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InterfazGUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(InterfazGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNREPORTE3NEW;
    private javax.swing.JTabbedPane RETO5;
    private javax.swing.JTable Tbinforme3;
    private javax.swing.JButton btnexportar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbInforme1;
    private javax.swing.JTable tbinforme2;
    private javax.swing.JLabel txtDescrInfo3;
    private javax.swing.JLabel txtdescripInfo2;
    // End of variables declaration//GEN-END:variables
}
