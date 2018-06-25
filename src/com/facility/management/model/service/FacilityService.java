package com.facility.management.model.service;

import com.facility.management.dao.FacilityHibernateDAO;
import com.facility.management.model.facility.Facility;


public class FacilityService {
	private FacilityHibernateDAO facDAO = new FacilityHibernateDAO();
	
	public void addFacility(Facility fac) {
		try {
			facDAO.addFacility(fac);
	    } catch (Exception se) {
	      System.err.println("FacilityService: Threw a Exception retrieving customer.");
	      System.err.println(se.getMessage());
	    }
	}
}
