
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Triangulo {
    private double area;
    private double base;
    private double altura;

    public Triangulo() {
        this(0.0, 0.0, 0.0);
    }

    public Triangulo(double area, double base, double altura) {
        this.area = area;
        this.base = base;
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void inserirDadosTriangulo(){
        setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do triângulo")));
        setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do triângulo:")));
    }
    public void calcularArea(){
        setArea(getBase() * getAltura() / 2);
    }
    public double mostrarAreaTriangulo(){
        JOptionPane.showMessageDialog(null, "Área do triângulo: " + getArea());
        return getArea();
    }
}
