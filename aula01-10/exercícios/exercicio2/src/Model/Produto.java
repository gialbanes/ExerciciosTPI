/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author giova
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
    public void cadastrarProduto(){
        String sql;
        sql = "Insert into produtos(codigo, nomeProduto, descricao) values " + "(" + getCodigo() + ", '" + getNomeProduto() + "', '" + getDescricao() + "')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro salvo!");
    }
    public ResultSet consultar(){
        ResultSet tabela;
        tabela = null;
        String sql = "Select * from produtos;";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    public void alterar(){
        String sql;
        sql = "Update produtos set nomeProduto = '" + getNomeProduto() + "', descricao = '" + getDescricao() + "' where codigo = " + getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado!");
    }
    public void excluir(){
        String sql;
        sql = "Delete from produtos where codigo = " + getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluído!");
    }
}