package mylect08;

public class W4Array1String {
	public static void main(String[] args) {

		String[] name = new String[3];
		name[0] = "Neung";
		name[1] = "Petch";
		name[2] = "Beem";

		for (int i = 0; i < name.length; i++) {
			System.out.println("name[" + i + "]:" + name[i]);
		}
	}

}
