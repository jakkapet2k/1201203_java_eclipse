package Lab;

public class MainStudent {

	public static void main (String[] args) {
		int myId = 64011211;
		String myName ="Jakkapet";
		String mySurname="Ladnok";

		
		Student obj = new Student (myId,myName,mySurname);
		
		String myStudent = obj.toString();
		
		System.out.println("obj :" + obj.toString());
	}
}
