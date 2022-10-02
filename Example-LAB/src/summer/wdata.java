package summer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class wdata {
	
	public static int getId(String prompt) {
		System.out.print(prompt);
		Scanner sc = new Scanner(System.in);
		int sId = sc.nextInt();
		return sId;
		
	}
	public static String getName(String prompt) {
		System.out.print(prompt);
		Scanner sc = new Scanner(System.in);
		String sName = sc.next();
		return sName;
		
	}
	public static String getSurname(String prompt) {
		System.out.print(prompt);
		Scanner sc = new Scanner(System.in);
		String sSurname = sc.next();
		return sSurname;
		
	}
	public static int getMark(String prompt) {
		System.out.print(prompt);
		Scanner sc = new Scanner(System.in);
		int mark = sc.nextInt();
		return mark;
		
	}
	

	public static void main(String [] args) {
		System.out.println("WriteData  File:StudentMarks  ");
		Scanner sc = new Scanner(System.in);
		String fileName ="StudentMarks.txt";
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(fileName));
			System.out.print("number : ");
			int n = sc.nextInt();
			int i = 1;
			while(i <= n ) {
				System.out.println("Student Number "+i);
				int sId = getId("Studen ID : ");
				String sName = getName("Studen Name : ");
				String sSurname = getSurname("Studen Surname : ");
				int mark = getMark("Mark : ");
				
				
				bw.write(i +" ) SID : " + sId + " , " + " Name : " + sName + " , " + " Sername : " +sSurname + " , " + " Mark : "+ mark + "\n");
				bw.flush();
				i++;
			}
			
			bw.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		sc.close();
	}

}
