package lect03;

public class CalculaterTax {
	public static int calculater(int income){
		int tax= 0;
		int quantity=7500;
		int quantity2=quantity+20000;
		int quantity3=quantity2+37500;
		int quantity4=quantity3+50000;
		int quantity5=quantity4+250000;
		int quantity6=quantity5+900000;
		
		if (income <= 150000) {
			tax =0;
		}else if (income <=300000){
			tax =((income-150000)/100)*5;
		}else if (income <=500000) {
			tax = quantity+(((income-300000)/100)*10);
		}else if (income <=750000){
			tax = quantity2+(((income-500000)/100)*15);
		}else if (income <=10000000) {
			tax = quantity3+(((income-750000)/100)*20);
		}else if (income <=2000000) {
			tax = quantity4+(((income-1750000)/100)*25);
		}else if (income <=5000000) {
			tax = quantity5+(((income-4750000)/100)*30);
		}else {
			tax = quantity6+(((income-4750000)/100)*35);
		}
		return tax;
	}
}
