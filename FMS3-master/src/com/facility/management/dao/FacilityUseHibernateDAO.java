package com.facility.management.dao;

import java.util.Collections;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.facility.management.model.facility.Facility;
import com.facility.management.model.facility_use.Facility_use;
import com.facility.management.model.service.FacilityUseService;

public class FacilityUseHibernateDAO {
	public void assignFacilityToUse(Facility_use facUse) {
		System.out.println("*************** Adding facilityUse information in DB with ID ...  " 
				+ facUse.getUseId());
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(facUse);
		session.getTransaction().commit();
	}
	
	public int vacateFacility(int uid) {
		try {
		System.out.println("*************** Searcing for facility use with ID ...  " + uid);
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
	    
	    Query vacateQuery = session.createQuery("Update FacilityUseImpl set status=vacant" + "where useId=:useId");		
	    vacateQuery.setString("useId", (uid + ""));
		vacateQuery.executeUpdate(); 
		
		session.getTransaction().commit();
		return 1;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
		}

	@SuppressWarnings("unchecked")
	public Boolean isInUseDuringInterval(int useId) {
		try {
		System.out.println("*************** Searcing for capacity for facility use with ID ...  " + useId);
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
        
        Query useQuery = session.createQuery("From FacilityUseImpl where useId=:useId");		
        useQuery.setString("useId", (useId + ""));
		
		System.out.println("*************** Retrieve Query is ....>>\n" + useQuery.toString()); 
		
		List u = useQuery.list();
		System.out.println("Getting status using HQL. \n" + u.get(4)); //prints only the capacity
		
		System.out.println("*************** Retrieve Query is ....>>\n" + u.get(4).toString()); 
		
		session.getTransaction().commit();
		if (u.get(4) == "occupied")
		return true;
		else
			return false;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public List<Facility_use> listActualUsage(int facilityId){
		try {
		System.out.println("*************** querying facility use ...  ");
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
        
        Query useQuery = session.createQuery("From FacilituUseImpl where facilityId=:facilityId");	
        useQuery.setString("facilityId", (facilityId + ""));
		
		List u = useQuery.list(); 
		
		System.out.println("*************** Retrieve Query is ....>>\n" + u.size()); 
		
		session.getTransaction().commit();
		return u;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();

		
	}
	
	public int calcUsageRate(int facilityId){
		try {
		System.out.println("*************** querying facility use ...  ");
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
        
        Query useQuery = session.createQuery("From FacilituUseImpl where facilityId=:facilityId");	
        useQuery.setString("facilityId", (facilityId + ""));
		
		List u = useQuery.list(); 
		
		System.out.println("*************** Retrieve Query is ....>>\n" + u.size()); 
		
		session.getTransaction().commit();
		return u.size();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;

		
	}
	
	public int calcDownTimeForFacility(int facilityId, int maxUsage){
		try {
		System.out.println("*************** querying facility use ...  ");
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
        
        Query useQuery = session.createQuery("From FacilituUseImpl where facilityId=:facilityId");	
        useQuery.setString("facilityId", (facilityId + ""));
		
		List u = useQuery.list(); 
		
		System.out.println("*************** Retrieve Query is ....>>\n" + u.size()); 
		
		session.getTransaction().commit();
		return maxUsage-u.size();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return maxUsage;

		
	}
	
}

