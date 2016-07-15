package com.railwayluggagebooking.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.railwayluggagebooking.bean.LoginBean;
import com.railwayluggagebooking.daointerfaces.LoginDao;
import com.railwayluggagebooking.utilities.DButilites;

public class LoginDaoImpementation implements LoginDao{

	public String validateUser( LoginBean login) throws ClassNotFoundException, SQLException{
        String role = "";
        Connection con = DButilites.getConnection();
        PreparedStatement psmt = con.prepareStatement("select role from RLBS_loginTable where userName =? and password=?");
        psmt.setString(1, login.getUserName());
        psmt.setString(2, login.getPassword());
        ResultSet rs = psmt.executeQuery();
        if(rs.next()){
            role=rs.getString("role");
        }
        else{
            role = "invalid";
        }
        return role;
    }
}
