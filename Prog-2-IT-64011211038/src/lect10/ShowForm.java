package lect10;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ShowForm extends JDialog implements ActionListener {
    
    private static final String del = "Delete";
    private static final String cancel = "Cancel";
    private static final int width = 400;
    private static final int height = 250;
    String idPro, namePro, detailPro, pricePro, stockPro;
    

    public ShowForm(JFrame frame ) {
        super(frame, true);
        
        Container pane = getContentPane();
        pane.setLayout(null);
        
        JLabel productLabel = new JLabel("Delete Product");
        JLabel productId = new JLabel("ID : ");
        JLabel productName = new JLabel("Name:");
        JLabel productDetails = new JLabel("Details:");
        JLabel productPrice = new JLabel("Price:");
        JLabel Stock = new JLabel("Stock:");
        
        JLabel showductId = new JLabel(idPro);
        JLabel showductName = new JLabel(namePro);
        JLabel showductDetails = new JLabel(detailPro);
        JLabel showuctPrice = new JLabel(pricePro);
        JLabel showStock = new JLabel(stockPro);

        JButton btn_del = new JButton(del);
        JButton btn_cancel = new JButton(cancel);
        
        pane.add(productLabel);
        pane.add(productId);
        pane.add(productName);
        pane.add(productDetails);
        pane.add(productPrice);
        pane.add(Stock);
        
        pane.add(showductId);
        pane.add(showductName);
        pane.add(showductDetails);
        pane.add(showuctPrice);
        pane.add(showStock);

        pane.add(btn_del);
        pane.add(btn_cancel);
        
        Dimension size = productLabel.getPreferredSize();
        productLabel.setBounds((width - size.width) / 2, 5, size.width, size.height);
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
        
        size = showductId.getPreferredSize();
        showductId.setBounds((width - size.width) / 15, 30, size.width, size.height);
        size = showductName.getPreferredSize();
        showductName.setBounds((width - size.width) / 15, 60, size.width, size.height);
        size = showductDetails.getPreferredSize();
        showductDetails.setBounds((width - size.width) / 15, 90, size.width, size.height);
        size = showuctPrice.getPreferredSize();
        showuctPrice.setBounds((width - size.width) / 15, 120, size.width, size.height);
        size = showStock.getPreferredSize();
        showStock.setBounds((width - size.width) / 15, 150, size.width, size.height);
        
        // set sizes and positions for controls buttons
        size = btn_del.getPreferredSize();
        btn_del.setBounds(width / 2 - size.width - 10, 180, size.width, size.height);
        size = btn_cancel.getPreferredSize();
        btn_cancel.setBounds(width / 2 + 10, 180, size.width, size.height);

        
        pane.setPreferredSize(new Dimension(width, height));

        pack();
        setLocationRelativeTo(null);
        setVisible(false);

        System.out.println("AddProductDialog() done!");
    }


    public void actionPerformed(ActionEvent evt) {
  
        
    }

}
