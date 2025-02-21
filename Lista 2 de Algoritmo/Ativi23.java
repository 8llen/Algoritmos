
package ativi23;

import javax.swing.JOptionPane;

public class Ativi23 {

    
    public static void main(String[] args) {
        
   // Variáveis
        int X, Y, Z;

        // Corpo do algoritmo
        X = 10;
        Y = 12;
        Z = X - Y;
        X = X + 8;

        if (X > Y) {
            if (Z < X) {
                Z = Y;
            } else {
                Z = X;
            }
        } else {
            if (Y > X) {
                Y = Z;
            } else {
                Y = Y + 1;
            }
        }

        // Exibir os valores usando JOptionPane
        JOptionPane.showMessageDialog(null, "O valor de X é: " + X);
        JOptionPane.showMessageDialog(null, "O valor de Y é: " + Y);
        JOptionPane.showMessageDialog(null, "O valor de Z é: " + Z);
    }
}