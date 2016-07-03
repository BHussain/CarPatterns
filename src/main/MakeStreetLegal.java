package main;

import models.Car;

public class MakeStreetLegal extends CarDecorator {
	public MakeStreetLegal(Car car){
		this.car = car;
	}
	
	@Override
	public String getSpecs(){
		car.setTopSpeed("120 km/h");
		return car.getSpecs();
	}
}
