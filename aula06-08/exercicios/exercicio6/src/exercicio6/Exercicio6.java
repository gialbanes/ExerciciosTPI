/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double litros, precoLitro, valorPago;
        precoLitro = 5.89;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de litros abestecido em um veículo: ");
        litros = sc.nextDouble();
        
        valorPago = litros * 5.89;
        System.out.print("O vaolor a ser pago por " + litros + " litro(s) de gasolina é " + valorPago);
    }
    
}
