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
public class Empresa {
    private int cnpj;
    private String nomeEmpresa;
    private String endereco;
    
    Conexao con = new Conexao();

    public Empresa() {
        this(0, "", "");
    }

    public Empresa(int cnpj, String nomeEmpresa, String endereco) {
        this.cnpj = cnpj;
        this.nomeEmpresa = nomeEmpresa;
        this.endereco = endereco;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void gravar(){
        String sql;
        sql = "Insert into consultaEmpresa(cnpj, nomeEmpresa, endereco) values ("  + getCnpj() + ", '" + getNomeEmpresa() + "', '" + getEndereco() + "')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro salvo!");      
    }
    public ResultSet listarEmpresas(){
        ResultSet tabela;
        tabela = null;
        String sql = "Select * from consultaEmpresa;";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    
}
