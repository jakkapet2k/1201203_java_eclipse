package lect01;

public class Lecturer {

	int id;
	String name;
	String surname;
	
	public Lecturer(int id, String name,String surname) {
		
		this.id=id;
		this.name=name;
		this.surname=surname;
	}
	public String toString() {
		String data = id + "-" + name + "-" + surname;
		return data;
	}
}
