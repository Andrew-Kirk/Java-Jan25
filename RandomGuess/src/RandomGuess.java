//Andrew Kirk 1/16/25 Random Guessing Game Assignment
import javax.swing.JOptionPane;

public class RandomGuess {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Think of a random number between 1 and 10!");
		JOptionPane.showMessageDialog(null,"The number is "+

		(1 + (int)(Math.random() * 10)));

	}

}
