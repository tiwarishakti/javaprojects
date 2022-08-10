package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		try {
			
			int id = Integer.parseInt(request.getParameter("ID"));
			String name = request.getParameter("name");
			String color = request.getParameter("color");
			float price = Float.parseFloat(request.getParameter("price"));

			ProductClass product1 = new ProductClass(id, name, color, price);


			HttpSession session = request.getSession();
			session.setAttribute("data", product1);
			request.setAttribute("data", product1.getProductDetails());
			RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
			rd.forward(request, response);

			

		} catch (NumberFormatException e) {
			out.println(e);
		} catch (Exception e) {
			out.println(e);
		}
	}
}