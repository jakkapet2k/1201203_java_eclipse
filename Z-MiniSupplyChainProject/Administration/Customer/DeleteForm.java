package Customer;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class DeleteForm extends JDialog implements ActionListener {

	private static final int LINE = 0;

	private static final int width = 400;
	private static final int height = 200;

	JTextField idTxt;
	//JTextField nameTxt;
	//JTextField DescriptionTxt;
	//JTextField priceTxt;
	//JTextField stockTxt;

	private static final String deleteString = "Delete";
	private static final String cancelString = "cancel";
	private static final String RefreshString = "Refresh";
	private JTable table;

//	private static final Product Proc = null;

	public DeleteForm(JFrame frame) {
		super(frame, true);
		setTitle("Delete ");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				ShowData();
			}
			public void windowActivated(WindowEvent e) {
				ShowData();
			}
		});

		// Create pane as container
		Container pane = getContentPane();
		// set layout manager to manual
		pane.setLayout(null);

		// create labels
		JLabel editformlabel = new JLabel("Delete Supplier");
		JLabel idLabel = new JLabel("ID");
		//JLabel nameLabel = new JLabel("Name");
		//JLabel DescriptionLabel = new JLabel("Description");
		//JLabel priceLabel = new JLabel("Price");
		//JLabel stockLabel = new JLabel("Stock");

		// create buttons
		JButton deleteBtn = new JButton(deleteString);
		deleteBtn.setForeground(new Color(0, 0, 0));
		JButton cancelBtn = new JButton(cancelString);
		// create texts
		idTxt = new JTextField(10);
		//nameTxt = new JTextField(20);
		//DescriptionTxt = new JTextField(15);
		//priceTxt = new JTextField(10);
		//stockTxt = new JTextField(10);

		// create control buttons.
		deleteBtn.addActionListener(this);
		cancelBtn.addActionListener(this);

		// add labels
		pane.add(editformlabel);
		pane.add(idLabel);
		//pane.add(nameLabel);
		//pane.add(DescriptionLabel);
		//pane.add(priceLabel);
		//pane.add(stockLabel);

		// add text fields
		pane.add(idTxt);
		//pane.add(nameTxt);
		//pane.add(DescriptionTxt);
		//pane.add(priceTxt);
		//pane.add(stockTxt);

		// add control buttons
		pane.add(deleteBtn);
		pane.add(cancelBtn);
		// set sizes and positions for labels
		Dimension size = editformlabel.getPreferredSize();
		editformlabel.setBounds(164, 11, size.width, size.height);
		size = idLabel.getPreferredSize();
		idLabel.setBounds(113, 45, size.width, size.height);
		//size = nameLabel.getPreferredSize();
		//nameLabel.setBounds(10, 50, size.width, size.height);
		//size = DescriptionLabel.getPreferredSize();
		//DescriptionLabel.setBounds(10, 80, size.width, size.height);
		//size = priceLabel.getPreferredSize();
		//priceLabel.setBounds(10, 110, size.width, size.height);
		//size = stockLabel.getPreferredSize();
		//stockLabel.setBounds(10, 140, size.width, size.height);

		// set sizes and positions for labels
		size = idTxt.getPreferredSize();
		idTxt.setBounds(134, 42, 145, 20);
		//size = nameTxt.getPreferredSize();
		//nameTxt.setBounds(80, 50, size.width, size.height);
		//size = DescriptionTxt.getPreferredSize();
		//DescriptionTxt.setBounds(80, 80, size.width, size.height);
		//size = priceTxt.getPreferredSize();
		//priceTxt.setBounds(80, 110, size.width, size.height);
		//size = stockTxt.getPreferredSize();
		//stockTxt.setBounds(80, 140, size.width, size.height);

		// set sizes and positions for controls buttons
		size = deleteBtn.getPreferredSize();
		deleteBtn.setBounds(31, 73, 166, 23);
		size = cancelBtn.getPreferredSize();
		cancelBtn.setBounds(222, 73, 126, 23);

		// set size and position for container
		pane.setPreferredSize(new Dimension(400, 400));
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 106, 380, 283);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

		pack();
		setLocationRelativeTo(null);
		setVisible(false);

		System.out.println("DeleteformDialog() done!");

	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		String actionCommand = evt.getActionCommand();
		// user presses "Add"
		if (actionCommand.equals(deleteString)) {
			System.out.println("actionCommand:" + deleteString);
			try {
				// retrieve values from text fields.
				int id = Integer.parseInt(idTxt.getText());
	
				Customer Delete = new Customer(id ,actionCommand , actionCommand);
				deleteCustomer(Delete);
				
				// reset text fields
				idTxt.setText(null);
				//nameTxt.setText(null);
				//DescriptionTxt.setText(null);
				//priceTxt.setText(null);
				//stockTxt.setText(null);
				
			} catch (Exception ex) {
				System.err.println("Error! Invalid data.");
			}
			// user presses "Cancel"
		} else if (actionCommand.equals(cancelString)) {
			System.out.println("actionCommand:" + cancelString);
			setVisible(false);
		}
	}
	private void deleteCustomer(Customer customer) {
		System.out.println("CustomerDB.deleteCustomer()");
		try {
			String deleteSql = "DELETE FROM customer WHERE ID=" + customer.id;
			System.out.println("selectSql:" + deleteSql);

			ConnMariaDB connDB = new ConnMariaDB();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				stmnt.executeUpdate(deleteSql);
				stmnt.close();
				con.close();
				System.out.println("customer Delete successfully.");
			}
		} catch (NumberFormatException ex) {
			System.err.println("Error! Invalid ID.");
		} catch (SQLException ex) {
			ex.printStackTrace();
		
		}
		ShowData();
	}
	private void ShowData() {
        ConnMariaDB connDB = new ConnMariaDB();
        Connection con = connDB.getConnection();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Username");
        model.addColumn("Password");



        try {
            String query = "SELECT * FROM customer";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                model.addRow(new Object[] {
                        rs.getString("id"),
                        rs.getString("username"),
                        rs.getString("password"),

                });
            }
            rs.close();
            st.close();
            con.close();

            table.setModel(model);
            table.setAutoResizeMode(0);
            table.getColumnModel().getColumn(0).setPreferredWidth(40);
            table.getColumnModel().getColumn(1).setPreferredWidth(100);
            table.getColumnModel().getColumn(2).setPreferredWidth(120);




        } catch (Exception e) {
            System.out.println("error: " + e);
        }
	}
}