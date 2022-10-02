package lect02;
import java.util.Scanner;
public class Grade {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID:");
		int myId = sc.nextInt();
		System.out.print("Name:");
		String myName = sc.next();
		System.out.print("Surname:");
		String mySurname=sc.next();
		System.out.print("Mark:");
		int myMark = -1 ;
		myMark = sc.nextInt();
		
		
		Student grade = new Student (myId,myName,mySurname,myMark);
		
		String myStudent = grade.toString();
		
		System.out.println( myStudent.toString());
	}
}
