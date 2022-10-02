package lect04;
import java.util.Scanner;
public class StockMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Stock ID : ");
		long stockId =sc.nextLong();
		System.out.print("Stock Name : ");
		String stockName = sc.next();
		System.out.print("Price : ");
		int stockPrice =sc.nextInt();
		System.out.print("Balance : ");
		int stockBalance =sc.nextInt();
		
		Stock st = new Stock(stockId,stockName,stockPrice,stockBalance);
		System.out.println(st.toString());
		sc.close();
		
	}
	
}
