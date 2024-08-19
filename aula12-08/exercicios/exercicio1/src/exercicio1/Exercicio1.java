/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1, n2, dobro, triplo;
        // double quadrado; quadrado = Math.pow(dias,2)
        
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();     
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();
        
        dobro = n1 * 2;
        triplo = n2 * 3;
        
        System.out.println("O primiero número é " + n1 + " e o seu dobro é " + dobro);
        System.out.println("O segundo número é " + n2 + " e o seu triplo é " + triplo);
    }   
    
}
