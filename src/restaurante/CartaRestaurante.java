/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.LinkedList;
import javax.swing.DefaultListModel;
import menu.Plato;

/**
 *
 * @author Daniel Felipe Camargo Roa 20172020078 
 *         Edwin Andrés Salinas 20172020087
 *         Diego Velez 20172020075
 */

public class CartaRestaurante extends javax.swing.JFrame {

    /**
     * Creates new form CartaRestaurante
     */
    static private javax.swing.JList<String> Lista;
    static private javax.swing.JScrollPane Panel;
    Ingredientes ing = new Ingredientes(this, false);
    DefaultListModel modeloCarta = new DefaultListModel();
    LinkedList Platos = new LinkedList();
    Plato pr;
    EditorPlato c = new EditorPlato();

    public CartaRestaurante() {
        initComponents();
        jList1.setModel(modeloCarta);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WP = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Ver = new javax.swing.JButton();
        Crear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Bienvenidos = new javax.swing.JLabel();
        Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WP.setLayout(null);

        jButton1.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        jButton1.setText("Preparar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        WP.add(jButton1);
        jButton1.setBounds(430, 290, 141, 27);

        Ver.setText("Ver Ingredientes");
        Ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerActionPerformed(evt);
            }
        });
        WP.add(Ver);
        Ver.setBounds(430, 330, 141, 23);

        Crear.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        Crear.setText("Crear");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });
        WP.add(Crear);
        Crear.setBounds(470, 380, 80, 40);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de Platos");
        WP.add(jLabel1);
        jLabel1.setBounds(70, 260, 248, 19);

        jScrollPane1.setViewportView(jList1);

        WP.add(jScrollPane1);
        jScrollPane1.setBounds(70, 290, 338, 157);

        Bienvenidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bienvenidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/letrero final.png"))); // NOI18N
        WP.add(Bienvenidos);
        Bienvenidos.setBounds(60, 60, 490, 180);

        Wallpaper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/fondo interfaz.jpg"))); // NOI18N
        WP.add(Wallpaper);
        Wallpaper.setBounds(0, 0, 600, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WP, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WP, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        c.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerActionPerformed
        
        ing.set((Plato)Platos.get(jList1.getSelectedIndex()));
        ing.setVisible(true);
    }//GEN-LAST:event_VerActionPerformed

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        Platos.add(c.getPlato());
        pr = c.getPlato();
        modeloCarta.addElement(pr.getNombre());
        c.setVisible(false);
        c = new EditorPlato();
    }//GEN-LAST:event_CrearActionPerformed

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
            java.util.logging.Logger.getLogger(CartaRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CartaRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CartaRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CartaRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CartaRestaurante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenidos;
    private javax.swing.JButton Crear;
    private javax.swing.JButton Ver;
    private javax.swing.JPanel WP;
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}