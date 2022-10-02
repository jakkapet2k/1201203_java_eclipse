package Lab;
import java.util.Scanner;
public class Grade2 {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mark : ");
		int mark =sc.nextInt();
		char grade =  ' ';
		if (mark < 60) {
			grade = 'u';
		}else  {
			grade ='S';
		}
		System.out.print("Mark : "+grade);
		
	}
}
