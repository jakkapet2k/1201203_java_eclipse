package mysummer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
	
	public static void main(String [] args) {
		System.out.println("WriteFile");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Student ID : ");
		int studentId = sc.nextInt();
		System.out.println("Student Name : ");
		String studentName = sc.next();
		
		String fileName ="StudentMarks.csv";
		
		BufferedWriter bw = null;
		try {
			
			bw = new BufferedWriter(new FileWriter(fileName));
			bw.write(studentId+","+studentName);
			bw.flush();
			bw.close();
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		sc.close();
				
	}


}
