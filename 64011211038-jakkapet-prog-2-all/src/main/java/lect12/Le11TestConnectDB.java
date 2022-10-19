package lect12;

import java.util.Scanner;
import java.sql.*;

public class Le11TestConnectDB {

	public static void testConnection() {
		
		// TODO Auto-generated method stub
		System.out.println("TestConnectDB.main()");
		//DBConnection connDB = new DBConnection();
		ConnMariaDB connDB = new ConnMariaDB();
		Connection con = connDB.getConnection();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Press any key ...");
		scanner.nextLine();
		if(con!=null) {
			try {
				con.close();
				System.out.println("Connection closed!");
			} catch(Exception ex) {
				;
			}
		}
		System.out.println("Goodbye");
	}
	
	public static void main(String[] args) {
		
		Le11TestConnectDB.testConnection();
		
	}

}
