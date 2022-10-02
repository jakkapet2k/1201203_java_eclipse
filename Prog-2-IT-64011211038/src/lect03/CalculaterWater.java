package lect03;

public class CalculaterWater {

	public static double calculater(int unit) {
		double bill=0;
		double quantity = 10*10.2;
		double quantity2= quantity*(10*16);
		double quantity3= quantity2*(10*19);
		
		if(unit <=10 ) {
			bill = unit*10.2;
		}else if (unit <=20) {
			bill = quantity+((unit-10)*16);
		}else if (unit <=30) {
			bill = quantity2+((-20)*19);
			
		}else {
			bill = quantity3+((unit-30)*21.2);
		}
		return bill;
	}
}
