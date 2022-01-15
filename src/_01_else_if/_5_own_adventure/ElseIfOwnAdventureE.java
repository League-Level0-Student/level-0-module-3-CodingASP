
package _01_else_if._5_own_adventure;


import javax.swing.JOptionPane;

public class ElseIfOwnAdventureE {

	public static void main(String[] args) {
			String aws = JOptionPane.showInputDialog("Would you rather die now or die later");
			if(aws.equals ("now")) {
				
				JOptionPane.showMessageDialog(null, "I got you");
			}
			if(aws.equals ("later")) {
				String aws2 = JOptionPane.showInputDialog(null, "Are you sure about that?");
				if(aws2.equals ("no")) {
					JOptionPane.showMessageDialog(null, "I can help you with that.");
				}else {
					JOptionPane.showMessageDialog(null, "Come see later.");
				}

			}
			
}
}


