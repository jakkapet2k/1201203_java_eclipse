package lect10;

import java.awt.Color;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;


public class SimpleFrameContentPane2 {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Simple JFrame");
		frame.setLocation(100, 100);
		frame.setBackground(Color.BLACK);
		frame.setPreferredSize(new Dimension(500, 300));
		
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.CYAN);
		
		JLabel label = new JLabel(" My Label ");
		int width = label.getPreferredSize().width;
		int height = label.getPreferredSize().height;
		label.setBounds(10, 10, width, height);
		frame.getContentPane().add(label);
		
		JTextField textField = new JTextField(20);
		width = textField.getPreferredSize().width;
		height = textField.getPreferredSize().height;
		textField.setBounds(200, 10, width, height);
		frame.getContentPane().add(textField);
		
		JButton button = new JButton("My Button");
		button.setBounds(50, 50, 100, 50);
		frame.getContentPane().add(button);
		
		frame.pack();
		frame.setVisible(true);
		
	}

}
