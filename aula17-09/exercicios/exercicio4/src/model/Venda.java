/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Venda {
    private int codigo;
    private String nomePrefeitura;
    private String cidade;
    
    Conexao con = new Conexao();

    public Venda() {
        this(0, "", "");
    }

    public Venda(int codigo, String nomePrefeitura, String cidade) {
        this.codigo = codigo;
        this.nomePrefeitura = nomePrefeitura;
        this.cidade = cidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomePrefeitura() {
        return nomePrefeitura;
    }

    public void setNomePrefeitura(String nomePrefeitura) {
        this.nomePrefeitura = nomePrefeitura;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void gravar(){
        String sql;
        sql = "Insert into consultaPrefeitura(codigo, nomePrefeitura, cidade) values" + "(" + getCodigo() + ", '" + getNomePrefeitura() + "', '" + getCidade() + "')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro salvo!");
    }
    public ResultSet listarPrefeituras(){
        ResultSet tabela;
        tabela = null;
        String sql = "Select * from consultaPrefeitura;";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
}
