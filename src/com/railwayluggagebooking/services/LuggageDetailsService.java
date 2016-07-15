package com.railwayluggagebooking.services;

import java.sql.SQLException;

import com.railwayluggagebooking.bean.LuggageDetailsBean;
import com.railwayluggagebooking.daoimplementations.LugggageDetailsDaoImplementation;
import com.railwayluggagebooking.daointerfaces.LuggageDetailsDao;



public class LuggageDetailsService {

	public int luggageDetailsEntry(LuggageDetailsBean luggageDetails) throws ClassNotFoundException, SQLException{
        LuggageDetailsDao luggageDetailsDao = new LugggageDetailsDaoImplementation();
        return luggageDetailsDao.luggageDetailsEntry(luggageDetails);   
	
}
}
