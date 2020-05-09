import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog(null, "Digite o n�mero de quadrados que deseja");
		int quad = Integer.parseInt(valor);
		String valorquad = "";
		for (int i = 0; i < quad + 1; i++) {
			int quadrado = i * i;
			valorquad += quadrado;
			valorquad += "\n";

		}
		JOptionPane.showMessageDialog(null, "Os quadrados s�o:\n" + valorquad);
	}

}
