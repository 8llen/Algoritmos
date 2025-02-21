
package ativi30;

import javax.swing.JOptionPane;

public class Ativi30 {

    
    public static void main(String[] args) {
      
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do refrigerante (1 - Meia-Cola, 2 - Limonax, 3 - Orange):"));

      
        char tipo = JOptionPane.showInputDialog("Digite o tipo do refrigerante (N - Normal, D - Diet):").charAt(0);

       
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do refrigerante:"));

      
        double preco = 0.0;
        if (codigo == 1) {
            if (tipo == 'N') {
                preco = 1.50;
            } else if (tipo == 'D') {
                preco = 1.70;
            }
        } else if (codigo == 2) {
            if (tipo == 'N') {
                preco = 1.60;
            } else if (tipo == 'D') {
                preco = 1.70;
            }
        } else if (codigo == 3) {
            if (tipo == 'N') {
                preco = 1.40;
            } else if (tipo == 'D') {
                preco = 1.45;
            }
        }

       
        double valorTotal = preco * quantidade;

       
        if (valorTotal > 100.00) {
            valorTotal = valorTotal * 0.95;
        }

        
        JOptionPane.showMessageDialog(null, "O valor total da compra é: R$ " + String.format("%.2f", valorTotal));
    }
}
