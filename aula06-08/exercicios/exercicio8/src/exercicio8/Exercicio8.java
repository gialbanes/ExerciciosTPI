/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double ladoA, ladoB, area, perimetro;
        
        System.out.print("Digite a medida do lado A em cm: ");
        ladoA = sc.nextDouble();
        System.out.print("Digite a medida do lado B em cm: ");
        ladoB = sc.nextDouble();
        
        area = ladoA * ladoB;
        perimetro = 2*ladoA + 2*ladoB;
        System.out.println("A área desse retângulo é: " + area);
        System.out.println("O perímetro desse retângulo é: " + perimetro);

    }
    
}
