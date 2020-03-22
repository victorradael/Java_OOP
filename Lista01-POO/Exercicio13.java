import java.applet.Applet;
import java.awt.Graphics;

public class Exercicio13 extends Applet {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		super.paint(g);
		for (int i = 0; i < 10; i++) {

			g.drawOval(50 + (10 * i), 50, 150, 150);
		}
	}

}