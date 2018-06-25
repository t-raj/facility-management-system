package com.facility.management.model.person;
import com.facility.management.model.facility.Facility;
import java.util.List;

public class PersonImpl implements Person {



	protected int personID;
	protected String address;
	protected String city;
	protected String state;
	protected String zip;
	protected String phone;
	protected String type;
	
 /*   public Person(int id, String t){
    	this.personID = id;
    	this.type = t;
    }
    
    public Person(int id){
    	this.personID = id;
    }
    */

	public int getPersonID() {
		return personID;
	}

	public void setPersonID(int id) {
		this.personID = id;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public List<Facility> getFacList() {
		return facList;
	}

	public void setFacList(List<Facility> facList) {
		this.facList = facList;
	}
}
