package com.railwayluggagebooking.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;


import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.railwayluggagebooking.bean.LoginBean;
import com.railwayluggagebooking.services.LoginService;



@SuppressWarnings("serial")
public  class LoginController extends HttpServlet {
	
	


	
	  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	        response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();

	        try {
	             String userName = request.getParameter("userName");
	             String password = request.getParameter("password");
	             String role = "";

	        //setting bean.........
	        LoginBean loginInfo = new LoginBean();
	        loginInfo.setUserName(userName);
	        loginInfo.setPassword(password);

	        
	        LoginService loginService = new LoginService();
	        try{
	         role = loginService.validateUser(loginInfo);
	        }
	        catch(ClassNotFoundException ce){
	            ce.printStackTrace();

	            // append exception message to log file
	        }
	        catch(SQLException se){
	            se.printStackTrace( );
	            // append exception message to log file
	        }
	        if( role.equalsIgnoreCase("clerk")){
	            HttpSession session = request.getSession();
	            session.setAttribute("userName", userName);


	            RequestDispatcher rd = request.getRequestDispatcher("/clerkHomePage.html");
	            rd.forward(request, response);

	        }

	        if( role.equalsIgnoreCase("parcelOfficer")){
	            HttpSession session = request.getSession();
	            session.setAttribute("userName", userName);
	            
	            RequestDispatcher rd = request.getRequestDispatcher("/parcelOfficerHomePage.html");
	            rd.forward(request, response);

	        }

	        if( role.equalsIgnoreCase("invalid")){
	          
	            RequestDispatcher rd = request.getRequestDispatcher("/Loginpage.jsp");
	            request.setAttribute("msg","Invalid User Id Password");
	            rd.forward(request, response);

	        }
	    }



	         finally { 
	            out.close();
	        }
	    } 

	    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
	    /** 
	     * Handles the HTTP <code>GET</code> method.
	     * @param request servlet request
	     * @param response servlet response
	     * @throws ServletException if a servlet-specific error occurs
	     * @throws IOException if an I/O error occurs
	     */
	    @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	        processRequest(request, response);
	    } 

	    /** 
	     * Handles the HTTP <code>POST</code> method.
	     * @param request servlet request
	     * @param response servlet response
	     * @throws ServletException if a servlet-specific error occurs
	     * @throws IOException if an I/O error occurs
	     */
	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	        processRequest(request, response);
	    }

	    /** 
	     * Returns a short description of the servlet.
	     * @return a String containing servlet description
	     */
	    @Override
	    public String getServletInfo() {
	        return "Short description";
	    }// </editor-fold>
		
		
		
		
		
		
		
	}


