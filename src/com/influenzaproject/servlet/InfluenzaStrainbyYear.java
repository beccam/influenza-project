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
 * Servlet implementation class InfluenzaStrainbyYear
 */
@WebServlet("/strain-by-year")
public class InfluenzaStrainbyYear extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfluenzaStrainbyYear() {
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
		
		String strainYear = request.getParameter("strain-year");
		PrintWriter out = response.getWriter();
		out.write("Strain year " + strainYear);
		
		String subtype = request.getParameter("Subtype");
		out.write("Subtype " + subtype);
		
        String queryText = "SELECT date, state FROM influenza.year_subtype WHERE year = '" + strainYear + "'" + " AND subtype ='" + subtype +"'";
		
		ResultSet results = session.execute(queryText);
		
		for (Row row : results) {		
			  String date = row.getDate("date").toString();
			  String state = row.getString("state");
			  out.println("<tr>");
			  out.println("<td>" + date + "</td>");
			  out.println("<td>" + state + "</td>");
			  out.println("</tr>");
			}
	}

}
