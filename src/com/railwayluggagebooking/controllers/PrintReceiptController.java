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

import com.railwayluggagebooking.bean.ReceiptBean;
import com.railwayluggagebooking.services.LoginService;
import com.railwayluggagebooking.services.PrintReceiptService;


public class PrintReceiptController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 response.setContentType("text/html;charset=UTF-8");
	     PrintWriter out = response.getWriter();
	     
	     int ticketNo=Integer.parseInt(request.getParameter("ticketNo"));
	     
	     ReceiptBean rb=null;
	     
	     PrintReceiptService printReceiptService = new PrintReceiptService();
	      
	     try{
	         rb = printReceiptService.getReceipt(ticketNo);
	        }
	     catch(NullPointerException ne){
	    	 
	        	out.println("<html>");
	        	out.println("<body>");
	        	out.println("<h3>Enter a valid ticket number</h3>");
	        	out.println("</body>");
	        	out.println("</html>");
	        	//RequestDispatcher rd = request.getRequestDispatcher("PrintReceiptController.java");
	        }
	     
	     catch(ClassNotFoundException ce)
	        {
	            ce.printStackTrace();
	            
	        }
	     catch(SQLException se)
	        {
	            se.printStackTrace();
	        }
	       
	     int check=(rb.getCheck());
	     ResultSet rs=rb.getResultSet();
	     
	     request.setAttribute("rs", rs);
	     
	     if(check==1)
	     {
	    	 
	    	 RequestDispatcher rd = request.getRequestDispatcher("/ViewReceiptDetails.jsp");
	            rd.forward(request, response);
	     }
	     if(check==0)
	     {
	    	 RequestDispatcher rd = request.getRequestDispatcher("/ViewReceiptStatus.jsp");
	            rd.forward(request, response);
	     }
	     
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doPost(request,response);
	}
}
