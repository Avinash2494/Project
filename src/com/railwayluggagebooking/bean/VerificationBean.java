package com.railwayluggagebooking.bean;

public class VerificationBean implements java.io.Serializable {

	private String status;
	private int ticketNo;
	
	public VerificationBean()
	{
		super();
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	
	
}
