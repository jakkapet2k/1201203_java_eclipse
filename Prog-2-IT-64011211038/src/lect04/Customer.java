package lect04;

public class Customer {
	long id;
	String name;
	String surname;
	String brithDate;
	String houdeNo;
	String village;
	String districtSub;
	String district;
	String province;
	int telNumber ;
	
	public Customer (long id,String name,String surname,String brithDate,String houdeNo,String village,String districtSub,String district,
			String province,int telNumber ) {
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.brithDate=brithDate;
		this.houdeNo=houdeNo;
		this.village=village;
		this.districtSub=districtSub;
		this.district=district;
		this.province=province;
		this.telNumber=telNumber;
	}
	public String toString() {
		return "----------------------------------------------\n"+
				"ID Custommer :"+this.id+"\n"+
				"Name-Surname : "+this.name+this.surname+"\n"+
				"BrithDay : "+this.brithDate+"\n"+
				"Address : "+this.houdeNo+" "+this.village+" "+this.districtSub+" "+this.district+" "+this.province+"\n"+
				"Tel : "+this.telNumber+"\n" +
				 "----------------------------------------------\n";
	}
}
