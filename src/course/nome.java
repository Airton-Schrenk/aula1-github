package course;
import javax.swing.JOptionPane;

public class nome {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String sobreNome = JOptionPane.showInputDialog("Digite o sobrenome: ");
         
        String nomeCompleto = nome + " " + sobreNome;
     
        JOptionPane.showMessageDialog(null, "Nome Completo: "+nomeCompleto,"Informação",JOptionPane.INFORMATION_MESSAGE);
 /*
Abaixo são mostrados alguns dos componentes mais usados:

JLabel -       Exibe texto não editável ou ícones.
JTextField –   Insere dados do teclado e serve também para exibição do texto editável ou não editável.
JButton –      Libera um evento quando o usuário clicar nele com o mouse.
JCheckBox –    Especifica uma opção que pode ser ou não selecionada.
JComboBox –    Fornece uma lista de itens onde possibilita o usuário selecionar um item ou digitar para procurar.
JList –        Lista de itens onde pode ser selecionado vários itens.
JPanel –       É a área onde abriga e organiza os componentes inseridos.
*/

	}

}
