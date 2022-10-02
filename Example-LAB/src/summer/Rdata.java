package summer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Rdata {

	public static void main(String[] args) {
		System.out.println("ReadData  File:StudentMarks");
		String fileName = "StudentMarks.txt";
		Reader(fileName);
		
	}
	
	public static void Reader(String fileName) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
