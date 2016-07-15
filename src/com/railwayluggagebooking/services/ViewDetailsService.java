package com.railwayluggagebooking.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.railwayluggagebooking.daoimplementations.ViewDetailsDaoImplementation;
import com.railwayluggagebooking.daointerfaces.ViewDetailsDao;


public class ViewDetailsService {
	public ResultSet getDetails()throws ClassNotFoundException, SQLException
	{
		
		ViewDetailsDao viewDetailsDao=new ViewDetailsDaoImplementation();
		return viewDetailsDao.getDetails();
	
	}
}
