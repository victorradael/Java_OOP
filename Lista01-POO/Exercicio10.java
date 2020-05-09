import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exercicio10 extends JFrame {
	/**
	 *
	 */
	private static final long serialVersionUID = -7251333871967374441L;

	public void init() {

		final String parametroa = JOptionPane.showInputDialog(null, "Digite o par�metro A da equa��o:");
		final double paraa = Double.parseDouble(parametroa);
		final String parametrob = JOptionPane.showInputDialog(null, "Digite o par�metro B da equa��o:");
		final double parab = Double.parseDouble(parametrob);
		final String parametroc = JOptionPane.showInputDialog(null, "Digite o par�metro C da equa��o:");
		final double parac = Double.parseDouble(parametroc);
		final double baskara = (parab * parab) - (4 * paraa * parac);

		if (baskara < 0) {
			JOptionPane.showMessageDialog(null, "Essa equa��o n�o possui x1 e x2");
			System.exit(0);
		}
		final double x1 = (-parab) - (Math.sqrt(baskara)) / (-2 * (paraa));
		final double x2 = (-parab) + (Math.sqrt(baskara)) / (-2 * (paraa));
		JOptionPane.showMessageDialog(null, "Os valores s�o:\nx1 = " + x1 + "\nx2 = " + x2);
	}

}