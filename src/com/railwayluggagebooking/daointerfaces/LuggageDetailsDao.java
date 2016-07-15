package com.railwayluggagebooking.daointerfaces;

import java.sql.SQLException;

import com.railwayluggagebooking.bean.LuggageDetailsBean;


public interface LuggageDetailsDao {

	public abstract int luggageDetailsEntry(LuggageDetailsBean luggageDetails) throws ClassNotFoundException, SQLException;
	
}
