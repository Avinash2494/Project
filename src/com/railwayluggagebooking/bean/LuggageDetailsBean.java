package com.railwayluggagebooking.bean;

public class LuggageDetailsBean implements java.io.Serializable {

	private int ticketNo;
	private int trainNo;
	private String trianName;
	private String dateOfJourney;
	private String source;
	private String destination;
	private String partyName;
	private int noOfItems;
	private int weight;
	//private String natureOfLuggage;
	
	
	
	public int getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public String getTrianName() {
		return trianName;
	}
	public void setTrianName(String trianName) {
		this.trianName = trianName;
	}
	public String getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(String dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public int getNoOfItems() {
		return noOfItems;
	}
	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/*public String getNatureOfLuggage() {
		return natureOfLuggage;
	}
	public void setNatureOfLuggage(String natureOfLuggage) {
		this.natureOfLuggage = natureOfLuggage;
	}*/
	
	
	
}
