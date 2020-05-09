import java.applet.Applet;

import javax.swing.JOptionPane;

public class Exercicio23 extends Applet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static boolean perfeitaMENTE(int abusada) {
		int divisores = 0;
		for (int i = 1; i <= (abusada / 2); i++) {
			if (abusada % i == 0) {
				divisores += i;

			}

		}
		if (divisores == abusada) {
			return true;

		} else {
			return false;
		}
	}

	@Override
	public void init() {

		super.init();
		String perfeitos = "";
		for (int i = 1; i < 1001; i++) {
			if (perfeitaMENTE(i)) {
				perfeitos += i + ", ";

			}

		}
		JOptionPane.showMessageDialog(null, "Os n�meros perfeitos de 1 at� 1000 s�o:\n" + perfeitos);

	}

}
