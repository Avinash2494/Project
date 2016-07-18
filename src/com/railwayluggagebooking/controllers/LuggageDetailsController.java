package com.railwayluggagebooking.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.railwayluggagebooking.bean.LoginBean;
import com.railwayluggagebooking.bean.LuggageDetailsBean;
import com.railwayluggagebooking.services.LoginService;
import com.railwayluggagebooking.services.LuggageDetailsService;

public class LuggageDetailsController extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		
		 response.setContentType("text/html;charset=UTF-8");
	     PrintWriter out = response.getWriter();
	     int totalFare=0;
		
	     try 
	    {
	    	 int ticketNo= Integer.parseInt(request.getParameter("ticketNo"));
	    	 int trainNo= Integer.parseInt(request.getParameter("trainNo"));
	    	 String trainName=request.getParameter("trainName");
	    	 String dateOfJourney=request.getParameter("dateOfJourney");
	    	 String source=request.getParameter("source");
	    	 String destination=request.getParameter("destination");
	    	 String partyName=request.getParameter("partyName");
	    	 int noOfItems= Integer.parseInt(request.getParameter("noOfItems"));
	    	 int weight= Integer.parseInt(request.getParameter("weight"));
	    	// String nature= request.getParameter("natureOfLuggage");
	    	 
	    	 LuggageDetailsBean luggageDetails = new LuggageDetailsBean();
	    
	    	luggageDetails.setTicketNo(ticketNo);
	 		luggageDetails.setTrainNo(trainNo);
	 		luggageDetails.setTrianName(trainName);
	 		luggageDetails.setDateOfJourney(dateOfJourney);
	 		luggageDetails.setSource(source);
	 		luggageDetails.setDestination(destination);
	 	    luggageDetails.setPartyName(partyName);
	 	    luggageDetails.setNoOfItems(noOfItems);
	 		luggageDetails.setWeight(weight);
	 		//luggageDetails.setNatureOfLuggage(nature);
	 		
	 		
	 		 LuggageDetailsService luggageDetailsService = new LuggageDetailsService();
		 
	 		 	try
	 		 	{
	 		 		
	 		 		totalFare=luggageDetailsService.luggageDetailsEntry(luggageDetails);
	 			 
	 		 	}
	 		 		
	 		 	 catch(ClassNotFoundException ce){
	 	            ce.printStackTrace();
	 	            
	 	        }
	 	        catch(SQLException se){
	 	            se.printStackTrace();	 	           
	 	            System.out.println("you have enter same id twice, inside exception");
	 	        }
	 	        
	 	       request.setAttribute("totalFare",totalFare); 
	 	       RequestDispatcher rd = request.getRequestDispatcher("/LuggageDetailsFareDisplay.jsp");
	            rd.forward(request, response);
	    	 
	     }
	     
	     finally { 
	            out.close();
	        }
		
	}

}
