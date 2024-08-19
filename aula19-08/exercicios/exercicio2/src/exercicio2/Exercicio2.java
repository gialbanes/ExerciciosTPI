/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome1, nome2, nome3;
        double valor1, valor2, valor3, valorTotal, valorProd1, valorProd2, valorProd3;
        int qtd_vendida1, qtd_vendida2, qtd_vendida3;
        
        System.out.println("Digite o nome do primeiro produto");
        nome1 = sc.next();
        System.out.println("Digite o valor do primeiro produto");
        valor1 = sc.nextDouble();
        System.out.println("Digite a qunatidade vendida do primeiro produto");
        qtd_vendida1 = sc.nextInt();
        
        System.out.println("Digite o nome do segundo produto");
        nome2 = sc.next();
        System.out.println("Digite o valor do segundo produto");
        valor2 = sc.nextDouble();
        System.out.println("Digite a qunatidade vendida do segundo produto");
        qtd_vendida2 = sc.nextInt();
        
        System.out.println("Digite o nome do terceiro produto");
        nome3 = sc.next();
        System.out.println("Digite o valor do terceiro produto");
        valor3 = sc.nextDouble();
        System.out.println("Digite a qunatidade vendida do terceiro produto");
        qtd_vendida3 = sc.nextInt();
        
        valorProd1 = valor1 * qtd_vendida1;
        valorProd2 = valor2 * qtd_vendida2;
        valorProd3 = valor3 * qtd_vendida3;
        valorTotal = valorProd1 + valorProd2 + valorProd3;
        
        System.out.println("O valor do produto 1 é R$" + valorProd1);
        System.out.println("O valor do produto 2 é R$" + valorProd2);
        System.out.println("O valor do produto 3 é R$" + valorProd3);
        System.out.println("O valor total pago pelos produtos é R$" + valorTotal);

    }
    
}
