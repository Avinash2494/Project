package com.railwayluggagebooking.daoimplementations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.railwayluggagebooking.bean.VerificationBean;
import com.railwayluggagebooking.daointerfaces.VerificationDao;
import com.railwayluggagebooking.utilities.DButilites;




public class VerificationDaoImplementation implements VerificationDao {

	
	public int getVerification(VerificationBean verificationBean) throws ClassNotFoundException,SQLException 
	{
		Connection con = DButilites.getConnection();
		Statement st=con.createStatement();
		
		int ticketNo=verificationBean.getTicketNo();
		String status=verificationBean.getStatus();
		
		System.out.println(status);
	    System.out.println(ticketNo);
		
		
		if(status.equalsIgnoreCase("accept"))
		{
			System.out.println("before approval");
			st.executeUpdate("update RPLBS_LuggageDetails set status='APPROVED' where Ticket_num="+ticketNo+"");
			System.out.println("after approval");
			//st.executeUpdate("update RPLBS_LuggageDetails set Remaining_space=Remaining_space-(select weight from RPLBS_LuggageDetails where Ticket_num="+ticketNo+")");
			st.executeUpdate("insert into RPLBS_reciept values(RPLBS_sequence.nextVal,"+ticketNo+")");
			System.out.println("after seq");
			return 1;
		}
		else
		{
			System.out.println("before rej");
			st.executeUpdate("update RPLBS_LuggageDetails set status='REJECTED' where Ticket_num="+ticketNo+"");
			System.out.println("after rej");
			return 0;
			
		}
		
	
	}

}
