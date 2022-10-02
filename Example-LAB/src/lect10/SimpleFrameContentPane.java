package lect10;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class SimpleFrameContentPane {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Simple JFrame");
		frame.setLocation(100, 100);
		frame.setPreferredSize(new Dimension(500, 500));
		frame.getContentPane().setPreferredSize(new Dimension(700, 700));
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setBounds(100, 100, 800, 800);
		frame.pack();
		frame.setVisible(true);
		
	}

}
