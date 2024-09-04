
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
public class Prova {
    private String nome;
    private double pontos;
    private String nivel;
    
    Scanner sc = new Scanner(System.in);

    public Prova() {
        this("", 0.0, "");
    }

    public Prova(String nome, double pontos, String nivel) {
        this.nome = nome;
        this.pontos = pontos;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPontos() {
        return pontos;
    }

    public void setPontos(double pontos) {
        this.pontos = pontos;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    public void nivelProva(){
        System.out.println("Digite seu nome:");
        setNome(sc.next());
        
        System.out.println("Digite quantos pontos você fez:");
        setPontos(sc.nextDouble());
        
        if((getPontos() <= 100)){
            setNivel("Nível 1");
        } else if ((getPontos() > 100) && getPontos() < 200){
            setNivel("Nível 2");
        } else if ((getPontos() >= 200)){
            setNivel("Nível 3");
        }
    }
    public void listarSituacao(){
        System.out.println("Olá, " + getNome() + " você fez " + getPontos() + " ponto(s), portanto será classificado como  " + getNivel());
    }
}
