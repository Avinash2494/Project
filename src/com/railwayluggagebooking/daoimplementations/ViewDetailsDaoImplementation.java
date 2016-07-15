package com.railwayluggagebooking.daoimplementations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.railwayluggagebooking.daointerfaces.ViewDetailsDao;
import com.railwayluggagebooking.utilities.DButilites;



public class ViewDetailsDaoImplementation implements ViewDetailsDao {
 

	public ResultSet getDetails() throws ClassNotFoundException, SQLException {
	
		Connection con = DButilites.getConnection();
		Statement st=con.createStatement();
		
	ResultSet rs=st.executeQuery("select d.*,r.RECIEPT_NUM from RPLBS_luggageDetails d,RPLBS_reciept r where d.ticket_num=r.ticket_num");
	System.out.println("after rs of view details..");
	return rs;
		
		
		
	}

}
