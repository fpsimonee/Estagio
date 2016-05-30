/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Objects.Operacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class OperacaoDAO implements InterDAO {
      private Connection con;
    
    public OperacaoDAO() throws SQLException, ClassNotFoundException {
        con = new DataSource().getCon();
    }

    @Override
    public void inserir(Object obj) throws SQLException {
        Operacao opr = (Operacao) obj;
        String sql = " INSERT INTO operacao (id_opercao," +
"					     tipo_operacao," +
"					     id_mercadoria,)" +					   
"				VALUES  (?," +
"			                 ?," +
"                                        ?," +
"                                        );";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setInt(1, opr.getId_operacao());
        stm.setString(2, opr.getTipo_operacao());
        stm.setInt(3, opr.getId_mercadoria());
        stm.executeUpdate();
    }

    @Override
    public List consultar(int chave) throws SQLException {        
        String sql = "SELECT * FROM operacao WHERE id_mercadoria=?";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setInt(1, chave);        
        ResultSet rs = stm.executeQuery();
        ArrayList<Operacao> vet = new ArrayList<Operacao>();
        while(rs.next()) {
            Operacao novo = new Operacao();
            novo.setId_operacao(rs.getInt(1));
            novo.setTipo_operacao(rs.getString(2));
            novo.setId_mercadoria(rs.getInt(3));           
            vet.add(novo);
        }
        return vet;
    }

    @Override
    public void atualizar(int chave, Object obj) throws SQLException {
        
    }

    @Override
    public void remover(int chave) throws SQLException {
        
    }
}
