package Lab;

public class MarkStudent {
	
	int id;
	String name;
	String surname;
	int mark;
	
	public MarkStudent(int id, String name, String surname ,int mark) {
		this.id =id;
		this.name = name;
		this.surname=surname;
		this.mark =mark;
	}
	public String toString() {
		
		String data = id + " - "  + name +" - " + surname + " - " +mark;
		return data;
	}

}
