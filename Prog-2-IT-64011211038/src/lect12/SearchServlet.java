package lect12;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServet
 */
@WebServlet("/Week13.SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("SearchServlet Served at: ").append(request.getContextPath());
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
		String title = "Search Student";
		out.println("<head><title>" + title + "</title></head>");
		out.println("<body>");
		out.println("<h3>" + title + "</h3>");
		try {

			// Display the request parameters. Trim and discard empty string.
			boolean noParam = true;
			String formId = "id";
			String idStr = request.getParameter(formId);
			if (idStr != null && (idStr = idStr.trim()).length() != 0) {
				out.println(formId + ":" + idStr + "</br></br>");
				noParam = false;
			}
			long id = Long.parseLong(idStr);
			// create sql command
			String searchSql = SQLStudent.searchStudentSQL(id);
			// execute sql command
			DBStudent.executeDB(searchSql);
			Vector<Student> students = DBStudent.searchDB(searchSql);
			if(!students.isEmpty()) {
				Student student = students.elementAt(0);
				// reset text fields
				out.println("ID:" + student.id + "</br>");
				out.println("Name:" + student.name + "</br>");
				out.println("Surname:" + student.surname + "</br>");
				out.println("Mark:" + student.mark + "</br>");
				out.println("Grade:" + student.grade + "</br>");
			} else {
				out.println("<font color=\"red\">Not found!</font></br>");
			}
			out.println("</br>");
		} catch (SQLException ex) {
			out.println("<font color=\"red\">Error! " + ex.getMessage() + "</font></br>");
			ex.printStackTrace();
		} catch (NumberFormatException ex) {
			out.println("<font color=\"red\">Error! " + ex.getMessage() + "</font></br>");
			ex.printStackTrace();
		}
		out.println("</br>");
		out.println("<a href=\"index.html\">Home</a>");
		out.println("</body></html>");
		out.close(); // Always close the output writer
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
