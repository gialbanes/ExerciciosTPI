/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salAtual, percentual, novoSal;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o salário mensal atual do funcionário: ");
        salAtual = sc.nextDouble();
        System.out.print("Digite o percentual de reajuste que será aplicado ao salário mensal atual do funcionário: ");
        percentual = sc.nextDouble();
        
        novoSal = salAtual + (salAtual * percentual) / 100;
        System.out.print("O novo salário com o percentual de reajuste é: " + novoSal);
    }
    
}
