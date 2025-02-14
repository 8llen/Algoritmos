
package ativi25;

import javax.swing.JOptionPane;

public class Ativi25 {

    
    public static void main(String[] args) {

     //PORTUGOL
     //inicio
    // Declaração das variáveis
    //real raio, altura, volume
    // Leitura dos dados de entrada
    // Cálculo do volume da caixa d'água (V = π * r² * h)
    //volume := 3.14159 * (raio * raio) * altura

        
        String inputRaio = JOptionPane.showInputDialog("Digite o raio da base da caixa d'água (em metros):");
        String inputAltura = JOptionPane.showInputDialog("Digite a altura da caixa d'água (em metros):");
        
        double raio = Double.parseDouble(inputRaio);
        double altura = Double.parseDouble(inputAltura);
        double volume = Math.PI * Math.pow(raio, 2) * altura;

        JOptionPane.showMessageDialog(null, "O volume da caixa d'água é: " + volume + " metros cúbicos.");
 
    }
    
}
