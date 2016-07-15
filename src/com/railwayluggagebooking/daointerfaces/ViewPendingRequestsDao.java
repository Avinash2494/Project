package com.railwayluggagebooking.daointerfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ViewPendingRequestsDao {

	public abstract ResultSet getPendingRequests()throws ClassNotFoundException, SQLException;
	
}
