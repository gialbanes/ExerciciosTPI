
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
public class CategoriaCliente {
    private String nome;
    private double numeroConta;
    private double saldoMedio;
    
    private Scanner sc = new Scanner(System.in);

    public CategoriaCliente() {
        this("", 0.0, 0.0);
    }

    public CategoriaCliente(String nome, double numeroConta, double saldoMedio) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldoMedio = saldoMedio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoMedio() {
        return saldoMedio;
    }

    public void setSaldoMedio(double saldoMedio) {
        this.saldoMedio = saldoMedio;
    }
    
    public void verificarSaldo(){
        System.out.println("Cliente, digite seu nome:");
        setNome(sc.next());
        
        System.out.println("Cliente, digite o número da sua conta:");
        setNumeroConta(sc.nextDouble());
        
        System.out.println("Cliente, digite o seu saldo médio:");
        setSaldoMedio(sc.nextDouble());
        
        if((getSaldoMedio() < 1000)){
            System.out.println("Cliente comum");
        } else if ((getSaldoMedio() >= 1000) && (getSaldoMedio() < 2500)){
            System.out.println("Cliente prata");
        } else if ((getSaldoMedio() >= 2500)){
            System.out.println("Cliente ouro");
        }
    } 
}
