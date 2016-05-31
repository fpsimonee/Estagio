/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TESTEBD;

import DAO.OperacaoDAO;
import Objects.Operacao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class TesteBD {
    public void main(String args[]) {
        try {
            OperacaoDAO dao;
            
            dao = new OperacaoDAO();
            Operacao oper = new Operacao();
            oper.setId_mercadoria(4555);
            oper.setId_operacao(4555);
            oper.setTipo_operacao("Compra");

            dao.inserir(oper);
        } catch (SQLException ex) {
            Logger.getLogger(TesteBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
