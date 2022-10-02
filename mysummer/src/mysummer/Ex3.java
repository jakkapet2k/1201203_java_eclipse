package mysummer;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Ex3 {
	
	public static void btnPressedSid (String sid) {
		try {
			int id = Integer.parseInt(sid);
			System.out.println("ID : " + id);
		}catch(NumberFormatException ex ) {
			ex.printStackTrace();
		}
	}

	
	public static void btnPressedName (String strname) {
		try {
			String name = strname;
			System.out.println("Name : " + name);
		}catch(Exception ex ) {
			ex.printStackTrace();
		}
	}
	
	public static void btnPressedSurname (String strsurname) {
		try {
			String surname = strsurname;
			System.out.println("Sername : " + surname);
		}catch(Exception ex ) {
			ex.printStackTrace();
		}
	}
	
	
	public static void btnPressedMark (String strmark) {
		int mark = 0 ;
		try {
			mark = Integer.parseInt(strmark);
			System.out.println("Mark : " + mark);
		}catch(NumberFormatException ex ) {
			ex.printStackTrace();
		}
		
		char grade = ' ';
		if(mark <= 49) {
			grade = 'F';
		}else if(mark <= 59) {
			grade = 'D';
		}else if(mark <= 69) {
			grade = 'C';
		}else if(mark <= 79) {
			grade = 'B';
		}else {
			grade = 'A';
		}
			System.out.println("Grade : " + Character.toString(grade));
		
		
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Swing From");
		frame.getContentPane().setPreferredSize(new Dimension(500,200));
		frame.getContentPane().setLayout(null);
		
		
		JLabel lbid = new JLabel("SID");
		lbid.setBounds(50,50, lbid.getPreferredSize().width,lbid.getPreferredSize().height);
		frame.getContentPane().add(lbid);
		
		JLabel name = new JLabel("name");
		name.setBounds(50,70, name.getPreferredSize().width,name.getPreferredSize().height);
		frame.getContentPane().add(name);
		
		JLabel surname = new JLabel("surname");
		surname.setBounds(50,90, surname.getPreferredSize().width, surname.getPreferredSize().height);
		frame.getContentPane().add(surname);
		
		JLabel mark = new JLabel("mark");
		mark.setBounds(50,110, mark.getPreferredSize().width, mark.getPreferredSize().height);
		frame.getContentPane().add(mark);
		
		
		JTextField txid = new JTextField(11);
		txid.setBounds(150,50,txid.getPreferredSize().width,txid.getPreferredSize().height);
		frame.getContentPane().add(txid);
		
		JTextField txname = new JTextField(11);
		txname.setBounds(150,70,txname.getPreferredSize().width,txname.getPreferredSize().height);
		frame.getContentPane().add(txname);
		
		JTextField txsurname = new JTextField(11);
		txsurname.setBounds(150,90,txsurname.getPreferredSize().width,txsurname.getPreferredSize().height);
		frame.getContentPane().add(txsurname);
		
		JTextField txmark = new JTextField(11);
		txmark.setBounds(150,110,txmark.getPreferredSize().width,txmark.getPreferredSize().height);
		frame.getContentPane().add(txmark);
		
		JButton btn = new JButton("Submit");
		btn.setBounds(50,150, btn.getPreferredSize().width,btn.getPreferredSize().height);
		frame.getContentPane().add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				btnPressedSid(txid.getText());
				btnPressedName(txname.getText());
				btnPressedSurname(txsurname.getText());
				btnPressedMark(txmark.getText());
				
			}
		});
		
		frame.pack();
		frame.setVisible(true);
	}
	
}
