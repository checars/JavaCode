package com.neu.checars;

public class Triangle extends Shape
{
	private double a;
	private double b;
	private double c;
	public Triangle(String color, double a, double b, double c)
	{
		super(color);
		this.setSides(a,b,c);
	}
	public void setSides(double a, double b, double c)
	{
		if(a >= b+c || b >= a+c || c >= a+b)
		{
			System.out.println("三角形两边之和大于第三 边");
			return;
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getPerimeter()
	{
		return a+b+c;
	}
	public String getType()
	{
		return getColor() + "三角形";
	}
}