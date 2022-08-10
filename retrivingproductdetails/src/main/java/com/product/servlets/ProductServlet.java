package com.product.servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/productServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ProductServlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="jdbc:mysql://localhost/myproduct";
		String uname="root";
		String pass="1182511";
		
		response.setContentType("text/html");
		
		int ID = Integer.parseInt(request.getParameter("ID"));
	
		PrintWriter out = response.getWriter();
		
		String query="select * from account where ProductID=?";
		out.print("<h1>   Details   </h1>");
		try {
	      Class.forName("com.mysql.jdbc.Driver");
	      Connection dbCon = DriverManager.getConnection(url, uname, pass);
	      PreparedStatement st=  dbCon.prepareStatement(query);
	      
	      st.setInt(1, ID);
	      
	      ResultSet rs =st.executeQuery();
	      out.println("<table>");
			out.println("<tr>");
			out.print("<td>");
			out.println("ProductID");
			out.print("</td>");
			out.print("<td>");
			out.println("ProductName");
			out.print("</td>");
			out.print("<td>");
			out.println("Price");
			out.print("</td>");
			out.print("<td>");
			out.println("Color");
			out.print("</td>");
			out.println("</tr>");
			
	      
	      while(rs.next()) {
	    	  
	    	  out.print("<tr><td>");
	    	  out.println(rs.getInt(1));
	    	  out.print("</td>");
	    	  out.print("<td>");
	    	  out.print(rs.getString(2));
	    	  out.print("</td>");
	    	  out.print("<td>");
	    	  out.print(rs.getInt(3));
	    	  out.print("</td>");
	    	  out.print("<td>");
	    	  out.print(rs.getString(4));
	    	  out.print("</td>");
	    	  out.print("</tr>");
			}
	     
	      out.println("</table>");
	      
		}
		catch(Exception e){
			
			System.out.println("Some Issue : "+ e.getMessage());
			
			
		}
		
		out.print("</table>");
		
	}

}