package Lab;

public class Student {
	int id;
	String name;
	String surname;
	
	public Student(int id, String name, String surname) {
		
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	
	public String toString() {
		
		String data = id + "-" + name +"-" + surname;
		return data;
	}
}
