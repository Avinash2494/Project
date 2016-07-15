package com.railwayluggagebooking.daointerfaces;


import java.sql.SQLException;

import com.railwayluggagebooking.bean.VerificationBean;


public interface VerificationDao {

	public abstract int getVerification(VerificationBean verificationBean)throws ClassNotFoundException, SQLException;
	
	
	
}
