package com.railwayluggagebooking.daointerfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.railwayluggagebooking.bean.LuggageAnalysisBean;
import com.railwayluggagebooking.bean.LuggageDetailsBean;


public interface LuggageDetailsDao {

	public abstract int luggageDetailsEntry(LuggageDetailsBean luggageDetails) throws ClassNotFoundException, SQLException;
	public abstract ResultSet luggageAnalysis(LuggageAnalysisBean luggageAnalysisBean) throws ClassNotFoundException, SQLException;
}
