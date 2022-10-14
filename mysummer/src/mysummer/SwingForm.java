package mysummer;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingForm extends JDialog implements ActionListener {

	private static final String test = "test";

	private static final String bt_str = "Submit";

	public static void main(String[] arg) {
		JFrame frame = new JFrame("SwingFrom");

		frame.getContentPane().setPreferredSize(new Dimension(500, 200));
		frame.getContentPane().setLayout(null);

		JLabel lbId = new JLabel("Student ID");
		lbId.setBounds(50, 50, lbId.getPreferredSize().width, lbId.getPreferredSize().height);
		frame.getContentPane().add(lbId);

		JLabel lbout = new JLabel("s");
		lbout.setBounds(60, 60, lbout.getPreferredSize().width, lbout.getPreferredSize().height);
		frame.getContentPane().add(lbId);

		SwingForm textId = new JTextField(11);
		textId.setBounds(150, 50, textId.getPreferredSize().width, textId.getPreferredSize().height);
		frame.getContentPane().add(textId);

		JButton btSubmit = new JButton(test);
		btSubmit.setBounds(50, 150, btSubmit.getPreferredSize().width, btSubmit.getPreferredSize().height);
		frame.getContentPane().add(btSubmit);

		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		String acionCommand = evt.getActionCommand();
		if (acionCommand.equals(test)) {
			System.out.println("actionCommand : " + test);
				String dataShow = textId.getText();
				Swingtest2 sho = new Swingtest2(dataShow);


		}

	}


}
