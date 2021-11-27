/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

//import Classes.User;
import DAO.UserDAO;
import Javabeans.User;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose Luiz
 */
public class DeleteUser extends javax.swing.JFrame {

    //cria um usuario
    //Classes.User user = new Classes.User();

    //cria uma instancia de Func Class
    //Classes.Func_Class func = new Classes.Func_Class();

    //cria uma variável para armazenar a foto de perfil
    public DeleteUser() {
        initComponents();

        this.setLocationRelativeTo(null);

        //mostrar imagem usnado o path
        // para isso, setar o imagebyte como null
        //func.displayImage(90, 60, null, "My_images/logo.png", jLabel_FormTitle);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchtitle = new javax.swing.JLabel();
        searchfield = new javax.swing.JTextField();
        search_separator = new javax.swing.JSeparator();
        searchbutton = new javax.swing.JButton();
        nametitle = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        name_separator = new javax.swing.JSeparator();
        usernametitle = new javax.swing.JLabel();
        usernamefield = new javax.swing.JTextField();
        username_separator = new javax.swing.JSeparator();
        emailtitle = new javax.swing.JLabel();
        emailfield = new javax.swing.JTextField();
        email_separator = new javax.swing.JSeparator();
        phonetitle = new javax.swing.JLabel();
        phonefield = new javax.swing.JTextField();
        phone_separator = new javax.swing.JSeparator();
        deleteuserbutton = new javax.swing.JButton();
        closebutton = new javax.swing.JLabel();
        orangebox = new javax.swing.JLabel();
        whitebg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchtitle.setText("Insira o ID do usuário:");
        getContentPane().add(searchtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 210, 20));

        searchfield.setForeground(new java.awt.Color(153, 153, 153));
        searchfield.setText("Pesquisar usuário por ID");
        searchfield.setToolTipText("");
        searchfield.setBorder(null);
        searchfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchfieldFocusLost(evt);
            }
        });
        searchfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchfieldMouseClicked(evt);
            }
        });
        searchfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchfieldActionPerformed(evt);
            }
        });
        getContentPane().add(searchfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 260, 20));
        getContentPane().add(search_separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 260, 10));

        searchbutton.setBackground(new java.awt.Color(60, 86, 240));
        searchbutton.setForeground(new java.awt.Color(240, 240, 240));
        searchbutton.setText("Pesquisar");
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(searchbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 100, 30));

        nametitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_adduser/title_name.png"))); // NOI18N
        getContentPane().add(nametitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, 20));

        namefield.setEditable(false);
        namefield.setToolTipText("");
        namefield.setBorder(null);
        namefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namefieldActionPerformed(evt);
            }
        });
        getContentPane().add(namefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 370, 30));
        getContentPane().add(name_separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 370, 10));

        usernametitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_adduser/title.png"))); // NOI18N
        getContentPane().add(usernametitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 100, 20));

        usernamefield.setEditable(false);
        usernamefield.setToolTipText("");
        usernamefield.setBorder(null);
        getContentPane().add(usernamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 370, 30));
        getContentPane().add(username_separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 370, 10));

        emailtitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_adduser/title_email.png"))); // NOI18N
        getContentPane().add(emailtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 30, 20));

        emailfield.setEditable(false);
        emailfield.setToolTipText("");
        emailfield.setBorder(null);
        getContentPane().add(emailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 370, 30));
        getContentPane().add(email_separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 370, 10));

        phonetitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_adduser/phone_email.png"))); // NOI18N
        getContentPane().add(phonetitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 50, 20));

        phonefield.setEditable(false);
        phonefield.setToolTipText("");
        phonefield.setBorder(null);
        getContentPane().add(phonefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 370, 30));
        getContentPane().add(phone_separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 370, 10));

        deleteuserbutton.setBackground(new java.awt.Color(60, 86, 240));
        deleteuserbutton.setForeground(new java.awt.Color(240, 240, 240));
        deleteuserbutton.setText("Excluir");
        deleteuserbutton.setToolTipText("");
        deleteuserbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteuserbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteuserbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 130, 30));

        closebutton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_adduser/close_icon.png"))); // NOI18N
        closebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebuttonMouseClicked(evt);
            }
        });
        getContentPane().add(closebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 10, 10));

        orangebox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orangebox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_adduser/orange_box.png"))); // NOI18N
        getContentPane().add(orangebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        whitebg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgregister/white-bg.png"))); // NOI18N
        getContentPane().add(whitebg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 410, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebuttonMouseClicked
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_closebuttonMouseClicked

    private void namefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namefieldActionPerformed

    private void deleteuserbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteuserbuttonActionPerformed
        try {
            int intUserId = Integer.parseInt(searchfield.getText());
            String strFullName = namefield.getText();
            String strUserName = usernamefield.getText();
            String strEmail = emailfield.getText();
            String strPhone = phonefield.getText();

            User obj = new User();

            obj.setIdUser(intUserId);
            obj.setNameComplete(strFullName);                           // Nome Completo
            obj.setNameUser(strUserName);                               // Nome do Usuario
            obj.setEmail(strEmail);                                     // Email
            obj.setPhone(strPhone);                                     // Telefone

            // Executando o delete
            UserDAO daoExcluir = new UserDAO();

            daoExcluir.excluirUsuario(obj);
            JOptionPane.showMessageDialog(null, "Sua conta foi excluida com sucesso.");
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir sua conta: " + error);
        }

    }//GEN-LAST:event_deleteuserbuttonActionPerformed

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed

        //obter dados do usuário
        try {
            int intUserId = Integer.parseInt(searchfield.getText());

            // Executando o select
            UserDAO dao = new UserDAO();
            List<User> listUsers = dao.consultarUsuario(intUserId);

            for (User u : listUsers) {
                namefield.setText(u.getNameComplete());
                usernamefield.setText(u.getNameUser());
                emailfield.setText(u.getEmail());
                phonefield.setText(u.getPhone());
            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Erro ao encontrar sua conta: " + error);
        }

    }//GEN-LAST:event_searchbuttonActionPerformed

    private void searchfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchfieldFocusGained
        // TODO add your handling code here:
        //emailfield.setText("");
        if (searchfield.getText().trim().equals("Pesquisar usuário por ID")) {
            searchfield.setText("");
            searchfield.setForeground(Color.black);
        }
    }//GEN-LAST:event_searchfieldFocusGained

    private void searchfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchfieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_searchfieldFocusLost

    private void searchfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchfieldActionPerformed

    private void searchfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchfieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchfieldMouseClicked

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
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closebutton;
    private javax.swing.JButton deleteuserbutton;
    private javax.swing.JSeparator email_separator;
    private javax.swing.JTextField emailfield;
    private javax.swing.JLabel emailtitle;
    private javax.swing.JSeparator name_separator;
    private javax.swing.JTextField namefield;
    private javax.swing.JLabel nametitle;
    private javax.swing.JLabel orangebox;
    private javax.swing.JSeparator phone_separator;
    private javax.swing.JTextField phonefield;
    private javax.swing.JLabel phonetitle;
    private javax.swing.JSeparator search_separator;
    private javax.swing.JButton searchbutton;
    private javax.swing.JTextField searchfield;
    private javax.swing.JLabel searchtitle;
    private javax.swing.JSeparator username_separator;
    private javax.swing.JTextField usernamefield;
    private javax.swing.JLabel usernametitle;
    private javax.swing.JLabel whitebg;
    // End of variables declaration//GEN-END:variables
}