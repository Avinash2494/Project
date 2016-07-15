package com.railwayluggagebooking.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.railwayluggagebooking.services.ViewPendingRequestsService;



public class VeiwPendingRequestsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=UTF-8");
	     PrintWriter out = response.getWriter();
	     //out.println("satya");
	     
	     ViewPendingRequestsService viewPendingRequestsService = new ViewPendingRequestsService();
	
	     ResultSet rs=null;
	     try
			{
				rs=viewPendingRequestsService.getPendingRequests();
			}
	     catch(ClassNotFoundException ce)
		    {
		            ce.printStackTrace();
		            
		    }
	     catch(SQLException se)
		    {
		        	se.printStackTrace();
		    }
	
	     
	     request.setAttribute("rs", rs);
	        RequestDispatcher rd=request.getRequestDispatcher("poVerificationPage.jsp");
	        rd.forward(request, response);
	
		}
	
}
