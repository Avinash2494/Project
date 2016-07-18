package com.railwayluggagebooking.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogOutController extends HttpServlet {
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		 HttpSession session = request.getSession();
		 session.invalidate();
		 System.out.println("Session destroied");
	     response.sendRedirect("Loginpage.jsp");	 
	 }

}
