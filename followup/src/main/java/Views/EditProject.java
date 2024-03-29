/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import DAO.ProjetoDAO;
import Javabeans.Projeto;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Luiz
 */
public class EditProject extends javax.swing.JFrame {

    /**
     * Creates new form EditProject
     */
    public EditProject() {
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

        editTitle = new javax.swing.JLabel();
        searchtitle = new javax.swing.JLabel();
        searchfield = new javax.swing.JTextField();
        search_separator = new javax.swing.JSeparator();
        searchbutton = new javax.swing.JButton();
        projectnameField = new javax.swing.JTextField();
        projectname_separator = new javax.swing.JSeparator();
        descriptionTitle = new javax.swing.JLabel();
        textareaDescription = new javax.swing.JTextArea();
        edituserbutton = new javax.swing.JButton();
        closebutton = new javax.swing.JLabel();
        orangebox = new javax.swing.JLabel();
        whitebg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgprojects/editproject_text.png"))); // NOI18N
        getContentPane().add(editTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 110, 50));

        searchtitle.setText("Insira o ID do projeto:");
        getContentPane().add(searchtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 230, 20));

        searchfield.setForeground(new java.awt.Color(153, 153, 153));
        searchfield.setText("Pesquisar usuário por ID");
        searchfield.setToolTipText("");
        searchfield.setBorder(null);
        searchfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchfieldFocusGained(evt);
            }
        });
        getContentPane().add(searchfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 260, 30));
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

        projectnameField.setToolTipText("");
        projectnameField.setBorder(null);
        projectnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectnameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(projectnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 370, 30));
        getContentPane().add(projectname_separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 370, 10));

        descriptionTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgprojects/title_description.png"))); // NOI18N
        getContentPane().add(descriptionTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 60, 20));

        textareaDescription.setColumns(20);
        textareaDescription.setRows(5);
        getContentPane().add(textareaDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 380, 160));

        edituserbutton.setBackground(new java.awt.Color(60, 86, 240));
        edituserbutton.setForeground(new java.awt.Color(240, 240, 240));
        edituserbutton.setText("Editar");
        edituserbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edituserbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(edituserbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 130, 30));

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
        getContentPane().add(whitebg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 410, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchfieldFocusGained
        // TODO add your handling code here:
        if (searchfield.getText().trim().equals("Pesquisar usuário por ID")) {
            searchfield.setText("");
            searchfield.setForeground(Color.black);
        }
    }//GEN-LAST:event_searchfieldFocusGained

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed

        //obter dados do usuário
        try {
            int intProjectId = Integer.parseInt(searchfield.getText());
            //String strProjectName = projectnameField.getText();
            
               
            // Executando o select
            ProjetoDAO dao = new ProjetoDAO();
            List<Projeto> listUsers = dao.consultarProjeto(intProjectId);

            for (Projeto p : listUsers) {
                projectnameField.setText(p.getNomeProjeto());
                textareaDescription.setText(p.getDescProjeto());
                
            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Erro ao encontrar sua conta: " + error);
        }

    }//GEN-LAST:event_searchbuttonActionPerformed

    private void projectnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectnameFieldActionPerformed

    private void edituserbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edituserbuttonActionPerformed
        // TODO add your handling code here:
        try {
            int intProjetoId = Integer.parseInt(searchfield.getText());
            String strProjectName =  projectnameField.getText();
            String strDescription = textareaDescription.getText();
            
            Projeto obj = new Projeto();

            obj.setIdProjeto(intProjetoId);                               // Id projeto
            obj.setNomeProjeto(strProjectName);                           // Nome do projeto
            obj.setDescProjeto(strDescription);
            
            // Executando o delete
            ProjetoDAO daoAlterar = new ProjetoDAO();

            daoAlterar.alterarProjeto(obj);
            JOptionPane.showMessageDialog(null, "O projeto foi alterado com sucesso.");
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar informações do projeto: " + error);
        }

    }//GEN-LAST:event_edituserbuttonActionPerformed

    private void closebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebuttonMouseClicked
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_closebuttonMouseClicked

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
            java.util.logging.Logger.getLogger(EditProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closebutton;
    private javax.swing.JLabel descriptionTitle;
    private javax.swing.JLabel editTitle;
    private javax.swing.JButton edituserbutton;
    private javax.swing.JLabel orangebox;
    private javax.swing.JTextField projectnameField;
    private javax.swing.JSeparator projectname_separator;
    private javax.swing.JSeparator search_separator;
    private javax.swing.JButton searchbutton;
    private javax.swing.JTextField searchfield;
    private javax.swing.JLabel searchtitle;
    private javax.swing.JTextArea textareaDescription;
    private javax.swing.JLabel whitebg;
    // End of variables declaration//GEN-END:variables
}
