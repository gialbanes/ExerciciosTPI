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
        int idade, dias;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        
        dias = idade * 365;
        System.out.print("Você já viveu " + dias + " dias.");
    }
    
}
