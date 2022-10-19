package ActivityReport;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class DBBalance {

	public static Vector<BalanceGoods> searchDB(String sql) throws SQLException {

		Vector<BalanceGoods> balance = new Vector();

		ConnMariaDB connDB = new ConnMariaDB();
		Connection con = connDB.getConnection();

		
		Statement stmnt = null;
		if (con != null) {
			stmnt = con.createStatement();
			ResultSet rs = stmnt.executeQuery(sql);
			while (rs.next()) {
				String name = rs.getString("NAME");
				int stock = rs.getInt("STOCK");
				BalanceGoods goods = new BalanceGoods(name,stock);
				balance.add(goods);
			}
			stmnt.close();
			con.close();
		}
		return balance;
	}

	public static void executeDB(String sql) throws SQLException {
		System.out.println("balanceDB.addBalance()");
		
		ConnMariaDB connDB = new ConnMariaDB();
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
