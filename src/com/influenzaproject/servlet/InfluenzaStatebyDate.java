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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cluster cluster = Cluster.builder().addContactPoint("localhost").build();

		Session session = cluster.connect();
		
		
		String state = request.getParameter("state");
		PrintWriter out = response.getWriter();
		out.write("State " + state);
		
		String Date = request.getParameter("Date");
		out.write("date " + Date);
		
        String queryText = "SELECT subtype,strain_id state FROM influenza.state_date WHERE state = '" + state + "'" + " AND date ='" + Date +"'";
		
		ResultSet results = session.execute(queryText);
		
		for (Row row : results) {		
			  String subtype = row.getString("subtype");
			  String location = row.getString("strain_id");
			  out.println("<tr>");
			  out.println("<td>" + subtype + "</td>");
			  out.println("<td>" + strain_id + "</td>");
			  out.println("</tr>");
			}
	}

}
