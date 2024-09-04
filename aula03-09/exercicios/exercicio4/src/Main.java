
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Temperatura temp = new Temperatura();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em celsius:");
        temp.setCelsius(sc.nextDouble());
        
        System.out.println("Digite a temperatura em fahrenheit:");
        temp.setFahrenheit(sc.nextDouble());
        
        temp.calcularTempCelsius(temp.getCelsius());
        temp.calcularTempFahrenheit(temp.getFahrenheit());
    }
    
}
