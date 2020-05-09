import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "Digite seu nome: ");
		String age = JOptionPane.showInputDialog(null, "Digite sua idade: ");
		int idade = Integer.parseInt(age);
		JOptionPane.showMessageDialog(null, name + " , Sua idade � :  " + idade);
	}

}
