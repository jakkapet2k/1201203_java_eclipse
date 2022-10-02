package lect03;
import java.util.Scanner; 
public class StudentMarkMain {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Student ID : ");
		long id = sc.nextLong();
		System.out.print("Name : ");
		String name = sc.next();
		System.out.print("Surname : ");
		String surname = sc.next();
		System.out.print("Mark : ");
		int mark = sc.nextInt();
		
		char grade = ' ';
		if(mark<60) {
			grade = 'U';
		}else {
			grade = 'S';
		}
	
		System.out.println("Grade : "+grade);
		
		StudentMark student = new StudentMark();
		
		System.out.println("Before Student : "+student);
		System.out.println("After Student.toString : "+student.toString());
		System.out.println("ID : " +student.id);
		System.out.println("name : " +student.name);
		
		student.id =id;
		student.name =name;
		student.surname =surname;
		student.mark =mark;
		student.grade =grade;
		
		System.out.println("Before Student : "+student);
		System.out.println("After Student.toString : "+student.toString());
		System.out.println("ID : " +student.id);
		System.out.println("name : " +student.name);
		
		StudentMark student2 = new StudentMark(id,name,surname,mark,grade);
		System.out.println("After Student2 : "+student2);
		System.out.println("After Student2.toString() : "+student2.toString());
 }
}
