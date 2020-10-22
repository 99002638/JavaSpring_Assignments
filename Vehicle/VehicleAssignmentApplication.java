package com.vehcile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class VehicleAssignmentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VehicleAssignmentApplication.class, args);
	}
		@Autowired
		ApplicationContext context;
		VehicleDetails vehDetails;
		@Override
		public void run(String... args) throws Exception {
			VehicleDetails vehDetails = context.getBean(VehicleDetails.class);
			vehDetails.getMileage("bike");
		}
		
		
		
		
	

}
