package mylect08;

import java.util.Scanner;

public class W4Arrary1Student {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Number of names: ");
		int number = sc.nextInt();
		Student[] students = new Student[number];
		for (int i = 0; i < number; i++) {
			System.out.print("id [" + i + "]:");
			int id = sc.nextInt();
			System.out.print("name [" + i + "]:");
			String name = sc.next();
			System.out.print("surname [" + i + "]:");
			String surname = sc.next();

			Student student = new Student();
			student.id = id;
			student.name = name;
			student.surname = surname;
			students[i] = student;

		}
		System.out.println("There are names ...");
		for (int i = 0; i < students.length; i++) {
			System.out.println("Student[" + i + "].ID : " + students[i].id + ", Name : " + students[i].name
					+ ", Surname : " + students[i].surname);
		}
	}
}