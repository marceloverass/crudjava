/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import br.com.entidade.Adocao;
import java.sql.SQLException;

/**
 *
 * @author profe
 */
public class TesteCon extends DAO{
    public static void main(String[] args) throws SQLException {
       DAO cx = new DAO();
       //cx.abrirBanco();
       CadastroDAO ca = new CadastroDAO();
       Adocao al = new Adocao();
       
       ca.inserir(al);
    }
}
