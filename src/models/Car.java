package models;

public abstract class Car {
	protected String color;
	protected String topSpeed;
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public String getTopSpeed(){
		return topSpeed;
	}
	
	public void setTopSpeed(String topSpeed){
		this.topSpeed = topSpeed;
	}
	
	public String getSpecs(){
		return "This car can travel at a top speed of:"+ topSpeed+"\n"+
				"It also is a stylish: "+ color;
	}
}
