
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Cliente {
    private String nome;
    private String endereco;
    private String rg;
    
    Scanner sc = new Scanner(System.in);

    public Cliente() {
        this("", "", "");
    }

    public Cliente(String nome, String endereco, String rg) {
        this.nome = nome;
        this.endereco = endereco;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    public void cadastrarCliente(){
        System.out.println("Digite o nome do cliente: ");
        setNome(sc.next());
        System.out.println("Digite o endereço do cliente: ");
        setEndereco(sc.next());
        System.out.println("Digite o RG do cliente: ");
        setRg(sc.next());
    }
    public void listarCliente(){
        System.out.println("*** Cliente *** \n Nome: " + getNome() + "\n Endereço: " + getEndereco() + "\n RG: " + getRg());
    }
}
