
package ativi26;

import javax.swing.JOptionPane;

public class Ativi26 {

    
    public static void main(String[] args) {
        
double a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente angular a1 da primeira reta:"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente linear b1 da primeira reta:"));
        double a2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente angular a2 da segunda reta:"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente linear b2 da segunda reta:"));

        if (a1 == a2) {
            if (b1 == b2) {
                JOptionPane.showMessageDialog(null, "As retas são coincidentes.");
            } else {
                JOptionPane.showMessageDialog(null, "As retas são paralelas e não se interceptam.");
            }
        } else {
            double x = (b2 - b1) / (a1 - a2);
            double y = a1 * x + b1;
            JOptionPane.showMessageDialog(null, "O ponto de interseção é: (" + x + ", " + y + ")");
        }
    }
}
