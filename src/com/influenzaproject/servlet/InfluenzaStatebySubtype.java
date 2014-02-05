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
 * Servlet implementation class InfluenzaStatebySubtype
 */
@WebServlet("/state-by-subtype")
public class InfluenzaStatebySubtype extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfluenzaStatebySubtype() {
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
		
		String subtype = request.getParameter("Subtype");
		PrintWriter out = response.getWriter();
		out.write("Subtype " + subtype);
		
		if ("state" != null) {
		String state = request.getParameter("state");
		out.write("State " + state);}
		
		String queryText = "SELECT date, strain_id FROM influenza.state_subtype WHERE subtype = '" + subtype + "'" + " AND state ='" + state +"'";
		
		ResultSet results = session.execute(queryText);
		
		for (Row row : results) {		
			  String date = row.getDate("date").toString();
			  String strain_id = row.getString("strain_id");
			  out.println("<tr>");
			  out.println("<td>" + date + "</td>");
			  out.println("<td>" + strain_id + "</td>");
			  out.println("</tr>");
			}
	}

}
