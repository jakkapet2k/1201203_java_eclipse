package lect10;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DeletForm extends JDialog implements ActionListener {

    private static final String CheckID = "Check ID";
    private static final String Del = "Delete";
    private static final String cancel = "Cancel";

    private static final int width = 250;
    private static final int height = 100;
    ShowForm showForm;
    JTextField idTexts;

    public DeletForm(JFrame frame) {
        
        showForm = new ShowForm(frame);

        Container pane = getContentPane();
        pane.setLayout(null);

        JLabel editProductLabel = new JLabel("Delete");
        JLabel productId = new JLabel("ID : ");

        JButton btn_del = new JButton(CheckID);
        JButton btn_cancel = new JButton(cancel);

        idTexts = new JTextField(10);


        btn_del.addActionListener(this);
        btn_cancel.addActionListener(this);

        pane.add(editProductLabel);
        pane.add(productId);


        pane.add(idTexts);


        pane.add(btn_del);
        pane.add(btn_cancel);

        // set sizes and positions for labels
        Dimension size = editProductLabel.getPreferredSize();
        editProductLabel.setBounds((width - size.width) / 2, 5, size.width, size.height);
        size = productId.getPreferredSize();
        productId.setBounds((width - size.width) / 3, 30, size.width, size.height);
        // set sizes and positions for labels
        size = idTexts.getPreferredSize();
        idTexts.setBounds(100, 30, size.width, size.height);

        // set sizes and positions for controls buttons
        size = btn_del.getPreferredSize();
        btn_del.setBounds(width / 2 - size.width - 10, 60, size.width, size.height);
        size = btn_cancel.getPreferredSize();
        btn_cancel.setBounds(width / 2 + 10, 60, size.width, size.height);

        // set size and position for container
        pane.setPreferredSize(new Dimension(width, height));

        pack();
        setLocationRelativeTo(null);
//        setVisible(false);

        System.out.println("DeleteProductDialog() done!");
    }

    public void actionPerformed(ActionEvent evt) {
        String acionCommand = evt.getActionCommand();
        System.out.println("actionCommand : "+CheckID);
        if (acionCommand.equals(CheckID)) {
            System.out.println("equals " + Del);
            
            showForm.setVisible(true);
        }else {
            
        }
        
    }

}
