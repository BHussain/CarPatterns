package main;

import models.Car;
import models.RaceCar;
import models.StreetCar;

public class CarFactory {
	public Car build(String type, String extra){
		switch(type){
		case "Street": return new StreetCar();
		case "Race": 
			switch(extra){
			case "legal":
				return new MakeStreetLegal(new RaceCar());
			default: 
				return new RaceCar();
			}
		default: return null;
		}
	}
}
