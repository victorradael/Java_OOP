import java.applet.Applet;

import javax.swing.JOptionPane;

public class Exercicio15 extends Applet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init() {

		super.init();
		int aleatorio = (int) (Math.random() * 10) + 1;
		String palpite = JOptionPane.showInputDialog(null, "TENTE A SORTE! DIGITE UM N�MERO E VEJA SE � O GANHADOR:");
		int intpal = Integer.parseInt(palpite);
		if (intpal == aleatorio) {
			JOptionPane.showMessageDialog(null, "PARAB�NS VOC� ACERTOU!");
		}

		else {
			JOptionPane.showMessageDialog(null, "!!!Voc� errou, e pegou v�rus no PC, tente novamente "
					+ "se n�o derreter o processador!!! \nO N�mero era: " + aleatorio);
		}
		System.exit(0);
	}

}
