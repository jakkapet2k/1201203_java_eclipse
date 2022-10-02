package lect05;
import java.util.Scanner;
public class ElectricMain {
	public static void main(String [] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unit :");
		int userUnits = sc.nextInt();
		
		
		Electric us = new Electric(userUnits);
		us.bill=Calculater.calculaterEr(userUnits);
		System.out.println(us.toString());
	}

}
