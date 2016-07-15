package com.railwayluggagebooking.daointerfaces;


import java.sql.SQLException;

import com.railwayluggagebooking.bean.ReceiptBean;



public interface PrintReceiptDao {

	public abstract ReceiptBean getReceipt(int ticketNo) throws ClassNotFoundException, SQLException;
}
