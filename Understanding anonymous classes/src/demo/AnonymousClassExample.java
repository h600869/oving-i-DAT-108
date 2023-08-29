package demo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClassExample {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Anonymous Class Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a JButton (button)
        JButton button = new JButton("Click Me!");
        
        // Add an ActionListener using an anonymous class
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Button Clicked!");
            }
        });
        
        // Add the button to the frame's content pane
        frame.getContentPane().add(button);
        
        // Set the size and make the frame visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
