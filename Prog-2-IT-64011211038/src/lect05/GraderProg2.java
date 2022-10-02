package lect05;
public class GraderProg2 implements Grader {

	public char grade(int mark) {
		
		char grade =' ';
		if (mark <50) {
			grade ='F';
		}else if (mark <60){
			grade = 'D';
		}else if (mark <70) {
			grade ='C';
		}else if (mark <80) {
			grade ='B';
		}else {
			grade='A';
		}
		return grade;
		
	}
}
