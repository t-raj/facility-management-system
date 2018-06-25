package com.facility.management.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.facility.management.model.maintenance.MaintRequest;
import com.facility.management.model.service.MaintRequestService;

public class MaintReqClient {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
		
		MaintRequestService maintService = (MaintRequestService) context.getBean("maintService");
		
		MaintRequest maintReq = (MaintRequest) context.getBean("maintRequest");
		maintReq.setFacilityId(5);
		maintReq.setMaintId(123);
		maintReq.setMaintDesc("Chicago");
		 
		maintService.addMaintReq(maintReq);

	}

}
