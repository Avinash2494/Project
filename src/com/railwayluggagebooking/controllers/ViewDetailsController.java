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

import com.railwayluggagebooking.services.ViewDetailsService;
import com.railwayluggagebooking.services.ViewPendingRequestsService;



public class ViewDetailsController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//System.out.println("Jsp for display");
		
		 response.setContentType("text/html;charset=UTF-8");
	     PrintWriter out = response.getWriter();
	     
	     ViewDetailsService viewDetailsService = new ViewDetailsService();
		
	     ResultSet rs=null;
	     try
			{
				rs=viewDetailsService.getDetails();
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
	        RequestDispatcher rd=request.getRequestDispatcher("clerkViewDetails.jsp");
	        rd.forward(request, response);
		
		
	}

}
