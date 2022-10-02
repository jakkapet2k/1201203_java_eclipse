package lect10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenu extends JPanel implements ActionListener {

	private static final String headerLabel = "Menu";
	private static final String addProduct = "Add Product";
	private static final String editProduct = "Edit Product";
	private static final String delProduct = "Delete Product";
	private static final String viewProduct = "View Product";
	private static final String exitPro = "Exit";

	private static final int frameWidth = 400;
	private static final int frameHeight = 300;

	AddForm addForm;
	EditForm editForm;
	DeletForm delForm;
	ViewForm viewForm;

	public MainMenu(JFrame frame) {

		super();

		addForm = new AddForm(frame);
		editForm = new EditForm(frame);
		delForm = new DeletForm(frame);
		viewForm = new ViewForm(frame);

		int panelWidth = 400;
		int panelHeight = 300;

		setLayout(null);

		JLabel headLabel = new JLabel(headerLabel);
		JButton addBtn = new JButton(addProduct);
		JButton editBtn = new JButton(editProduct);
		JButton delBtn = new JButton(delProduct);
		JButton viewBtn = new JButton(viewProduct);
		JButton exitBtn = new JButton(exitPro);

		addBtn.addActionListener(this);
		//editBtn.addActionListener(this);
		//delBtn.addActionListener(this);
		//viewBtn.addActionListener(this);
		exitBtn.addActionListener(this);

		add(headLabel);
		add(addBtn);
		add(editBtn);
		add(delBtn);
		add(viewBtn);
		add(exitBtn);

		Dimension size = headLabel.getPreferredSize();
		headLabel.setBounds((panelWidth - size.width) / 2, 20, size.width, size.height);
		size = addBtn.getPreferredSize();
		addBtn.setBounds((panelWidth - size.width) / 2, 60, size.width, size.height);
		size = editBtn.getPreferredSize();
		editBtn.setBounds((panelWidth - size.width) / 2, 100, size.width, size.height);
		size = delBtn.getPreferredSize();
		delBtn.setBounds((panelWidth - size.width) / 2, 140, size.width, size.height);
		size = viewBtn.getPreferredSize();
		viewBtn.setBounds((panelWidth - size.width) / 2, 180, size.width, size.height);
		size = exitBtn.getPreferredSize();
		exitBtn.setBounds((panelWidth - size.width) / 2, 220, size.width, size.height);

		this.setPreferredSize(new Dimension(panelWidth, panelHeight));

	}

	public void actionPerformed(ActionEvent evt) {
		String acionCommand = evt.getActionCommand();
		System.out.println("actionCommand : "+addProduct);
		if (acionCommand.equals(addProduct)) {
			System.out.println("equals " + addProduct);
			
			addForm.setVisible(true);
		}else if(acionCommand.equals(editProduct)) {
			System.out.println("equals " + editProduct);
			
			addForm.setVisible(true);
		}else if(acionCommand.equals(delProduct)) {
			System.out.println("equals " + delProduct);
			
			addForm.setVisible(true);
		}else if(acionCommand.equals(viewProduct)) {
			System.out.println("equals " + viewProduct);
			
			addForm.setVisible(true);
		}
		else if (acionCommand.equals(exitPro)) {
			System.out.println("equals " + exitPro);
			System.exit(0);
		}
			
		

	}

}
