import java.applet.Applet;

import javax.swing.JOptionPane;

public class Exercicio24 extends Applet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init() {

		super.init();
		String voceescolhe = "";
		int opcao = 0;
		int fatorial = 1;
		while (opcao == 0) {
			voceescolhe = JOptionPane.showInputDialog(null, "Digite o n�mero que deseja calcular o fatorial:");
			int valorint = Integer.parseInt(voceescolhe);
			for (int i = 1; i <= valorint; i++) {
				fatorial = fatorial * i;
			}
			JOptionPane.showMessageDialog(null, "O Fatorial de " + valorint + " �: " + fatorial);
			opcao = JOptionPane.showConfirmDialog(null, "Gostaria de Calcular de outro n�mero?");
			fatorial = 1;

		}
	}
}
