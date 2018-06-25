package com.facility.management.dao;

import java.util.Collections;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.facility.management.model.facility.Facility;
import com.facility.management.model.inspections.Inspections;
import com.facility.management.model.service.InspectionService;

public class InspectionsHibernateDAO {
	public void addInspection(Inspections inspect) {
		System.out.println("*************** Adding inspection information in DB with ID ...  " 
				+ inspect.getInspectId());
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(inspect);
		session.getTransaction().commit();
	}
	
	public List<Facility> listInspections(){
		try {
		System.out.println("*************** querying inspections ...  ");
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
        
        Query listInspectionsQuery = session.createQuery("From InspectionsImpl");	
		
		List ins = listInspectionsQuery.list(); 
		
		System.out.println("*************** Retrieve Query is ....>>\n" + ins.size()); 
		
		session.getTransaction().commit();
		return ins;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();

		
	}
}
