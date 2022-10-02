package lect05;

public class StudenMain {
	
	public static void main(String [] args) {
		int id =1038;
		String name= "Jakkapet";
		String surname="Ladnok";
		int mark =85;
		char grade = ' ';
		
		GradePractice grader =new GradePractice();
		grade=grader.grade(mark);
		
		Student student = new  Student(id,name,surname,mark,grade);
		System.out.print("Run$ "+student);
	}

}
	