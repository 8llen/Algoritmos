
package ativi19;

import javax.swing.JOptionPane;

public class Ativi19 {

    
    public static void main(String[] args) {
        int frangos;
        double gasto;
        String sfrangos;

        sfrangos = JOptionPane.showInputDialog(null, "Quantos frangos tem na granja");
        frangos = Integer.parseInt(sfrangos);

        gasto = frangos * (4 + 2*3.50);

        JOptionPane.showMessageDialog(null, "Gasto total é: " + gasto);
    }
    
}
