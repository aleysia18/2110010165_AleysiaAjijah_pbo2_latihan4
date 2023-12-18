/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package layout;

import java.awt.CardLayout;

/**
 *
 * @author User
 */
public class PilihGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButton() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        btnGlassFish = new javax.swing.JButton();
        btnJavaEE = new javax.swing.JButton();
        btnPostgreSQL = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        lblGlassFish = new javax.swing.JLabel();
        lblJavaEE = new javax.swing.JLabel();
        lblPostgreSQL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PilihGambarButton");

        buttonPanel.setBackground(new java.awt.Color(204, 204, 204));

        btnGlassFish.setText("GlassFish");
        btnGlassFish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGlassFishActionPerformed(evt);
            }
        });
        buttonPanel.add(btnGlassFish);

        btnJavaEE.setText("JavaEE");
        btnJavaEE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJavaEEActionPerformed(evt);
            }
        });
        buttonPanel.add(btnJavaEE);

        btnPostgreSQL.setText("PostgreSQL");
        btnPostgreSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostgreSQLActionPerformed(evt);
            }
        });
        buttonPanel.add(btnPostgreSQL);

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        buttonPanel.add(jButton1);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        imagePanel.setLayout(new java.awt.CardLayout());

        lblGlassFish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGlassFish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/glassfish.jpg"))); // NOI18N
        imagePanel.add(lblGlassFish, "0");
        lblGlassFish.getAccessibleContext().setAccessibleName("0");
        lblGlassFish.getAccessibleContext().setAccessibleDescription("null");

        lblJavaEE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJavaEE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/javaee.jpg"))); // NOI18N
        imagePanel.add(lblJavaEE, "1");
        lblJavaEE.getAccessibleContext().setAccessibleName("1");
        lblJavaEE.getAccessibleContext().setAccessibleDescription("null");

        lblPostgreSQL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPostgreSQL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/postgresql.jpg"))); // NOI18N
        imagePanel.add(lblPostgreSQL, "2");
        lblPostgreSQL.getAccessibleContext().setAccessibleName("2");
        lblPostgreSQL.getAccessibleContext().setAccessibleDescription("null");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPostgreSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostgreSQLActionPerformed
        CardLayout c1 = (CardLayout)(imagePanel.getLayout());
        c1.show(imagePanel, "2");
    }//GEN-LAST:event_btnPostgreSQLActionPerformed

    private void btnJavaEEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJavaEEActionPerformed
        CardLayout c1 = (CardLayout)(imagePanel.getLayout());
        c1.show(imagePanel, "1");
    }//GEN-LAST:event_btnJavaEEActionPerformed

    private void btnGlassFishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGlassFishActionPerformed
        CardLayout c1 = (CardLayout)(imagePanel.getLayout());
        c1.show(imagePanel, "0");
    }//GEN-LAST:event_btnGlassFishActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGlassFish;
    private javax.swing.JButton btnJavaEE;
    private javax.swing.JButton btnPostgreSQL;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblGlassFish;
    private javax.swing.JLabel lblJavaEE;
    private javax.swing.JLabel lblPostgreSQL;
    // End of variables declaration//GEN-END:variables
}
