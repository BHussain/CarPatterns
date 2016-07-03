package models;

import interfaces.IOption;
import interfaces.IOptionVisitor;

public class Some<T> implements IOption<T>{
	private T value;
	
	public Some(T value){
		this.value = value;
	}

	@Override
	public <U> U visit(IOptionVisitor<T, U> visitor) {
		// TODO Auto-generated method stub
		return visitor.onSome(value);
	}


}
