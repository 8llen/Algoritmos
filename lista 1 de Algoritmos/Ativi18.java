
package ativi18;

import javax.swing.JOptionPane;

public class Ativi18 {

    
    public static void main(String[] args) {
        int horas_normais, horas_extras;
        double salário;
        String shoras_normais, shoras_extras;

        shoras_normais = JOptionPane.showInputDialog(null, "Quantas horas normais você trabalhou?");
        shoras_extras = JOptionPane.showInputDialog(null, "Quantas horas extras você trabalhou?");
        horas_normais = Integer.parseInt(shoras_normais);
        horas_extras = Integer.parseInt(shoras_extras);

        salário = 10 * horas_normais + 15 * horas_extras;

        JOptionPane.showMessageDialog(null, "Seu salário bruto é: " + salário + ", e o líquido é: " + salário * 0.90);

    }
    
}
