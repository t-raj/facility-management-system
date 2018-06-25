package com.facility.management.model.service;

import com.facility.management.dao.InspectionsHibernateDAO;
import com.facility.management.model.inspections.Inspections;


public class InspectionService {
	private InspectionsHibernateDAO inspectDAO = new InspectionsHibernateDAO();
	
	public void addInspection(Inspections inspect) {
		try {
			inspectDAO.addInspection(inspect);

	    } catch (Exception se) {
	      System.err.println("InspectionService: Threw a Exception adding inspection.");
	      System.err.println(se.getMessage());
	    }
	}

}
