import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        Quadrado quad = new Quadrado();

        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite \n 1. Calcular área quadrado \n 2. Calcular perímetro quadrado \n 3. MostrarValores \n 0. Sair"));

            switch (op) {
                case 1:
                    double ladoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado A:"));
                    quad.calcularArea(ladoA);
                case 2:
                    ladoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado A:"));
                    quad.calcularPerimetro(ladoA);
                    break;
                case 3:
                    quad.mostrarValores();
                    break;  
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break; 
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        }
        while(op!=0);
    }
}
