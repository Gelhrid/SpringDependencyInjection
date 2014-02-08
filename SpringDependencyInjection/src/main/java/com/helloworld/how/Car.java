package com.helloworld.how;

public class Car {
private String types;
private int id;
private Color color;



	public void setColor(Color color) {
	this.color = color;
}
	public void drive(){
		System.out.println("brum brum brum");
	}
	public Car(String types, int id) {
	super();
	this.types = types;
	this.id = id;
}
	@Override
	public String toString() {
		return "Car [types=" + types + ", id=" + id + ", color=" + color + "]";
	}
	
	
}
