import java.applet.Applet;

import javax.swing.JOptionPane;

public class Exercicio27 extends Applet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static int quoint(int a, int b) {
		return a / b;

	}

	public static int intint(int a, int b) {
		return a % b;
	}

	@Override
	public void init() {

		super.init();
		String valor1 = JOptionPane.showInputDialog(null, "Digite um valor de 1 a 99999:");
		int a = Integer.parseInt(valor1);
		String linha = "";
		for (int i = valor1.length(); i > 0; i--) {
			linha += quoint(a, (int) Math.pow(10, i - 1)) + "  ";
			a = intint(a, (int) Math.pow(10, i - 1));

		}
		JOptionPane.showMessageDialog(null, "N�mero gerado foi: " + linha);

	}

}