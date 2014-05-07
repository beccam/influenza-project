package com.influenzaproject.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfluenzaHome
 */
@WebServlet("/")
public class InfluenzaHome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InfluenzaHome() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<head>");
		out.print("<meta content=\"text/html; charset=ISO-8859-1\"");
		out.print("http-equiv=\"content-type\">");
		out.print("<title>Influenza Home</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Influenza Database</h1>");
		out.print("<form method=\"get\"");
		out.print("action=\"http://localhost:8080/Influenza/strain-by-year\"");
		out.print("name=\"strain-by-year\">Click ");
		out.print("for Strain by Year");
		out.print("<select name=\"Subtype\">");
		out.print("<option>H1N1</option>");
		out.print("<option>H3N2</option>");
		out.print("</select>");
		out.print("<select name=\"strain-year\">");
		out.print("<option>2007</option>");
		out.print("<option>2008</option>");
		out.print("<option>2009</option>");
		out.print("<option>2010</option>");
		out.print("<option>2011</option>");
		out.print("<option>2012</option>");
		out.print("</select>");
		out.print("<button>Submit</button><br>");
		out.print("<br>");

		out.print("<br>");
		out.print("</form>");
		out.print("<br>");
		out.print("<form method=\"get\" action=\"http://localhost:8080/Influenza/state-by-date\" name=\"state-by-date\">Click ");
		out.print("for State by Date");
		out.print("<select name=\"state\">");
		out.print("<option value=\"AL\">Alabama</option>");
		out.print("<option value=\"AK\">Alaska</option>");
		out.print("<option value=\"AZ\">Arizona</option>");
		out.print("<option value=\"AR\">Arkansas</option>");
		out.print("<option value=\"CA\">California</option>");
		out.print("<option value=\"CO\">Colorado</option>");
		out.print("<option value=\"CT\">Connecticut</option>");
		out.print("<option value=\"DE\">Delaware</option>");
		out.print("<option value=\"FL\">Florida</option>");
		out.print("<option value=\"GA\">Georgia</option>");
		out.print("<option value=\"HI\">Hawaii</option>");
		out.print("<option value=\"ID\">Idaho</option>");
		out.print("<option value=\"IL\">Illinois</option>");
		out.print("<option value=\"IN\">Indiana</option>");
		out.print("<option value=\"IA\">Iowa</option>");
		out.print("<option value=\"KS\">Kansas</option>");
		out.print("<option value=\"KY\">Kentucky</option>");
		out.print("<option value=\"LA\">Louisiana</option>");
		out.print("<option value=\"ME\">Maine</option>");
		out.print("<option value=\"MD\">Maryland</option>");
		out.print("<option value=\"MA\">Massachusetts</option>");
		out.print("<option value=\"MI\">Michigan</option>");
		out.print("<option value=\"MN\">Minnesota</option>");
		out.print("<option value=\"MS\">Mississippi</option>");
		out.print("<option value=\"MO\">Missouri</option>");
		out.print("<option value=\"MT\">Montana</option>");
		out.print("<option value=\"NE\">Nebraska</option>");
		out.print("<option value=\"NV\">Nevada</option>");
		out.print("<option value=\"NH\">New Hampshire</option>");
		out.print("<option value=\"NJ\">New Jersey</option>");
		out.print("<option value=\"NM\">New Mexico</option>");
		out.print("<option value=\"NY\">New York</option>");
		out.print("<option value=\"NC\">North Carolina</option>");
		out.print("<option value=\"ND\">North Dakota</option>");
		out.print("<option value=\"OH\">Ohio</option>");
		out.print("<option value=\"OK\">Oklahoma</option>");
		out.print("<option value=\"OR\">Oregon</option>");
		out.print("<option value=\"PA\">Pennsylvania</option>");
		out.print("<option value=\"RI\">Rhode Island</option>");
		out.print("<option value=\"SC\">South Carolina</option>");
		out.print("<option value=\"SD\">South Dakota</option>");
		out.print("<option value=\"TN\">Tennessee</option>");
		out.print("<option value=\"TX\">Texas</option>");
		out.print("<option value=\"UT\">Utah</option>");
		out.print("<option value=\"VT\">Vermont</option>");
		out.print("<option value=\"VA\">Virginia</option>");
		out.print("<option value=\"WA\">Washington</option>");
		out.print("<option value=\"WV\">West Virginia</option>");
		out.print("<option value=\"WI\">Wisconsin</option>");
		out.print("<option value=\"WY\">Wyoming</option>");
		out.print("</select>");
		out.print("<button>Submit</button><br>");
		out.print("<textarea cols=\"15\" rows=\"1\" name=\"date\"></textarea><br>");
		out.print("</select>");
		out.print("<button>Submit</button><br>");
		out.print("<br>");
		out.print("</form>");
		out.print("<br>");
		out.print("<form method=\"get\" action=\"http://localhost:8080/Influenza/state-by-subtype\" name=\"state-by-subtype\">Click ");
		out.print("for State by Subtype");
		out.print("<select name=\"Subtype\">");
		out.print("<option>H1N1</option>");
		out.print("<option>H3N2</option>");
		out.print("</select>");
		out.print("<button>Submit</button><br>");
		out.print("<select name=\"state\">");
		out.print("<option value=\"AL\">Alabama</option>");
		out.print("<option value=\"AK\">Alaska</option>");
		out.print("<option value=\"AZ\">Arizona</option>");
		out.print("<option value=\"AR\">Arkansas</option>");
		out.print("<option value=\"CA\">California</option>");
		out.print("<option value=\"CO\">Colorado</option>");
		out.print("<option value=\"CT\">Connecticut</option>");
		out.print("<option value=\"DE\">Delaware</option>");
		out.print("<option value=\"FL\">Florida</option>");
		out.print("<option value=\"GA\">Georgia</option>");
		out.print("<option value=\"HI\">Hawaii</option>");
		out.print("<option value=\"ID\">Idaho</option>");
		out.print("<option value=\"IL\">Illinois</option>");
		out.print("<option value=\"IN\">Indiana</option>");
		out.print("<option value=\"IA\">Iowa</option>");
		out.print("<option value=\"KS\">Kansas</option>");
		out.print("<option value=\"KY\">Kentucky</option>");
		out.print("<option value=\"LA\">Louisiana</option>");
		out.print("<option value=\"ME\">Maine</option>");
		out.print("<option value=\"MD\">Maryland</option>");
		out.print("<option value=\"MA\">Massachusetts</option>");
		out.print("<option value=\"MI\">Michigan</option>");
		out.print("<option value=\"MN\">Minnesota</option>");
		out.print("<option value=\"MS\">Mississippi</option>");
		out.print("<option value=\"MO\">Missouri</option>");
		out.print("<option value=\"MT\">Montana</option>");
		out.print("<option value=\"NE\">Nebraska</option>");
		out.print("<option value=\"NV\">Nevada</option>");
		out.print("<option value=\"NH\">New Hampshire</option>");
		out.print("<option value=\"NJ\">New Jersey</option>");
		out.print("<option value=\"NM\">New Mexico</option>");
		out.print("<option value=\"NY\">New York</option>");
		out.print("<option value=\"NC\">North Carolina</option>");
		out.print("<option value=\"ND\">North Dakota</option>");
		out.print("<option value=\"OH\">Ohio</option>");
		out.print("<option value=\"OK\">Oklahoma</option>");
		out.print("<option value=\"OR\">Oregon</option>");
		out.print("<option value=\"PA\">Pennsylvania</option>");
		out.print("<option value=\"RI\">Rhode Island</option>");
		out.print("<option value=\"SC\">South Carolina</option>");
		out.print("<option value=\"SD\">South Dakota</option>");
		out.print("<option value=\"TN\">Tennessee</option>");
		out.print("<option value=\"TX\">Texas</option>");
		out.print("<option value=\"UT\">Utah</option>");
		out.print("<option value=\"VT\">Vermont</option>");
		out.print("<option value=\"VA\">Virginia</option>");
		out.print("<option value=\"WA\">Washington</option>");
		out.print("<option value=\"WV\">West Virginia</option>");
		out.print("<option value=\"WI\">Wisconsin</option>");
		out.print("<option value=\"WY\">Wyoming</option>");
		out.print("</select>");
		out.print("</form>");
		out.print("<br>");
		out.print("<br>");
		out.print("</body>");
		out.print("</html>");
	}

}
