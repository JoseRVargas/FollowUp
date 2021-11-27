
package DAO;

//import Classes.ConnectionFactory;
import JDBC.ConnectorFactory;
import Javabeans.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luizr
 */
public class UserDAO {

    private Connection conecta;

    //Contrutor
    public UserDAO() {
        this.conecta = new ConnectorFactory().conecta();
    }

    //Metodo Checar Usuario
    public boolean checarUsuario(String strUserName) {
        try {
            //Comando SQL
            String cmdSql = "SELECT name_user, name_complete, email, fone FROM USUARIOS WHERE name_user = ?";
            
            //Organizar o cmdsql e executar ele
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            stmt.setString(1, strUserName);
            
            //Guarda o Resultado da consulta no objeto RS(resultset)
            ResultSet rs = stmt.executeQuery();
            
            return rs.next();
            
        } catch (SQLException error) {
            throw new RuntimeException(error);
        }
    }

    //Metodo Adicionar Usuario
    public void cadastrarUsuario(User obj) {
        try {
            //Comando SQL
            String cmdSql = "INSERT INTO `usuarios`(`name_complete`, `name_user`, `email`, `fone`, `password`) VALUES(?,?, ?, ?, ?)";

            //Organizar o cmdsql e executar ele
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            stmt.setString(1, obj.getNameComplete());
            stmt.setString(2, obj.getNameUser());
            stmt.setString(3, obj.getEmail());
            stmt.setString(4, obj.getPhone());
            stmt.setString(5, obj.getPassword());

            //Executa o comando
            stmt.execute();

            //Fechar a conexao
            stmt.close();
        } catch (SQLException error) {
            throw new RuntimeException(error);
        }
    }
    
    //Metodo Listar todos os Usuarios
    public List<User>listarUsuarios(){
        try {
            // Criando vetor que ira armazena os registros do banco
            List<User> lista = new ArrayList<User>();
            
            // Comando SQL
            String cmdSql = "SELECT * FROM `usuarios`";
            
            //Organizar o cmdsql e executar ele
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            
            //Guarda o Resultado da consulta no objeto RS(resultset)
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                //resgata cada registros e o armazena no objeto u
                User u = new User();
                u.setIdUser(rs.getInt("idUser"));
                u.setNameUser(rs.getString("name_user"));
                u.setNameComplete(rs.getString("name_complete"));
                u.setEmail(rs.getString("email"));
                u.setPhone(rs.getString("fone"));
                
                //adicionar a linha na lista 
                lista.add(u);
            }
            return lista;
        } catch (SQLException error) {
            throw new RuntimeException(error);
        }
    
    }
    
    //Metodo Checar Usuario
    public List<User> consultarUsuario(int intUserId) {
        try {
            // Criando vetor que ira armazena os registros do banco
            List<User> lista = new ArrayList<User>();
            
            //Comando SQL
            String cmdSql = "SELECT name_complete, name_user, email, fone FROM USUARIOS WHERE idUser = ?";
            
            //Organizar o cmdsql e executar ele
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            stmt.setInt(1, intUserId);
            
            //Guarda o Resultado da consulta no objeto RS(resultset)
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){    
                //resgata cada registros e o armazena no objeto u
                User u = new User();
                //u.setIdUser(rs.getInt("idUser"));
                u.setNameComplete(rs.getString("name_complete"));
                u.setNameUser(rs.getString("name_user"));
                u.setEmail(rs.getString("email"));
                u.setPhone(rs.getString("fone"));
                
                //adicionar a linha na lista 
                lista.add(u);
            }
            return lista;
            
        } catch (SQLException error) {
            throw new RuntimeException(error);
        }
    }

    //Metodo Excluir Usuario
    public void excluirUsuario(User obj){
        try {
            //Comando SQL
            String cmdSql = "DELETE FROM USUARIOS WHERE idUser = ?";
            
            //Organizar o cmdsql e executar ele
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            
            stmt.setInt(1, obj.getIdUser());
            
            //Executa o comando
            stmt.execute();
            
            //Fechar a conexao
            stmt.close();
            
        } catch (SQLException error) {
            throw new RuntimeException(error);
        }
    }
   
    //Metodo Alterar Usuario
    public void alterarUsuario(User obj){
        try {
            //Comando SQL
            String cmdSql = "UPDATE USUARIOS SET name_complete = ?, name_user = ?, email = ?, fone = ? WHERE idUser = ?";
            
            //Organizar o cmdsql e executar ele
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            
            stmt.setString(1, obj.getNameComplete());
            stmt.setString(2, obj.getNameUser());
            stmt.setString(3, obj.getEmail());
            stmt.setString(4, obj.getPhone());
            stmt.setInt(5, obj.getIdUser());
            
            //Executa o comando
            stmt.execute();
            
            //Fechar a conexao
            stmt.close();
            
        } catch (SQLException error) {
            throw new RuntimeException(error);
        }
    }
    
}
