package com.facility.management.model.maintenance;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public interface MaintRequest {

	public int getFacilityId();
	public void setFacilityId(int facilityId);
	public int getMaintId();
	public void setMaintId(int maintId);
	public void setMaintDesc(String maintDescription);
	public String getMaintDesc();
	public void setStatus(String status);
	public String getStatus();
	public void setCost(double cost);
	public double getCost();
	public void setStartDate(Calendar start);
	public Calendar getStartDate();
	public void setEndDate(Calendar end);
	public Calendar getEndDate();
}
