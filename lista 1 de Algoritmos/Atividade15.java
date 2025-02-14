
package atividadehelio;

import javax.swing.JOptionPane;

public class Atividadehelio {

    
    public static void main(String[] args) {
        
   //TESTE DE MESA     
//Variável	Valor Inicial	      Após Entrada de Dados	   Cálculo Conta Rachada	Cálculo Centavos	Cálculo Felipe	         Valor Final
//s_conta	-	 "101.53"	             -	                           -	                       -	             -                      "101.53"
//conta	-	  101.53	             -	                           -	                       -	             -                      101.53
//conta_rachada	    -	                     -	                   101.53 / 3 = 33.8433	               -	             -	                   33.8433
//carlos_andré	    -	                     -	                           -	               (int)33.8433 = 33	     -	                      33
//centavos	    -	                     -	                           -	             33.8433 - 33 = 0.8433	     -	                    0.8433
//felipe	            -	                     -	                           -	                       -	      33 + 3 * 0.8433	           35.5299 (35.53 arredondado)
        
        int carlos_andré;
        double conta, conta_rachada, centavos, felipe;
        String sconta;

        sconta = JOptionPane.showInputDialog(null, "qual o resultado da conta?");
        conta = Double.parseDouble(sconta); 

        conta_rachada = conta / 3;
        carlos_andré = (int)conta_rachada;
        centavos = conta_rachada - carlos_andré;
        felipe = carlos_andré + 3 * centavos;
        
        JOptionPane.showMessageDialog(null, "Carlos: " + carlos_andré + ", André: " + carlos_andré + ", Felipe: " + felipe);
        
    }
    
}
