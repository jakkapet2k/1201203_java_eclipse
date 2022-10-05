package lect12;

public class Student {
	long id;
	String name;
	String surname;
	double mark;
	char grade;
	Student(long id, String name, String surname, double mark, char grade) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.mark = mark;
		this.grade = grade;
	}
	
	public String toString() {
		return "id:" + id + ", name:" + name + ", surname:" + ", mark:" + mark + ", grade:" + grade;
	}
}
