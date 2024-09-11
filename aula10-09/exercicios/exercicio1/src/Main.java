
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
        CustoPiso piso = new CustoPiso();
        
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite \n 1. Inserir valores do cômodo \n 2. Calcular preço por área \n 3. MostrarValores \n 0. Sair"));
            
            switch(op){
                case 1:
                    piso.inserirValores();
                    break;
                case 2: 
                    piso.setPrecoPorArea(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço por área:")));
                    piso.calcularPrecoArea();
                    break;
                case 3: 
                    piso.mostrarValores();
                    break;
                case 0: 
                    JOptionPane.showMessageDialog(null, "Saindo...");
            }
        }
        while(op!=0);
    }
    
}
