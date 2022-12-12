package com.curdapplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class AddServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
			int k = i + j;
		//res.sendredirect("?sq="+k)
		req.setAttribute("k", k);
		//Request Dispatcher will invoke one servlet to another servlet
		RequestDispatcher rs = req.getRequestDispatcher("sq");
		rs.forward(req, res);
		
	}

}

