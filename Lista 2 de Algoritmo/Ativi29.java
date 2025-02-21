
package ativi29;

import javax.swing.JOptionPane;

public class Ativi29 {

    public static void main(String[] args) {
         
        char caractere = JOptionPane.showInputDialog("Digite um caractere maiúsculo:").charAt(0);

        
        String mensagem = verificaCaractere(caractere);

       
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static String verificaCaractere(char caractere) {
        if (Character.isUpperCase(caractere)) {
            switch (caractere) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    return "Vogal";
                default:
                    return "Consoante";
            }
        } else {
            return "Outro";
        }
    }
}

