package aplication;

import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class CalculadoraPen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int SB = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do Salário Benef: "));
        int nPST = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de Pen: "));
        int tipoPen = Integer.parseInt(JOptionPane.showInputDialog("1-CotaComRedutor; 2-SistCotas; 3-CotaIntegr:"));
        int abateINSS = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor abatimento INSS: "));
	
      if(tipoPen == 1){
        if(SB > 5839.45F){
          float cotaPen = ((((SB - 5839.45F) * 0.7F) + 5839.45F) - abateINSS)/nPST;
          JOptionPane.showMessageDialog(null,"Valor CotaPen EC41: "+cotaPen,"cotaPen",JOptionPane.INFORMATION_MESSAGE);
        }else{ 
          JOptionPane.showMessageDialog(null,"Valor CotaPen EC41: "+SB,"SB",JOptionPane.INFORMATION_MESSAGE);
        }
 	    }else if(tipoPen == 2){
        if(SB > 5839.45F){
        float cotaPen = (SB * (0.45F + (0.05F * nPST))-abateINSS);
        JOptionPane.showMessageDialog(null,"Valor CotaPen Sis: "+cotaPen,"cotaPen",JOptionPane.INFORMATION_MESSAGE);
        }else{
          JOptionPane.showMessageDialog(null,"Valor CotaPen Sistema Cotas: "+SB,"SB",JOptionPane.INFORMATION_MESSAGE);
        }
 	    }else if(tipoPen == 3){
        if(SB > 5839.45F){
        float cotaPen = ((SB / nPST)-abateINSS);
        JOptionPane.showMessageDialog(null,"Valor CotaPen Integral: "+cotaPen,"cotaPen",JOptionPane.INFORMATION_MESSAGE);
 	      }else{
          JOptionPane.showMessageDialog(null,"Valor CotaPen Integral: "+SB,"SB",JOptionPane.INFORMATION_MESSAGE);
        }
      }
	    sc.close();
	}

}
