package course;
import javax.swing.JOptionPane;
public class SaidavaloresInteiros {

	public static void main(String[] args) throws NumberFormatException{
		int valorA = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor A: "));
        int valorB = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor B: "));
         
        int resultado = valorA * valorB;
         
        JOptionPane.showMessageDialog(null,"Resultado final: "+resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);

	}

}
