package mysummer;

public class MultiplyWhile {
	
	public static void main(String[] args) {
		
		int count=2;
		while(count <=12) {
			System.out.println("Multiply Number : " + count);
			int multiply=2;
			while(multiply <=12) {
				int multi = count*multiply;
				System.out.println(count + " x " + multiply + " = " + multi);
				multiply++;
			}
			System.out.println("------------------------");
			count++;
		}
		
	}

}
