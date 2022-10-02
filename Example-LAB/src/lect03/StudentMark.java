package lect03;

public class StudentMark {

	long id;
	String name;
	String surname;
	int mark;
	char grade;
	
	public StudentMark() {
		;
	}
	
	public StudentMark(long id,String name,String surname,int mark,char grade) {
		
		this.id = id;
		this.name=name;
		this.surname = surname;
		this.mark=mark;
		this.grade= grade;
	}
	
	public String toString() {
		String data = "Name : "+ this.id + ", Surname : "+ this.surname+", Mark : "+this.mark+", Grade : "+this.grade;
		return data;
	}
}
