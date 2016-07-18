package com.railwayluggagebooking.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.railwayluggagebooking.bean.LuggageAnalysisBean;
import com.railwayluggagebooking.bean.LuggageDetailsBean;
import com.railwayluggagebooking.daoimplementations.LugggageDetailsDaoImplementation;
import com.railwayluggagebooking.daointerfaces.LuggageDetailsDao;



public class LuggageDetailsService {

	public int luggageDetailsEntry(LuggageDetailsBean luggageDetails) throws ClassNotFoundException, SQLException{
        LuggageDetailsDao luggageDetailsDao = new LugggageDetailsDaoImplementation();
        return luggageDetailsDao.luggageDetailsEntry(luggageDetails);   
	
}
	public ResultSet luggageAnalysis(LuggageAnalysisBean luggageAnalysisBean) throws ClassNotFoundException, SQLException{
		
		LuggageDetailsDao luggageDetailsDao = new LugggageDetailsDaoImplementation();
		return luggageDetailsDao.luggageAnalysis(luggageAnalysisBean);
		
	}
	
	
}
