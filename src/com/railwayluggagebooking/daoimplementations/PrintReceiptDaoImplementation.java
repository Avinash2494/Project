package com.railwayluggagebooking.daoimplementations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.railwayluggagebooking.bean.ReceiptBean;
import com.railwayluggagebooking.daointerfaces.PrintReceiptDao;
import com.railwayluggagebooking.utilities.DButilites;




public class PrintReceiptDaoImplementation implements PrintReceiptDao {

	
	public ReceiptBean getReceipt(int ticketNo) throws ClassNotFoundException,SQLException 
	{
		
		String bookingStatus=null;
		int check=0;
		
		Connection con = DButilites.getConnection();
		Statement st=con.createStatement();
		
		ReceiptBean rb=new ReceiptBean();
		
		ResultSet rs;
		rs=st.executeQuery("select status from RPLBS_LuggageDetails where ticket_num="+ticketNo);
		
		while(rs.next())
		{
			bookingStatus=rs.getString(1);			
		}
		
		//System.out.println(bookingStatus);
		
		if(bookingStatus.equalsIgnoreCase("APPROVED"))
		{
			rs=st.executeQuery("select d.*,r.RECIEPT_NUM from RPLBS_luggageDetails d,RPLBS_reciept r where d.ticket_num=r.ticket_num AND d.ticket_num="+ticketNo);
			
			rb.setResultSet(rs);
			rb.setCheck(1);
		}
		else
		{
			rs=st.executeQuery("select ticket_num,NAME_OF_PASSENGER ,status from RPLBS_luggageDetails where ticket_num="+ticketNo);
			
			rb.setResultSet(rs);
			rb.setCheck(0);
		}
				
		return rb;
	}
 
}
