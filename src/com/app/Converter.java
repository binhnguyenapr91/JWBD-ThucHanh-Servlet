package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="Converter", urlPatterns = "/convert")
public class Converter extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		float rate = Float.parseFloat(req.getParameter("rate"));
		float usd = Float.parseFloat(req.getParameter("usd"));
		float result = rate * usd;
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<h1>Result</h1>");
		writer.println("<p>USD: "+usd+"</p>");
		writer.println("<p>VND: "+result+"</p>");	
		writer.println("</html>");
	}

}
