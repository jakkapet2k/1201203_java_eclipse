package lect10;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ShowForm extends JDialog implements ActionListener {

    public static final int NAME_1ST_LINE = 0;
    public static final int ID_COLUMN = 0;

    private static final String del = "Delete";
    private static final String cancel = "Cancel";
    private static final int width = 400;
    private static final int height = 250;

    private static int idPro ;
    
    public ShowForm(JFrame frame, int showId, String showname,String  showdetail, int showprice,
            int showstock) {
        super(frame, true);

//        String [] show = {showId,showname,showdetail,showprice,showstock};
        idPro = showId;

        System.out.println(showId + showname + showdetail + showprice + showstock);
        Container pane = getContentPane();
        pane.setLayout(null);

        JLabel productLabel = new JLabel("Delete Product");
        JLabel productId = new JLabel("ID : ");
        JLabel productName = new JLabel("Name:");
        JLabel productDetails = new JLabel("Details:");
        JLabel productPrice = new JLabel("Price:");
        JLabel Stock = new JLabel("Stock:");

        JLabel showductId = new JLabel(String.valueOf(showId));
        JLabel showductName = new JLabel(showname);
        JLabel showductDetails = new JLabel(showdetail);
        JLabel showuctPrice = new JLabel(String.valueOf(showprice));
        JLabel showStock = new JLabel(String.valueOf(showstock));

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

        btn_del.addActionListener(this);
        
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
        showductId.setBounds((width - size.width) / 3, 30, size.width, size.height);
        size = showductName.getPreferredSize();
        showductName.setBounds((width - size.width) / 3, 60, size.width, size.height);
        size = showductDetails.getPreferredSize();
        showductDetails.setBounds((width - size.width) / 3, 90, size.width, size.height);
        size = showuctPrice.getPreferredSize();
        showuctPrice.setBounds((width - size.width) / 3, 120, size.width, size.height);
        size = showStock.getPreferredSize();
        showStock.setBounds((width - size.width) / 3, 150, size.width, size.height);

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
        String acionCommand = evt.getActionCommand();
        System.out.println("actionCommand : " + del);
        if (acionCommand.equals(del)) {
            try {
                int proId = idPro;
                System.out.println(proId);
                // add file
                String goodsFile = "Files/Goods.csv";

                // Read file to method ReadTextFile
                String[] goodsArray = ReadWriteFile.readFile(goodsFile);

                // create Object
                Goods[] GoodsArr = new Goods[goodsArray.length];

                boolean ck = false;
                for (int i = NAME_1ST_LINE; i < goodsArray.length; i++) {
                    Goods GoodsObj = new Goods();
//               System.out.println(i);
                    String[] goods = goodsArray[i].split(",");
//               System.out.println(goods);
                    String id = goods[ID_COLUMN];
                    int intId = Integer.parseInt(id);
                    
//               System.out.println(id);
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

                    GoodsArr[i] = GoodsObj;

                }

                for (int i = NAME_1ST_LINE; i < goodsArray.length; i++) {
//              System.out.println( GoodsArr[i].toString());
                    if (GoodsArr[i].getInt()==proId) {
                        
            
                        continue;
                    } else {
                        if (i == 0) {

                            ReadWriteFile WF = new ReadWriteFile(GoodsArr[i].getInt(), GoodsArr[i].getName(),
                                    GoodsArr[i].getDetail(), GoodsArr[i].getPrice(), GoodsArr[i].getStock(), false);

                        } else {
                            ReadWriteFile WF = new ReadWriteFile(GoodsArr[i].getInt(), GoodsArr[i].getName(),
                                    GoodsArr[i].getDetail(), GoodsArr[i].getPrice(), GoodsArr[i].getStock(), true);

                        }

                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

}
