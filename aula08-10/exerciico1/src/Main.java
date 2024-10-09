
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo t = new Triangulo();
        
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite \n 1. Inserir dados triângulo \n 2.Calcular área do triângulo \n 3.Mostrar área do triângulo \n 0.Sair"));
            
            switch(op){
            case 1: 
                t.inserirDadosTriangulo();
                break;
            case 2:
                t.calcularArea();
                break;
            case 3:
                t.mostrarAreaTriangulo();
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Saindo...");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                break;                           
          }
        }
        while(op!=0);
    }
    
}
