import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		String numero1 = JOptionPane.showInputDialog(null, "Digite um n�mero:");
		String numero2 = JOptionPane.showInputDialog(null, "Digite outro n�mero:");
		float intnumero1 = Float.parseFloat(numero1);
		float intnumero2 = Float.parseFloat(numero2);
		JOptionPane.showMessageDialog(null,
				"Soma " + (intnumero1 + intnumero2) + "\nSubtra��o " + (intnumero1 - intnumero2) + "\nMultiplica��o "
						+ (intnumero1 * intnumero2) + "\nDivis�o " + (intnumero1 / intnumero2));

	}
}
