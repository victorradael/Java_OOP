import javax.swing.JOptionPane;

public class Exercicio22 {
	public static void main(String[] args) {
		int opcao = 0;
		String impress = "";
		while (opcao == 0) {

			int megasena[] = { 1, 2, 3, 4, 5, 6 };

			for (int i = 0; i < 6; i++) {
				megasena[i] = (int) ((Math.random() * 60) + 1);
				impress += megasena[i] + " ";

			}
			JOptionPane.showMessageDialog(null, "Tente a Sorte\n" + impress);
			opcao = JOptionPane.showConfirmDialog(null, "Gostaria de uma nova sequ�ncia?");
			impress = "";

		}

	}

}
