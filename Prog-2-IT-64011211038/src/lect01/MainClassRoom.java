package lect01;

public class MainClassRoom {

	public static void main (String[] args) {
		int myId = 405;
		int myCapacity =50;
		String myName = "IT";
		
		ClassRoom obj = new ClassRoom(myId,myCapacity,myName);
		String myClassRoom = obj.toString();
		System.out.println("obj : "+myClassRoom);
	}
}
