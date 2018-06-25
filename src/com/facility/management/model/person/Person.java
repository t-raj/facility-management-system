package com.facility.management.model.person;

import java.util.List;

import com.facility.management.model.facility.Facility;

public interface Person {

	public int getPersonID();

	public void setPersonID(int id);
	
	public String getType();

	public void setType(String type);
	
	public String getAddress();
	
	public void setAddress(String address);
	
	public String getCity();


	public void setCity(String city);


	public String getState();


	public void setState(String state);


	public String getZip();


	public void setZip(String zip);
	
	public String getPhone();


	public void setPhone(String phone);
	
	public List<Facility> getFacList();

	public void setFacList(List<Facility> facList);

}
