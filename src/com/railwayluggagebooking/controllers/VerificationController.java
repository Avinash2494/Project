package com.railwayluggagebooking.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.railwayluggagebooking.bean.VerificationBean;
import com.railwayluggagebooking.services.VerificationService;


public class VerificationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		 response.setContentType("text/html;charset=UTF-8");
	     PrintWriter out = response.getWriter();
	     
	     int check=0;
	     
	     String status=request.getParameter("status");
	     int ticketNo=Integer.parseInt(request.getParameter("ticketNo"));
	     
	     //out.println(status);
	    System.out.println(status);
	    System.out.println(ticketNo);
	    
	     VerificationBean verificationBean=new VerificationBean();
	     verificationBean.setStatus(status);
	     verificationBean.setTicketNo(ticketNo);
	     
	     
	     
	     
	     VerificationService verificationServise=new VerificationService();
	     
	     try{
	         check = verificationServise.getVerification(verificationBean);
	        }
	        catch(ClassNotFoundException ce)
	        {
	            ce.printStackTrace();
	        }
	        catch(SQLException se)
	        {
	            se.printStackTrace();
	        }
	     
	     if(check==1)
	     {
	    	 RequestDispatcher rd = request.getRequestDispatcher("/parcelOfficerHomePage.html");
	            rd.forward(request, response);
	     }
	     if(check==0)
	     {
	    	 RequestDispatcher rd = request.getRequestDispatcher("/parcelOfficerHomePage.html");
	            rd.forward(request, response);
	     }

	}

}
