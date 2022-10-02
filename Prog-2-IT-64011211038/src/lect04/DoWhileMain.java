package lect04;
import java.util.Scanner;
public class DoWhileMain {
	 public static void main (String [] args) {
			Scanner sc = new Scanner(System.in);
			String check = " ";
			
			do {
				
				System.out.print("ID : ");
				long id = sc.nextLong();
				System.out.print("Company Name : ");
				String  name =sc.next();
				System.out.print("Company No : ");
				String  comNo =sc.next();
				System.out.print("Village : ");
				String  vil =sc.next();
				System.out.print("Distrivt Sub : ");
				String  disSub =sc.next();
				System.out.print("Distrivt : ");
				String  dis =sc.next();
				System.out.print("Province : ");
				String  provin =sc.next();
				System.out.print("Tel : ");
				int tel =sc.nextInt();
				
				Supplier se= new Supplier(id,name,comNo,vil,disSub,dis,provin,tel);
				System.out.println(se.toString());
				
				System.out.print("Do you want to continue? [y/n] : ");
				check = sc.next();
				System.out.println();
			}while(check.equalsIgnoreCase("y"));
			System.out.println("Good By.!!");
			sc.close();

	 }
}
