package lect10;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;


public class SimpleFrameContentPane3 implements ActionListener {
	
	private static final String BUTTON_STR = "My Button";
	static JTextField textField;
	
	public SimpleFrameContentPane3() {
		
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
		
		textField = new JTextField(20);
		width = textField.getPreferredSize().width;
		height = textField.getPreferredSize().height;
		textField.setBounds(200, 10, width, height);
		frame.getContentPane().add(textField);
		
		JButton button = new JButton(BUTTON_STR);
		button.setBounds(50, 50, 100, 50);
		button.addActionListener(this);
		frame.getContentPane().add(button);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {

		new SimpleFrameContentPane3();
		
	}
	
	public void actionPerformed(ActionEvent evt) {
		String actionCommand = evt.getActionCommand();
		System.out.println("actionCommand:" + actionCommand);
		if(actionCommand.equals(BUTTON_STR)) {
			System.out.println("equals:" + BUTTON_STR);
			String text = textField.getText();
			System.out.println("text:" + text);
		}
	}

}
