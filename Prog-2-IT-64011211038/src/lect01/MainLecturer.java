package lect01;

public class MainLecturer {

	public static void main (String[] args) {
		
		int myId = 12123;
		String myName = "Chattrakul";
		String mySurname = "Sombuttheera";
		
		Lecturer obj = new Lecturer(myId,myName,mySurname);
		String myLecturer = obj.toString();
		System.out.println("obj : "+myLecturer);
	}
}
