import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {
		String quantidade_linhas = JOptionPane.showInputDialog(null, "Digite quantas linhas de * deseja:");
		int linhasint = Integer.parseInt(quantidade_linhas);
		String asterisco = "******";
		String show = " ";
		for (int i = 0; i < linhasint; i++) {
			show += asterisco;
			show += "\n";

		}
		JOptionPane.showMessageDialog(null, "Aqui esta(�o) a(s) " + linhasint + " linha(s):\n" + show);
	}

}