import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exercicio9 extends JFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public void init() {

		int opcao = 0;

		while (opcao == 0) {
			final String combustivel = JOptionPane.showInputDialog(null,
					"Digite quanto de combust�vel foi colocado no ve�culo" + "na medida litros(L):");
			final float combint = Float.parseFloat(combustivel);
			final String quilometragem = JOptionPane.showInputDialog(null,
					"Digite quantos Quilometro foram percorridos(Km):");
			final float quiloint = Float.parseFloat(quilometragem);
			JOptionPane.showMessageDialog(null, "Seu ve�culo faz " + quiloint / combint + " Km/L");
			opcao = JOptionPane.showConfirmDialog(null, "Gostaria de usar o aplicativo novamente?");
		}
	}
}