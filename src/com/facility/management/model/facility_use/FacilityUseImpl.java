package com.facility.management.model.facility_use;

import java.util.Calendar;

public class FacilityUseImpl implements Facility_use {
	
	private int useId;
	private int facilityId;
	private String tenant;
	private String owner;
    private Calendar startDate;
    private Calendar endDate;
    private String status;  //occupied or vacant

	@Override
	public int getUseId() {
		return useId;
	}
	
	@Override
	public void setUseId(int useId) {
		this.useId = useId;		
	}
	
	@Override
	public int getFacilityId() {
		return facilityId;
	}
	
	@Override
	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;		
	}
	
	@Override
	public String getTenant() {
		return tenant;
	}
	
	@Override
	public void setTenant(String tenant) {
		this.tenant = tenant;
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
	public String getStatus() {
		return status;
	}
	
	@Override
	public void setStatus(String status) {
		this.status = status;
		
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
