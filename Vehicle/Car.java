package com.vehcile;

import org.springframework.stereotype.Component;

@Component
public class Car implements MileCalculator {


	@Override
	public void showMilage(int mil) {
		System.out.println("Car milage is...."+mil);
	}

}
