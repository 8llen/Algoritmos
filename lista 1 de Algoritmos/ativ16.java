
package javaapplication16;

import javax.swing.JOptionPane;

public class JavaApplication16 {

    
    public static void main(String[] args) {
        double hambúrguer = 100;
        double presunto = 50;
        double queijo = 50;
        int quantidade;
        String squantidade;

        squantidade = JOptionPane.showInputDialog(null, "Quantos sanduíches você irá fazer?");
        quantidade = Integer.parseInt(squantidade);

        hambúrguer = hambúrguer * quantidade / 1000;
        queijo = queijo * quantidade * 2 / 1000;
        presunto = presunto * quantidade/ 1000;

        JOptionPane.showMessageDialog(null, "Hambúguer: " + hambúrguer + ", Queijo: " + queijo + ", Presunto: " + presunto);
    }
    
}
