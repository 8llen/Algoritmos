
package atividade24;

import javax.swing.JOptionPane;

public class Atividade24 {

    
    public static void main(String[] args) {
       double refresco, água, suco;
        String srefresco, ságua, ssuco;
        
        srefresco = JOptionPane.showInputDialog(null, "Quantidade de litros de refresco: ");
        refresco = Double.parseDouble(srefresco);
        
        água = refresco * 0.8;
        suco = refresco * 0.2;
        
        JOptionPane.showMessageDialog(null, "Serão necessários "+ água +"L de água e "+ suco +"L de suco.");
    }
    
}
