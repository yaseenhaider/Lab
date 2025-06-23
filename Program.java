import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;

public class Program {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("what is your name");

        frame.setSize(300, 200);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button
        JButton button = new JButton("Click Me!");


        // Add button to frame
        frame.getContentPane().add(button);


        // Make the frame visible
        frame.setVisible(true);


    }
}
