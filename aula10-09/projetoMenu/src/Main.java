
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
       Caixa cx = new Caixa();
       
       int op;
       //COMANDO DO-WHILE: COMANDO DE REPETIÇÃO PARA O MENU
       do{
           //JOptionPane.showInputDialog: CAIXA PARA ENTRADA DE VALROES
           op = Integer.parseInt(JOptionPane.showInputDialog("Digite \n 1. Depositar \n 2. Sacar \n 3. Consultar saldo \n 0. Sair"));
           
           //COMANDO DE CONDIÇÃO SWITCH-CASE PARA VERIFICAR QUAL A OPÇÃO SELECIONADA
           switch(op){
               case 1:
                   cx.depositar();
                   break;
               case 2: 
                   cx.sacar();
                   break;
               case 3:
                   //JOPTIONPANE SHOW MESSAGE DIALOG: CAIXA DE MENSAGEM PARA MOSTRAR OS VALORES; SEMELHANTE AO SOUT
                   JOptionPane.showMessageDialog(null, "Saldo atual:" + cx.mostrarSaldo());
                   break;
               case 0:
                   JOptionPane.showMessageDialog(null, "Finalizando...");
                   break;
               default: 
                   JOptionPane.showMessageDialog(null, "opção inválida!");
                   break;
           } 
           
       }
       while(op != 0);
    }
    
}
