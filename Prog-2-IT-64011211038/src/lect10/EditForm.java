package lect10;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EditForm extends JDialog implements ActionListener {

    public static final int NAME_1ST_LINE = 0;
    public static final int ID_COLUMN = 0;

    private static final String editProduct = "Edit";
    private static final String cancel = "Cancel";

    private static final int width = 400;
    private static final int height = 250;

    JTextField idTexts;
    JTextField nameTexts;
    JTextField priceTexts;
    JTextField detailsTexts;
    JTextField stockTexts;

    public EditForm(JFrame frame) {
        super(frame, true);

        Container pane = getContentPane();
        pane.setLayout(null);

        JLabel editProductLabel = new JLabel("Edit");
        JLabel productId = new JLabel("ID : ");
        JLabel productName = new JLabel("Name:");
        JLabel productDetails = new JLabel("Details:");
        JLabel productPrice = new JLabel("Price:");
        JLabel Stock = new JLabel("Stock:");

        JButton btn_edit = new JButton(editProduct);
        JButton btn_cancel = new JButton(cancel);

        idTexts = new JTextField(10);
        nameTexts = new JTextField(20);
        priceTexts = new JTextField(10);
        detailsTexts = new JTextField(20);
        stockTexts = new JTextField(10);

        btn_edit.addActionListener(this);
        btn_cancel.addActionListener(this);

        pane.add(editProductLabel);
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

        pane.add(btn_edit);
        pane.add(btn_cancel);

        // set sizes and positions for labels
        Dimension size = editProductLabel.getPreferredSize();
        editProductLabel.setBounds((width - size.width) / 2, 5, size.width, size.height);
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
        size = btn_edit.getPreferredSize();
        btn_edit.setBounds(width / 2 - size.width - 10, 180, size.width, size.height);
        size = btn_cancel.getPreferredSize();
        btn_cancel.setBounds(width / 2 + 10, 180, size.width, size.height);

        // set size and position for container
        pane.setPreferredSize(new Dimension(width, height));

        pack();
        setLocationRelativeTo(null);
        setVisible(false);

        System.out.println("EditProductDialog() done!");
    }
    
    public void actionPerformed(ActionEvent evt) {
        String acionCommand = evt.getActionCommand();

        if (acionCommand.equals(editProduct)) {
            System.out.println("actionCommand : " + editProduct);
            try {
                int proId = Integer.parseInt(idTexts.getText());
                String proName = nameTexts.getText();
                String prodetails = detailsTexts.getText();
                int proprice = Integer.parseInt(priceTexts.getText());
                int prostock = Integer.parseInt(stockTexts.getText());

                // add file
                String goodsFile = "Files/Goods.csv";

                // Read file to method ReadTextFile
                String[] goodsArray = ReadWriteFile.readFile(goodsFile);

                // create Object
                Goods[] GoodsArr = new Goods[goodsArray.length];

                boolean ck = false;
                for (int i = NAME_1ST_LINE; i < goodsArray.length; i++) {
                    Goods GoodsObj = new Goods();
//                   System.out.println(i);
                    String[] goods = goodsArray[i].split(",");
//                   System.out.println(goods);
                    String id = goods[ID_COLUMN];
                    int intId = Integer.parseInt(id);

//                   System.out.println(id);
                    GoodsObj.setId(intId);
                    String name = goods[1];
                    GoodsObj.setName(name);
                    String details = goods[2];
                    GoodsObj.setDetail(details);
                    String price = goods[3];
                    int intPrice = Integer.parseInt(price);
                    GoodsObj.setPrice(intPrice);
                    String stock = goods[4];
                    int intstock = Integer.parseInt(stock);
                    GoodsObj.setStock(intstock);
                    if (proId == intId) {
                        GoodsObj.setId(proId);
                        GoodsObj.setName(proName);
                        GoodsObj.setDetail(prodetails);
                        GoodsObj.setPrice(proprice);
                        GoodsObj.setStock(prostock);
                        ck = true;
                                
                    }
                    
                    GoodsArr[i] = GoodsObj;

                }
                if (ck == false) {
                    JOptionPane.showMessageDialog(null, "error!!");
                }
                for (int i = NAME_1ST_LINE; i < goodsArray.length; i++) {
//                  System.out.println( GoodsArr[i].toString());
                    if (i == 0) {

                        ReadWriteFile WF = new ReadWriteFile(GoodsArr[i].getInt(), GoodsArr[i].getName(),
                                GoodsArr[i].getDetail(), GoodsArr[i].getPrice(), GoodsArr[i].getStock(), false);

                    } else {
                        ReadWriteFile WF = new ReadWriteFile(GoodsArr[i].getInt(), GoodsArr[i].getName(),
                                GoodsArr[i].getDetail(), GoodsArr[i].getPrice(), GoodsArr[i].getStock(), true);

                    }
                }
                if (ck == true) {
                    JOptionPane.showMessageDialog(null, "seccess!!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
