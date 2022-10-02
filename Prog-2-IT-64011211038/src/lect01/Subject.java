package lect01;

public class Subject {

	int id ;
	String title;
	String lecturer;
	
	public Subject(int id,String title,String lecturer) {
		
		this.id = id;
		this.title = title;
		this.lecturer = lecturer;
	}
	
	public String toString() {
		
		String data = id + "-" + title + "-" +lecturer;
		return data;
	}
}
