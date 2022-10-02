package summer;

import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID:");
		int id = sc.nextInt();
		System.out.print("Insert mark:");
		String strMark = sc.next();
		int mark = -1;
		try {
			mark = Integer.parseInt(strMark);
		} catch(NumberFormatException ex) {
			ex.printStackTrace();
		}	
		char grade = ' ';
		if(mark <= 49) {
			grade = 'F';
		} else if(mark <= 59) {
			grade = 'D';
		} else if(mark <= 69) {
			grade = 'C';
		} else if(mark <= 79) {
			grade = 'B';
		} else {
			grade = 'A';
		}
		System.out.println("grade:" + Character.toString(grade));
	}
}
