package com.railwayluggagebooking.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.railwayluggagebooking.daoimplementations.ViewPendingRequestsDaoImplementation;
import com.railwayluggagebooking.daointerfaces.ViewPendingRequestsDao;


public class ViewPendingRequestsService {

	public ResultSet getPendingRequests()throws ClassNotFoundException, SQLException
	{
		
		ViewPendingRequestsDao viewPendingRequestsDao=new ViewPendingRequestsDaoImplementation();
		return viewPendingRequestsDao.getPendingRequests();
	
	}
	
}
