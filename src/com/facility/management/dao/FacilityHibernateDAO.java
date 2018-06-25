package com.facility.management.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import org.hibernate.Query;
import org.hibernate.Session;

import com.facility.management.model.facility.Facility;
import com.facility.management.dao.HibernatePGSQLHelper;


public class FacilityHibernateDAO {
	
	public void addNewFacility(Facility fac) {
		System.out.println("*************** Adding facility in DB with ID ...  " 
				+ fac.getFacilityId());
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(fac);
		session.getTransaction().commit();
	}
	public void removeFacility(Facility fac) {
		System.out.println("*************** Deleteing facility from DB with ID ...  " + fac.getFacilityId());
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(fac);
		session.getTransaction().commit();
	}
	
	public List<Facility> listFacilities(){
		try {
		System.out.println("*************** querying facilities ...  ");
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
        
        Query listFacilitiesQuery = session.createQuery("From FacilityImpl");	//gets all facilities	
		
		List facs = listFacilitiesQuery.list(); //list of all columns in the facility's row
		
		System.out.println("*************** Retrieve Query is ....>>\n" + facs.size()); 
		
		session.getTransaction().commit();
		return facs;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();

		
	}

    
	@SuppressWarnings("unchecked")
	public int requestAvailableCapacity(int facilityId) {
		try {
		System.out.println("*************** Searcing for capacity for facility with ID ...  " + facilityId);
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
        
        Query getCapacityQuery = session.createQuery("From FacilityImpl where facilityId=:facilityId");		
        getCapacityQuery.setString("facilityId", (facilityId + ""));
		
		System.out.println("*************** Retrieve Query is ....>>\n" + getCapacityQuery.toString()); 
		
		List cap = getCapacityQuery.list(); //list of all columns in the facility's row
		System.out.println("Getting facility capacity using HQL. \n" + cap.get(3)); //prints only the capacity
		
		System.out.println("*************** Retrieve Query is ....>>\n" + cap.get(3).toString()); 
		
		session.getTransaction().commit();
		return (int)cap.get(3);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public String getFacilityInformation(int facilityId) {
		try {
		System.out.println("*************** Searcing for detail for facility with ID ...  " + facilityId);
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
        
        Query getDetailQuery = session.createQuery("From FacilityImpl where facilityId=:facilityId");		
        getDetailQuery.setString("facilityId", (facilityId + ""));
		
		System.out.println("*************** Retrieve Query is ....>>\n" + getDetailQuery.toString()); 
		
		List details = getDetailQuery.list(); //list of all columns in the facility's row
		System.out.println("Getting Facility Details using HQL. \n" + details.get(5));
		
		System.out.println("*************** Retrieve Query is ....>>\n" + details.get(5).toString()); 
		
		session.getTransaction().commit();
		return (String)details.get(5);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
		}
	
	public String addFacilityDetail(int facilityId, String d) {
		try {
		System.out.println("*************** Searcing for detail for facility with ID ...  " + facilityId);
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
	    
	    Query getDetailQuery = session.createQuery("Update FacilityImpl set detail=:newDetails" + "where facilityId=:facilityId");
	    getDetailQuery.setString("newDetails", (d));
	    getDetailQuery.setString("facilityId", (facilityId + ""));
	    getDetailQuery.executeUpdate(); 
		
		session.getTransaction().commit();
		return d;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
		}


}
