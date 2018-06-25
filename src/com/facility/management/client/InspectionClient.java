package com.facility.management.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.facility.management.model.inspections.Inspections;
import com.facility.management.model.service.InspectionService;

public class InspectionClient {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
		
		InspectionService inspectionService = (InspectionService) context.getBean("inspectionService");
		
		 Inspections inspectionUse = (Inspections) context.getBean("inspectionUse");
		 inspectionUse.setFacilityId(5);
		 inspectionUse.setInspectId(1);
		 inspectionUse.setDescription("Tenant x is moving out");

		 inspectionService.addInspection(inspectionUse);

	}

}
