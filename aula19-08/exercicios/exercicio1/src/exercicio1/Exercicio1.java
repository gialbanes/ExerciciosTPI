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
        
        int raio;
        double area;
        
        System.out.println("Digite a medida do raio:");
        raio = sc.nextInt();
        
        area = (3.14 * (Math.pow(raio,raio)));
        
        System.out.println("A área da circunferência é " + area);
    }
    
}
