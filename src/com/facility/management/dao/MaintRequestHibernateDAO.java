package com.facility.management.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.facility.management.model.facility.Facility;
import com.facility.management.model.maintenance.MaintRequest;
import com.fms2.dal.DBHelper;
import com.fms2.model.Facility_MaintReq;
import com.fms2.model.Facility_Maintenance;

public class MaintRequestHibernateDAO {
	
	public void makeFacilityMaintReq(MaintRequest maint) {
		System.out.println("*************** Adding maintenance request information in DB with ID ...  " 
				+ maint.getMaintId());
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(maint);
		session.getTransaction().commit();
	}
	
	public List<MaintRequest> listMaintenanceRequests(){
		try {
		System.out.println("*************** querying maintenance requests ...  ");
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
        
        Query listMaintQuery = session.createQuery("From MaintRequestImpl");	
		
		List maint = listMaintQuery.list();
		
		System.out.println("*************** Retrieve Query is ....>>\n" + maint.size()); 
		
		session.getTransaction().commit();
		return maint;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();

		
	}
	
	public List<MaintRequest> listMaintenance(){
		try {
		System.out.println("*************** querying maintenance requests ...  ");
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
        
        Query listMaintQuery = session.createQuery("From MaintRequestImpl where status=closed");	
		
		List maint = listMaintQuery.list();
		
		System.out.println("*************** Retrieve Query is ....>>\n" + maint.size()); 
		
		session.getTransaction().commit();
		return maint;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();

		
	}
	
	public int calcMaintenanceCostForFacility(int facilityId){
		try {
		System.out.println("*************** querying maintenance requests ...  ");
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
        
        Query maintQuery = session.createQuery("Select cost From MaintRequestImpl where status=closed and facilityId=:facilityId");	
        maintQuery.setString("facilityId", (facilityId + ""));
		
		List maint = maintQuery.list();
		
		System.out.println("*************** Retrieve Query is ....>>\n" + maint.size()); 
		int sum = 0;
		for (int i = 0; i < maint.size(); i++) {
			sum += (int)maint.get(i);
		}
		session.getTransaction().commit();
		return sum;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;

		
	}
	
	public List<MaintRequest> listFacilityProblems(){
		try {
		System.out.println("*************** querying maintenance requests ...  ");
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
        
        Query listMaintQuery = session.createQuery("From MaintRequestImpl where status=open");	
		
		List maint = listMaintQuery.list();
		
		System.out.println("*************** Retrieve Query is ....>>\n" + maint.size()); 
		
		session.getTransaction().commit();
		return maint;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();

		
	}
	
	public int calcProblemRateForFacility(int facilityId){
		try {
		System.out.println("*************** querying maintenance requests ...  ");
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
        
        Query maintQuery = session.createQuery("From MaintRequestImpl where status=open and facilityId=:facilityId");	
        maintQuery.setString("facilityId", (facilityId + ""));
		
		List maint = maintQuery.list();
		
		System.out.println("*************** Retrieve Query is ....>>\n" + maint.size()); 
		
		session.getTransaction().commit();
		return maint.size();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;

		
	}
	public Boolean scheduleMaintenence(int id, Calendar start, Calendar end) {
		try {
		System.out.println("*************** Searcing for request with ID ...  " + id);
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
	    
	    Query vacateQuery = session.createQuery("Update MaintRequestImpl set startDate=start and endDate=end" + "where maintId=:id");		
	    vacateQuery.setString("id", (id + ""));
		vacateQuery.executeUpdate(); 
		
		session.getTransaction().commit();
		return true;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		}

}
