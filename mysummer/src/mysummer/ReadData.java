package mysummer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {
	
	public static void main(String [] args) {
		
		System.out.println("ReadFile : Student.txt");
		String fileName = "Student.txt";
		Readfile(fileName);
		
	} 
	
	public static void Readfile(String fileName) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line;
			while((line = br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
			
		}catch(IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
