import java.applet.Applet;

import javax.swing.JOptionPane;

public class Exercicio17 extends Applet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public int[][] matre(int mat1[][], int mat2[][]) {
		int matre[][] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matre[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		return matre;
	}

	@Override
	public void init() {

		super.init();
		int mat1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int mat2[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		String impress = "";
		int matre2[][] = matre(mat1, mat2);
		for (int k = 0; k < 3; k++) {
			for (int k2 = 0; k2 < 3; k2++) {

				impress += matre2[k][k2] + "  ";

			}
			impress += "\n";

		}

		JOptionPane.showMessageDialog(null, impress);

	}
}
