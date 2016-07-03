package main;

import interfaces.IOptionVisitor;
import models.Car;

public class SpecsPrinter implements IOptionVisitor<Car,String>{

	@Override
	public String onSome(Car value) {
		// TODO Auto-generated method stub
		return value.getSpecs();
	}

	@Override
	public String onNone() {
		// TODO Auto-generated method stub
		return "Not a car";
	}

}
