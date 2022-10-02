package lect01;

public class MainSubject {

	public static void main (String[] args) {
		
		int myId = 1201203;
		String myTitle = "Come Programming 2";
		String myLecturer = "Chattrakul";
		
		Subject obj = new Subject (myId,myTitle,myLecturer);
		String mySubject = obj.toString();
		System.out.println("obj : " + mySubject);
	}
	
}
