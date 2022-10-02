package lect04;
import java.util.Scanner;
public class WhileMain {
	
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		String check = "y";
		while(check.equalsIgnoreCase("y")) {
			System.out.print("Custommer ID : ");
			long id = sc.nextLong();
			System.out.print("Name : ");
			String name = sc.next();
			System.out.print("Surname : ");
			String surname = sc.next();
			System.out.print("Brith Date : ");
			String brithdate = sc.next();
			System.out.print("House No : ");
			String houseno = sc.next();
			System.out.print("Village : ");
			String village = sc.next();
			System.out.print("District Sub : ");
			String districtSub = sc.next();
			System.out.print("District : ");
			String district = sc.next();
			System.out.print("Province : ");
			String province = sc.next();
			System.out.print("Tel : ");
			int tel = sc.nextInt();
			
			Customer cm = new Customer(id,name,surname,brithdate,houseno,village,districtSub,district,province,tel);
			System.out.println(cm.toString());
			
			System.out.print("Do you want to continue? [y/n] : ");
			check = sc.next();
			System.out.println();
		
		}
		System.out.println("Good By.!!");
		sc.close();
	}
}
