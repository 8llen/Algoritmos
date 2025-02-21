
package ativi19;

import javax.swing.JOptionPane; 

public class Ativi19 {

    
    public static void main(String[] args) {
        
     int codigoSanduiche = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do sanduíche (100, 101, 102, 103): "));
        int codigoBebida = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da bebida (201, 202, 203): "));
        
        double precoSanduiche = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do sanduíche: "));
        double precoBebida = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da bebida: "));
        
        switch (codigoSanduiche) {
            case 100:
                precoSanduiche = 1.20;
                break;
            case 101:
                precoSanduiche = 1.30;
                break;
            case 102:
                precoSanduiche = 1.50;
                break;
            case 103:
                precoSanduiche = 1.20;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Código de sanduíche inválido.");
                return;
        }
        
        switch (codigoBebida) {
            case 201:
                precoBebida = 1.00;
                break;
            case 202:
                precoBebida = 1.50;
                break;
            case 203:
                precoBebida = 0.70;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Código de bebida inválido.");
                return;
        }
        
        double total = precoSanduiche + precoBebida;
        
        JOptionPane.showMessageDialog(null, "O valor a pagar é: R$" + total);
    }
    
}
