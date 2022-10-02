package Lab;

public class MainMarkStudent {
	
	public static void main(String[] args) {
		int myId = 64011211;
		String myName = "Jakkapet";
		String mySurname = "Ladnok";
		int myMark = 80 ;
		
		MarkStudent obj = new MarkStudent(myId ,myName ,mySurname ,myMark);
		String data = obj.toString();
		System.out.print("obj :"+obj.toString());
		
	}

}
