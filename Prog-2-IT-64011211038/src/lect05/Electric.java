package lect05;

public class Electric {
	double bill;
	int units;
	
	public Electric (int units) {
		this.bill=0;
		this.units=units;
	}
	
	public String toString() {
		return "Used Unit : "+this.units+" Unit , Bill is :"+this.bill+" Baht";
	}

}
