/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Luiz
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        this.setLocationRelativeTo(null);
               
        //Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.blue);
        //registerlink.setBorder(label_border);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closebutton = new javax.swing.JLabel();
        viewpwd = new javax.swing.JCheckBox();
        emailseparator = new javax.swing.JSeparator();
        emailfield = new javax.swing.JTextField();
        pwdseparator = new javax.swing.JSeparator();
        pwdfield = new javax.swing.JPasswordField();
        loginbutton = new javax.swing.JButton();
        loginfieldtitle = new javax.swing.JLabel();
        registertext = new javax.swing.JLabel();
        registerlink = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        bgblue = new javax.swing.JLabel();
        bgwhite = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close-button.png"))); // NOI18N
        closebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebuttonMouseClicked(evt);
            }
        });
        getContentPane().add(closebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 20, 20, 20));

        viewpwd.setBackground(new java.awt.Color(255, 255, 255));
        viewpwd.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        viewpwd.setText("Ver/ocultar senha");
        viewpwd.setToolTipText("");
        viewpwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewpwdMouseClicked(evt);
            }
        });
        viewpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpwdActionPerformed(evt);
            }
        });
        getContentPane().add(viewpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, -1, -1));

        emailseparator.setForeground(new java.awt.Color(60, 86, 240));
        getContentPane().add(emailseparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, 280, 10));

        emailfield.setForeground(new java.awt.Color(153, 153, 153));
        emailfield.setText("Endereço de email");
        emailfield.setToolTipText("");
        emailfield.setBorder(null);
        emailfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailfieldFocusLost(evt);
            }
        });
        emailfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailfieldActionPerformed(evt);
            }
        });
        getContentPane().add(emailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 280, 30));

        pwdseparator.setForeground(new java.awt.Color(60, 86, 240));
        getContentPane().add(pwdseparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 280, 10));

        pwdfield.setForeground(new java.awt.Color(153, 153, 153));
        pwdfield.setText("testetestete");
        pwdfield.setToolTipText("");
        pwdfield.setBorder(null);
        pwdfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwdfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwdfieldFocusLost(evt);
            }
        });
        pwdfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdfieldActionPerformed(evt);
            }
        });
        getContentPane().add(pwdfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, 280, 30));
        pwdfield.getAccessibleContext().setAccessibleName("");

        loginbutton.setBackground(new java.awt.Color(60, 86, 240));
        loginbutton.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        loginbutton.setForeground(new java.awt.Color(240, 240, 240));
        loginbutton.setText("Iniciar sessão");
        loginbutton.setBorder(null);
        loginbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginbuttonMouseExited(evt);
            }
        });
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(loginbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 510, 280, 50));

        loginfieldtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginfieldtitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loginfieldtitle.png"))); // NOI18N
        getContentPane().add(loginfieldtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 690, 40));

        registertext.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        registertext.setText("Não possui uma conta?");
        getContentPane().add(registertext, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 570, -1, -1));

        registerlink.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        registerlink.setForeground(new java.awt.Color(86, 60, 240));
        registerlink.setText("Clique aqui para se registrar!");
        registerlink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerlinkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerlinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerlinkMouseExited(evt);
            }
        });
        getContentPane().add(registerlink, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 570, -1, -1));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logodescricao.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 730));

        bgblue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bluebg.png"))); // NOI18N
        getContentPane().add(bgblue, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 600, 790));

        bgwhite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/whitebg.png"))); // NOI18N
        getContentPane().add(bgwhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 710, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailfieldActionPerformed

    private void viewpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewpwdActionPerformed

    private void viewpwdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewpwdMouseClicked
        // TODO add your handling code here:
        if(viewpwd.isSelected()){
            pwdfield.setEchoChar((char)0);
        }else{
            pwdfield.setEchoChar('*');
        }
    }//GEN-LAST:event_viewpwdMouseClicked

    private void closebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebuttonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closebuttonMouseClicked

    private void pwdfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdfieldActionPerformed

    private void emailfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailfieldFocusGained
        // TODO add your handling code here:
        //emailfield.setText("");
        if(emailfield.getText().trim().equals("Endereço de email")){
            emailfield.setText("");
            emailfield.setForeground(Color.black);
        }
    }//GEN-LAST:event_emailfieldFocusGained

    private void pwdfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdfieldFocusGained
        // TODO add your handling code here:
        //pwdfield.setText("");
        
        String pass = String.valueOf(pwdfield.getPassword());
        
        if(pass.trim().equals("testetestete")){
            pwdfield.setText("");
            pwdfield.setForeground(Color.black);
        }
    }//GEN-LAST:event_pwdfieldFocusGained

    private void emailfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailfieldFocusLost
        // TODO add your handling code here:
        if(emailfield.getText().trim().equals("") || emailfield.getText().trim().equals("Endereço de email")){
            emailfield.setText("Endereço de email");
            emailfield.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_emailfieldFocusLost

    private void pwdfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdfieldFocusLost
        // TODO add your handling code here:
        
        String pass = String.valueOf(pwdfield.getPassword());
        
        if(pass.trim().equals("") || pass.trim().equals("testetestete")){
            pwdfield.setText("testetestete");
            pwdfield.setForeground(new Color(153, 153, 153));
        }        
        
    }//GEN-LAST:event_pwdfieldFocusLost

    private void loginbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbuttonMouseExited
        // TODO add your handling code here:
        loginbutton.setBackground(new Color(60, 84, 240));
    }//GEN-LAST:event_loginbuttonMouseExited

    private void loginbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbuttonMouseEntered
        // TODO add your handling code here:
        loginbutton.setBackground(new Color(33, 51, 163));
    }//GEN-LAST:event_loginbuttonMouseEntered

    private void loginbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbuttonMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_loginbuttonMouseClicked

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        // TODO add your handling code here:
        PreparedStatement st;
        ResultSet rs;
        
        String email = emailfield.getText();
        String password = String.valueOf(pwdfield.getPassword());
        
        String query = "SELECT * FROM `users` WHERE `email` = ? AND `password`= ?";
        
        if(emailfield.getText().trim().equals("Endereço de email")){
            JOptionPane.showMessageDialog(null, "Insira seu endereço de email", "O campo de email está vazio.", 2);
        }
        else if(password.trim().equals("testetestete")){
            JOptionPane.showMessageDialog(null, "Insira sua senha", "O campo senha, está vazio", 2);
        }
        else{
            
            try {
            st = ConnectionFactory.getConnection().prepareStatement(query);
            
            st.setString(1, email);
            st.setString(2, password);
            rs = st.executeQuery();
            
            if(rs.next()){
                // mostrar um novo formulario
                Menu form = new Menu();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                // fechar o formulario de login atual form(login form)
                this.dispose();
                
            }else{
                // exibir mensagem de erro
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos", "Erro", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void registerlinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerlinkMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.blue);
        registerlink.setBorder(label_border);
    }//GEN-LAST:event_registerlinkMouseEntered

    private void registerlinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerlinkMouseExited
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.gray);
        registerlink.setBorder(label_border);
    }//GEN-LAST:event_registerlinkMouseExited

    private void registerlinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerlinkMouseClicked
        // TODO add your handling code here:
        RegisterForm rf = new RegisterForm();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_registerlinkMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgblue;
    private javax.swing.JLabel bgwhite;
    private javax.swing.JLabel closebutton;
    private javax.swing.JTextField emailfield;
    private javax.swing.JSeparator emailseparator;
    private javax.swing.JButton loginbutton;
    private javax.swing.JLabel loginfieldtitle;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField pwdfield;
    private javax.swing.JSeparator pwdseparator;
    private javax.swing.JLabel registerlink;
    private javax.swing.JLabel registertext;
    private javax.swing.JCheckBox viewpwd;
    // End of variables declaration//GEN-END:variables
}
