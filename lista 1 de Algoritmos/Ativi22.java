
package ativi22;

import javax.swing.JOptionPane;

public class Ativi22 {

    
    public static void main(String[] args) {
        
         int qtd1, qtd5, qtd10, qtd25, qtd50, qtd100;
        double reais;
        String sqtd1, sqtd5, sqtd10, sqtd25, sqtd50, sqtd100;

        sqtd1 = JOptionPane.showInputDialog(null, "Quantas moedas de 1 centavo você tem?");
        sqtd5 = JOptionPane.showInputDialog(null, "Quantas moedas de 5 centavos você tem?");
        sqtd10 = JOptionPane.showInputDialog(null, "Quantas moedas de 10 centavos você tem?");
        sqtd25 = JOptionPane.showInputDialog(null, "Quantas moedas de 25 centavos você tem?");
        sqtd50 = JOptionPane.showInputDialog(null, "Quantas moedas de 50 centavos você tem?");
        sqtd100 = JOptionPane.showInputDialog(null, "Quantas moedas de 1 real você tem?");
        qtd1 = Integer.parseInt(sqtd1);
        qtd5 = Integer.parseInt(sqtd5);
        qtd10 = Integer.parseInt(sqtd10);
        qtd25 = Integer.parseInt(sqtd25);
        qtd50 = Integer.parseInt(sqtd50);
        qtd100 = Integer.parseInt(sqtd100);

        reais = qtd1 + qtd5 * 5 + qtd10 * 10 + qtd25 * 25 + qtd50 * 50 + qtd100 * 100;
        reais = reais / 100;
    
        JOptionPane.showMessageDialog(null, "Total de reais: " + reais);
    }
    
}
