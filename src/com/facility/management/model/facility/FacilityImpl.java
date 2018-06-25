package com.facility.management.model.facility;

public class FacilityImpl implements Facility {
	private int facilityId;
	private String owner;
	private String city;
	private double rate;
	private int capacity;
	private String detail;
	
	@Override
	public int getFacilityId() {
		return facilityId;
	}
	
	@Override
	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
		
	}
	
	@Override
	public String getOwner() {
		return owner;
	}
	
	@Override
	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public void setCity(String city) {
		this.city = city;
		
	}

	@Override
	public String getCity() {
		return city;
	}
	
	@Override
	public double getFacilityRate() {
		return rate;
	}
	
	@Override
	public void setFacilityRate(double rate) {
		this.rate = rate;
		
	}
	
	@Override
	public int getFacilityCapacity() {
		return capacity;
	}
	
	@Override
	public void setFacilityCapacity(int capacity) {
		this.capacity = capacity;
		
	}
	
	@Override
	public String getDetail() {
		return detail;
	}
	
	@Override
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	

}
