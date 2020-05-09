import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String[] args) {
		String numero_first = JOptionPane.showInputDialog(null, "Digite o n�mero que deseja saber o somat�rio:");
		int numeroint = Integer.parseInt(numero_first);
		int somatorio = 0;
		for (int i = 0; i < numeroint + 1; i++) {
			somatorio += i;

		}
		JOptionPane.showMessageDialog(null, "O somat�rio de " + numeroint + " �:\n " + somatorio);
	}
}
