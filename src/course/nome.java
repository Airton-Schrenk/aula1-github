package course;
import javax.swing.JOptionPane;

public class nome {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String sobreNome = JOptionPane.showInputDialog("Digite o sobrenome: ");
         
        String nomeCompleto = nome + " " + sobreNome;
     
        JOptionPane.showMessageDialog(null, "Nome Completo: "+nomeCompleto,"Informa��o",JOptionPane.INFORMATION_MESSAGE);
 /*
Abaixo s�o mostrados alguns dos componentes mais usados:

JLabel -       Exibe texto n�o edit�vel ou �cones.
JTextField �   Insere dados do teclado e serve tamb�m para exibi��o do texto edit�vel ou n�o edit�vel.
JButton �      Libera um evento quando o usu�rio clicar nele com o mouse.
JCheckBox �    Especifica uma op��o que pode ser ou n�o selecionada.
JComboBox �    Fornece uma lista de itens onde possibilita o usu�rio selecionar um item ou digitar para procurar.
JList �        Lista de itens onde pode ser selecionado v�rios itens.
JPanel �       � a �rea onde abriga e organiza os componentes inseridos.
*/

	}

}
