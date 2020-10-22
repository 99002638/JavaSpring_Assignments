package com.vehcile;

import org.springframework.stereotype.Component;

@Component
public class Bike implements MileCalculator {

	@Override
	public void showMilage(int mil) {
		System.out.println("Bike milage is....");

	}

}