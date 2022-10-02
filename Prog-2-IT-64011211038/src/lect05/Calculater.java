package lect05;

public class Calculater {
	public static double calculaterEr (int units) {
		double bill=0;
		double amoute=15*2.3488;
		double amoute2=amoute+(10*2.9882);
		double amoute3=amoute2+(10*3.2405);
		double amoute4=amoute3+(65*3.6237);
		double amoute5=amoute4+(50*3.7171);
		double amoute6=amoute5+(250*4.2218);
		
		if (units <= 15) {
			bill = units*2.3488;
		}else if (units <=25) {
			bill = amoute+((units-15)*2.9882);
		}else if (units <=35) {
			bill = amoute2+((units-25)*3.2405);
		}else if (units <=100) {
			bill = amoute3+((units-35)*3.6237);
		}else if (units <=150) {
			bill = amoute4+((units-100)*4.2218);
		}else if (units <=400) {
			bill = amoute5+((units-150)*4.4217);
		}else {
			bill = amoute6+((units-400)*4.4217);
		}
		
		return bill+8.19;
				
	}

}
