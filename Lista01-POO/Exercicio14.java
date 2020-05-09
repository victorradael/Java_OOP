import java.applet.Applet;
import java.awt.Graphics;

public class Exercicio14 extends Applet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		super.paint(g);

		g.drawOval((int) (Math.random() * 300) + 1, (int) (Math.random() * 200), 150, 150);
	}

}
