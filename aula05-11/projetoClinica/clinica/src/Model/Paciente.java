/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Paciente {
    private int codigo;
    private String nome;
    private String login;
    private String senha;
    private String endereco;
    private String complemento;
    private String rg;
    private String cpf;
    private String nascimento;
    
    Conexao con = new Conexao();

    public Paciente() {
        this(0, "", "", "", "", "", "", "", "");
    }

    public Paciente(int codigo, String nome, String login, String senha, String endereco, String complemento, String rg, String cpf, String nascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.endereco = endereco;
        this.complemento = complemento;
        this.rg = rg;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public Conexao getCon() {
        return con;
    }

    public void setCon(Conexao con) {
        this.con = con;
    }
    
    public void cadastrarPaciente(){           
      String sql = "Insert into pacientes (codigo, nome, login, senha, endereco, complemento, rg, cpf, dt_nascimento) values " + "(" + this.getCodigo() + ", '" + this.getNome() + "','" + this.getLogin() + "','" + this.getSenha() + "','" + this.getEndereco() + "','" + this.getComplemento() + "','" + this.getRg() + "','" + this.getCpf() + "','" + this.getNascimento() + "' )";
       con.executeSQL(sql);
       JOptionPane.showMessageDialog(null, "Registro salvo!");     
    } 
     public ResultSet consultar(){
        ResultSet tabela;
        tabela = null;
        
        String sql= "Select * from pacientes";
        tabela = con.RetornarResultset(sql);
     return tabela;   
    }
    public void excluir(){
        String sql;
        sql= "Delete from pacientes where codigo = "+ getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluído!");
    }
    public void alterar(){
        String sql;
        sql="Update pacientes set nome = '" + getNome()+ "', endereco = '" +getEndereco()+ "' where codigo = "+ getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado!"); 
    } 
    //código classe usuário 
    //busca de campo especifico
    public ResultSet consultarCampoEspecifico(){
        ResultSet tabela;
        tabela = null;
        try{
          String sql="Select * from pacientes where nome like '"+ getNome()+"%'";
          tabela= con.RetornarResultset(sql);                  
           }
           catch(Exception sqle){
                JOptionPane.showMessageDialog(null,"Atenção..."+sqle.getMessage());
           }
        return tabela;    
    }
    public ResultSet logar(){
        ResultSet tabela;
        tabela = null;
        String sql = "select * from pacientes where login = '" + getLogin() + "'and senha = '" + getSenha() + "'";     
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
}
    