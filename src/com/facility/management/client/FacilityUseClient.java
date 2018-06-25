package com.facility.management.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.facility.management.model.customer.Customer;
import com.facility.management.model.facility_use.Facility_use;
import com.facility.management.model.service.FacilityUseService;

public class FacilityUseClient {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
		
		FacilityUseService facilityUseService = (FacilityUseService) context.getBean("facilityUseService");
		
		 Facility_use facilityUse = (Facility_use) context.getBean("facilityUse");
		 facilityUse.setFacilityId(5);
		 facilityUse.setUseId(1);
		 facilityUse.setTenant("Tenant x");

		 facilityUseService.addFacilityUse(facilityUse);

	}

}
