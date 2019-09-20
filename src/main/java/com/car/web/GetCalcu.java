package com.car.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class GetCars
 */
public class GetCalcu extends HttpServlet {

	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name").toString();
		
		name.toUpperCase();
		
		PrintWriter out = response.getWriter();
		out.println("Hello " + name);
		
	}

	

	}

