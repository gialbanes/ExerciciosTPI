
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
public class OlimpiadaMatematica {
    private String nome;
    private String endereco;
    private double media;
    private double notaMenor;
    private double notaMaior;
    
    Scanner sc = new Scanner(System.in);

    public OlimpiadaMatematica() {
        this("", "", 0.0, 0.0, 0.0);
    }

    public OlimpiadaMatematica(String nome, String endereco, double media, double notaMenor, double notaMaior) {
        this.nome = nome;
        this.endereco = endereco;
        this.media = media;
        this.notaMenor = notaMenor;
        this.notaMaior = notaMaior;
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

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getNotaMenor() {
        return notaMenor;
    }

    public void setNotaMenor(double notaMenor) {
        this.notaMenor = notaMenor;
    }

    public double getNotaMaior() {
        return notaMaior;
    }

    public void setNotaMaior(double notaMaior) {
        this.notaMaior = notaMaior;
    }
    
    public void dadosPessoais(){
        System.out.println("Digite seu nome:");
        setNome(sc.next());
        
        System.out.println("Digite seu endereço:");
        setEndereco(sc.next());
        
        System.out.println("Olá, " + getNome() + " morador(a) de " + getEndereco());
    }
    
    public void calcularMedia(){
        System.out.println("Digite a menor nota:");
        setNotaMenor(sc.nextDouble());
        
        System.out.println("Digite a maior nota:");
        setNotaMaior(sc.nextDouble());
        
        setMedia((getNotaMenor() + getNotaMaior()) / 2);
        
        System.out.println("A média é " + getMedia());
    }
    
    public void verificarMedia(){
        if((getMedia() > 9)){
            System.out.println("Aluno inscrito");
        } else {
            System.out.println("Média insuficiente");
        }
    }
}
