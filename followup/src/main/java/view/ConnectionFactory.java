/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose Luiz
 */
public class ConnectionFactory {
    
    private static String servername = "localhost";
    private static String dbname = "usuarios";
    private static String usuario = "root";
    private static Integer porta = 3306;
    private static String senha = "";
    
    public static Connection getConnection(){
        Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(usuario);
        datasource.setPassword(senha);
        datasource.setDatabaseName(dbname);
        datasource.setPort(porta);
        
        try {
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(" Get connection -> " + ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cnx;
    }
    
}
