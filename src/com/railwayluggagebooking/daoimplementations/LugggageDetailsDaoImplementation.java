package com.railwayluggagebooking.daoimplementations;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.railwayluggagebooking.bean.LuggageAnalysisBean;
import com.railwayluggagebooking.bean.LuggageDetailsBean;
import com.railwayluggagebooking.daointerfaces.LuggageDetailsDao;
import com.railwayluggagebooking.utilities.DButilites;


public class LugggageDetailsDaoImplementation implements LuggageDetailsDao{

	public int luggageDetailsEntry(LuggageDetailsBean luggageDetails) throws ClassNotFoundException, SQLException
	{	
		int farePerKg=0 ;
		int totalFare=0;
		try 
		{
		
			
		//System.out.println(luggageDetails.getDateOfJourney());
			Connection con = DButilites.getConnection();
			if(con!=null)
				 System.out.println("connection succes");
			
		Statement st =con.createStatement();
		
		ResultSet rs=st.executeQuery("select FARE_PERKG from RPLBS_FareTable where source='"+luggageDetails.getSource()+"' and destination='"+luggageDetails.getDestination()+"'");
		
		while(rs.next())
		{
			System.out.println("inside while loop");
			farePerKg=rs.getInt(1);
		}
	     System.out.println(farePerKg);
		totalFare=farePerKg*luggageDetails.getWeight();
		System.out.println(totalFare);
		
		
		//.......Inserting into table...............
				
		PreparedStatement psmt = con.prepareStatement("insert into RPLBS_LuggageDetails(TICKET_NUM,TRAIN_NUM,TRAIN_NAME,DATE_OF_JOURNEY,SOURCE,DESTINATION,NAME_OF_PASSENGER,NUM_OF_ITEMS,WEIGHT,FARE,STATUS) values(?,?,?,?,?,?,?,?,?,"+totalFare+",'PENDING')");
		System.out.println("sucess after pstmt");
		
		psmt.setInt(1, luggageDetails.getTicketNo());
		psmt.setInt(2, luggageDetails.getTrainNo());
		psmt.setString(3,luggageDetails.getTrianName());
		psmt.setString(4, luggageDetails.getDateOfJourney());
		psmt.setString(5, luggageDetails.getSource());
		psmt.setString(6, luggageDetails.getDestination());
		psmt.setString(7, luggageDetails.getPartyName());
		psmt.setInt(8, luggageDetails.getNoOfItems());
		psmt.setInt(9, luggageDetails.getWeight());
		//psmt.setString(12,luggageDetails.getNatureOfLuggage());
		//psmt.setInt(10,totalFare);
		//psmt.setString(11,"pending" );
		
				
		psmt.executeUpdate();
		 
		 
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return totalFare;
		
	}

	@Override
	public ResultSet luggageAnalysis(LuggageAnalysisBean luggageAnalysisBean) throws ClassNotFoundException, SQLException {
		Connection con = DButilites.getConnection();
		if(con!=null)
	     System.out.println("connection succes");
		Statement st =con.createStatement();
		ResultSet rs =null;
		if(luggageAnalysisBean.getFlag().equals("1")){
	         rs=st.executeQuery("select count(TICKET_NUM), DATE_OF_JOURNEY  FROM RPLBS_LUGGAGEDETAILS GROUP BY DATE_OF_JOURNEY");
		}
		if(luggageAnalysisBean.getFlag().equals("2")){
			rs=st.executeQuery("select count(TICKET_NUM), TRAIN_NUM  FROM RPLBS_LUGGAGEDETAILS GROUP BY TRAIN_NUM");
			}
		
		System.out.println(rs);
		return rs;
	}    
}
