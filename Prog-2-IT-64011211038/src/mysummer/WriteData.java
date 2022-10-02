package mysummer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteData {
	
	public static int getSid(String prompt) {
		System.out.print(prompt);
		Scanner sc = new Scanner(System.in);
		int SID = sc.nextInt();
		return SID;
		
	}
	public static String getName(String prompt) {
		System.out.print(prompt);
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		return name;
		
	}
	public static String getSurName(String prompt) {
		System.out.print(prompt);
		Scanner sc = new Scanner(System.in);
		String surName = sc.next();
		return surName;
		
	}
	public static int getMark(String prompt) {
		System.out.print(prompt);
		Scanner sc = new Scanner(System.in);
		int mark = sc.nextInt();
		return mark;
		
	}

	public static void main (String []  args) {
		System.out.println("Write File : Student.txt");
		Scanner sc = new Scanner(System.in);
		String fileName = "Student.txt";
		BufferedWriter bw =null;
		try {
			bw = new BufferedWriter(new FileWriter(fileName));
			System.out.print("Student : ");
			int n = sc.nextInt();
			int i = 1;
			while (i<=n) {
				
				System.out.println("Student No : " + i);
				int SID = getSid("SID : ");
				String name = getName ( "Name : ");
				String surName = getSurName("Suername : ");
				int mark = getMark("Mark : ");
				
				bw.write(i + " ) " + " SID : " + SID + " , " + " Name : " + name + " , " + " Surname : " + surName + " , "+ " Mark : " + mark +"\n"   );
				i++;
				bw.flush();
			}
			bw.close();
			
			}catch (IOException e) {
				e.printStackTrace();
			}
			sc.close();		}
		
	 
}

