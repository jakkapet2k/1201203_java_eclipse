package lect10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ReadWriteFile {

    

    public static String[] readFile(String fileName) {
        System.out.println("readTextFile(), fileName: " + fileName);
        String[] lines = null;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = br.readLine()) != null) {
//              System.out.println(line);
                buf.append(line + "\n");
            }
            // System.out.println("buf---------\n"+buf);
            String temp = buf.toString();
            // Add array
            lines = temp.split("\n");
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return lines;
    }

    public ReadWriteFile(int proId, String proName, String prodetails, int proprice, int prostock,boolean booLean) {
                
        System.out.println("AddProduct!!");
        String fileName = "Files/Goods.csv";
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            bw = new BufferedWriter(new FileWriter(fileName,booLean));
            bw.write(proId + "," + proName + "," + prodetails + "," + proprice + "," + prostock);
            bw.write("\n");
            bw.flush();
            bw.close();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        
    }



    
}
