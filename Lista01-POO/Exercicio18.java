import javax.swing.JOptionPane;

public class Exercicio18 {
	public static void main(String[] args) {

		int vetorale[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String impress = "";
		for (int i = 0; i < 10; i++) {
			vetorale[i] = (int) (Math.random() * 101);

		}
		String opcao = JOptionPane.showInputDialog(null, "Tente acertar o n�mero de 1 � 100");
		int opcaoint = Integer.parseInt(opcao);
		for (int i = 0; i < 10; i++) {
			impress += vetorale[i] + " ,";

			if (opcaoint == vetorale[i]) {
				JOptionPane.showMessageDialog(null, "Parab�ns!!! Voc� acertou.");
				System.exit(0);

			}
		}
		JOptionPane.showMessageDialog(null, "Tente novamente mais tarde.\n ASequ�ncia era: " + impress);
	}
}
