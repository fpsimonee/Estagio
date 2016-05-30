/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author Administrador
 */
public class Operacao {
   private int id_operacao; 
   private String tipo_operacao;
   private int id_mercadoria;

    public int getId_operacao() {
        return id_operacao;
    }

    public void setId_operacao(int id_operacao) {
        this.id_operacao = id_operacao;
    }

    public String getTipo_operacao() {
        return tipo_operacao;
    }

    public void setTipo_operacao(String tipo_operacao) {
        this.tipo_operacao = tipo_operacao;
    }

    public int getId_mercadoria() {
        return id_mercadoria;
    }

    public void setId_mercadoria(int id_mercadoria) {
        this.id_mercadoria = id_mercadoria;
    }
   
   
}
