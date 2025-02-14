
package ativi27;

import javax.swing.JOptionPane;

public class Ativi27 {

   
    public static void main(String[] args) {
         
        double[] compras = new double[4];
        double totalGastos = 0;
        
        for (int i = 0; i < 4; i++) {
            compras[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra " + (i+1) + ":"));
            totalGastos += compras[i];
        }
        
        double pontos = totalGastos / 5;
        
        JOptionPane.showMessageDialog(null, "O total de pontos acumulados é: " + pontos);
    }
}

/*Portugo

Compra 1	Compra 2	Compra 3	Compra 4	Total Gastos	Pontos Acumulados
30.00	         20.00	         15.00	         35.00	           100.00	     20.00
50.00	         60.00	         40.00	         50.00	           200.00	     40.00
10.00	         20.00	         30.00	         40.00	           100.00	     20.00
25.00	         25.00	         25.00           25.00	           100.00	     20.00

*/

