package lect01;

public class MainTeaching {
	
	public static void main(String[] args) {
		int myIdSubject = 1201203;
		int myIdLecturer = 12123;
		String myIdClassRoom = "IT405";
		
		Teaching obj = new Teaching(myIdSubject, myIdLecturer, myIdClassRoom);
		String myTeaching = obj.toString();
		System.out.println("obj : "+ myTeaching);
	}
}
