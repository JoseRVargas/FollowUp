/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import JDBC.ConnectorFactory;
import Javabeans.Projeto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose Luiz
 */
public class ProjetoDAO {

    private Connection conecta;

    //Construtor
    public ProjetoDAO() {
        this.conecta = new ConnectorFactory().conecta();
    }

    //Metodo Checar Projeto
    public boolean checarProjeto(String strProjectName) {
        try {
            //Comando SQL
            String cmdSql = "SELECT name_project, description, user_owner FROM PROJETO WHERE name_project = ?";
            
            //Organizar o cmdsql e executar ele
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            stmt.setString(1, strProjectName);
            
            //Guarda o Resultado da consulta no objeto RS(resultset)
            ResultSet rs = stmt.executeQuery();
            
            return rs.next();
            
        } catch (SQLException error) {
            throw new RuntimeException(error);
        }
    }

    //Metodo Adicionar Projeto
    public void cadastrarProjeto(Projeto obj) {
        try {
            //Comando SQL
            String cmdSql = "INSERT INTO `projeto`(`name_project`, `description`, `user_owner`) VALUES(?, ?, ?)";

            //Organizar o cmdsql e executar ele
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            stmt.setString(1, obj.getNomeProjeto());
            stmt.setString(2, obj.getDescProjeto());
            stmt.setString(3, obj.getProprietarioProjeto());

            //Executa o comando
            stmt.execute();

            //Fechar a conexao
            stmt.close();
        } catch (SQLException error) {
            throw new RuntimeException(error);
        }
    }
    
    //Metodo Listar todos os Usuarios
    public List<Projeto>listarProjetos(){
        try {
            // Criando vetor que ira armazena os registros do banco
            List<Projeto> lista = new ArrayList<Projeto>();
            
            // Comando SQL
            String cmdSql = "SELECT * FROM `projeto`";
            
            //Organizar o cmdsql e executar ele
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            
            //Guarda o Resultado da consulta no objeto RS(resultset)
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                //resgata cada registros e o armazena no objeto u
                Projeto p = new Projeto();
                p.setIdProjeto(rs.getInt("idProjeto"));
                p.setNomeProjeto(rs.getString("name_project"));
                p.setDescProjeto(rs.getString("description"));
                p.setProprietarioProjeto(rs.getString("user_owner"));

                
                //adicionar a linha na lista 
                lista.add(p);
            }
            return lista;
        } catch (SQLException error) {
            throw new RuntimeException(error);
        }
    
    }
    
    //Metodo Checar Usuario
    public List<Projeto> consultarProjeto(int intProjectId) {
        try {
            // Criando vetor que ira armazena os registros do banco
            List<Projeto> lista = new ArrayList<Projeto>();
            
            //Comando SQL
            String cmdSql = "SELECT name_project, description, user_owner FROM PROJETO WHERE idProjeto = ?";
            
            //Organizar o cmdsql e executar ele
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            stmt.setInt(1, intProjectId);
            
            //Guarda o Resultado da consulta no objeto RS(resultset)
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){    
                //resgata cada registros e o armazena no objeto p
                Projeto p = new Projeto();
                //p.setIdUser(rs.getInt("idProjeto"));
                p.setNomeProjeto(rs.getString("name_project"));
                p.setDescProjeto(rs.getString("description"));
                p.setProprietarioProjeto(rs.getString("user_owner"));
                
                //adicionar a linha na lista 
                lista.add(p);
            }
            return lista;
            
        } catch (SQLException error) {
            throw new RuntimeException(error);
        }
    }

    //Metodo Excluir Usuario
    public void excluirProjeto(Projeto obj){
        try {
            //Comando SQL
            String cmdSql = "DELETE FROM PROJETO WHERE idProjeto = ?";
            
            //Organizar o cmdsql e executar ele
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            
            stmt.setInt(1, obj.getIdProjeto());
            
            //Executa o comando
            stmt.execute();
            
            //Fechar a conexao
            stmt.close();
            
        } catch (SQLException error) {
            throw new RuntimeException(error);
        }
    }
   
    //Metodo Alterar Usuario
    public void alterarProjeto(Projeto obj){
        try {
            //Comando SQL
            String cmdSql = "UPDATE PROJETO SET name_project = ?, description = ?, user_owner = ? WHERE idProjeto = ?";
            
            //Organizar o cmdsql e executar ele
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            
            stmt.setString(1, obj.getNomeProjeto());
            stmt.setString(2, obj.getDescProjeto());
            stmt.setString(3, obj.getProprietarioProjeto());
            stmt.setInt(4, obj.getIdProjeto());
            
            //Executa o comando
            stmt.execute();
            
            //Fechar a conexao
            stmt.close();
            
        } catch (SQLException error) {
            throw new RuntimeException(error);
        }
    }
    
}
