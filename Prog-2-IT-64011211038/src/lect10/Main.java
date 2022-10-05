package lect10;

import javax.swing.JFrame;

public class Main {

	
	private static void menuShowGUI() {
		JFrame frame = new JFrame("GOODS");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new MainMenu(frame));   
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		
		System.out.println("Start Lect10 Main");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				menuShowGUI();
			}
		});
		
	}
}
