/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Combustivel comb = new Combustivel();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de km rodado:");
        comb.setKm(sc.nextDouble());

        System.out.println("Digite o valor do combustível:");
        comb.setValorComb(sc.nextDouble());

        comb.calcularLitros(comb.getKm());
        comb.calcularTotalGasto(comb.getValorComb());
    }
    
}
