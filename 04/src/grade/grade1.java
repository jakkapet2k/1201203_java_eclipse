package grade;
import java.util.Scanner;
public class grade1 {

	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("mark: ");
		int mark = sc.nextInt();
		char grade ;
		if(mark >=80 && mark <=100) {
			grade = 'A';
		}else if (mark >=70 && mark <=80) {
			grade = 'C';
		}else if (mark >=60 && mark <=70) {
			grade = 'D';
		}else if (mark < 50 && mark <=60) {
			grade = 'D';
		}else if (mark < 50) {
			grade = 'F';
		}else {
			grade = 'N';
		}
		System.out.print("mark : "+grade);
	}
}
