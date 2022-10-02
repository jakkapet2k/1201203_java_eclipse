package summer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {
	public static void main(String[] args) {
		System.out.println("ReadFile.main()");
		String fileName = "StudentMarks.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
