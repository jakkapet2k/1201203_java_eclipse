package tester;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Swingtest2  extends JDialog implements ActionListener{
    
    private static final String test ="test";

    private static final String bt_str ="Submit";

    private static final String del = "Delete";
    private static final String cancel = "Cancel";
    private static final int width = 400;
    private static final int height = 250;
    String idPro, namePro, detailPro, pricePro, stockPro;
    public Swingtest2(JFrame frame, String str ) {
              
        frame = new JFrame("SwingFrom");
 
            
            Container pane = getContentPane();
            pane.setLayout(null);
            
            JLabel productLabel = new JLabel("Delete Product");
            JLabel productId = new JLabel("ID : ");
           
            
            JLabel showductId = new JLabel(str);
    

            JButton btn_del = new JButton(del);
            JButton btn_cancel = new JButton(cancel);
            
            pane.add(productLabel);
            pane.add(productId);
            
            pane.add(showductId);
   

            pane.add(btn_del);
            pane.add(btn_cancel);
            
            Dimension size = productLabel.getPreferredSize();
            productLabel.setBounds((width - size.width) / 2, 5, size.width, size.height);
            size = productId.getPreferredSize();
            productId.setBounds((width - size.width) / 10, 30, size.width, size.height);
           
            size = showductId.getPreferredSize();
            showductId.setBounds((width - size.width) / 5, 30, size.width, size.height);
            
            
            // set sizes and positions for controls buttons
            size = btn_del.getPreferredSize();
            btn_del.setBounds(width / 2 - size.width - 10, 180, size.width, size.height);
            size = btn_cancel.getPreferredSize();
            btn_cancel.setBounds(width / 2 + 10, 180, size.width, size.height);

            
            pane.setPreferredSize(new Dimension(width, height));

            pack();
            setLocationRelativeTo(null);
            setVisible(true);

            System.out.println("AddProductDialog() done!");
        }

            
    


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
