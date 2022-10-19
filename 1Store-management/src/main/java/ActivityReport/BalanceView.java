package ActivityReport;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/activityReport.BalanceGoods")
public class BalanceView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BalanceView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("BalanceView Served at: ").append(request.getContextPath());
		// Set the response message's MIME type
		response.setContentType("text/html;charset=UTF-8");
		// Allocate a output writer to write the response message into the network
		// socket
		PrintWriter out = response.getWriter();

		// Use ResourceBundle to keep localized string in "LocalStrings_xx.properties"
		// ResourceBundle rb = ResourceBundle.getBundle("LocalStrings",
		// request.getLocale());
		
		// Write the response message, in an HTML page
		out.println("<!DOCTYPE html"); // HTML 5
		out.println("<html><head>");
		out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
		String title = "Balance Report";
		out.println("<head><title>" + title + "</title></head>");
		out.println("<body class="+"text-center"+" >");
		out.println("<center>");
		out.println("<h3>" + title + "</h3>");
		try {
			// create sql command
			String sql = SQLBalance.ViewBalanceSQL();
			Vector<BalanceGoods> balancegoode = DBBalance.searchDB(sql);
			
			out.println("<table border=1>\n");
			out.println("<tr >");		
			out.println("<td> NAME </td>"
					+ "<td> STOCK </td>");
			out.println("</tr>");
			for(Iterator<BalanceGoods> it=balancegoode.iterator();it.hasNext();)
			{
				BalanceGoods balance = (BalanceGoods)it.next();
				out.println("<tr>");
				out.println("<td>" + balance.name + "</td>"
						+ "<td>" + balance.stock + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			
			out.println("</br></br>");
			out.println("Student retrieved successfully</br>");
		} catch (SQLException ex) {
			out.println("Error! " + ex.getMessage());
			ex.printStackTrace();
		}
		out.println("</br>");
		out.println("<a href=\"index.html\">Home</a>");
		out.println("</center>");
		out.println("</body></html>");
		out.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
