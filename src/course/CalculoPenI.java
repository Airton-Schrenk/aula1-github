package course;
import javax.swing.JOptionPane;
public class CalculoPenI {

	public static void main(String[] args) {
		// TODO 
		float sb, inss, cotaPen;
        
        sb = Float.parseFloat(JOptionPane.showInputDialog ("Digite o Sal�rio Benef�cio"));
        inss = Float.parseFloat (JOptionPane.showInputDialog("Digite o teto do INSS"));
        cotaPen = ((sb - inss) * 7/100) + inss;
         
        JOptionPane.showMessageDialog(null, "O valor da Cota Pens�o = "+ cotaPen,"Cota Pens�o", JOptionPane.WARNING_MESSAGE);
	}

}