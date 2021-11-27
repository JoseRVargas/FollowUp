/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

//import Classes.ConnectionFactory;
import JDBC.ConnectorFactory;
import Javabeans.Projeto;
import Javabeans.Requisito;
import Javabeans.User;
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
public class RequisitoDAO {

    private Connection conecta;

    //Contrutor
    public RequisitoDAO() {
        this.conecta = new ConnectorFactory().conecta();
    }

    //Metodo Checar Usuario
    public boolean checarRequisito(String strName, int intProject) {
        try {
            //Comando SQL
            String cmdSql = "SELECT name_requirement, module, functionality, date_create, author, date_last_change, author_last_change, version, priority, complexity, hours_estimated, name_state,phase, description FROM REQUISITOS INNER JOIN ESTADOS ON Estados_idEstados = idEstados WHERE Projeto_idProjeto = ? AND name_requirement = ?";

            //Organizar o cmdsql e executar ele
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            stmt.setInt(1, intProject);
            stmt.setString(2, strName);

            //Guarda o Resultado da consulta no objeto RS(resultset)
            ResultSet rs = stmt.executeQuery();

            return rs.next();

        } catch (SQLException error) {
            throw new RuntimeException(error);
        }
    }

    //Metodo Adicionar Requisito
    public void cadastrarRequisito(Requisito obj, int intProject) {
        try {
            //Comando SQL
            String cmdSql = "NSERT INTO REQUISITOS(name_requirement, module, functionality, date_create, author, date_last_change, author_last_change, version, priority, complexity, hours_estimated, phase, description, Estados_idEstados, Projeto_idProjeto) VALUES(?,?,?, CURDATE(),?, CURDATE(), ?, ?, ?, ?, ?, ?, ?, ?, ?);";

            //Organizar o cmdsql e executar ele
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            stmt.setString(1, obj.getNomeReq());
            stmt.setString(2, obj.getModReq());
            stmt.setString(3, obj.getFuncReq());
            stmt.setString(4, obj.getAutorReq());
            stmt.setInt(5, obj.getVersaoReq());
            stmt.setString(6, obj.getPrioridadeReq());
            stmt.setString(7, obj.getCompReq());
            stmt.setInt(5, obj.getHoraReq());
            stmt.setString(8, obj.getFaseReq());
            stmt.setString(9, obj.getDescricao());
            stmt.setString(10, obj.getFaseReq());
            stmt.setInt(11, obj.getEstadoReq());
            stmt.setInt(12, intProject);
            //Executa o comando
            stmt.execute();

            //Fechar a conexao
            stmt.close();
        } catch (SQLException error) {
            throw new RuntimeException(error);
        }
    }

    //Metodo Excluir Usuario
    public void excluirRequisito(Requisito obj, int intProject) {
        try {
            //Comando SQL
            String cmdSql = "DELETE FROM REQUISITOS WHERE name_requirement = ? AND Projeto_idProjeto = ?";

            //Organizar o cmdsql e executar ele
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);

            stmt.setString(1, obj.getNomeReq());
            stmt.setInt(2, intProject);

            //Executa o comando
            stmt.execute();

            //Fechar a conexao
            stmt.close();

        } catch (SQLException error) {
            throw new RuntimeException(error);
        }
    }

    //Metodo Alterar Usuario
    public void alterarRequisito(Requisito obj, int intProject) {
        try {
            //Comando SQL
            String cmdSql = "UPDATE REQUISITOS SET IdentReq = ? name_requirement = ?, module = ?, functionality = ?, data_last_change = CURDATE(),"
                    + "author_last_change = ?, version = ?, priority = ?, complexity, hours_estimated = ?, phase = ?, description = ?,"
                    + "Estados_idEstados = ? WHERE name_requirement = ? AND Projeto_idProjeto = ?";

            //Organizar o cmdsql e executar ele
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);

            stmt.setString(1, obj.getIdReq());
            stmt.setString(2, obj.getNomeReq());
            stmt.setString(3, obj.getModReq());
            stmt.setString(4, obj.getFuncReq());
            stmt.setString(5, obj.getAutorReq());
            stmt.setInt(6, obj.getVersaoReq());
            stmt.setString(7, obj.getPrioridadeReq());
            stmt.setString(8, obj.getCompReq());
            stmt.setInt(9, obj.getHoraReq());
            stmt.setString(10, obj.getFaseReq());
            stmt.setString(11, obj.getDescricao());
            stmt.setInt(12, obj.getEstadoReq());
            stmt.setInt(13, obj.getEstadoReq());
            stmt.setString(14, obj.getNomeReq());
            stmt.setInt(15, intProject);

            //Executa o comando
            stmt.execute();

            //Fechar a conexao
            stmt.close();

        } catch (SQLException error) {
            throw new RuntimeException(error);
        }
    }
    //Metodo Checar Usuario

    public List<Requisito> consultarRequisito(int intIdentReq, int intProject) {
        try {
            // Criando vetor que ira armazena os registros do banco
            List<Requisito> lista = new ArrayList<Requisito>();

            //Comando SQL
            String cmdSql = "SELECT IdentReq , name_requirement, functionality, author, description FROM REQUISITOS INNER JOIN ESTADOS ON Estados_idEstados = idEstados WHERE idRequisitos = ? AND Projeto_idProjeto = ?";

            //Organizar o cmdsql e executar ele
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            stmt.setInt(1, intIdentReq);
            stmt.setInt(1, intProject);

            //Guarda o Resultado da consulta no objeto RS(resultset)
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                //resgata cada registros e o armazena no objeto u
                Requisito u = new Requisito();
                //u.setIdUser(rs.getInt("idUser"));
                u.setIdReq(rs.getString("IdentReq"));
                u.setNomeReq(rs.getString("name_requirement"));
                u.setFuncReq(rs.getString("functionality"));
                u.setAutorReq(rs.getString("author"));
                u.setDescricao(rs.getString("description"));

                //adicionar a linha na lista 
                lista.add(u);
            }
            return lista;

        } catch (SQLException error) {
            throw new RuntimeException(error);
        }
    }
}
