package com.railwayluggagebooking.daointerfaces;

import java.sql.SQLException;

import com.railwayluggagebooking.bean.LoginBean;


public interface LoginDao {

	public abstract String validateUser(LoginBean login ) throws ClassNotFoundException, SQLException;
}
