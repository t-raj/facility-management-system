package com.facility.management.model.maintenance;

import java.util.Calendar;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class MaintRequestImpl implements MaintRequest {
	private int facilityId;
	private int maintId;
	private String maintDescription;
    private double cost;
    private String status; //open / closed
    private Calendar startDate;
    private Calendar endDate;
	
	
	@Override
	public int getFacilityId() {
		return facilityId;
	}
	
	
	@Override
	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;		
	}
	


	@Override
	public int getMaintId() {
		return maintId;
	}

	@Override
	public void setMaintId(int maintId) {
		this.maintId = maintId;
		
	}

	@Override
	public void setMaintDesc(String maintDescription) {
		this.maintDescription = maintDescription;
		
	}
	
	@Override
	public String getMaintDesc() {
		return maintDescription;
	}

	@Override
	public String getStatus() {
		return status;
	}
	
	@Override
	public void setStatus(String status) {
		this.status = status;
		
	}
	
	@Override
	public double getCost() {
		return cost;
	}
	
	@Override
	public void setCost(double cost) {
		this.cost = cost;
		
	}
	
	@Override
	public Calendar getStartDate() {
		return startDate;
	}
	
	@Override
	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
		
	}

	@Override
	public Calendar getEndDate() {
		return endDate;
	}
	
	@Override
	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
		
	}
	

}
