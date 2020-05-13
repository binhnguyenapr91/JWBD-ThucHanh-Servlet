package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="Welcome",urlPatterns ="/welcome")
public class Welcome extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>");
		writer.println("Welcome Page");
		writer.println("</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("Login Info");		
		writer.println("</h1>");
		String username = req.getParameter("username");
		Date date = (Date)req.getAttribute("loginTime");
		writer.println("<p>User: "+username+" login at: "+ date);
		writer.println("</body>");
		writer.println("</html>");
		writer.close();
	}

}
