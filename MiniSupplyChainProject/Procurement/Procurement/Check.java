package Procurement;

public class Check {
	String goods;
	String receivedate;
	public Check(String name, String receivedate) {
		this.goods = name;
		this.receivedate=receivedate;
	}
	
	public String toString() {
		return "id:" + goods +", receivedate:" + receivedate ;
	}
}
