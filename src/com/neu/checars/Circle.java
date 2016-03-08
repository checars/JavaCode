package com.neu.checars;

public class Circle extends Shape
{
	private double radius;

	public Circle(String color, double radius)
	{
		super(color);
		this.radius = radius;
	}
	public double getPerimeter()
	{
		return Math.PI*radius*2;
	}
	public String getType()
	{
		return getColor() + "т╡пн";
	}
}