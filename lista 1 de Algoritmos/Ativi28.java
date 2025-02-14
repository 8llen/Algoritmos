
package ativi28;

import javax.swing.JOptionPane;

public class Ativi28 {

   
    public static void main(String[] args) {
        
        String valorChequeStr = JOptionPane.showInputDialog("Insira o valor do cheque:");
        
        double valorCheque = Double.parseDouble(valorChequeStr);
        
        double valorCPMF = valorCheque * 0.0038;
        
        String valorCPMFStr = String.format("%.2f", valorCPMF);
       
        JOptionPane.showMessageDialog(null, "O valor recolhido de CPMF será: R$ " + valorCPMFStr);
    }
    
}
