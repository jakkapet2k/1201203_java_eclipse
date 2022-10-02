package summer;

import java.util.Scanner;

public class MethodDemo {
	
	public static void greetUser() {
		
		System.out.println("Hello User. Have a good day.");
		System.out.println("สวัสดีผู้ใช้. วันนี้เป็นวันที่ดี.");
	}
	
	public static int getId(String prompt) {
		int id;
		
		System.out.print(prompt);
		Scanner sc = new Scanner(System.in);
		id = sc.nextInt();
		
		return id;
	}
	
	public static void main(String[] args) {
		
		greetUser();
		int id = getId("Please insert your id:");
		
		System.out.println("id:" + id);
		
	}

}
