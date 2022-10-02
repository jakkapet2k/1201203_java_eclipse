package lect04;

public class Supplier {
	long id;
	String nameCompany;
	String companyNo;
	String village;
	String districtSub;
	String district;
	String province;
	int tel;
	
	public	Supplier (long id, String nameCompany,String companyNo,String village ,String districrSub,String district,String province,int tel ) {
		this.id=id;
		this.nameCompany=nameCompany;
		this.companyNo=companyNo;
		this.village=village;
		this.districtSub=districrSub;
		this.district=district;
		this.province=province;
		this.tel=tel;
	}
	public String toString() {
		return"-------------------------------------------------\n"+
				"ID : "+this.id+"\n"+
				"Company name : "+this.nameCompany+"\n"+
				"Address :"+this.companyNo+" "+this.village+" "+this.districtSub+" "+
				this.district+" "+this.province+"\n"+
				"Tel : "+this.tel;
	}
	
}
