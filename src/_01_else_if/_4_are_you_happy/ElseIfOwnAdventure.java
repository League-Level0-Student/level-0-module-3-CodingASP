
package _01_else_if._4_are_you_happy;


import javax.swing.JOptionPane;

public class ElseIfOwnAdventure {

	public static void main(String[] args) {
			String aws = JOptionPane.showInputDialog("Are you happy?");
			if(aws.equals ("yes")) {
				
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}
			if(aws.equals ("no")) {
				String aws2 = JOptionPane.showInputDialog(null, "Do you want to be happy?");
				if(aws2.equals ("no")) {
					JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
				}else {
					JOptionPane.showMessageDialog(null, "Change something");
				}

			}
			
}
}


