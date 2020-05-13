package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="Dictionary",urlPatterns = "/search")
public class Dictionary extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String needToSearch = req.getParameter("english");
		Map<String,String> dictionary = new HashMap();
		dictionary.put("hello", "xin chao");
		dictionary.put("morning", "buoi sang");
		dictionary.put("cat", "con meo");
		dictionary.put("girl", "co gai");
		dictionary.put("wife", "vo");
		PrintWriter writer = resp.getWriter();
		String result = dictionary.get(needToSearch);
		writer.println("<html>");
		if(result!= null) {
			writer.println("The word: "+needToSearch+" means: "+ result);			
		}else writer.println("Not found");
		writer.println("</html>");	
	}

}
