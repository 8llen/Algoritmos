
package ativi21;

import javax.swing.JOptionPane;

public class Ativi21 {

    
    public static void main(String[] args) {
        
       double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário (maior que 0): R$"));
        int codigoCargo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do cargo (91, 92, 93): "));
        
        if (salario <= 0) {
            JOptionPane.showMessageDialog(null, "Salário inválido. Deve ser maior que 0.");
        } else {
            double novoSalario = 0;
            
            switch (codigoCargo) {
                case 91:
                    novoSalario = salario * 1.10;
                    break;
                case 92:
                    novoSalario = salario * 1.20;
                    break;
                case 93:
                    novoSalario = salario * 1.30;
                    break;
                default:
                    novoSalario = salario * 1.355;
                    break;
            }
            
            double diferenca = novoSalario - salario;
            
            JOptionPane.showMessageDialog(null, "Salário antigo: R$" + salario + 
                    "\nNovo salário: R$" + novoSalario + 
                    "\nDiferença: R$" + diferenca);
        }
    }  
}



    
    

