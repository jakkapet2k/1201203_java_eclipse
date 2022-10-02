package lect10;

import java.awt.Dimension;

import javax.swing.JFrame;

public class SimpleFrame {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Simple JFrame");
		frame.setLocation(100, 100);
		frame.setPreferredSize(new Dimension(500, 500));
		frame.pack();
		frame.setVisible(true);
		
	}

}
