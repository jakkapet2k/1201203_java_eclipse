package lect03;

public class TaxUser {

	int income;
	int tax;
	
	public TaxUser(int income) {
		this.income=income;
		this.tax=0;
	}
	public String toString() {
		return "User Income "+this.income+" Baht , User Tax is " + this.tax+" Baht";
	}
}
