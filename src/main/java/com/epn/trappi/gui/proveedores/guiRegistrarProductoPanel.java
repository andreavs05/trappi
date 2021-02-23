/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epn.trappi.gui.proveedores;

import com.epn.trappi.db.proveedores.ProveedoresDb;
import com.epn.trappi.models.proveedores.ListaProveedores;
import com.epn.trappi.models.proveedores.Producto;
import com.epn.trappi.models.proveedores.Proveedor;
import javax.swing.JOptionPane;

/**
 *
 * @author Peterca
 */
public class guiRegistrarProductoPanel extends javax.swing.JPanel {
    
    ProveedoresDb db = new ProveedoresDb();
    ListaProveedores listaProveedores = new ListaProveedores();

    /**
     * Creates new form guiRegistrarProductoPanel
     */
    public guiRegistrarProductoPanel() {
        initComponents();
        cargarProveedor();
    }
    
    private void cargarProveedor() {
        listaProveedores.getListaDeProveedores().forEach(prov -> {
            cmbProvedor.addItem(prov.getRazonSocial());
        });
    }
    
    private boolean validarNombre(String direccion) {
        if (direccion.length() > 50 || direccion.trim().equals("")) {
            return false;
        }
        return direccion.matches("[[0-9]*[ ]]*[A-Za-zñÑÁÉÍÓÚáéíóú]+[0-9]*[[ ][A-Za-zñÑÁÉÍÓÚáéíóú]+[0-9]*]*");
    }
    
    private boolean validarPrecio(String precio) {
        try {
            Double.parseDouble(precio);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    private Proveedor obtenerProveedor(String nombre) {
        Proveedor resultado = null;
        for (Proveedor proveedor : this.listaProveedores.getListaDeProveedores()) {
            if (proveedor.getRazonSocial().equals(nombre)) {
                resultado = proveedor;
                break;
            }
        }
        return resultado;
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnRegistrarProducto = new javax.swing.JButton();
        cmbProvedor = new javax.swing.JComboBox<>();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        PanelVerTodos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Nombre:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Precio:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Proveedor:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        btnRegistrarProducto.setBackground(new java.awt.Color(38, 112, 171));
        btnRegistrarProducto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegistrarProducto.setForeground(new java.awt.Color(240, 240, 241));
        btnRegistrarProducto.setBorderPainted(false);
        btnRegistrarProducto.setLabel("Registrar");
        btnRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProductoActionPerformed(evt);
            }
        });

        cmbProvedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout PanelVerTodosLayout = new javax.swing.GroupLayout(PanelVerTodos);
        PanelVerTodos.setLayout(PanelVerTodosLayout);
        PanelVerTodosLayout.setHorizontalGroup(
            PanelVerTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVerTodosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelVerTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre)
                    .addComponent(txtPrecio)
                    .addGroup(PanelVerTodosLayout.createSequentialGroup()
                        .addGroup(PanelVerTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelVerTodosLayout.createSequentialGroup()
                        .addComponent(btnRegistrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 205, Short.MAX_VALUE))
                    .addComponent(cmbProvedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PanelVerTodosLayout.setVerticalGroup(
            PanelVerTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVerTodosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(6, 6, 6)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(6, 6, 6)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(cmbProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(btnRegistrarProducto)
                .addGap(155, 155, 155))
        );

        add(PanelVerTodos);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed

    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyPressed

    }//GEN-LAST:event_txtPrecioKeyPressed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped

    }//GEN-LAST:event_txtPrecioKeyTyped

    private void btnRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProductoActionPerformed
        // Atributos
        String nombre;
        String precio;
        String prov;
        Proveedor proveedor;
        
        nombre = txtNombre.getText();
        precio = txtPrecio.getText();
        prov = cmbProvedor.getSelectedItem().toString();
        
        if (validarNombre(nombre)) {
            try {
                if (validarPrecio(precio)) {
                    proveedor = obtenerProveedor(prov);
                    Producto nuevoP = new Producto(nombre, Double.parseDouble(precio), proveedor);
                    nuevoP.registrar();
                    JOptionPane.showMessageDialog(null, "Producto registrado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    txtNombre.setText("");
                    txtPrecio.setText("");
                    cmbProvedor.setSelectedIndex(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Debes ingresar un precio valido", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nombre de producto Incorrecto.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelVerTodos;
    private javax.swing.JButton btnRegistrarProducto;
    private javax.swing.JComboBox<String> cmbProvedor;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
