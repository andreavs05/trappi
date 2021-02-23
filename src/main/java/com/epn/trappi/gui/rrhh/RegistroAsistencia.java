/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epn.trappi.gui.rrhh;


import com.epn.trappi.*;
import java.awt.Color;

/**
 *
 * @author stali
 */
public class RegistroAsistencia extends javax.swing.JFrame {

    /**
     * Creates new form Ejemplo_GUI
     */
    public RegistroAsistencia() {
        initComponents();
     
        jButSalida.setEnabled(false);
        jButSalida.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        PanelAsistencia = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextNombreAspirante = new javax.swing.JTextField();
        jButSalida = new javax.swing.JButton();
        jButEntrada = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextCedulaAspirante = new javax.swing.JTextField();
        jTextApellidoAspirante = new javax.swing.JTextField();
        jTextCargoAspirante = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGOtrappi.jpeg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton4.setText("Salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RECURSOS HUMANOS");

        jButton1.setBackground(new java.awt.Color(204, 153, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Aspirantes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(204, 153, 0));
        btnVolver.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(51, 51, 51));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 153, 0));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 51));
        jButton5.setText("Contratación");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 153, 0));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 51, 51));
        jButton6.setText("Contratos");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 153, 0));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 51, 51));
        jButton7.setText("Asistencia");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelAsistencia.setBackground(new java.awt.Color(255, 255, 255));
        PanelAsistencia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Nombre:");
        PanelAsistencia.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 20));

        jTextNombreAspirante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreAspiranteActionPerformed(evt);
            }
        });
        jTextNombreAspirante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreAspiranteKeyTyped(evt);
            }
        });
        PanelAsistencia.add(jTextNombreAspirante, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 520, 28));

        jButSalida.setBackground(new java.awt.Color(0, 153, 153));
        jButSalida.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButSalida.setForeground(new java.awt.Color(240, 240, 241));
        jButSalida.setText("Salida");
        jButSalida.setBorderPainted(false);
        jButSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSalidaActionPerformed(evt);
            }
        });
        PanelAsistencia.add(jButSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 180, 90));

        jButEntrada.setBackground(new java.awt.Color(38, 112, 171));
        jButEntrada.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButEntrada.setForeground(new java.awt.Color(240, 240, 241));
        jButEntrada.setText("Entrada");
        jButEntrada.setBorderPainted(false);
        jButEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEntradaActionPerformed(evt);
            }
        });
        PanelAsistencia.add(jButEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 180, 90));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Apellidos:");
        PanelAsistencia.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Cédula:");
        PanelAsistencia.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jTextCedulaAspirante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCedulaAspiranteActionPerformed(evt);
            }
        });
        jTextCedulaAspirante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCedulaAspiranteKeyTyped(evt);
            }
        });
        PanelAsistencia.add(jTextCedulaAspirante, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 230, 28));

        jTextApellidoAspirante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextApellidoAspiranteActionPerformed(evt);
            }
        });
        jTextApellidoAspirante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextApellidoAspiranteKeyTyped(evt);
            }
        });
        PanelAsistencia.add(jTextApellidoAspirante, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 520, 28));

        jTextCargoAspirante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCargoAspiranteActionPerformed(evt);
            }
        });
        jTextCargoAspirante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCargoAspiranteKeyTyped(evt);
            }
        });
        PanelAsistencia.add(jTextCargoAspirante, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 170, 28));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Cargo:");
        PanelAsistencia.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Control registro de empleados");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 510, 40));

        PanelAsistencia.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 100));

        jLabel4.setText("Hora de Entrada:");
        PanelAsistencia.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel5.setText("Hora de Salida:");
        PanelAsistencia.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new RegistroAspirante().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        new ContratarAspirante().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSalidaActionPerformed

    }//GEN-LAST:event_jButSalidaActionPerformed

    private void jTextNombreAspiranteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreAspiranteKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextNombreAspiranteKeyTyped

    private void jTextNombreAspiranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreAspiranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreAspiranteActionPerformed

    private void jButEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEntradaActionPerformed
      
    }//GEN-LAST:event_jButEntradaActionPerformed

    private void jTextCedulaAspiranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCedulaAspiranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCedulaAspiranteActionPerformed

    private void jTextCedulaAspiranteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCedulaAspiranteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCedulaAspiranteKeyTyped

    private void jTextApellidoAspiranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextApellidoAspiranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextApellidoAspiranteActionPerformed

    private void jTextApellidoAspiranteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextApellidoAspiranteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextApellidoAspiranteKeyTyped

    private void jTextCargoAspiranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCargoAspiranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCargoAspiranteActionPerformed

    private void jTextCargoAspiranteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCargoAspiranteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCargoAspiranteKeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        new Contratos().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       this.setVisible(false);
        new RegistroAsistencia().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAsistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAsistencia;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButEntrada;
    private javax.swing.JButton jButSalida;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextApellidoAspirante;
    private javax.swing.JTextField jTextCargoAspirante;
    private javax.swing.JTextField jTextCedulaAspirante;
    private javax.swing.JTextField jTextNombreAspirante;
    // End of variables declaration//GEN-END:variables
}
