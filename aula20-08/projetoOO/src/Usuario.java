
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
public class Usuario {
    //DECLARA OS ATRIBUTOS DA CLASSE
    private String nome;
    private String email;
    private int idade;
    private String endereco;

    //CONSTRUTOR
    public Usuario() {
        this("", "", 0, ""); //INICIALIZANDO OS ATRIBUTOS
    }

    //inicializando tudo vazio
    public Usuario(String nome, String email, int idade, String endereco) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.endereco = endereco;
    }
    
    //ENCAPSULAMENTO DOS ATRIBUTOS
    public String getNome() { //PEGA O VALOR PARA USAR
        return nome;
    }

    public void setNome(String nome) { //UARDAR O VALOR
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    //MÉTODOS
    public void guardarDados(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        setNome(sc.next());
        System.out.println("Digite seu email:");
        setEndereco(sc.next());
        System.out.println("Digite sua idade:");
        setIdade(sc.nextInt());
        System.out.println("Digite seu endereço:");
        sc.nextLine();
        setEndereco(sc.nextLine());
    }
    
    public void mostrarDados(){
        System.out.println("\n Dados do usuário \n Nome: " + getNome());
        System.out.println("\n Email: " + getEmail());
        System.out.println("\n Idade: " + getIdade());
        System.out.println("\n Endereço: " + getEndereco());
    }
    
}
