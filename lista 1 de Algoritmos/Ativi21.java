
package ativi21;

import javax.swing.JOptionPane;

public class Ativi21 {

    
    public static void main(String[] args) {
        int qtd_lata, qtd_garrafa_p, qtd_garrafa_g;
        double litros;
        String sqtd_lata, sqtd_garrafa_p, sqtd_garrafa_g;

        sqtd_lata = JOptionPane.showInputDialog(null, "Quantas latas de 350 ml você comprou?");
        sqtd_garrafa_p = JOptionPane.showInputDialog(null, "Quantas garrafas de 600 ml você comprou?");
        sqtd_garrafa_g = JOptionPane.showInputDialog(null, "Quantas garrafas de 2L você comprou?");
        qtd_lata = Integer.parseInt(sqtd_lata);
        qtd_garrafa_p = Integer.parseInt(sqtd_garrafa_p);
        qtd_garrafa_g = Integer.parseInt(sqtd_garrafa_g);

        litros = (qtd_lata * 350 + qtd_garrafa_p * 600 + qtd_garrafa_g * 2000);
        litros = litros / 1000;

        JOptionPane.showMessageDialog(null, "Litros no total: " + litros);
    }
    
}
