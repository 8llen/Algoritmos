
package ativi20;

import javax.swing.JOptionPane;

public class Ativi20 {

   
    public static void main(String[] args) {
        double novelos, blusas, novelos_por_blusa;
        String s_novelos, s_blusas;

        s_blusas = JOptionPane.showInputDialog(null, "Quantas blusas foram fabricadas?");
        s_novelos = JOptionPane.showInputDialog(null, "Quantos novelos foram gastos?");
        blusas = Double.parseDouble(s_blusas);
        novelos = Double.parseDouble(s_novelos);

        novelos_por_blusa = novelos / blusas;

        JOptionPane.showMessageDialog(null, "Você gastou " + novelos_por_blusa + " novelos por blusa.");
    }
    
}
