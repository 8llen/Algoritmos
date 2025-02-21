
package ativi25;

import javax.swing.JOptionPane;

public class Ativi25 {

   
    public static void main(String[] args) {
       
   double x = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada x do ponto: "));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada y do ponto: "));
        
        if (2 * x + y == 3) {
            JOptionPane.showMessageDialog(null, "O ponto pertence à reta 2x + y = 3.");
        } else {
            JOptionPane.showMessageDialog(null, "O ponto não pertence à reta 2x + y = 3.");
        }
    }
    
}


