import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		String number1 = JOptionPane.showInputDialog(null, "Digite um n�mero");
		String number2 = JOptionPane.showInputDialog(null, "Digite outro n�mero");
		int intnumber1 = Integer.parseInt(number1);
		int intnumber2 = Integer.parseInt(number2);
		if (intnumber2 > intnumber1) {

			JOptionPane.showMessageDialog(null, "O maior n�mero � " + intnumber2);
		} else {
			JOptionPane.showMessageDialog(null, "O maior n�mero � " + intnumber1);
		}
	}

}
