package lect03;

public class Electric {

	long id;
	String name;
	String surname;
	int units;
	double bill;
	
	public Electric (long id,String name,String surname ,int units) {
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.units=units;
		this.bill=0;
	}
	public String toString() {
		return "ID : "+this.id+" , Name : "+this.name+" , Surname : "+this.surname+" , Used Electric : "+
	this.units+" Unit , ElectricBill is : "+this.bill+" Bath";
	}
}
