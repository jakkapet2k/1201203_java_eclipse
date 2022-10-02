package lect01;

public class Teaching {

	int idSubject;
	int idLecturer;
	String idClassRoom;
	
	public Teaching (int idSubject,int idLecturer,String idClassRoom) {
		this.idSubject = idSubject;
		this.idLecturer = idLecturer;
		this.idClassRoom = idClassRoom;
		
	}
	public String toString() {
		String data = idSubject+"-"+idLecturer+"-"+idClassRoom;
		return data;
	}
}
