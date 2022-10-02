package mysummer;

import java.util.Scanner;

public class ifelse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		int id  = sc.nextInt();
		System.out.print("Insert marlk:");
		String strMark = sc.next();
		int mark = -1;
		try {
			mark = Integer.parseInt(strMark);
		} catch(NumberFormatException ex) {
			ex.printStackTrace();
		}
		
		char garde = ' ';
		if(mark <=49) {
			garde = 'F';
		}else if (mark <=59) {
			garde = 'D';
		}else if (mark <=69) {
			garde = 'C';
		}else if (mark <=79) {
			garde = 'B';
		}else {
			garde = 'A';
		}
			System.out.print("Gard : "+ Character.toString(garde));
		
		
	}

}
