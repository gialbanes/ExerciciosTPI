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
        
        double valorAtraso, valor, taxa;
        int tempo;
        
        System.out.println("Digite o valor da parcela:");
        valor = sc.nextDouble();
        System.out.println("Digite a taxa de juros");
        taxa = sc.nextDouble();
        System.out.println("Digite o tempo que a parcela está atrasada:");
        tempo = sc.nextInt();
        
        valorAtraso = valor + (valor * (taxa/100) * tempo);
        System.out.println("O valor atrasado a ser pago é " + valorAtraso);
    }
    
}
