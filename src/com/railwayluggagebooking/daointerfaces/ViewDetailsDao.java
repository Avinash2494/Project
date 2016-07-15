package com.railwayluggagebooking.daointerfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ViewDetailsDao {

	public abstract ResultSet getDetails()throws ClassNotFoundException, SQLException;
}
