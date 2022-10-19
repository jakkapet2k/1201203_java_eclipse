package lect12;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;

import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import util.HTMLFilter;

/**
 * Servlet implementation class AddServet
 */
@WebServlet("/Week13.AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddServlet() {
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
		response.getWriter().append("AddServlet Served at: ").append(request.getContextPath());
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
		String title = "Add Student";
		out.println("<head><title>" + title + "</title></head>");
		out.println("<body>");
		out.println("<h3>" + title + "</h3>");
		try {

			// Display the request parameters. Trim and discard empty string.
			boolean noParam = true;
			String formId = "id";
			String formName = "name";
			String formSurname = "surname";
			String formMark = "mark";
			String idStr = request.getParameter(formId);
			if (idStr != null && (idStr = idStr.trim()).length() != 0) {
				out.println(formId + ":" + idStr + "</br>");
				noParam = false;
			}
			String nameStr = request.getParameter(formName);
			if (nameStr != null && (nameStr = nameStr.trim()).length() != 0) {
				out.println(formName + ":" + nameStr + "</br>");
				noParam = false;
			}
			String surnameStr = request.getParameter(formSurname);
			if (surnameStr != null && (surnameStr = surnameStr.trim()).length() != 0) {
				out.println(formSurname + ":" + surnameStr + "</br>");
				noParam = false;
			}
			String markStr = request.getParameter(formMark);
			if (markStr != null && (markStr = markStr.trim()).length() != 0) {
				out.println(formMark + ":" + markStr + "</br>");
				noParam = false;
			}
			long id = Long.parseLong(idStr);
			double mark = Double.parseDouble(markStr);
			char grade = Grader.gradeMark(mark);
			Student student = new Student(id, nameStr, surnameStr, mark, grade);
			
			// create sql command
			String addSql = SQLStudent.addStudentSQL(student);
			// execute sql command
			DBStudent.executeDB(addSql);

			out.println("</br>");
			out.println("Student added successfully</br>");
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
