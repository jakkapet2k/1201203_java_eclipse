package mysummer;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SwingForm {
	public static void buttonPressed (String strId) {
		System.out.println("strId : " + strId);
		try {
			int id = Integer.parseInt(strId);
			System.out.println("ID : "+ id);
		}catch(NumberFormatException ex){
			ex.printStackTrace();
		}
		
	}
	public static void main(String[] arg) {
		JFrame frame = new JFrame("SwingFrom");
		
		frame.getContentPane().setPreferredSize(new Dimension(500,200));
		frame.getContentPane().setLayout(null);
		
		JLabel lbId = new JLabel("Student ID");
		lbId.setBounds(50, 50, lbId.getPreferredSize().width, lbId.getPreferredSize().height);
		frame.getContentPane().add(lbId);
		
		JTextField textId = new JTextField(11);
		textId.setBounds(150,50, textId.getPreferredSize().width,textId.getPreferredSize().height);
		frame.getContentPane().add(textId);
		
		JButton btSubmit = new JButton("Submit");
		btSubmit.setBounds(50,150, btSubmit.getPreferredSize().width,btSubmit.getPreferredSize().height);
		frame.getContentPane().add(btSubmit);
		
		btSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				buttonPressed(textId.getText());
			}
		});
		frame.pack();
		frame.setVisible(true);		
	}

}
