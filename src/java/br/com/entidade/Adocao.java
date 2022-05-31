/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.entidade;

import java.sql.Date;

public class Adocao {
    private int codigo;
    private String nome;
    private String idade;
    private String situacao;
    private Date data_entrada;
    private String data_adocao;
   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
    
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public Date getData_Entrada() {
        return data_entrada;
    }

    public void setData_Entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }
    
    public String getData_Adocao() {
        return data_adocao;
    }

    public void setData_Adocao(String data_adocao) {
        this.data_adocao = data_adocao;
    }

    
    
}
