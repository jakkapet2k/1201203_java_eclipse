package summer;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SwingFormDemo {
	public static void buttonPressed(String strId) {
		System.out.println("strId:" + strId);
		try {
			int id = Integer.parseInt(strId);
			System.out.println("id:" + id);
		} catch(NumberFormatException ex) {
			ex.printStackTrace();
		}
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("SwingFormDemo");
		
		frame.getContentPane().setPreferredSize(new Dimension(500, 200));
		frame.getContentPane().setLayout(null);
		
		JLabel lbId = new JLabel("รหัสประจำตัว");
		lbId.setBounds(50, 50, lbId.getPreferredSize().width, 
				lbId.getPreferredSize().height);
		frame.getContentPane().add(lbId);
		JTextField txId =  new JTextField(11);
		txId.setBounds(150, 50, txId.getPreferredSize().width, 
				txId.getPreferredSize().height);
		frame.getContentPane().add(txId);
		JButton btSubmit = new JButton("ตกลง");
		btSubmit.setBounds(50, 150, btSubmit.getPreferredSize().width, 
				btSubmit.getPreferredSize().height);
		frame.getContentPane().add(btSubmit);
		btSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				buttonPressed(txId.getText());
			}		
		});
		frame.pack();
		frame.setVisible(true);
	}
}