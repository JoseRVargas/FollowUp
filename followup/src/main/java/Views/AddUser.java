/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

//import Classes.ConnectionFactory;
import DAO.UserDAO;
import JDBC.ConnectorFactory;
import Javabeans.User;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Jose Luiz
 */
public class AddUser extends javax.swing.JFrame {

    /**
     * Creates new form AddUser
     */
    //Cria um novo objeto para o metodo de classes
    //Classes.User User = new Classes.User();

    //Cria uma variável para armazenar o diretorio da foto de perfil
    String imagePath = null;

    public AddUser() {
        initComponents();

        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nametitle = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        nameseparator = new javax.swing.JSeparator();
        usernametitle = new javax.swing.JLabel();
        usernamefield = new javax.swing.JTextField();
        usernameseparator = new javax.swing.JSeparator();
        emailtitle = new javax.swing.JLabel();
        emailfield = new javax.swing.JTextField();
        emailseparator = new javax.swing.JSeparator();
        phonetitle = new javax.swing.JLabel();
        phonefield = new javax.swing.JTextField();
        phoneseparator = new javax.swing.JSeparator();
        pwdtitle1 = new javax.swing.JLabel();
        pwdfield1 = new javax.swing.JPasswordField();
        pwdseparator1 = new javax.swing.JSeparator();
        pwdtitle2 = new javax.swing.JLabel();
        pwdfield2 = new javax.swing.JPasswordField();
        pwdseparator2 = new javax.swing.JSeparator();
        registerbutton = new javax.swing.JButton();
        Adduser_title = new javax.swing.JLabel();
        closebutton = new javax.swing.JLabel();
        orangebox = new javax.swing.JLabel();
        whitebg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 570));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nametitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_adduser/title_name.png"))); // NOI18N
        getContentPane().add(nametitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, 20));

        namefield.setForeground(new java.awt.Color(153, 153, 153));
        namefield.setText("Insira o nome completo");
        namefield.setBorder(null);
        namefield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                namefieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                namefieldFocusLost(evt);
            }
        });
        namefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namefieldActionPerformed(evt);
            }
        });
        getContentPane().add(namefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 370, 30));
        getContentPane().add(nameseparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 370, 10));

        usernametitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_adduser/title.png"))); // NOI18N
        getContentPane().add(usernametitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 100, 20));

        usernamefield.setForeground(new java.awt.Color(153, 153, 153));
        usernamefield.setText("Insira um nome de usuário");
        usernamefield.setBorder(null);
        usernamefield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernamefieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernamefieldFocusLost(evt);
            }
        });
        usernamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamefieldActionPerformed(evt);
            }
        });
        getContentPane().add(usernamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 370, 30));
        getContentPane().add(usernameseparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 370, 10));

        emailtitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_adduser/title_email.png"))); // NOI18N
        getContentPane().add(emailtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 30, 20));

        emailfield.setForeground(new java.awt.Color(153, 153, 153));
        emailfield.setText("Insira um endereço de email");
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
        getContentPane().add(emailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 370, 30));
        getContentPane().add(emailseparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 370, 10));

        phonetitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_adduser/phone_email.png"))); // NOI18N
        getContentPane().add(phonetitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 50, 20));

        phonefield.setForeground(new java.awt.Color(153, 153, 153));
        phonefield.setText("Insira um número de telefone");
        phonefield.setToolTipText("");
        phonefield.setBorder(null);
        phonefield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phonefieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phonefieldFocusLost(evt);
            }
        });
        phonefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonefieldActionPerformed(evt);
            }
        });
        phonefield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phonefieldKeyTyped(evt);
            }
        });
        getContentPane().add(phonefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 370, 30));
        getContentPane().add(phoneseparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 370, 10));

        pwdtitle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_adduser/password_email.png"))); // NOI18N
        getContentPane().add(pwdtitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 40, 20));

        pwdfield1.setForeground(new java.awt.Color(153, 153, 153));
        pwdfield1.setText("testetestete");
        pwdfield1.setBorder(null);
        pwdfield1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwdfield1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwdfield1FocusLost(evt);
            }
        });
        getContentPane().add(pwdfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 370, 30));
        getContentPane().add(pwdseparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 370, 10));

        pwdtitle2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_adduser/password_email.png"))); // NOI18N
        getContentPane().add(pwdtitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 40, 20));

        pwdfield2.setForeground(new java.awt.Color(153, 153, 153));
        pwdfield2.setText("testetestete");
        pwdfield2.setBorder(null);
        pwdfield2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwdfield2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwdfield2FocusLost(evt);
            }
        });
        pwdfield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdfield2ActionPerformed(evt);
            }
        });
        getContentPane().add(pwdfield2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 370, 30));
        getContentPane().add(pwdseparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 370, 10));

        registerbutton.setBackground(new java.awt.Color(60, 86, 240));
        registerbutton.setForeground(new java.awt.Color(240, 240, 240));
        registerbutton.setText("Cadastrar");
        registerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(registerbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 130, 30));

        Adduser_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Adduser_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_adduser/adduser_text.png"))); // NOI18N
        getContentPane().add(Adduser_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 150, 30));

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
        getContentPane().add(whitebg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 410, 520));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailfieldActionPerformed

    private void usernamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamefieldActionPerformed

    private void namefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namefieldActionPerformed

    private void closebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebuttonMouseClicked
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_closebuttonMouseClicked

    private void phonefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonefieldActionPerformed

    private void registerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbuttonActionPerformed

        try {
            String strFullName = namefield.getText();
            String strUserName = usernamefield.getText();
            String strEmail = emailfield.getText();
            String strPwd1 = String.valueOf(pwdfield1.getPassword());
            String strPwd2 = String.valueOf(pwdfield2.getPassword());
            String strPhone = phonefield.getText();

            //Verificacao dos campos preenchidos
            if (verifyFields()) {

                //  Chamada do objeto dao para checagem do usuario
                UserDAO daocheck = new UserDAO();

                // Verificar se o usuario ja existe no sistema
                if (daocheck.checarUsuario(strUserName)) {
                    JOptionPane.showMessageDialog(null, "Esse nome de usuário já existe. Por favor, escolha outro nome", "Falha na criação do usuário", 2);
                } else {
                    // Continua com o cadastro do usuario
                    User obj = new User();
                    obj.setNameComplete(strFullName);                           // Nome Completo
                    obj.setNameUser(strUserName);                               // Nome do Usuario
                    obj.setEmail(strEmail);                                     // Email
                    obj.setPhone(phonefield.getText());                         // Telefone
                    obj.setPassword(String.valueOf(pwdfield1.getPassword()));   // Password

                    UserDAO dao = new UserDAO();
                    dao.cadastrarUsuario(obj);
                    JOptionPane.showMessageDialog(null, "Sua conta foi criada com sucesso.");

                }

            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar sua conta: " + error);
        }


    }//GEN-LAST:event_registerbuttonActionPerformed

    private void namefieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namefieldFocusGained
        // TODO add your handling code here:
        if (namefield.getText().trim().equals("Insira o nome completo")) {
            namefield.setText("");
            namefield.setForeground(Color.black);
        }
    }//GEN-LAST:event_namefieldFocusGained

    private void namefieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namefieldFocusLost
        // TODO add your handling code here:
        if (namefield.getText().trim().equals("") || namefield.getText().trim().equals("Insira o nome completo")) {
            namefield.setText("Insira o nome completo");
            namefield.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_namefieldFocusLost

    private void usernamefieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernamefieldFocusGained
        // TODO add your handling code here:
        if (usernamefield.getText().trim().equals("Insira um nome de usuário")) {
            usernamefield.setText("");
            usernamefield.setForeground(Color.black);
        }
    }//GEN-LAST:event_usernamefieldFocusGained

    private void usernamefieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernamefieldFocusLost
        // TODO add your handling code here:
        if (usernamefield.getText().trim().equals("") || usernamefield.getText().trim().equals("Insira um nome de usuário")) {
            usernamefield.setText("Insira um nome de usuário");
            usernamefield.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_usernamefieldFocusLost

    private void emailfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailfieldFocusGained
        // TODO add your handling code here:
        if (emailfield.getText().trim().equals("Insira um endereço de email")) {
            emailfield.setText("");
            emailfield.setForeground(Color.black);
        }
    }//GEN-LAST:event_emailfieldFocusGained

    private void emailfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailfieldFocusLost
        // TODO add your handling code here:
        if (emailfield.getText().trim().equals("") || emailfield.getText().trim().equals("Insira um endereço de email")) {
            emailfield.setText("Insira um endereço de email");
            emailfield.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_emailfieldFocusLost

    private void phonefieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phonefieldFocusGained
        // TODO add your handling code here:
        if (phonefield.getText().trim().equals("Insira um número de telefone")) {
            phonefield.setText("");
            phonefield.setForeground(Color.black);
        }
    }//GEN-LAST:event_phonefieldFocusGained

    private void phonefieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phonefieldFocusLost
        // TODO add your handling code here:
        if (phonefield.getText().trim().equals("") || phonefield.getText().trim().equals("Insira um número de telefone")) {
            phonefield.setText("Insira um número de telefone");
            phonefield.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_phonefieldFocusLost

    private void pwdfield2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdfield2FocusGained
        // TODO add your handling code here:
        String pass = String.valueOf(pwdfield2.getPassword());

        if (pass.trim().equals("testetestete")) {
            pwdfield2.setText("");
            pwdfield2.setForeground(Color.black);
        }

    }//GEN-LAST:event_pwdfield2FocusGained

    private void pwdfield2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdfield2FocusLost
        // TODO add your handling code here:
        String pass = String.valueOf(pwdfield2.getPassword());

        if (pass.trim().equals("") || pass.trim().equals("testetestete")) {
            pwdfield2.setText("testetestete");
            pwdfield2.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_pwdfield2FocusLost

    private void phonefieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonefieldKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_phonefieldKeyTyped

    private void pwdfield1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdfield1FocusGained
        // TODO add your handling code here:
        String pass = String.valueOf(pwdfield2.getPassword());

        if (pass.trim().equals("testetestete")) {
            pwdfield1.setText("");
            pwdfield1.setForeground(Color.black);
        }
    }//GEN-LAST:event_pwdfield1FocusGained

    private void pwdfield1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdfield1FocusLost
        // TODO add your handling code here:
        String pass = String.valueOf(pwdfield1.getPassword());

        if (pass.trim().equals("") || pass.trim().equals("testetestete")) {
            pwdfield1.setText("testetestete");
            pwdfield1.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_pwdfield1FocusLost

    private void pwdfield2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdfield2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdfield2ActionPerformed
    public boolean verifyFields() {

        //Declaracao das Variaveis
        String strFullName = namefield.getText();
        String strUserName = usernamefield.getText();
        String strEmail = emailfield.getText();
        String strPhone = phonefield.getText();
        String strPwd1 = String.valueOf(pwdfield1.getPassword());
        String strPwd2 = String.valueOf(pwdfield2.getPassword());

        //Checando se todos os campos obrigatorios foram preenchidos
        if (strFullName.trim().equals("") || strUserName.trim().equals("") || strEmail.trim().equals("") || strPhone.trim().equals("")
                || strPwd1.trim().equals("") || strPwd2.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Um ou mais campos estão vazios", "Campos vazios", 2);
            return false;
        } //Checando se ambas as senhas são iguais
        else if (!strPwd1.equals(strPwd2)) {
            JOptionPane.showMessageDialog(null, "As senhas não coincidem", "Confirmar senha", 2);
            return false;
        } //Caso todas as verificacoes esteja corretas 
        else {
            return true;
        }
    }

    //Criar uma função para checar se o usuário já existe na base de dados
    public boolean checkUsername(String username) {

        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;

        String query = "SELECT * FROM `usuarios` WHERE `name_user` = ?";

        try {
            st = ConnectorFactory.conecta().prepareStatement(query);
            st.setString(1, username);
            rs = st.executeQuery();

            if (rs.next()) {
                username_exist = true;
                JOptionPane.showMessageDialog(null, "Esse nome de usuário já existe. Por favor, escolha outro nome", "Falha na criação do usuário", 2);
            }

        } catch (SQLException ex) {
            //Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        return username_exist;

    }

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
                if ("Motif".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adduser_title;
    private javax.swing.JLabel closebutton;
    private javax.swing.JTextField emailfield;
    private javax.swing.JSeparator emailseparator;
    private javax.swing.JLabel emailtitle;
    private javax.swing.JTextField namefield;
    private javax.swing.JSeparator nameseparator;
    private javax.swing.JLabel nametitle;
    private javax.swing.JLabel orangebox;
    private javax.swing.JTextField phonefield;
    private javax.swing.JSeparator phoneseparator;
    private javax.swing.JLabel phonetitle;
    private javax.swing.JPasswordField pwdfield1;
    private javax.swing.JPasswordField pwdfield2;
    private javax.swing.JSeparator pwdseparator1;
    private javax.swing.JSeparator pwdseparator2;
    private javax.swing.JLabel pwdtitle1;
    private javax.swing.JLabel pwdtitle2;
    private javax.swing.JButton registerbutton;
    private javax.swing.JTextField usernamefield;
    private javax.swing.JSeparator usernameseparator;
    private javax.swing.JLabel usernametitle;
    private javax.swing.JLabel whitebg;
    // End of variables declaration//GEN-END:variables
}
