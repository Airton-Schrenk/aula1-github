package course;
import javax.swing.JOptionPane;
public class CalculoPenII {

	public static void main(String[] args) {
		// TODO 
		float sb, inss, cotaPen, nPen, tipo;
        
        sb = Float.parseFloat(JOptionPane.showInputDialog ("Digite o Sal�rio Benef�cio"));
        inss = Float.parseFloat (JOptionPane.showInputDialog("Digite o teto do INSS"));
        nPen = Float.parseFloat (JOptionPane.showInputDialog("Digite o n�mero de Pensionistas"));
        tipo = Float.parseFloat (JOptionPane.showInputDialog("Digite 1-CotaRedutor; 2-SistemaCota; 3-Integral"));
        
        if(tipo == 1) {
        	cotaPen = (((sb - inss) * 7/100) + inss)/nPen;
        JOptionPane.showMessageDialog(null, "O valor da Cota Pens�o = "+ cotaPen,"Cota Pens�o", JOptionPane.WARNING_MESSAGE);
	    }else if(tipo == 2) {
	    	cotaPen = (sb * ((float)0.45 + (float)0.05 * nPen))/nPen;
	    JOptionPane.showMessageDialog(null, "O valor da cota Pens�o = "+ cotaPen, "Cota Pens�o", JOptionPane.WARNING_MESSAGE);
	    }else if(tipo == 3){
	    	cotaPen = (sb / nPen);
	    JOptionPane.showMessageDialog(null, "O valor da cota Pens�o = "+ cotaPen, "Cota Pens�o", JOptionPane.WARNING_MESSAGE);
	    }
	}
        

}