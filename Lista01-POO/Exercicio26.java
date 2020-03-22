import java.applet.Applet;

import javax.swing.JOptionPane;

public class Exercicio26 extends Applet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static double calculaIMC(double peso, double altura) {
		double IMC = peso / (altura * altura);
		return IMC;
	}

	@Override
	public void init() {

		super.init();
		int opcao = 0;
		double peso = 0;
		double altura = 0;
		double IMC = 0;
		while (opcao == 0) {
			String pe = JOptionPane.showInputDialog(null, "Digite seu peso :");
			peso = Double.parseDouble(pe);
			String al = JOptionPane.showInputDialog(null, "Digite sua altura :");
			altura = Double.parseDouble(al);

			IMC = calculaIMC(peso, altura);
			if (IMC < 18.5) {
				JOptionPane.showMessageDialog(null,
						"Seu IMC � " + calculaIMC(peso, altura) + " Voc� est� abaixo do peso.");
			}
			if (IMC > 18.5 && IMC < 23.5) {
				JOptionPane.showMessageDialog(null, "Seu IMC � " + calculaIMC(peso, altura) + " Voc� est� no padr�o.");
			}
			if (IMC > 23.5) {
				JOptionPane.showMessageDialog(null,
						"Seu IMC � " + calculaIMC(peso, altura) + " Voc� est� acima do peso.");
			}
			opcao = JOptionPane.showConfirmDialog(null, "Gostaria de refazer o c�lculo?");
			IMC = 0;

		}
	}

}
