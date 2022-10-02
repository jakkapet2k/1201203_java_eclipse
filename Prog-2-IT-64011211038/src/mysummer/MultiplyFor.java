package mysummer;

public class MultiplyFor {
	
	public static void main (String[] args) {
		
		for (int count=2; count <=12; count++) {
			
			System.out.println("Mutiply Number : " + count );
			for(int multiply=2; multiply <=12; multiply++) {
				
				int multisum = count*multiply;
				System.out.println(count + " x " + multiply + " = " + multisum);				
			}
			
			System.out.println("-----------------");
		}
		
	}

}
