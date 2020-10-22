package com.vehcile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleDetails {

		@Autowired
		@Qualifier("car")
		MileCalculator carcalculator;
		@Autowired
		@Qualifier("bike")
		MileCalculator bikecalculator;

		public void getMileage(String choice)
		{
			if(choice == "car")
				carcalculator.showMilage(45);
			else
				bikecalculator.showMilage(35);
				
		}
		
	
}
