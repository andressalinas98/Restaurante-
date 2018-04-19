/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import ingredientes.*;
import javax.swing.DefaultListModel;

/**
 *
 * @author Daniel Felipe Camargo Roa 20172020078 
 *         Edwin Andrés Salinas 20172020087
 *         Diego Velez 20172020075
 */

import menu.Plato;

public class EditorPlato extends javax.swing.JFrame {

    DefaultListModel modeloLista = new DefaultListModel();
    Cocina Postres = new Postres();
    Cocina Principal = new Principal();
    Cocina Bebidas = new Bebidas();
    Plato plato = new Plato();
    int op = 0;
    String Agr = "Ingredientes Agregados:";

    /**
     * Creates new form EditorPlato
     */
    public EditorPlato() {
        initComponents();
        modeloLista.clear();
        ListaIngredientes.setModel(modeloLista);
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
        btnBebidas = new javax.swing.JButton();
        btnPrincipal = new javax.swing.JButton();
        btnPostres = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaIngredientes = new javax.swing.JList<>();
        Presentacion = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        Nombrar = new javax.swing.JButton();
        TextField = new javax.swing.JTextField();
        Agregados = new javax.swing.JLabel();
        Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        btnBebidas.setText("Bebidas");
        btnBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidasActionPerformed(evt);
            }
        });
        jPanel1.add(btnBebidas);
        btnBebidas.setBounds(130, 170, 91, 23);

        btnPrincipal.setText("Principal");
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrincipal);
        btnPrincipal.setBounds(20, 170, 97, 23);

        btnPostres.setText("Postres");
        btnPostres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostresActionPerformed(evt);
            }
        });
        jPanel1.add(btnPostres);
        btnPostres.setBounds(240, 170, 89, 23);

        ListaIngredientes.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(ListaIngredientes);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 200, 379, 130);

        Presentacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Presentacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/platoshop.png"))); // NOI18N
        jPanel1.add(Presentacion);
        Presentacion.setBounds(140, 30, 240, 130);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(430, 200, 71, 23);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);
        btnEliminar.setBounds(430, 240, 69, 23);

        Nombrar.setText("Nombrar");
        Nombrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombrarActionPerformed(evt);
            }
        });
        jPanel1.add(Nombrar);
        Nombrar.setBounds(420, 340, 77, 30);

        TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(TextField);
        TextField.setBounds(10, 340, 390, 30);

        Agregados.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        Agregados.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Agregados);
        Agregados.setBounds(10, 370, 390, 90);

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/fondo interfaz.jpg"))); // NOI18N
        jPanel1.add(Wallpaper);
        Wallpaper.setBounds(4, 4, 540, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        modeloLista.clear();
        for (int i = 0; i < Principal.getSize(); i++) {
            modeloLista.add(i, Principal.getNombreP(i));
        }
        ListaIngredientes.setModel(modeloLista);
        op = 2;
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void btnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidasActionPerformed
        modeloLista.clear();
        for (int i = 0; i < Bebidas.getSize(); i++) {
            modeloLista.add(i, Bebidas.getNombreP(i));
        }
        ListaIngredientes.setModel(modeloLista);
        op = 1;
    }//GEN-LAST:event_btnBebidasActionPerformed

    private void btnPostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostresActionPerformed
        modeloLista.clear();
        for (int i = 0; i < Postres.getSize(); i++) {
            modeloLista.add(i, Postres.getNombreP(i));
        }
        ListaIngredientes.setModel(modeloLista);
        op = 3;
    }//GEN-LAST:event_btnPostresActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        switch (op) {
            case 1:
                plato.preparar(Bebidas.getIng(ListaIngredientes.getSelectedIndex()));
                Agr += Bebidas.getNombreP(ListaIngredientes.getSelectedIndex()) + ", ";
                Agregados.setText(Agr);
                break;
            case 2:
                plato.preparar(Principal.getIng(ListaIngredientes.getSelectedIndex()));
                Agr += Principal.getNombreP(ListaIngredientes.getSelectedIndex()) + ", ";
                Agregados.setText(Agr);
                break;
            case 3:
                plato.preparar(Postres.getIng(ListaIngredientes.getSelectedIndex()));
                Agr += Postres.getNombreP(ListaIngredientes.getSelectedIndex()) + ", ";
                Agregados.setText(Agr);
                break;
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void NombrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombrarActionPerformed
        plato.setNombre(TextField.getText());
//        this.setVisible(false);
//        plato.limpiar();
    }//GEN-LAST:event_NombrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        plato.quitar(ListaIngredientes.getSelectedIndex());
    }//GEN-LAST:event_btnEliminarActionPerformed

    public Plato getPlato() {
        return plato;
    }

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
       CartaRestaurante B = new CartaRestaurante();
       B.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(EditorPlato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorPlato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorPlato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorPlato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorPlato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agregados;
    private javax.swing.JList<String> ListaIngredientes;
    private javax.swing.JButton Nombrar;
    private javax.swing.JLabel Presentacion;
    private javax.swing.JTextField TextField;
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBebidas;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnPostres;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}