package mysummer;

import java.util.Scanner;

public class inputOutput {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("id :");
		int id;
		id = sc.nextInt();
		System.out.print("name : ");
		String name;
		name = sc.next();
		System.out.print("surname :");
		String surname;
		surname = sc.next();
		System.out.print("id :" + id + ", name :"+ name + ", surname :" + surname);
		sc.close();
		
	}
	
}
