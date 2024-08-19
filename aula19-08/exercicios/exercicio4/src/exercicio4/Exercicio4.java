/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome;
        int qtdMax, qtdEstoque, qtdComprar;
        
        System.out.println("Digite o nome do produto");
        nome = sc.next();
        System.out.println("Digite a quantidade máxima do produto:");
        qtdMax = sc.nextInt();
        System.out.println("Digite a quantidade em estoque do produto:");
        qtdEstoque = sc.nextInt();
        
        qtdComprar = qtdMax - qtdEstoque;
        
        System.out.println(nome + ": comprar " + qtdComprar);
    }
    
}
