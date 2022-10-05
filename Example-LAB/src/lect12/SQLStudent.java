package lect12;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class SQLStudent {
	public static String updateStudentSQL(Student student) {
		System.out.println("StudentDB.updateStudent()");
		String updateSql = "UPDATE STUDENT SET " 
				+ "NAME='" + student.name + "'" 
				+ ", SURNAME='" + student.surname + "'"
				+ ", MARK=" + student.mark 
				+ ", GRADE='" + student.grade 
				+ "'" + " WHERE ID=" + student.id;
		System.out.println("updateSql:" + updateSql);
		return updateSql;
	}

	public static String deleteStudentSQL(long id) {

		System.out.println("StudentDB.deleteStudent()");
		String deleteSql = "DELETE FROM STUDENT WHERE ID=" + id;
		System.out.println("deleteSql:" + deleteSql);
		return deleteSql;
	}

	public static String searchStudentSQL(long id) {
		System.out.println("StudentDB.search()");
		String searchSql = "SELECT * FROM STUDENT WHERE ID=" + id;
		System.out.println("selectSql:" + searchSql);
		return searchSql;
	}

	public static String viewStudentsSQL() {
		System.out.println("StudentDB.viewStudents()");
		String selectSql = "SELECT * FROM STUDENT";
		System.out.println("selectSql:" + selectSql);
		return selectSql;
	}

	public static String addStudentSQL(Student student) {
		System.out.println("StudentSQL.addStudentSQL()");
		String insertSql = "INSERT INTO STUDENT VALUES" 
				+ "(" + student.id 
				+ ", '" + student.name + "'"
				+ ", '"	+ student.surname + "'"
				+ ", " + student.mark 
				+ ", '" + student.grade + "')";
		System.out.println("insertSql:" + insertSql);
		return insertSql;
	}

}
