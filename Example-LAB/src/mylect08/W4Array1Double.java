package mylect08;

public class W4Array1Double {
	public static void main(String[] args) {

		double[] a = new double[4];
		a[0] = 30.23456;
		a[1] = 40.16547;
		a[2] = 60.484645;
		a[3] = 90.54654;

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]:" + a[i]);
		}

	}
}