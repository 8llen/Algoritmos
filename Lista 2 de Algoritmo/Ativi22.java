
package ativi22;

import javax.swing.JOptionPane;

public class Ativi22 {

   
    public static void main(String[] args) {
        
        int idAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de identificação do aluno:"));
        
        double X1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        double X2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        double X3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
        double ME = Double.parseDouble(JOptionPane.showInputDialog("Digite a média dos exercícios:"));

       
        double MA = (X1 + 2 * X2 + 3 * X3 + ME) / 7;

        
        String conceito;
        if (MA >= 9.0) {
            conceito = "A";
        } else if (MA >= 7.5) {
            conceito = "B";
        } else if (MA >= 6.0) {
            conceito = "C";
        } else if (MA >= 4.0) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        
        String status = (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) ? "APROVADO" : "REPROVADO";

        String resultado = "Número do aluno: " + idAluno + "\n"
                         + "Notas: " + X1 + ", " + X2 + ", " + X3 + "\n"
                         + "Média dos exercícios: " + ME + "\n"
                         + "Média de Aproveitamento: " + String.format("%.2f", MA) + "\n"
                         + "Conceito: " + conceito + "\n"
                         + "Situação: " + status;

        JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}