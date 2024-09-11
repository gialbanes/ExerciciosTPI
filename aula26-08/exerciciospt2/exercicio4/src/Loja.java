
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
public class Loja {
    private String razaoSocial;
    private String cpfCliente;
    private double valorCompra;
    private double qtdItensCompra;
    private double valorTotalCompra;
    
    Scanner sc = new Scanner(System.in);

    public Loja() {
        this("", "", 0.0, 0.0, 0.0);
    }

    public Loja(String razaoSocial, String cpfCliente, double valorCompra, double qtdItensCompra, double valorTotalCompra) {
        this.razaoSocial = razaoSocial;
        this.cpfCliente = cpfCliente;
        this.valorCompra = valorCompra;
        this.qtdItensCompra = qtdItensCompra;
        this.valorTotalCompra = valorTotalCompra;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getQtdItensCompra() {
        return qtdItensCompra;
    }

    public void setQtdItensCompra(double qtdItensCompra) {
        this.qtdItensCompra = qtdItensCompra;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }
    public void inserirDadosLoja(){
        System.out.println("Digite a razão social da compra:");
        setRazaoSocial(sc.next());
        
        System.out.println("Digite o CPF do cliente:");
        setCpfCliente(sc.next());
        
        System.out.println("Digite o valor da compra:");
        setValorCompra(sc.nextDouble());
        
        System.out.println("Digite a quantidade de itens comprados:");
        setQtdItensCompra(sc.nextDouble());
    }
    public void mostrarDadosLoja(){
        System.out.println("*** Dados da Loja *** \n Razão social: " + getRazaoSocial() + "\n CPF do cliente: " + getCpfCliente() + "\n Valor da compra: R$" + getValorCompra() + "\n Quantidade de itens comprados: " + getQtdItensCompra());
    }
    public void calcularCompraLOja(){
        setValorTotalCompra(getValorCompra() * getQtdItensCompra());
        System.out.println("\n VALOR TOTAL: R$" + getValorTotalCompra());
    }
    
    
    
}
