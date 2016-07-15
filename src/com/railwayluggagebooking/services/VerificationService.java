package com.railwayluggagebooking.services;

import java.sql.SQLException;

import com.railwayluggagebooking.bean.VerificationBean;
import com.railwayluggagebooking.daoimplementations.VerificationDaoImplementation;
import com.railwayluggagebooking.daointerfaces.VerificationDao;




public class VerificationService {

	public int getVerification(VerificationBean verificationBean) throws ClassNotFoundException, SQLException{
		VerificationDao verificationDao=new VerificationDaoImplementation();
		return verificationDao.getVerification(verificationBean);
		
}
}
