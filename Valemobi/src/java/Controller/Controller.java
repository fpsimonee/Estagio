/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.OperacaoDAO;
import Objects.Operacao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Administrador
 */
public class Controller {
  @RequestMapping("novaOperacao")
  public String form() {
    return "Operacao/formulario";
  }
  @RequestMapping("adicionaTarefa")
public String adiciona(Operacao oper){
   OperacaoDAO dao;      
      try {
          dao = new OperacaoDAO();
          dao.inserir(oper);
      } catch (SQLException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
      }
  return "Operacao/adicionada";
}
  
}
