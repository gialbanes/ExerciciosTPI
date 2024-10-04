
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
public class CustoPiso {
    private double comprimentoComodo;
    private double larguraComodo;
    private double precoPorArea;
    private double custoTotalComodo;

    public CustoPiso() {
        this(0.0, 0.0, 0.0, 0.0);
    }

    public CustoPiso(double comprimentoComodo, double larguraComodo, double precoPorArea, double custoTotalComodo) {
        this.comprimentoComodo = comprimentoComodo;
        this.larguraComodo = larguraComodo;
        this.precoPorArea = precoPorArea;
        this.custoTotalComodo = custoTotalComodo;
    }

    public double getComprimentoComodo() {
        return comprimentoComodo;
    }

    public void setComprimentoComodo(double comprimentoComodo) {
        this.comprimentoComodo = comprimentoComodo;
    }

    public double getLarguraComodo() {
        return larguraComodo;
    }

    public void setLarguraComodo(double larguraComodo) {
        this.larguraComodo = larguraComodo;
    }

    public double getPrecoPorArea() {
        return precoPorArea;
    }

    public void setPrecoPorArea(double precoPorArea) {
        this.precoPorArea = precoPorArea;
    }

    public double getCustoTotalComodo() {
        return custoTotalComodo;
    }

    public void setCustoTotalComodo(double custoTotalComodo) {
        this.custoTotalComodo = custoTotalComodo;
    }
    public void inserirValores(){
        setComprimentoComodo(Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do cômodo:")));
        setLarguraComodo(Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do cômodo:")));
    }
    public void calcularPrecoArea(){
        setCustoTotalComodo(getComprimentoComodo() * getLarguraComodo() + getPrecoPorArea());
    }
    public void mostrarValores(){
        JOptionPane.showMessageDialog(null, "*** Dados *** \n Comprimento do cômodo: " + getComprimentoComodo() + "\n Largura do cômodo: " + getLarguraComodo() + "\n Preço por área: " + getPrecoPorArea() + "\n Custo total do cômodo: " + getCustoTotalComodo());
    }
    
    
}
