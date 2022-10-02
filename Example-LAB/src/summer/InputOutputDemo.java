package summer;

import java.util.Scanner;

public class InputOutputDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("รหัสนิสิต:");
		int id;
		id = sc.nextInt();
		System.out.print("ชื่อ:");
		String name;
		name = sc.next();
		System.out.print("นามสกุล:");
		String surname;
		surname = sc.next();
		System.out.println("รหัสนิสิต:" + id 
				+ ", ชื่อ:" + name + ", นามสกุล:" + surname);
		sc.close();
	}

}
