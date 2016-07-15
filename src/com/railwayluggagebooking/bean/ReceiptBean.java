package com.railwayluggagebooking.bean;

import java.sql.ResultSet;

public class ReceiptBean implements java.io.Serializable {

	private int check;
	private ResultSet resultSet;
	
	public ReceiptBean()
	{
		super();
	}

	public int getCheck() {
		return check;
	}

	public void setCheck(int check) {
		this.check = check;
	}

	public ResultSet getResultSet() {
		return resultSet;
	}

	public void setResultSet(ResultSet resultSet) {
		this.resultSet = resultSet;
	}
	
	
}
