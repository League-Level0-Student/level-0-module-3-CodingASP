
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;
public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.penDown();
		rob.setSpeed(10);
		rob.setPenWidth(10);

		while (true) {
			
			int count = 1;
			while ( count < 5 ) {
				rob.move(40);
				rob.turn(90);
				count += 1;
			}
		
			//3. Set the pen width to 10
			//4. Ask the user what color pen they would like the robot to draw with
			String color = JOptionPane.showInputDialog(null, "What color would you like the pen to be; Red, Blue, or Green?");
			//5. Use an if/else statement to set the pen color that the user requested
			if (color.equalsIgnoreCase("Red")) {
				rob.setPenColor(Color.red);
			}
			if (color.equalsIgnoreCase("Blue")) {
				rob.setPenColor(Color.blue);
			}
			if (color.equalsIgnoreCase("Green")) {
				rob.setPenColor(Color.green);
			}
	        //6. If the user doesn't enter anything, choose a random color
			
	        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
			
		}
		



	}
}
