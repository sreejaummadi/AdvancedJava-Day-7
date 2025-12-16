package com.codegnan.web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			String name=request.getParameter("uname");
			String password=request.getParameter("upwd");
			RequestDispatcher rd;
			if("malli".equals(name)&&"malli".equals(password)) {
				rd=request.getRequestDispatcher("/sucess.html");
				rd.forward(request, response);
			}else {
				rd=request.getRequestDispatcher("/failure.html");
				rd.forward(request, response);
			}
	}

}
