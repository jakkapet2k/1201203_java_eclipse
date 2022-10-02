package summer;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex3 {
	
	
	public static void buttonPressedSid (String strId) {
		try {
			int id = Integer.parseInt(strId);
			System.out.println("ID : "+ id);
		}catch(NumberFormatException ex){
			ex.printStackTrace();
		}
		
	}
	public static void buttonPressedName (String strname) {
		try {
			String name = strname;
			System.out.println("Name : "+ name);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	public static void buttonPressedSurName (String strsurname) {
		try {
			String surname = strsurname;
			System.out.println("Name : "+ surname);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	public static void buttonPressedMark (String strMark) {
		int mark = 0;
		try {
			 mark = Integer.parseInt(strMark);
			 System.out.println("Mark : "+ mark);
		} catch(NumberFormatException ex) {
			ex.printStackTrace();
		}
		
		char garde = ' ';
		if(mark <=49) {
			garde = 'F';
		}else if (mark <=59) {
			garde = 'D';
		}else if (mark <=69) {
			garde = 'C';
		}else if (mark <=79) {
			garde = 'B';
		}else {
			garde = 'A';
		}
			System.out.println("Gard : "+ Character.toString(garde));
		
		
	}
	

	public static void main(String[] arg) {
		JFrame frame = new JFrame("SwingFrom");
		
		frame.getContentPane().setPreferredSize(new Dimension(500,200));
		frame.getContentPane().setLayout(null);
		JLabel lbId = new JLabel("SID");
		lbId.setBounds(50, 50, lbId.getPreferredSize().width, lbId.getPreferredSize().height);
		frame.getContentPane().add(lbId);
		JLabel name = new JLabel("Name");
		name.setBounds(50, 70, name.getPreferredSize().width, name.getPreferredSize().height);
		frame.getContentPane().add(name);
		JLabel surname = new JLabel("Surname");
		surname.setBounds(50, 90, surname.getPreferredSize().width, surname.getPreferredSize().height);
		frame.getContentPane().add(surname);
		JLabel mark = new JLabel("Mark");
		mark.setBounds(50, 110, mark.getPreferredSize().width, mark.getPreferredSize().height);
		frame.getContentPane().add(mark);
		JTextField textId = new JTextField(11);
		textId.setBounds(150,50, textId.getPreferredSize().width,textId.getPreferredSize().height);
		frame.getContentPane().add(textId);
		JTextField textname = new JTextField(11);
		textname.setBounds(150,70, textname.getPreferredSize().width,textname.getPreferredSize().height);
		frame.getContentPane().add(textname);
		JTextField textsurname = new JTextField(11);
		textsurname.setBounds(150,90, textsurname.getPreferredSize().width,textsurname.getPreferredSize().height);
		frame.getContentPane().add(textsurname);
		JTextField textmark = new JTextField(11);
		textmark.setBounds(150,110, textmark.getPreferredSize().width,textmark.getPreferredSize().height);
		frame.getContentPane().add(textmark);
		JButton btSubmit = new JButton("Submit");
		btSubmit.setBounds(50,150, btSubmit.getPreferredSize().width,btSubmit.getPreferredSize().height);
		frame.getContentPane().add(btSubmit);
		btSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				buttonPressedSid(textId.getText());
				buttonPressedName(textname.getText());
				buttonPressedSurName(textsurname.getText());
				buttonPressedMark(textmark.getText());
			}
		});
		frame.pack();
		frame.setVisible(true);		
	}

}
