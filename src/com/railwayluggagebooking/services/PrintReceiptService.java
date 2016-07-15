package com.railwayluggagebooking.services;


import java.sql.SQLException;

import com.railwayluggagebooking.bean.ReceiptBean;
import com.railwayluggagebooking.daoimplementations.PrintReceiptDaoImplementation;
import com.railwayluggagebooking.daointerfaces.PrintReceiptDao;



public class PrintReceiptService {

	public ReceiptBean getReceipt(int ticketNo)throws ClassNotFoundException, SQLException
	{
		
		PrintReceiptDao printReceiptDao=new PrintReceiptDaoImplementation();
		return printReceiptDao.getReceipt(ticketNo);
	
	}
}
