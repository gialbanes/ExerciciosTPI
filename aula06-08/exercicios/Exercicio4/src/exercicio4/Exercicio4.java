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
        double salMin, salFunc, qtdSal; 
        salMin = 1400;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o salário do funcionário: ");
        salFunc = sc.nextDouble();
        
        qtdSal = salFunc/salMin;
        System.out.print("A quantidade de salários mínimos que o funcionário recebe é: " + qtdSal);
        
        
    }
    
}
