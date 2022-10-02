package lect03;
import java.util.Scanner;
public class ElectricMain {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("ID : ");
		long userId =sc.nextLong();
		System.out.print("Name : ");
		String userName = sc.next();
		System.out.print("Surname : ");
		String userSurname =sc.next();
		System.out.print("Units Electric : ");
		int userUnits = sc.nextInt();
		
		Electric us = new Electric (userId,userName,userSurname,userUnits);
		us.bill=CalculaterElectric.calculater(userUnits);
		System.out.println(us.toString());
	}
}
