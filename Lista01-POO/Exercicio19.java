import java.applet.Applet;

import javax.swing.JOptionPane;

public class Exercicio19 extends Applet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static int recebemat(int mat[][]) {
		int maior = mat[0][0];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				if (mat[i][j] > maior) {
					maior = mat[i][j];
				}
			}
		}
		return maior;
	}

	@Override
	public void init() {

		super.init();
		int mat[][] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				String valor = JOptionPane.showInputDialog(null, "Digite o valor da posi��o " + i + " " + j);
				int valori = Integer.parseInt(valor);
				mat[i][j] = valori;

			}

		}
		JOptionPane.showMessageDialog(null, "O maior � : " + recebemat(mat));

	}

}
