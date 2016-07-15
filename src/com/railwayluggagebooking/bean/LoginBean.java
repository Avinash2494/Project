package com.railwayluggagebooking.bean;

public class LoginBean implements java.io.Serializable{

	
	private String userName;
	private String password;
	
	public LoginBean()
	{
		super();
	}
	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	
	
}
