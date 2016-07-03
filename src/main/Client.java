package main;

import java.util.ArrayList;
import java.util.List;

import interfaces.IOption;
import interfaces.TraditionalIterator;
import models.Car;


public class Client {
	public static void main(String[] args){
		List<Car> cars = new ArrayList<>();
		CarFactory factory = new CarFactory();
		cars.add(factory.build("Race",""));
		cars.add(factory.build("Street",""));
		cars.add(factory.build("Race", "legal"));
		
		TraditionalIterator<Car> unsafe = new CarIterator(cars);
		
		while(unsafe.hasNext()){
			unsafe.next();
			System.out.println(unsafe.getCurrent().getSpecs());
		}
		
		unsafe = new CarIterator(cars);
		
		IteratorAdapter safe = new IteratorAdapter(unsafe);
		SpecsPrinter printer = new SpecsPrinter();
		
		boolean done = false;
		while(!done){
			IOption<Car> option = safe.next();
			if(option.visit(printer).equals("Not a car")){
				done = true;
			}else{
				System.out.println(option.visit(printer));
			}
		}
	}
}
