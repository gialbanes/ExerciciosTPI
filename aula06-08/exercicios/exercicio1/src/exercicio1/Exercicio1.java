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
        // TODO code application logic here
        
        int n1, n2, soma, sub, mult;
        double div;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        n1 = leia.nextInt();
        
        System.out.println("Digite o segundo número: ");
        n2 = leia.nextInt();
        
        soma = n1 + n2;
        sub = n1 - n2;
        mult = n1 * n2;
        div = n1 / n2;
        
        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da subtração é: " + sub);
        System.out.println("O resultado da multiplicação é: " + mult);
        System.out.println("O resultado da divisão é: " + div);
    }
    
}
