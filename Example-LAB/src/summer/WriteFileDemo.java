package summer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFileDemo {

	public static void main(String[] args) {
		System.out.println("WriteFile.main();");
		// receive data from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Student Id:");
		int studentId = sc.nextInt();
		System.out.print("Student Name:");
		String studentName = sc.next();
		
		// open a file at your working directory
		String fileName = "good.csv";
		// create objects for writing data to a file
		BufferedWriter bw = null;
		try {
			// open objects for writing data to a file
			bw = new BufferedWriter(new FileWriter(fileName,true));
			// write data
			bw.write(studentId 
					+ "," + studentName+"\n");
			// make sure data in buffer is written
			bw.flush();
			// close file
			bw.close();
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		sc.close();
	}
}	
