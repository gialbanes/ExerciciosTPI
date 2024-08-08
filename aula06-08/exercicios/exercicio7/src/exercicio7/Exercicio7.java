/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nomeProduto;
        int qtdComprada;
        double precoUnitario, total;
        
        System.out.print("Digite o nome do produto comprado: ");
        nomeProduto = sc.next();
        System.out.print("Digite a quantidade do produto comprado: ");
        qtdComprada = sc.nextInt();
        System.out.print("Digite o preço unitário do produto comprado: ");
        precoUnitario = sc.nextDouble();
        
        total = qtdComprada * precoUnitario;
        System.out.print("Você deverá pagar R$" + total + " pelo(s) " + nomeProduto);
        
    }
    
}
