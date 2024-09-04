
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
public class Temperatura {
    private double celsius; 
    private double fahrenheit;
    
    Scanner sc = new Scanner(System.in);

    public Temperatura() {
        this(0.0, 0.0);
    }

    public Temperatura(double celsius, double fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    
    public void calcularTempCelsius(double f){
        this.setCelsius((f - 32) * (5/9.0));
        
        System.out.println("A temperatura em celsius é " + getCelsius());
    }
    
    public void calcularTempFahrenheit(double c){
        this.setFahrenheit(c * 1.8 + 32);
        
        System.out.println("A temperatura em fahrenheit é " + getFahrenheit());
    }
}
