package DAO;

import DAO.DataSource;
import Objects.Mercadoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class mercadoriaDAO implements InterDAO {
    private Connection con;
    
    public mercadoriaDAO() throws SQLException, ClassNotFoundException {
        con = new DataSource().getCon();
    }

    @Override
    public void inserir(Object obj) throws SQLException {
        Mercadoria merc = (Mercadoria) obj;
        String sql = " INSERT INTO mercadoria (id_mercadoria," +
"					       tipo_mercadoria," +
"					       nome_mercadoria," +
"					       qtd," +
"					       preco," +
"					       tipo_negocio)" +
"				VALUES  (?," +
"			                 ?," +
"                                        ?," +
"                                        ?," +
"                                        ?," +
"                                        ?," +
"                                        );";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setInt(1, merc.getId_mercadoria());
        stm.setString(2, merc.getTipo_mercadoria());
        stm.setString(3, merc.getNome_mercadoria());
        stm.setInt(4, merc.getQtd());
        stm.setDouble(5, merc.getPreco());
        stm.setString(6, merc.getTipo_negocio());
        stm.executeUpdate();
    }

    @Override
    public List consultar(int chave) throws SQLException {        
        String sql = "SELECT * FROM mercadoria WHERE id_mercadoria=?";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setInt(1, chave);        
        ResultSet rs = stm.executeQuery();
        ArrayList<Mercadoria> vet = new ArrayList<Mercadoria>();
        while(rs.next()) {
            Mercadoria novo = new Mercadoria();
            novo.setId_mercadoria(rs.getInt(1));
            novo.setTipo_mercadoria(rs.getString(2));
            novo.setNome_mercadoria(rs.getString(3));
            novo.setQtd(rs.getInt(4));
            novo.setPreco(rs.getDouble(5));
            novo.setTipo_negocio(rs.getString(6));
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
