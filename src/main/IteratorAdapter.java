package main;

import interfaces.IOption;
import interfaces.SafeIterator;
import interfaces.TraditionalIterator;
import models.Car;
import models.None;
import models.Some;

public class IteratorAdapter implements SafeIterator<IOption<Car>> {
	private TraditionalIterator<Car> it;
	
	public IteratorAdapter(TraditionalIterator<Car> it){
		this.it = it;
	}
	
	@Override
	public IOption<Car> next() {
		if(it.hasNext()){
			it.next();
			Car car = it.getCurrent();
			return new Some<Car>(car);
		}else{
			return new None<Car>();
		}
	}
	
}
