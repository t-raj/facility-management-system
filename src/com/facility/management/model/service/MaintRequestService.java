package com.facility.management.model.service;

import com.facility.management.dao.MaintRequestHibernateDAO;
import com.facility.management.model.maintenance.MaintRequest;


public class MaintRequestService {
	private MaintRequestHibernateDAO maintReqDAO = new MaintRequestHibernateDAO();
	
	public void addMaintReq(MaintRequest maintReq) {
		try {
			maintReqDAO.addMaintReq(maintReq);
	    } catch (Exception se) {
	      System.err.println("MaintRequestService: Threw a Exception adding maint request.");
	      System.err.println(se.getMessage());
	    }
	}
}
