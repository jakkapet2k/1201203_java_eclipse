package lect03;
import java.util.Scanner;
public class StudentMain {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID : ");
		long myId =sc.nextLong();
		System.out.print("Name : ");
		String myName = sc.next();
		System.out.print("Surname : ");
		String mySurname = sc.next();
		System.out.print("Mark : ");
		int myMark = sc.nextInt();
		
		Student studen =  new Student(myId,myName,mySurname,myMark);
		studen.grade = Grade.grading(myMark);
		System.out.println(studen.toString());
		sc.close();
	}
}
