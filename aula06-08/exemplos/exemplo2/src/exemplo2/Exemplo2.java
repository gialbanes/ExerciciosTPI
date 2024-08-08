/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota1, nota2, media;
        String nome;
        
        Scanner leia = new Scanner(System.in);
        
        //scanner é utilizado para ler os valores digitados
        System.out.print("Digite o seu nome: ");
        nome = leia.next();
        System.out.print("Digite a primeira nota: ");
        nota1 = leia.nextInt();
        System.out.print("Digite a segunda nota: ");
        nota2 = leia.nextInt();
        
        media = (nota1 + nota2) /2;
        
        //p arredondar valores
        DecimalFormat conv = new DecimalFormat("0.00");
        System.out.println("O aluno(a) " + nome + "teve média igual a: " + conv.format(media));          
    }
    
}
