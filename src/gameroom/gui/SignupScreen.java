/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameroom.gui;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JFrame;
import gameroom.bdGestor.Bd_gestor;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SignupScreen extends javax.swing.JFrame {


    private Color darkBlue = Color.decode("#0f0326");
    private Color ligthBlue = Color.decode("#1c6e8c");
    private Color yellow = Color.decode("#ffd23f");
    private Color red = Color.decode("#dd0426");
    private Color white = Color.decode("#fafaff");    
    
    public SignupScreen() {
        setTitle("GameRoom - Crear nueva cuenta");
        initComponents();
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
        field_username = new javax.swing.JTextField();
        field_password = new javax.swing.JPasswordField();
        field_verifyPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(darkBlue);
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/img/crearNuevaCuenta-fixed.png"))); // NOI18N

        field_username.setBackground(new java.awt.Color(255, 255, 255));
        field_username.setForeground(new java.awt.Color(0, 0, 0));
        field_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_username.setBorder(null);
        field_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_usernameActionPerformed(evt);
            }
        });

        field_password.setBackground(new java.awt.Color(255, 255, 255));
        field_password.setForeground(new java.awt.Color(0, 0, 0));
        field_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_password.setBorder(null);

        field_verifyPassword.setBackground(new java.awt.Color(255, 255, 255));
        field_verifyPassword.setForeground(new java.awt.Color(0, 0, 0));
        field_verifyPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_verifyPassword.setBorder(null);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE DE USUARIO:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONTRASEÑA:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VERIFICAR CONTRASEÑA:");

        jButton1.setBackground(red);
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CREAR UNA NUEVA CUENTA");
        jButton1.setBorder(null);
        jButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(field_username)
                            .addComponent(field_password)
                            .addComponent(field_verifyPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(field_username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(field_password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(field_verifyPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void field_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_usernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Bd_gestor bdGestor = new Bd_gestor("ueizgfjgoc2gxumn","u22yMCtXEBlTA4pMsMjI",this);
        
        // Obtenemos el valor en String de los JPassword y JTextField.
        
        
        String username = field_username.getText();
        String passwdString = new String(field_password.getPassword());
        String passwdVerifyString = new String(field_verifyPassword.getPassword());
        
        if(!passwdString.equals("") & !passwdVerifyString.equals("") & !username.equals("")){
            if(passwdString.equals(passwdVerifyString)){
                try {
                    bdGestor.registerUser(username, passwdString);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SignupScreen.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ocurrio un error inesperado. Por favor intentelo de nuevo mas tarde.");
                    Logger.getLogger(SignupScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Por favor, rellene todos los campos.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SignupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField field_password;
    private javax.swing.JTextField field_username;
    private javax.swing.JPasswordField field_verifyPassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}