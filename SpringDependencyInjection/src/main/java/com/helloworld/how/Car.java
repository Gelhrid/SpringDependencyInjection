package com.helloworld.how;

public class Car {
private String type;
private int id;
	public void drive(){
		System.out.println("brum brum brum");
	}
	@Override
	public String toString() {
		return "Car [type=" + type + ", id=" + id + "]";
	}
	
	
}
