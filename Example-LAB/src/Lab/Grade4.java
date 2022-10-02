package Lab;
import java.util.Scanner;
public class Grade4 {

		public static void main (String [] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Mark : ");
			int mark =sc.nextInt();
			char grade = ' ';	
			if(mark < 50) {
				grade = 'F';
			}else if (mark < 60) {
				grade = 'D'; 
			}else if (mark < 70) {
				grade = 'C';
			}else if (mark < 80) {
				grade = 'B';
			}else if (mark >=80 && mark <=100) {
				grade = 'A';
			}else {
				grade = 'N';
			}
			System.out.print("mark : "+grade );
			}
		}

