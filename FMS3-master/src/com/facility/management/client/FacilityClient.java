package com.facility.management.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.facility.management.model.customer.Customer;
import com.facility.management.model.facility.Facility;
import com.facility.management.model.service.FacilityService;

public class FacilityClient {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
		
		FacilityService facilityService = (FacilityService) context.getBean("facilityService");
		
		 Facility facility = (Facility) context.getBean("facility");
		 facility.setFacilityId(5);
		 facility.setOwner("CRAZY");
		 facility.setCity("Chicago");
		 
		 facilityService.addFacility(facility);
	}

}
