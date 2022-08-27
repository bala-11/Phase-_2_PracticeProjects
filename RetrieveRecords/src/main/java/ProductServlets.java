

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlets
 */
public class ProductServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ProductServlets() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());	try {
		      
		Connection con=DBConnection.getConnection();
	        
	String str= "select * from Product";
  Statement stmt= (Statement) con.createStatement();
  
  ResultSet rs=((java.sql.Statement) stmt).executeQuery(str); 
  PrintWriter out= response.getWriter();
 
  out.print("<table border=1 cellpadding=10 cellspacing=0> <thead><tr>");
  out.println("<caption><h1>Product Details</h1></caption>");
	out.print("<th>ProductId</th><th>ProductName</th><th>Price</th><th>Quantity</th>");
	out.print("<tr></thead>");
	out.print("<tbody>");
  while(rs.next())
  {
  	out.print("<tr>");
		
		out.print("<td>"+rs.getInt(1)+"</td>");
		out.print("<td>"+rs.getString(2)+"</td>");
		out.print("<td>"+rs.getFloat(3)+"</td>");
		out.print("<td>"+rs.getInt(4)+"</td>");
		out.print("</tr>");
  }
   con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
