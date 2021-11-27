package Views;

//import Classes.ConnectionFactory;
//import static Classes.ConnectionFactory.getConnection;
//import Classes.User;
//import Classes.UsuarioDAO;
import DAO.UserDAO;
import static JDBC.ConnectorFactory.conecta;
import Javabeans.User;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Jose Luiz
 */
public class UsersPanel extends javax.swing.JFrame {

    //ConnectionFactory conex = new ConnectionFactory();
    
    // metodo de listagem
    public void Listar() {
        try {
            // Executando o select
            UserDAO dao = new UserDAO();
            List<User> listUsers = dao.listarUsuarios();

            // Inserindo os dados na tabela 
            DefaultTableModel model = (DefaultTableModel) jTableUsers.getModel();
            //zera todas as linhas para limpeza da tabela
            model.setNumRows(0);

            for (User u : listUsers) {
                model.addRow(new Object[]{
                    u.getIdUser(),
                    u.getNameUser(),
                    u.getNameComplete(),
                    u.getEmail(),
                    u.getPhone()
                });
            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar sua conta: " + error);
        }
    }

    public UsersPanel() {
        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) jTableUsers.getModel();
        jTableUsers.setRowSorter(new TableRowSorter(modelo));

        this.setLocationRelativeTo(null);
       
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTableUsers = new javax.swing.JTable();
        pfpArea = new javax.swing.JLabel();
        usernameArea = new javax.swing.JLabel();
        counter = new javax.swing.JLabel();
        counter_box = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        userLink = new javax.swing.JLabel();
        projectLink = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        guidetitle = new javax.swing.JLabel();
        guideProperties = new javax.swing.JLabel();
        adduser_button = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        bluebg = new javax.swing.JLabel();
        whitebg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome completo", "Nome de usuario", "Email", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUsers.setRowHeight(50);
        jTableUsers.getTableHeader().setReorderingAllowed(false);
        getContentPane().add(jTableUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 215, -1, -1));
        if (jTableUsers.getColumnModel().getColumnCount() > 0) {
            jTableUsers.getColumnModel().getColumn(0).setResizable(false);
            jTableUsers.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTableUsers.getColumnModel().getColumn(1).setResizable(false);
            jTableUsers.getColumnModel().getColumn(1).setPreferredWidth(350);
            jTableUsers.getColumnModel().getColumn(2).setResizable(false);
            jTableUsers.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTableUsers.getColumnModel().getColumn(3).setResizable(false);
            jTableUsers.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTableUsers.getColumnModel().getColumn(4).setResizable(false);
            jTableUsers.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        pfpArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pfpArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgusers/pfp.png"))); // NOI18N
        getContentPane().add(pfpArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 250, 110));

        usernameArea.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        usernameArea.setForeground(new java.awt.Color(255, 255, 255));
        usernameArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameArea.setToolTipText("");
        getContentPane().add(usernameArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 250, 30));

        counter.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        counter.setForeground(new java.awt.Color(255, 255, 255));
        counter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        counter.setToolTipText("");
        getContentPane().add(counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 60, 10, 30));

        counter_box.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        counter_box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgusers/box_counter.png"))); // NOI18N
        getContentPane().add(counter_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 40, 30));

        updateButton.setBackground(new java.awt.Color(60, 86, 240));
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Atualizar");
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 740, 150, 30));

        removeButton.setBackground(new java.awt.Color(60, 86, 240));
        removeButton.setForeground(new java.awt.Color(255, 255, 255));
        removeButton.setText("Remover usuário");
        removeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 740, 150, 30));

        editButton.setBackground(new java.awt.Color(60, 86, 240));
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Editar usuário");
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 740, 150, 30));

        userLink.setBackground(new java.awt.Color(60, 86, 240));
        userLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgusers/users.png"))); // NOI18N
        userLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userLink.setOpaque(true);
        userLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userLinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userLinkMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                userLinkMouseReleased(evt);
            }
        });
        getContentPane().add(userLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 230, 370, 70));

        projectLink.setBackground(new java.awt.Color(60, 86, 240));
        projectLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        projectLink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgusers/projects.png"))); // NOI18N
        projectLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        projectLink.setOpaque(true);
        projectLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projectLinkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                projectLinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                projectLinkMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                projectLinkMouseReleased(evt);
            }
        });
        getContentPane().add(projectLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 300, 370, 70));

        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgusers/title.png"))); // NOI18N
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 180, 40));

        guidetitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgusers/guide_title.png"))); // NOI18N
        getContentPane().add(guidetitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 210, 30));

        guideProperties.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgusers/guide_properties.png"))); // NOI18N
        getContentPane().add(guideProperties, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 165, 980, 50));

        adduser_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adduser_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgusers/newuser_button.png"))); // NOI18N
        adduser_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adduser_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adduser_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(adduser_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 700, 80, 80));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgmenu/logo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 250, 130));

        bluebg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgmenu/blue_box.png"))); // NOI18N
        getContentPane().add(bluebg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 790));

        whitebg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgmenu/white_bg.png"))); // NOI18N
        getContentPane().add(whitebg, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1030, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adduser_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adduser_buttonMouseClicked
        AddUser ad = new AddUser();
        ad.setVisible(true);
        ad.pack();
        ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }//GEN-LAST:event_adduser_buttonMouseClicked

    
    // Evento do botao atualizar dados
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // Listando dados da tabela
        Listar();
        String contador = Integer.toString(jTableUsers.getModel().getRowCount());
        counter.setText(contador);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void userLinkMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userLinkMouseReleased
        // TODO add your handling code here:
        Color c1 = userLink.getBackground();
        Color c2 = new Color(57, 76, 190);

        if (c1.getRGB() == c2.getRGB()) {
            userLink.setBackground(new Color(33, 51, 163));
            projectLink.setBackground(new Color(60, 86, 240));
        } else {
            userLink.setBackground(new Color(60, 86, 240));
            projectLink.setBackground(new Color(60, 86, 240));
        }

        //userLink.setBackground(new Color(33, 51, 163));
        //projectLink.setBackground(new Color(60, 86, 240));
    }//GEN-LAST:event_userLinkMouseReleased

    private void projectLinkMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectLinkMouseReleased
        // TODO add your handling code here:
        Color c1 = projectLink.getBackground();
        Color c2 = new Color(57, 76, 190);

        if (c1.getRGB() == c2.getRGB()) {
            projectLink.setBackground(new Color(33, 51, 163));
            userLink.setBackground(new Color(60, 86, 240));
        } else {
            projectLink.setBackground(new Color(60, 86, 240));
            userLink.setBackground(new Color(60, 86, 240));
        }

    }//GEN-LAST:event_projectLinkMouseReleased

    private void userLinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userLinkMouseEntered
        // TODO add your handling code here:
        Color c1 = userLink.getBackground();
        Color c2 = new Color(33, 51, 163);

        if (c1.getRGB() == c2.getRGB()) {
            userLink.setBackground(new Color(33, 51, 163));
        } else {
            userLink.setBackground(new Color(57, 76, 190));
        }

    }//GEN-LAST:event_userLinkMouseEntered

    private void userLinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userLinkMouseExited
        // TODO add your handling code here:
        Color c1 = userLink.getBackground();
        Color c2 = new Color(33, 51, 163);

        if (c1.getRGB() == c2.getRGB()) {
            userLink.setBackground(new Color(33, 51, 163));
        } else {
            userLink.setBackground(new Color(60, 86, 240));
        }

    }//GEN-LAST:event_userLinkMouseExited

    private void projectLinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectLinkMouseEntered
        // TODO add your handling code here:
        Color c1 = projectLink.getBackground();
        Color c2 = new Color(33, 51, 163);

        if (c1.getRGB() == c2.getRGB()) {
            projectLink.setBackground(new Color(33, 51, 163));
        } else {
            projectLink.setBackground(new Color(57, 76, 190));
        }
    }//GEN-LAST:event_projectLinkMouseEntered

    private void projectLinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectLinkMouseExited
        // TODO add your handling code here:
        Color c1 = projectLink.getBackground();
        Color c2 = new Color(33, 51, 163);

        if (c1.getRGB() == c2.getRGB()) {
            projectLink.setBackground(new Color(33, 51, 163));
        } else {
            projectLink.setBackground(new Color(60, 86, 240));
        }

    }//GEN-LAST:event_projectLinkMouseExited

    // Evento para aparecer dados no momento em que a tela aparecer
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Listando dados da tabela
        Listar();
        String contador = Integer.toString(jTableUsers.getModel().getRowCount());
        counter.setText(contador);
    }//GEN-LAST:event_formWindowOpened

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        DeleteUser ud = new DeleteUser();
        ud.setVisible(true);
        ud.pack();
        ud.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_removeButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        EditUser ed = new EditUser();
        ed.setVisible(true);
        ed.pack();
        ed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_editButtonActionPerformed

    private void projectLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectLinkMouseClicked
        // TODO add your handling code here:
        ProjectsPanel pp = new ProjectsPanel();
        pp.setVisible(true);
        pp.pack();
        pp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.dispose();
    }//GEN-LAST:event_projectLinkMouseClicked
    
    
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
            java.util.logging.Logger.getLogger(UsersPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsersPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsersPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsersPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsersPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adduser_button;
    private javax.swing.JLabel bluebg;
    private javax.swing.JLabel counter;
    private javax.swing.JLabel counter_box;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel guideProperties;
    private javax.swing.JLabel guidetitle;
    private javax.swing.JTable jTableUsers;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel pfpArea;
    private javax.swing.JLabel projectLink;
    private javax.swing.JButton removeButton;
    private javax.swing.JLabel title;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel userLink;
    private javax.swing.JLabel usernameArea;
    private javax.swing.JLabel whitebg;
    // End of variables declaration//GEN-END:variables
}
