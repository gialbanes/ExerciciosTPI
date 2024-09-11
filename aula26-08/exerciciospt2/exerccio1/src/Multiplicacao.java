
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
public class Multiplicacao {
    private int valor;
    private int resultado;
    
    Scanner sc = new Scanner(System.in);

    public Multiplicacao() {
        this(0,0);
    }

    public Multiplicacao(int valor, int resultado) {
        this.valor = valor;
        this.resultado = resultado;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public void multiplicacao4(){
        System.out.println("Digite um número qualquer:");
        setValor(sc.nextInt());
        
        resultado = valor * 4;
    }
    
    public void mostrarMultiplicacao(){
        System.out.println("O resultado do número " + getValor() + " multiplicado por 4 é " + getResultado());
    }
    
    
}
