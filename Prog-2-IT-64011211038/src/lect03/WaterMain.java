package lect03;

import java.util.Scanner;

public class WaterMain {

	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Water Unit :");
		int usUnit = sc.nextInt();
		
		
		Water us = new Water(usUnit);
		us.bill=CalculaterWater.calculater(usUnit);
		System.out.println(us.toString());
		
		sc.close();
	}
	
}
