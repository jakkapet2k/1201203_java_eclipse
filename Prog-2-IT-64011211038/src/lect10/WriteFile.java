package lect10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public WriteFile(int proId, String proName, String prodetails, int proprice, int prostock) {
		System.out.println("AddProduct!!");
		String fileName = "Files/L10.csv";
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			bw = new BufferedWriter(new FileWriter(fileName, true));
			bw.write(proId + "," + proName + "," + prodetails + "," + proprice + "," + prostock);
			bw.write("\n");
			bw.flush();
			bw.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
