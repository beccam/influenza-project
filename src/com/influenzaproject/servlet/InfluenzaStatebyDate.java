package com.influenzaproject.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

/**
 * Servlet implementation class InfluenzaStatebyDate
 */
@WebServlet("/state-by-date")
public class InfluenzaStatebyDate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InfluenzaStatebyDate() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cluster cluster = Cluster.builder().addContactPoint("192.168.56.101")
				.build();

		Session session = cluster.connect();

		String state = request.getParameter("state");
		PrintWriter out = response.getWriter();
		// out.write("State " + state);

		String Date = request.getParameter("date");
		// out.write("date " + Date);

		String queryText = "SELECT subtype,strain_id FROM influenza.state_date WHERE state = '"
				+ state + "'" + " AND collection_date ='" + Date + "'";

		ResultSet results = session.execute(queryText);

		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 "
				+ "Transitional//EN\">\n" + "<HTML>\n"
				+ "<head><title>Track a Package</title></head>\n"
				+ "<body style=\"font:14px arial,sans-serif\">\n");
		out.println("<p>&nbsp; </p>");
		out.println("<style type=\"text/css\">");
		out.println("table.gridtable {");
		out.println("	font-family: verdana,arial,sans-serif;");
		out.println("	font-size:11px;");
		out.println("	color:#333333;");
		out.println("	border-width: 1px;");
		out.println("	border-color: #666666;");
		out.println("	border-collapse: collapse;");
		out.println("}");
		out.println("table.gridtable th {");
		out.println("	border-width: 1px;");
		out.println("	padding: 8px;");
		out.println("	border-style: solid;");
		out.println("	border-color: #666666;");
		out.println("	background-color: #dedede;");
		out.println("}");
		out.println("table.gridtable td {");
		out.println("	border-width: 1px;");
		out.println("	padding: 8px;");
		out.println("	border-style: solid;");
		out.println("	border-color: #666666;");
		out.println("	");
		out.println("	background-color: #ffff00;");
		out.println("}");
		out.println("</style>");
		out.println("<table class=\"gridtable\">");
		out.println("<tr><th>Sub Type</th><th>Strain ID</th></tr>");
		for (Row row : results) {
			String subtype = row.getString("subtype");
			String strain_id = row.getString("strain_id");
			out.println("<tr>");
			out.println("<td>" + subtype + "</td>");
			out.println("<td>" + strain_id + "</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body></html>");
	}

}
