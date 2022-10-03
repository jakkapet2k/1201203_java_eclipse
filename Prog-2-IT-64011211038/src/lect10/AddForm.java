package lect10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JDialog;
import javax.swing.JTextField;

public class AddForm extends JDialog implements ActionListener {

	private static final String addProduct = "Add Product";
	private static final String cancel = "Cancel";

	private static final int width = 400;
	private static final int height = 250;

	JTextField idTexts;
	JTextField nameTexts;
	JTextField priceTexts;
	JTextField detailsTexts;
	JTextField stockTexts;

	public AddForm(JFrame frame) {
		super(frame, true);

		Container pane = getContentPane();
		pane.setLayout(null);

		JLabel addProductLabel = new JLabel("Add Product");
		JLabel productId = new JLabel("ID : ");
		JLabel productName = new JLabel("Name:");
		JLabel productDetails = new JLabel("Details:");
		JLabel productPrice = new JLabel("Price:");
		JLabel Stock = new JLabel("Stock:");

		JButton btn_add = new JButton(addProduct);
		JButton btn_cancel = new JButton(cancel);

		idTexts = new JTextField(10);
		nameTexts = new JTextField(20);
		priceTexts = new JTextField(10);
		detailsTexts = new JTextField(20);
		stockTexts = new JTextField(10);

		btn_add.addActionListener(this);
		btn_cancel.addActionListener(this);

		pane.add(addProductLabel);
		pane.add(productId);
		pane.add(productName);
		pane.add(productDetails);
		pane.add(productPrice);
		pane.add(Stock);

		pane.add(idTexts);
		pane.add(nameTexts);
		pane.add(priceTexts);
		pane.add(detailsTexts);
		pane.add(stockTexts);

		pane.add(btn_add);
		pane.add(btn_cancel);

		// set sizes and positions for labels
		Dimension size = addProductLabel.getPreferredSize();
		addProductLabel.setBounds((width - size.width) / 2, 5, size.width, size.height);
		size = productId.getPreferredSize();
		productId.setBounds((width - size.width) / 10, 30, size.width, size.height);
		size = productName.getPreferredSize();
		productName.setBounds((width - size.width) / 10, 60, size.width, size.height);
		size = productDetails.getPreferredSize();
		productDetails.setBounds((width - size.width) / 10, 90, size.width, size.height);
		size = productPrice.getPreferredSize();
		productPrice.setBounds((width - size.width) / 10, 120, size.width, size.height);
		size = Stock.getPreferredSize();
		Stock.setBounds((width - size.width) / 10, 150, size.width, size.height);
		// set sizes and positions for labels
		size = idTexts.getPreferredSize();
		idTexts.setBounds(80, 30, size.width, size.height);
		size = nameTexts.getPreferredSize();
		nameTexts.setBounds(100, 60, size.width, size.height);
		size = detailsTexts.getPreferredSize();
		detailsTexts.setBounds(110, 90, size.width, size.height);
		size = priceTexts.getPreferredSize();
		priceTexts.setBounds(110, 120, size.width, size.height);
		size = stockTexts.getPreferredSize();
		stockTexts.setBounds(110, 150, size.width, size.height);

		// set sizes and positions for controls buttons
		size = btn_add.getPreferredSize();
		btn_add.setBounds(width / 2 - size.width - 10, 180, size.width, size.height);
		size = btn_cancel.getPreferredSize();
		btn_cancel.setBounds(width / 2 + 10, 180, size.width, size.height);

		// set size and position for container
		pane.setPreferredSize(new Dimension(width, height));

		pack();
		setLocationRelativeTo(null);
		setVisible(false);

		System.out.println("AddProductDialog() done!");

	}

	public void actionPerformed(ActionEvent evt) {
		String acionCommand = evt.getActionCommand();

		if (acionCommand.equals(addProduct)) {
			System.out.println("actionCommand : " + addProduct);
			try {
				
				int proId = Integer.parseInt(idTexts.getText());
				String ProName = nameTexts.getText();
				String Prodetails = detailsTexts.getText();
				int proprice = Integer.parseInt(priceTexts.getText());
				int prostock = Integer.parseInt(stockTexts.getText());
				ReadWriteFile WF = new ReadWriteFile(proId,ProName,Prodetails,proprice,prostock,true);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}
