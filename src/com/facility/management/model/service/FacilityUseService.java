package com.facility.management.model.service;

import com.facility.management.dao.FacilityUseHibernateDAO;
import com.facility.management.model.facility_use.Facility_use;


public class FacilityUseService {
	private FacilityUseHibernateDAO facUseDAO = new FacilityUseHibernateDAO();
	
	public void addFacilityUse(Facility_use facUse) {
		try {
			facUseDAO.addFacilityUse(facUse);

	    } catch (Exception se) {
	      System.err.println("FacilityService: Threw a Exception adding use.");
	      System.err.println(se.getMessage());
	    }
	}

}
