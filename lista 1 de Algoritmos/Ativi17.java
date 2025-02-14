
package ativi17;

import javax.swing.JOptionPane;

public class Ativi17 {

    
    public static void main(String[] args) {
        double celsius, fahrenheit;
        String scelsius;
        
        scelsius = JOptionPane.showInputDialog(null, "Graus em celsius:");
        celsius = Double.parseDouble(scelsius);

        fahrenheit = (1.8 * celsius) + 32;

        JOptionPane.showMessageDialog(null, "" + celsius + "°C são " + fahrenheit + "°F");
  
    }
    
}
