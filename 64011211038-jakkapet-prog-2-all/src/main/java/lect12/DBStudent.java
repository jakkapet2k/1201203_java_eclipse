package lect12;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class DBStudent {

	public static Vector<Student> searchDB(String sql) throws SQLException {

		Vector<Student> students = new Vector();

		DBConnection connDB = new DBConnection();
		Connection con = connDB.getConnection();

		Statement stmnt = null;
		if (con != null) {
			stmnt = con.createStatement();
			ResultSet rs = stmnt.executeQuery(sql);
			while (rs.next()) {
				long id = rs.getLong("ID");
				String name = rs.getString("NAME");
				String surname = rs.getString("SURNAME");
				double mark = rs.getDouble("MARK");
				char grade = rs.getString("GRADE").charAt(0);
				Student student = new Student(id, name, surname, mark, grade);
				students.add(student);
			}
			stmnt.close();
			con.close();
		}
		return students;
	}

	public static void executeDB(String sql) throws SQLException {
		System.out.println("StudentDB.addStudent()");
		DBConnection connDB = new DBConnection();
		Connection con = connDB.getConnection();

		Statement stmnt = null;
		if (con != null) {
			stmnt = con.createStatement();
			stmnt.execute(sql);
			stmnt.close();
			con.close();
		}
	}

}
