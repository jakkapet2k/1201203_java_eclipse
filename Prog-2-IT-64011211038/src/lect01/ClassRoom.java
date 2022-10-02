package lect01;

public class ClassRoom {
	int id;
	int capacity;
	String name;
	
	public ClassRoom(int id,int capacity,String name) {
		this.id = id;
		this.capacity = capacity;
		this.name = name;
	}
	public String toString() {
		String data = id + "-" + capacity + "-" + name;
		return data ;
	}
}
