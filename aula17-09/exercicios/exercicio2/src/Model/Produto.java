/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Produto {
    private int codigo;
    private String nomeProduto;
    private String descricao;
    
    Conexao con = new Conexao();

    public Produto() {
        this(0, "", "");
    }

    public Produto(int codigo, String nomeProduto, String descricao) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    } 
    
    public void cadastrarVenda(){
        String sql;
        sql = "Insert into consultaProduto(codigo, nomeProduto, descricao) values" +  "(" + getCodigo() + ", '" + getNomeProduto() + "', '" + getDescricao() + "')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro salvo!");
    }
    public ResultSet listarVenda(){
        ResultSet tabela;
        tabela = null;
        String sql = "select * from consultaProduto;";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
}
