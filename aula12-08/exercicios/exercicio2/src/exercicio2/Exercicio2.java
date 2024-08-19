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
        
        int num;
        double quadrado;
        
        System.out.println("Digite um número qualquer");
        num = sc.nextInt();
        
        quadrado = Math.pow(num, 2);
        System.out.println("O quadrado de " + num + " é " + quadrado);
    }
    
}
