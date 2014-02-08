package com.helloworld.how;

public class Color {
	private String color;
	private String special;

	public Color(String color, String special) {
		this.color = color;
		this.special = special;
	}


	@Override
	public String toString() {
		return "Color [color=" + color + ", special=" + special + "]";
	}

}
