package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Login",urlPatterns = "/login")
public class Login extends HttpServlet{
	/**
	 * 
	 */

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		if(username.equals("admin") && password.equals("admin")) {
			writer.println("User: "+username+" logged in at "+new Date());
		}else {
			writer.println("Login error!");
		}
		writer.println("</html>");
		writer.close();
	}
}
