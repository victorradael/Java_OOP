import java.applet.Applet;

import javax.swing.JOptionPane;

public class Exercicio21 extends Applet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init() {

		super.init();
		int vetorale[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		int vetormulti[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		String impress = "";
		String impressoriginal = "";
		int opcao = 0;
		for (int i = 0; i < 15; i++) {
			vetorale[i] = (int) (Math.random() * 10);
		}
		String numeroN = "";
		while (opcao == 0) {
			numeroN = JOptionPane.showInputDialog(null, "Digite um n�mero qualquer:");
			int numeroint = Integer.parseInt(numeroN);

			for (int i = 0; i < 15; i++) {
				vetormulti[i] = vetorale[i] * numeroint;
				impress += vetormulti[i] + " ";
				impressoriginal += vetorale[i] + " ";
			}
			JOptionPane.showMessageDialog(null,
					"Vetor aleat�rio:\n" + impressoriginal + "\nVetor Multiplicado por " + numeroint + "\n" + impress);
			opcao = JOptionPane.showConfirmDialog(null, "Deseja fazer com outro n�mero?");
			if (opcao == 0) {
				impress = "";
				impressoriginal = "";

			}
		}
	}
}
