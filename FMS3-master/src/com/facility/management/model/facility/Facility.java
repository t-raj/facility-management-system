package com.facility.management.model.facility;

public interface Facility {

	public int getFacilityId();
	public void setFacilityId(int facilityId);
	public String getOwner();
	public void setOwner(String owner);
	public void setCity(String string);
	public String getCity();
	public double getFacilityRate();
	public void setFacilityRate(double rate);
	public int getFacilityCapacity();
	public void setFacilityCapacity(int capacity);
	public String getDetail();
	public void setDetail(String detail);
}
