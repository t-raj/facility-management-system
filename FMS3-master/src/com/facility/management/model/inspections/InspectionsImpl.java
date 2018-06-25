package com.facility.management.model.inspections;

public class InspectionsImpl implements Inspections {
	private int facilityId;
	private int inspectId;
	private String description;
	
	@Override
	public int getFacilityId() {
		return facilityId;
	}
	
	@Override
	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
		
	}
	
	@Override
	public int getInspectId() {
		return inspectId;
	}
	
	@Override
	public void setInspectId(int inspectId) {
		this.inspectId = inspectId;
		
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public void setDescription(String description) {
		this.description = description;
	}




	

}
