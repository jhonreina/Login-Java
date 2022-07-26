/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import modelo.Usuario;

/**
 *
 * @author Jonathan
 */
public class Programa extends javax.swing.JFrame {

    Usuario usuario;
    
    public Programa() {
        initComponents();
    }
    
    public Programa(Usuario usuario){
        initComponents();
        setLocationRelativeTo(null);
        this.usuario = usuario;
        
        etiquetaNombre.setText(usuario.getNombre());
        etiquetaRol.setText(usuario.getNombreRol());
        
        if (usuario.getIdTipo_usuario()==1) {
            
        }
        else if (usuario.getIdTipo_usuario()==2) {
            menuProveedores.setVisible(false);
            subMenuAgregarProducto.setVisible(false);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaRol = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuProductos = new javax.swing.JMenu();
        subMenuAgregarProducto = new javax.swing.JMenuItem();
        subModificarProducto = new javax.swing.JMenuItem();
        subMenuCatalogoProductos = new javax.swing.JMenuItem();
        menuProveedores = new javax.swing.JMenu();
        subMenuProveedores = new javax.swing.JMenuItem();
        subMenuCatalogoProveedores = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido al Programa");

        etiquetaNombre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        etiquetaRol.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        menuProductos.setText("Productos");

        subMenuAgregarProducto.setText("Agregar Producto");
        menuProductos.add(subMenuAgregarProducto);

        subModificarProducto.setText("Modificar Producto");
        menuProductos.add(subModificarProducto);

        subMenuCatalogoProductos.setText("Catalogo de Productos");
        menuProductos.add(subMenuCatalogoProductos);

        jMenuBar1.add(menuProductos);

        menuProveedores.setText("Proveedores");

        subMenuProveedores.setText("Agregar Proveedor");
        subMenuProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuProveedoresActionPerformed(evt);
            }
        });
        menuProveedores.add(subMenuProveedores);

        subMenuCatalogoProveedores.setText("Catalogo de Proveedores");
        menuProveedores.add(subMenuCatalogoProveedores);

        jMenuBar1.add(menuProveedores);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(etiquetaRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(92, 92, 92)
                .addComponent(etiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaRol, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subMenuProveedoresActionPerformed

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
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuProductos;
    private javax.swing.JMenu menuProveedores;
    private javax.swing.JMenuItem subMenuAgregarProducto;
    private javax.swing.JMenuItem subMenuCatalogoProductos;
    private javax.swing.JMenuItem subMenuCatalogoProveedores;
    private javax.swing.JMenuItem subMenuProveedores;
    private javax.swing.JMenuItem subModificarProducto;
    // End of variables declaration//GEN-END:variables
}
