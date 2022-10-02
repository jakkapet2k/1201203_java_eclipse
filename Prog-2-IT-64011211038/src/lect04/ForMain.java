package lect04;
import java.util.Scanner;
public class ForMain {

		public static void main (String [] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Stock : ");
			int stock = sc.nextInt();
			System.out.println();
			for(int i=1;i<=stock;i++) {
				System.out.println("Stock No."+i+"/"+stock);
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
				
			}
			System.out.println("Good By.!!");
			sc.close();
		}
}
