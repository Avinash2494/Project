package com.railwayluggagebooking.services;

import java.sql.SQLException;

import com.railwayluggagebooking.bean.LoginBean;
import com.railwayluggagebooking.daoimplementations.LoginDaoImpementation;
import com.railwayluggagebooking.daointerfaces.LoginDao;

public class LoginService {

	public String validateUser(LoginBean login) throws ClassNotFoundException, SQLException{
        LoginDao loginDao = new LoginDaoImpementation();
        return loginDao.validateUser(login);     
    }
}
