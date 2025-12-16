package com.codegnan.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("uname");
		String password=request.getParameter("upwd");
		out.println("<html><body>");
		out.println("<h1 style ='color:red' align='center'>");
		if(name.equals("codegnan")&&password.equals("codegnan@123")) {
			//out.println("Success");
			response.sendRedirect("success");
		}else {
			//out.println("Failure");
			response.sendRedirect("failure");
		}
		out.println("</h1>");
		out.println("<h3 align='center'>");
		out.println("<a href='./LoginForm.html'>|Login Form|</a>");
		out.println("</h3></body></html>");
	}

}
