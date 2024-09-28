/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author fatec-dsm2
 */
public class Empresa {
    private String cnpj;
    private String nomeEmpresa;
    private String endereco;

    public Empresa() {
        this("", "", "");
    }

    public Empresa(String cnpj, String nomeEmpresa, String endereco) {
        this.cnpj = cnpj;
        this.nomeEmpresa = nomeEmpresa;
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
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
        String sqq;
    }
    
    
}
