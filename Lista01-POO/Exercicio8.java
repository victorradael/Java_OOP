import javax.swing.JOptionPane;

public class Exercicio8 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Esse programa far� a m�dia salarial dos funcion�rios,"
				+ " digite os sal�rios, quando acabar digite (-1)");
		String salario = "0";
		int salariovalor = Integer.parseInt(salario);
		int totalsalarial = 0;
		int funcionarios = 0;

		while (salariovalor != -1) {
			salario = JOptionPane.showInputDialog(null, "Digite o salario: ");
			salariovalor = Integer.parseInt(salario);
			JOptionPane.showMessageDialog(null, "Quando acabar digite (-1)");
			if (salariovalor != -1) {
				totalsalarial += salariovalor;
				funcionarios++;

			}

		}
		JOptionPane.showMessageDialog(null,
				"A Media salarial dos funcion�rios �:\nR$ " + totalsalarial / funcionarios + ",00");
	}
}
