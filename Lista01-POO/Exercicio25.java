import java.applet.Applet;

import javax.swing.JOptionPane;

public class Exercicio25 extends Applet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static double quadrado(double lado) {
		double areaquadrado = lado * lado;
		return areaquadrado;

	}

	public static double retangulo(double lado, double base) {
		double arearetangulo = lado * base;
		return arearetangulo;

	}

	public static double triangulo(double base, double altura) {
		double areatriangulo = (base * altura) / 2;
		return areatriangulo;

	}

	public static double circulo(double raio) {
		double areacirculo = Math.PI * (raio * raio);
		return areacirculo;

	}

	@Override
	public void init() {

		super.init();
		String opcao = JOptionPane.showInputDialog(null,
				"Escolha a �rea do que deseja calcular:\n1-Quadrado" + "\n2-Ret�ngulo\n3-Tri�ngulo\n4-C�rculo");
		int opcaoi = Integer.parseInt(opcao);
		switch (opcaoi) {
			case 1:
				String lado = JOptionPane.showInputDialog(null, "Digite o tamnho do lado:");
				double ladoi = Double.parseDouble(lado);
				JOptionPane.showMessageDialog(null, "Area = " + quadrado(ladoi));
				break;
			case 2:
				lado = JOptionPane.showInputDialog(null, "Digite o tamnho do lado:");
				ladoi = Double.parseDouble(lado);
				String base = JOptionPane.showInputDialog(null, "Digite o tamnho do lado:");
				double basei = Double.parseDouble(base);
				JOptionPane.showMessageDialog(null, "Area = " + retangulo(ladoi, basei));
				break;
			case 3:
				String altura = JOptionPane.showInputDialog(null, "Digite o tamnho do lado:");
				double alturai = Double.parseDouble(altura);
				base = JOptionPane.showInputDialog(null, "Digite o tamnho do lado:");
				basei = Double.parseDouble(base);
				JOptionPane.showMessageDialog(null, "Area = " + triangulo(basei, alturai));
				break;
			case 4:
				String raio = JOptionPane.showInputDialog(null, "Digite o tamnho do lado:");
				double raioi = Double.parseDouble(raio);
				JOptionPane.showMessageDialog(null, "Area = " + circulo(raioi));
				break;

			default:
				JOptionPane.showMessageDialog(null, "ERRO!!! DIGITE DE 1 a 4");
				break;
		}
	}

}
