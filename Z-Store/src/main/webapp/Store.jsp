<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Store</title>
</head>
<body>


	<%
	try {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection("jdbc:mariadb://202.28.34.205:3306/db60011213190", "60011213190",
			"60011213190");
			statement = connection.createStatement();
			String query = "  SELECT * FROM goods;";
			resultSet = statement.executeQuery(query);

		} catch (Exception e) {
			out.println("An error occurred.");
		}
	%>






	<div >
		<h1>Store</h1>
		<table border="1" cellpadding="5">

			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Price</th>
				<th>Stock</th>
			</tr>

			<%
			while (resultSet.next()) {
			%>
			
			<tr>
				<td>
					<%=resultSet.getString("name")%>
				</td>
				<td>
					<%=resultSet.getString("description")%>
				</td>
				<td>
					<%=resultSet.getString("unit_price")%>
				</td>
				<td> 
					<%=resultSet.getString("stock")%>
				</td>
				</form>
				<td><a href="ordergoods.jsp"><button type="button">Buy</button></a></td>
				
			</tr>
			
			<%
			}
			connection.close();
			} catch (Exception e) {
			e.printStackTrace();
			}
			%>

		</table>
	</div>

<br><br>
</body>
</html>