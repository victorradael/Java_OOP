import java.applet.Applet;

import javax.swing.JOptionPane;

public class Exercicio12 extends Applet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init() {
		super.init();
		String catetoOposto = JOptionPane.showInputDialog(null, "Digite o valor do Cateto Oposto: ");
		double catetoOpostoDouble = Double.parseDouble(catetoOposto);
		String catetoAdjacente = JOptionPane.showInputDialog(null, "Digite o valor do Cateto Adjacente: ");
		double catetoAdjacenteDouble = Double.parseDouble(catetoAdjacente);

		JOptionPane.showMessageDialog(null,
				"Valor da Hipotenusa: " + hipotenusa(catetoOpostoDouble, catetoAdjacenteDouble));
	}

	public static double hipotenusa(double catop, double catad) {
		double hipotenusa = Math.sqrt((catop * catop) + (catad * catad));

		return hipotenusa;
	}

}