package com.curdapplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
	{
		 int j = (int)req.getAttribute("k"); 
		
		/* int j = Integer.parseInt(req.getParameter("k")); */
		
		j = j*j;
		
		PrintWriter pw = res.getWriter();
		pw.println("Result is" +j);
	
	}

}
