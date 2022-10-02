package lect03;

public class Grade {
	public static char grading (int mark) 
	{
		if(mark < 50) {
			return 'F';
		}
		else if (mark < 60) {
			return 'D';
		}
		else if (mark < 70) {
			return 'C';
		}else if (mark <80) {
			return 'B';
		}else if (mark >=80 && mark <=100){
			return 'A';
		}else {
			return ' ';
		}
	}
}
