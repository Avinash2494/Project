package com.railwayluggagebooking.daoimplementations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.railwayluggagebooking.daointerfaces.ViewPendingRequestsDao;
import com.railwayluggagebooking.utilities.DButilites;



public class ViewPendingRequestsDaoImplementation implements ViewPendingRequestsDao{

	public ResultSet getPendingRequests() throws ClassNotFoundException, SQLException{
		
		Connection con = DButilites.getConnection();
		Statement st=con.createStatement();
		
		
		
		ResultSet rs=st.executeQuery("select * from RPLBS_LuggageDetails where status='PENDING'");
		System.out.println("after rs");
		return rs;
	}
}
