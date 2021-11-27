/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_exemplocrud;

import DAO.UserDAO;
import JDBC.ConnectorFactory;
import Javabeans.User;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author luizr
 */
public class Projeto_exemploCRUD {

    public static void main(String[] args) {
        /*try {
            //Testando a conexao
            JOptionPane.showMessageDialog(null, "Testando a conexao");

            Connection con = new ConnectorFactory().conecta();

            JOptionPane.showMessageDialog(null, "Está conectado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        */
        User obj = new User();
        
        String strFullName = "Roberto Luiz";
        String strUserName = "roberto.vargas";
        String strEmail = "roberto@hotmail.com";
        String strPwd1 = "123";
        String strPwd2 = "123";
        String strPhone = "123456";
        
        
        obj.setNameComplete(strFullName); // Nome Completo
        obj.setNameUser(strUserName);     // Nome do Usuario
        obj.setEmail(strEmail);       // Email
        obj.setPhone(strPhone);       // Telefone
        obj.setPassword(strPwd1);                                          // Password
        
        UserDAO dao = new UserDAO();
        dao.cadastrarUsuario(obj);
        JOptionPane.showMessageDialog(null, "Está cadastrado");
        

    }
}
