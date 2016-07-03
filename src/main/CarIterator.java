package main;

import java.util.List;

import interfaces.TraditionalIterator;
import models.Car;

public class CarIterator implements TraditionalIterator<Car> {
	
	private int index;
	private List<Car> cars;
	
	public CarIterator(List<Car> cars){
		this.cars = cars;
		index = -1;
	}
	
	@Override
	public Car getCurrent() {
		return cars.get(index);
	}

	@Override
	public boolean hasNext() {
		if(index+1<cars.size()){
			return true;
		}
		return false;
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		index ++;
	}

}
