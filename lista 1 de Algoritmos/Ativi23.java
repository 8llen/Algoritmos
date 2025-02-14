
package ativi23;

import javax.swing.JOptionPane;

public class Ativi23 {

    
    public static void main(String[] args) {
        double alt_pessoa, som_pessoa, alt_predio, som_predio;
        String salt_pessoa, ssom_pessoa, ssom_predio;
        
        salt_pessoa = JOptionPane.showInputDialog(null, "Sua altura (em metros): ");
        ssom_pessoa = JOptionPane.showInputDialog(null, "Sua sombra (em metros): ");
        ssom_predio = JOptionPane.showInputDialog(null, "Sombra do prédio (em metros): ");
        alt_pessoa = Double.parseDouble(salt_pessoa);
        som_pessoa = Double.parseDouble(ssom_pessoa);
        som_predio = Double.parseDouble(ssom_predio);
        
        alt_predio = (alt_pessoa * som_predio) / som_pessoa;

        JOptionPane.showMessageDialog(null, "A altura do prédio é: "+ alt_predio +" metros");
    }
    
}
