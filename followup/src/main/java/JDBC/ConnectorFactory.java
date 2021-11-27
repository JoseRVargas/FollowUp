/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author luizr
 */
public class ConnectorFactory {
    public static Connection conecta(){
        try{
            
            return DriverManager.getConnection("jdbc:mysql://localhost/db_followup?useTimezone=true&serverTimezone=UTC", "root", "244ad@je1A");
            
        } catch(SQLException error){
            
            throw new RuntimeException(error);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
 
}
