package lect03;

public class Water {
	int unit;
	double bill;
	
	public Water (int unit) {
		this.unit=unit;
		this.bill=0;
	}
	
	public String toString() {
		return "Used Water : " + this.unit+"Unit , Water Bill is :"+this.bill+"Baht";
	}
}
