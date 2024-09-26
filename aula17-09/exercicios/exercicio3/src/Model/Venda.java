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
public class Venda {
    private int codigo;
    private String nomeVendedor;
    private String nomeProduto;
    
    Conexao con = new Conexao();

    public Venda() {
        this(0, "", "");
    }

    public Venda(int codigo, String nomeVendedor, String nomeProduto) {
        this.codigo = codigo;
        this.nomeVendedor = nomeVendedor;
        this.nomeProduto = nomeProduto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public void cadastrarVenda(){
        String sql;
        sql = "Insert into consultaVendas(codigo, nomeVendedor, nomeProduto) values" + "(" + getCodigo() + ", '" + getNomeVendedor() + "' , '" + getNomeProduto() + "')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Registro salvo!");
    }
    public ResultSet listarVenda(){
        ResultSet tabela;
        tabela = null;
        String sql = "Select * from consultaVendas;";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    
}
