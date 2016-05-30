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
public class Mercadoria {
    private int id_mercadoria;
    private String tipo_mercadoria;
    private String nome_mercadoria;
    private int qtd;
    private double preco; 
    private String tipo_negocio;

    public int getId_mercadoria() {
        return id_mercadoria;
    }

    public void setId_mercadoria(int id_mercadoria) {
        this.id_mercadoria = id_mercadoria;
    }

    public String getTipo_mercadoria() {
        return tipo_mercadoria;
    }

    public void setTipo_mercadoria(String tipo_mercadoria) {
        this.tipo_mercadoria = tipo_mercadoria;
    }

    public String getNome_mercadoria() {
        return nome_mercadoria;
    }

    public void setNome_mercadoria(String nome_mercadoria) {
        this.nome_mercadoria = nome_mercadoria;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo_negocio() {
        return tipo_negocio;
    }

    public void setTipo_negocio(String tipo_negocio) {
        this.tipo_negocio = tipo_negocio;
    }
    
    
    
}
