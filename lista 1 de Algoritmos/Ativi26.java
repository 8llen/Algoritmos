
package ativi26;

import javax.swing.JOptionPane;

public class Ativi26 {

   
    public static void main(String[] args) {
        /*
        VAR
  nome1, nome2, nome3: CARACTER
  pontos1, pontos2, pontos3: INTEIRO
  totalPontos: INTEIRO
  premio1, premio2, premio3: REAL

INICIO
  ESCREVA("Digite o nome do 1º colocado: ")
  LEIA(nome1)
  ESCREVA("Digite os pontos do 1º colocado: ")
  LEIA(pontos1)

  ESCREVA("Digite o nome do 2º colocado: ")
  LEIA(nome2)
  ESCREVA("Digite os pontos do 2º colocado: ")
  LEIA(pontos2)

  ESCREVA("Digite o nome do 3º colocado: ")
  LEIA(nome3)
  ESCREVA("Digite os pontos do 3º colocado: ")
  LEIA(pontos3)

  totalPontos <- pontos1 + pontos2 + pontos3
  premio1 <- pontos1 / totalPontos * 500000
  premio2 <- pontos2 / totalPontos * 500000
  premio3 <- pontos3 / totalPontos * 500000

  ESCREVA("Prêmio do 1º colocado (" + nome1 + "): R$" + FORMATA(premio1, 2))
  ESCREVA("Prêmio do 2º colocado (" + nome2 + "): R$" + FORMATA(premio2, 2))
  ESCREVA("Prêmio do 3º colocado (" + nome3 + "): R$" + FORMATA(premio3, 2))
FIM


Teste de Mesa:

| Nome | Pontos |
| --- | --- |
| João | 100 |
| Maria | 80 |
| Pedro | 60 |

| Nome | Prêmio |
| --- | --- |
| João | R$ 250.000,00 |
| Maria | R$ 200.000,00 |
| Pedro | R$ 150.000,00 |

        */
        String nome1 = JOptionPane.showInputDialog("Digite o nome do 1º colocado:");
        int pontos1 = Integer.parseInt(JOptionPane.showInputDialog("Digite os pontos do 1º colocado:"));

        String nome2 = JOptionPane.showInputDialog("Digite o nome do 2º colocado:");
        int pontos2 = Integer.parseInt(JOptionPane.showInputDialog("Digite os pontos do 2º colocado:"));

        String nome3 = JOptionPane.showInputDialog("Digite o nome do 3º colocado:");
        int pontos3 = Integer.parseInt(JOptionPane.showInputDialog("Digite os pontos do 3º colocado:"));

        int totalPontos = pontos1 + pontos2 + pontos3;
        double premio1 = (double) pontos1 / totalPontos * 500000;
        double premio2 = (double) pontos2 / totalPontos * 500000;
        double premio3 = (double) pontos3 / totalPontos * 500000;

        JOptionPane.showMessageDialog(null, "Prêmio do 1º colocado (" + nome1 + "): R$" + String.format("%.2f", premio1));
        JOptionPane.showMessageDialog(null, "Prêmio do 2º colocado (" + nome2 + "): R$" + String.format("%.2f", premio2));
        JOptionPane.showMessageDialog(null, "Prêmio do 3º colocado (" + nome3 + "): R$" + String.format("%.2f", premio3));
    }
    
}
