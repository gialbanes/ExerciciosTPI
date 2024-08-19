/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double salario_fixo=1000, bonus, salario_total;
        int qtd_vendidos;
        
        System.out.println("Digite a quantidade de móveis vendidos:");
        qtd_vendidos = sc.nextInt();
        
        bonus = qtd_vendidos * 50;
        salario_total = salario_fixo + bonus;
        System.out.println("O funcionário vendeu " + qtd_vendidos + " móveis e seu salário total foi R$" + salario_total);
        
        
    }
    
}
