/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epn.trappi.gui.proveedores;

import com.epn.trappi.db.proveedores.ProveedoresDb;
import com.epn.trappi.models.proveedores.Compra;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Peterca
 */
public class guiComprasPanel extends javax.swing.JPanel {

    /**
     * Creates new form guiComprasPanel
     */
    DefaultTableModel modelo;
    private final ProveedoresDb db = new ProveedoresDb();
    
    public guiComprasPanel() throws IOException {
        initComponents();
        cargar();
    }
    
    public void cargar() throws IOException{
        String[] titulos = {"Número de Compra","Producto","Cantidad","Proveedor","Fecha","Estado","Monto"};
        String[] fila = new String [7];
        modelo = new DefaultTableModel(null, titulos);
        System.out.println("hola \n"+db.getCompras().get(0).toString());
        ArrayList<Compra> c = (ArrayList<Compra>) db.getCompras();
        System.out.println("hola jhtf\n"+c.size());
        for (int i=0;i<c.size();i++){
            fila[0]= "01";
            if(i==0){
                fila[2]=String.valueOf(c.get(i).getListaCantidadDeBienes().getListaCantidadDeBienes().get(0).getCantidad());
                fila[1]=c.get(i).getListaCantidadDeBienes().getListaCantidadDeBienes().get(0).getBien().getNombre();
            }
            else{
                fila[2]=String.valueOf(c.get(i).getListaCantidadDeBienes().getListaCantidadDeBienes().get(1).getCantidad());
                fila[1]=c.get(i).getListaCantidadDeBienes().getListaCantidadDeBienes().get(1).getBien().getNombre();
            }
            fila[3]= c.get(i).getListaCantidadDeBienes().getListaCantidadDeBienes().get(1).getBien().getProveeedor().getRuc();   
            fila[4]= c.get(i).getFecha();
            fila[5]= c.get(i).getEstado();
            fila[6]= c.get(i).getMontoTotal().toString();
            modelo.addRow(fila);
        }
        jTable1.setModel(modelo);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelVerTodos = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFechCompNotaCred = new javax.swing.JTextField();
        jButRegFactCompNotaCred = new javax.swing.JButton();
        jIVA = new javax.swing.JLabel();
        jValor = new javax.swing.JLabel();
        jButRegFactCompNotaCred1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextCompra = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        PanelVerTodos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Buscar Compra");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Compras");

        jTextFechCompNotaCred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFechCompNotaCredActionPerformed(evt);
            }
        });
        jTextFechCompNotaCred.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFechCompNotaCredKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFechCompNotaCredKeyTyped(evt);
            }
        });

        jButRegFactCompNotaCred.setBackground(new java.awt.Color(38, 112, 171));
        jButRegFactCompNotaCred.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButRegFactCompNotaCred.setForeground(new java.awt.Color(240, 240, 241));
        jButRegFactCompNotaCred.setText("Actualizar estado");
        jButRegFactCompNotaCred.setBorderPainted(false);
        jButRegFactCompNotaCred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButRegFactCompNotaCredActionPerformed(evt);
            }
        });

        jIVA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jValor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButRegFactCompNotaCred1.setBackground(new java.awt.Color(38, 112, 171));
        jButRegFactCompNotaCred1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButRegFactCompNotaCred1.setForeground(new java.awt.Color(240, 240, 241));
        jButRegFactCompNotaCred1.setText("Buscar");
        jButRegFactCompNotaCred1.setBorderPainted(false);
        jButRegFactCompNotaCred1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButRegFactCompNotaCred1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Estado");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Compra");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entregado", "Pendiente" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jTextCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel11)
                .addGap(195, 195, 195)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout PanelVerTodosLayout = new javax.swing.GroupLayout(PanelVerTodos);
        PanelVerTodos.setLayout(PanelVerTodosLayout);
        PanelVerTodosLayout.setHorizontalGroup(
            PanelVerTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVerTodosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelVerTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelVerTodosLayout.createSequentialGroup()
                        .addGroup(PanelVerTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(PanelVerTodosLayout.createSequentialGroup()
                                .addComponent(jTextFechCompNotaCred, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jButRegFactCompNotaCred1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelVerTodosLayout.createSequentialGroup()
                        .addGroup(PanelVerTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jButRegFactCompNotaCred, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelVerTodosLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelVerTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jValor, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PanelVerTodosLayout.setVerticalGroup(
            PanelVerTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVerTodosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addGap(8, 8, 8)
                .addGroup(PanelVerTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFechCompNotaCred, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButRegFactCompNotaCred1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGroup(PanelVerTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelVerTodosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelVerTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jValor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(PanelVerTodosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButRegFactCompNotaCred)
                .addGap(23, 23, 23))
        );

        add(PanelVerTodos);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFechCompNotaCredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFechCompNotaCredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFechCompNotaCredActionPerformed

    private void jTextFechCompNotaCredKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFechCompNotaCredKeyPressed

    }//GEN-LAST:event_jTextFechCompNotaCredKeyPressed

    private void jTextFechCompNotaCredKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFechCompNotaCredKeyTyped

    }//GEN-LAST:event_jTextFechCompNotaCredKeyTyped

    private void jButRegFactCompNotaCred1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButRegFactCompNotaCred1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButRegFactCompNotaCred1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            ArrayList<Compra> c = (ArrayList<Compra>) db.getCompras();
            if(c.get(jTable1.getSelectedRow()).getEstado().equals("Entregado")){
                jComboBox1.setSelectedIndex(0);
            }
            else{
                jComboBox1.setSelectedIndex(1);
            }
            jTextCompra.setText(modelo.getValueAt(jTable1.getSelectedRow(),0)+"");
            jTextCompra.setEditable(false);
        } catch (IOException ex) {
            Logger.getLogger(guiComprasPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButRegFactCompNotaCredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButRegFactCompNotaCredActionPerformed
        try {
            ArrayList<Compra> c = (ArrayList<Compra>) db.getCompras(),r = new ArrayList<Compra>();
            for (int i=0;i<c.size();i++){
                if(db.seleccionarIdentificadores().get(i)==Integer.parseInt(jTextCompra.getText())){
                    c.get(i).setEstado(jComboBox1.getSelectedItem().toString());
                    r.add(c.get(i));
                }
            }
            for (int i=0;i<r.size();i++){
                //db.setCompras(r.get(i).getListaCantidadDeBienes().getListaCantidadDeBienes().get(i).getBien().getNombre(), TOOL_TIP_TEXT_KEY, WIDTH, TOOL_TIP_TEXT_KEY, SOMEBITS);
            }
        } catch (IOException ex) {
            Logger.getLogger(guiComprasPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButRegFactCompNotaCredActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelVerTodos;
    private javax.swing.JButton jButRegFactCompNotaCred;
    private javax.swing.JButton jButRegFactCompNotaCred1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jIVA;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextCompra;
    private javax.swing.JTextField jTextFechCompNotaCred;
    private javax.swing.JLabel jValor;
    // End of variables declaration//GEN-END:variables
}
