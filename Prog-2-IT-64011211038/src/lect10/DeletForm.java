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

    public static final int NAME_1ST_LINE = 0;
    public static final int ID_COLUMN = 0;

    private static final String CheckID = "Check ID";
    private static final String Del = "Delete";
    private static final String cancel = "Cancel";

    private static final int width = 250;
    private static final int height = 100;
    ShowForm showForm;
    JTextField idTexts;
    JFrame frame;
    String inputId, showname, showdetail ;
    int showId, showprice, showstock;

    public DeletForm(JFrame frame) {
        // test paramiter

//        String sId = String.valueOf(showId);
//        String sPrice = String.valueOf(showprice);
//        String sStock = String.valueOf(showstock);
//        sId = "ID Not Found!!";
//        showname = "Name Not Found!!";
//        showdetail = "Detail Not Found!!";
//        sStock = "Price Not Found!!";
//        sPrice = "Stock Not Found!!";

        // ----------------------------------
        showForm = new ShowForm(frame, showId, showname, showdetail, showprice, showstock);

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
        System.out.println("actionCommand : " + CheckID);
        if (acionCommand.equals(CheckID)) {
            try {
                
                System.out.println("equals " + Del);

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
//                System.out.println( GoodsArr[i].toString());
                    int proId = Integer.parseInt(idTexts.getText());
                    if(proId==GoodsArr[i].getInt()) {               
//                        System.out.println( GoodsArr[i].getInt()+ GoodsArr[i].getName()+ GoodsArr[i].getDetail()+ GoodsArr[i].getPrice()+ GoodsArr[i].getStock());
                        String showId =String.valueOf(GoodsArr[i].getInt());
                        String showname =GoodsArr[i].getName();
                        String showdetail =  GoodsArr[i].getDetail();
                        String showprice = String.valueOf(GoodsArr[i].getPrice());
                        String showstock = String.valueOf(GoodsArr[i].getStock());
                        ShowForm show = new ShowForm(frame, GoodsArr[i].getInt(), GoodsArr[i].getName(), GoodsArr[i].getDetail(), GoodsArr[i].getPrice(), GoodsArr[i].getStock());
//                        System.out.println( showId+showname+showdetail+showprice+showstock);
//                        ShowForm show = new ShowForm(frame,showId,showname,showdetail,showprice,showstock) ;
                        showForm.setVisible(true);
                    }
                        
                }
                
//     ShowForm show = new ShowForm(frame, GoodsArr[i].getInt(), GoodsArr[i].getName(), GoodsArr[i].getDetail(), GoodsArr[i].getPrice(), GoodsArr[i].getStock());
//            showForm.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
