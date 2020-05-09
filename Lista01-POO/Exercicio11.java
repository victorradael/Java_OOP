import javax.swing.JOptionPane;

public class Exercicio11 {
	public static void main(String[] args) {
		float valores[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < 10; i++) {

			String valor1 = JOptionPane.showInputDialog(null, "Digite o valor " + (i + 1) + " :");
			float fvalor1 = Float.parseFloat(valor1);
			valores[i] = fvalor1;

		}
		String cont = " ";
		for (int i = 9; i >= 0; i--) {
			cont = cont + valores[i] + ", ";

		}
		JOptionPane.showMessageDialog(null, cont);
		int opcao = JOptionPane.showConfirmDialog(null,
				"Gostaria de Saber o maior n�mero, o menor n�mero e " + "a m�dia dos n�meros digitados?");
		float soma = 0;
		float maiorab = valores[0];
		float menorab = valores[0];
		if (opcao == 0) {
			for (int i = 0; i < 10; i++) {
				soma += valores[i];
				if (valores[i] > maiorab) {
					maiorab = valores[i];
				}
				if (valores[i] < menorab) {
					menorab = valores[i];
				}

			}
			JOptionPane.showMessageDialog(null, "A m�dia dos valores digitados �: " + (soma / 10)
					+ "\nO maior valor é: " + maiorab + "\nO menor valor é: " + menorab);
		}

	}

}