import javax.swing.JOptionPane;

public class Exercicio7 {
	public static void main(final String[] args) {
		final String linhas = JOptionPane.showInputDialog(null, "Digite o tamanho da pir�mide de *:");
		final int linhasint = Integer.parseInt(linhas);
		String piramide = "";
		for (int i = 0; i <= linhasint; i++) {
			for (int j = 0; j < i; j++) {
				piramide += "*";
			}
			piramide += "\n";

		}
		JOptionPane.showMessageDialog(null, "Aqui est� sua piramide de " + linhasint + " linhas:\n" + piramide);
	}

}
