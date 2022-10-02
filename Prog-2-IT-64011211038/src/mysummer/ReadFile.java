package mysummer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

		public static void main(String[] args) {
			System.out.println("ReadFile");
			String fileName = "StudentMarks.csv";
			try {
				BufferedReader br = new BufferedReader(new FileReader(fileName));
				String line;
				while ((line = br.readLine())!= null) {
					System.out.println(line);
				}
				br.close();
				
			}catch(IOException ex) {
				ex.printStackTrace();
			}
			
		}
}

