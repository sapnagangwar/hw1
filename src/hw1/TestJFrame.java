package hw1;



import javax.swing.JFrame;

public class TestJFrame {

	public static void main(String[] args) {

		// Construct the JFrame object
		JFrame myWindow = new JFrame();

		// Set the frame's width (400) and height (250) in pixels
		myWindow.setSize(800, 250);

		// Set the frame's title
		myWindow.setTitle("Hello World!!");

		// Set the program to exit when the user closes the frame
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Make the frame visible to the user
		myWindow.setVisible(true);

		return;
	}
}
