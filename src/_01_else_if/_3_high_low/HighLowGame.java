
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100-1)+1;
		
		// 2. Print out the random variable above
		System.out.print(random);
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
			String aws = JOptionPane.showInputDialog(null, "Guess!");
			// 4. Convert the users™ answer to an int (Integer.parseInt(string))
			int a = Integer.parseInt(aws);
			// 5. if the guess is correct
			if(a == random) {
				JOptionPane.showMessageDialog(null, "Your guess is correct!");
				System.exit(0);
			}
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
			if(a > random) {
				JOptionPane.showMessageDialog(null, "Your guess is too high!");
				System.out.println("You lose! The number was: " + random);
				
			}else if(a < random) {
				JOptionPane.showMessageDialog(null, "Your guess is too low!");
				System.out.println(" You lose! The number was: " + random );
			}
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


