package lect02;

public class Student {
	
	int id;
	String name;
	String surname;
	int mark;
	char grade = ' ';
	
	public Student(	int id,String name,String surname,int mark) {
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.mark=mark;
		

		if(mark <= 49) {
			grade = 'F';
		} else if(mark <= 59) {
			grade = 'D';		
		} else if(mark <= 69) {
			grade = 'C';
		} else if(mark <= 79) {
			grade = 'B';
		} else {
			grade = 'A';
		}
		
	}

public String toString() {
		
		String data = "ID : "+ id +"\nName : " + name +"\nSurname :" + surname+"\nMark : "+ mark + "\nGrade : " +grade;
		return data;
	}
}
