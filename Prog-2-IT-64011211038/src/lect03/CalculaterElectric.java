package lect03;

public class CalculaterElectric {

	public static double calculater(int units) {
		double bill=0;
		double quantity = 15*2.3488;
		double quantity2 = quantity+(10*2.9982);
		double quantity3 = quantity2+(10*3.2405);
		double quantity4 = quantity3+(65*3.6237);
		double quantity5 = quantity4+(50*3.7171);
		double quantity6 = quantity5+(250*4.2218);
		
		if(units <=15) {
			bill = units*2.3488;
		}else if (units <=25) {
			bill = quantity+((units-15)*2.9882); 
		}else if(units <=35) {
			bill= quantity2+((units-25)*3.2405);
		}else if (units <=100) {
			bill =quantity3+((units-35)*3.6237);
		}else if (units <=150) {
			bill =quantity4+((units-100)*4.2218);
		}else if (units <=400) {
			bill = quantity5+((units-150)*4.4217);
		}else {
			bill = quantity6+((units-400)*4.4271);
		}
		return bill+8.19;
	}
}
