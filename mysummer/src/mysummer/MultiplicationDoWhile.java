package mysummer;

public class MultiplicationDoWhile {
	
	public static void main (String[] args) {
		
		int count=2;
		do {
			System.out.println("Multiply Number : "+ count);

			int multiply = 2;
			do {
				int multisum = count*multiply;
				System.out.println(count + " x " + multiply + " = " + multisum);
				multiply++;
			
			}while(multiply <= 12);
			count++;
			System.out.println("-----------------------");
			
		}while(count <=12);
		
	}

}
