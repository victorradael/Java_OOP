import java.applet.Applet;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Exercicio20 extends Applet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static int[] retornavetor(int matriz[][]) {

		int vetor[] = { 0, 0, 0 };
		for (int i = 0; i < 3; i++) {
			vetor[i] = matriz[0][i];

		}
		return vetor;
	}

	public static int diagonalprincipal(int matriz[][]) {
		int digprincipal = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j > i) {
					digprincipal += matriz[i][j];
				}
			}
		}
		return digprincipal;
	}

	public void init() {
		super.init();
		String recebevalor = "";
		int matriz[][] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		for (int k = 0; k < 3; k++) {
			for (int k2 = 0; k2 < 3; k2++) {
				recebevalor = JOptionPane.showInputDialog(null, "Digite o elemento " + k + " " + k2 + " da matriz.");
				int valorint = Integer.parseInt(recebevalor);
				matriz[k][k2] = valorint;
			}
		}
		UIManager.put("OptionPane.yesButtonText", "Soma da Dos N�meros Acima da Diagonal Principal.");
		UIManager.put("OptionPane.noButtonText", "Primeira Linha da Matriz");
		int opcao = JOptionPane.showConfirmDialog(null, "O que voc� deseja saber?");
		String impress = "";
		if (opcao == 0) {
			JOptionPane.showMessageDialog(null, diagonalprincipal(matriz));

		} else {
			for (int i = 0; i < 3; i++) {
				impress += retornavetor(matriz)[i] + ", ";
			}
			JOptionPane.showMessageDialog(null, impress);
		}
	}
}
