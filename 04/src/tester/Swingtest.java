package tester;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Swingtest {
    private static final String test = "test";

    private static final String bt_str = "Submit";
    static Swingtest2 showForm2;
    JFrame frame;
    JTextField textId;

    public static void main(String[] arg) {
        JFrame  frame = new JFrame("SwingFrom");
        JLabel lbId = new JLabel("Student ID");

        JTextField textId = new JTextField(11);

        frame.getContentPane().setPreferredSize(new Dimension(500, 200));
        frame.getContentPane().setLayout(null);

        lbId.setBounds(50, 50, lbId.getPreferredSize().width, lbId.getPreferredSize().height);
        frame.getContentPane().add(lbId);
        textId.setBounds(150, 50, textId.getPreferredSize().width, textId.getPreferredSize().height);
        frame.getContentPane().add(textId);

        JButton btSubmit = new JButton(test);
        btSubmit.setBounds(50, 150, btSubmit.getPreferredSize().width, btSubmit.getPreferredSize().height);
        frame.getContentPane().add(btSubmit);
        btSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                   String dataShow = textId.getText();
                   JLabel data = new JLabel(dataShow);
                   data.setBounds(70, 50, data.getPreferredSize().width, data.getPreferredSize().height);
                   frame.getContentPane().add(data);
                
                Swingtest2 sho = new Swingtest2(frame,dataShow);
//                showForm2.setVisible(true);
            }       
        });
        frame.pack();
        frame.setVisible(true);
    }


    
}
