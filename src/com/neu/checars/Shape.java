package com.neu.checars;

public abstract class Shape
{
	{System.out.println("执行Shape的初始化块");}
	private String color;
	public abstract double getPerimeter();
	public abstract String getType();

	public Shape(){}
	public Shape(String color)
	{
		System.out.println("执行Shape的构造器");
		this.color = color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}
}