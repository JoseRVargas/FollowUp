/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import DAO.ProjetoDAO;
import Javabeans.Projeto;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Luiz
 */
public class AddProject extends javax.swing.JFrame {

    /**
     * Creates new form AddProject
     */
    public AddProject() {
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

        newprojectTitle = new javax.swing.JLabel();
        projectNameTitle = new javax.swing.JLabel();
        projectnamefield = new javax.swing.JTextField();
        nameseparator = new javax.swing.JSeparator();
        descriptionTitle = new javax.swing.JLabel();
        textareaDescription = new javax.swing.JTextArea();
        registerbutton = new javax.swing.JButton();
        closebutton = new javax.swing.JLabel();
        orangebox = new javax.swing.JLabel();
        whitebg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newprojectTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newprojectTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgprojects/newproject_text.png"))); // NOI18N
        getContentPane().add(newprojectTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 150, 50));

        projectNameTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgprojects/title.png"))); // NOI18N
        getContentPane().add(projectNameTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 20));

        projectnamefield.setForeground(new java.awt.Color(153, 153, 153));
        projectnamefield.setText("Insira o nome do projeto");
        projectnamefield.setBorder(null);
        projectnamefield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                projectnamefieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                projectnamefieldFocusLost(evt);
            }
        });
        projectnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectnamefieldActionPerformed(evt);
            }
        });
        getContentPane().add(projectnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 380, 30));
        getContentPane().add(nameseparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 370, 10));

        descriptionTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgprojects/title_description.png"))); // NOI18N
        getContentPane().add(descriptionTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 60, 20));

        textareaDescription.setColumns(20);
        textareaDescription.setRows(5);
        getContentPane().add(textareaDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 380, 160));

        registerbutton.setBackground(new java.awt.Color(60, 86, 240));
        registerbutton.setForeground(new java.awt.Color(240, 240, 240));
        registerbutton.setText("Cadastrar");
        registerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(registerbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 130, 30));

        closebutton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_adduser/close_icon.png"))); // NOI18N
        closebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        getContentPane().add(whitebg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 410, 350));

        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void projectnamefieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_projectnamefieldFocusGained
        // TODO add your handling code here:
        if (projectnamefield.getText().trim().equals("Insira o nome do projeto")) {
            projectnamefield.setText("");
            projectnamefield.setForeground(Color.black);
        }
    }//GEN-LAST:event_projectnamefieldFocusGained

    private void projectnamefieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_projectnamefieldFocusLost
        // TODO add your handling code here:
        if (projectnamefield.getText().trim().equals("") || projectnamefield.getText().trim().equals("Insira o nome do projeto")) {
            projectnamefield.setText("Insira o nome do projeto");
            projectnamefield.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_projectnamefieldFocusLost

    private void projectnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectnamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectnamefieldActionPerformed

    private void registerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbuttonActionPerformed

        try {
            String strProjectName = projectnamefield.getText();
            String strDescricao = textareaDescription.getText();
            //String strProjectOwner = jtextField.getText();
            
            //Verificacao dos campos preenchidos
            if (verifyFields()) {

                //  Chamada do objeto dao para checagem do nome do
                ProjetoDAO daocheck = new ProjetoDAO();

                // Verificar se o usuario ja existe no sistema
                if (daocheck.checarProjeto(strProjectName)) {
                    JOptionPane.showMessageDialog(null, "Esse nome de usuário já existe. Por favor, escolha outro nome", "Falha na criação do usuário", 2);
                } else {
                    // Continua com o cadastro do usuario
                    Projeto obj = new Projeto();
                    obj.setNomeProjeto(strProjectName);                           // Nome do projeto
                    obj.setDescProjeto(strDescricao);                               // Usuário proprietário

                    ProjetoDAO dao = new ProjetoDAO();
                    dao.cadastrarProjeto(obj);
                    JOptionPane.showMessageDialog(null, "O projeto foi criado com sucesso.");

                }

            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o projeto" + error);
        }

    }//GEN-LAST:event_registerbuttonActionPerformed

    private void closebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebuttonMouseClicked
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_closebuttonMouseClicked
    
    public boolean verifyFields() {

        //Declaracao das Variaveis
        String strProjectName = projectnamefield.getText();
        String strDescricao = textareaDescription.getText();
        

        //Checando se todos os campos obrigatorios foram preenchidos
        if (strProjectName.trim().equals("") || strDescricao.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Um ou mais campos estão vazios", "Campos vazios", 2);
            return false;
        } //Checando se ambas as senhas são iguais
        /*
        else if (!strPwd1.equals(strPwd2)) {
            JOptionPane.showMessageDialog(null, "As senhas não coincidem", "Confirmar senha", 2);
            return false;
        }
        */
        
        //Caso todas as verificacoes esteja corretas 
        else {
            return true;
        }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closebutton;
    private javax.swing.JLabel descriptionTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JSeparator nameseparator;
    private javax.swing.JLabel newprojectTitle;
    private javax.swing.JLabel orangebox;
    private javax.swing.JLabel projectNameTitle;
    private javax.swing.JTextField projectnamefield;
    private javax.swing.JButton registerbutton;
    private javax.swing.JTextArea textareaDescription;
    private javax.swing.JLabel whitebg;
    // End of variables declaration//GEN-END:variables
}