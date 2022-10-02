package lect04;

public class Stock {
	long id;
	String name;
	int price;
	int balance;
	
	public Stock (long id,String name,int price,int balance) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.balance=balance;
	}
	
	public String toString() {
		return "ID Stock : "+this.id+", Name Stock : "+this.name+", Price : "+this.price+" Baht , Balance : "+this.balance;
	}
}
