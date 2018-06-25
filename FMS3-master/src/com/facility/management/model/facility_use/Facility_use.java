package com.facility.management.model.facility_use;

import java.util.Calendar;

public interface Facility_use {

	public int getUseId();
	public void setUseId(int useId);
	public int getFacilityId();
	public void setFacilityId(int facilityId);
	public	void setTenant(String tenant);
	public String getTenant();
	public	void setOwner(String owner);
	public String getOwner();
    public Calendar getStartDate();
    public Calendar getEndDate();
    public String getStatus();
    public void setStartDate(Calendar start);
    public void setEndDate(Calendar end);
    public void setStatus(String status);
	

}
