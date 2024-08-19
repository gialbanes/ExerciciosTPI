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
        
        int raio;
        double altura, volume;
        
        System.out.println("Digite o raio do cilindro:");
        raio = sc.nextInt();
        System.out.println("Digite a altura do cilindro:");
        altura = sc.nextDouble();
        
        volume = 3.14159 * (Math.pow(raio,raio) * altura);
        
        System.out.println("O volume do cilindro é " + volume);
    }
    
}
