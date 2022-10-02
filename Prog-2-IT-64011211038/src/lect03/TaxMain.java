package lect03;
import java.util.Scanner;
public class TaxMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Income : ");
		int userIncome =sc.nextInt();
		
		TaxUser tax = new TaxUser(userIncome);
		tax.tax=CalculaterTax.calculater(userIncome);
		System.out.println(tax.toString());
	}
}
