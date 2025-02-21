
package ativi28;

import javax.swing.JOptionPane;

public class Ativi28 {

    
    public static void main(String[] args) {
       

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        
        boolean satisfaz = verificaCaracteristica(numero);

       
        if (satisfaz) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " satisfaz a característica.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " não satisfaz a característica.");
        }
    }

    public static boolean verificaCaracteristica(int numero) {
        int parte1 = numero / 100; 
        int parte2 = numero % 100; 
        int soma = parte1 + parte2;
        return (soma * soma) == numero;
    }
}
