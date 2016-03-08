package com.neu.checars;

public class ShapeTest
{
	public static void main(String args[])
	{
		Shape t = new Triangle("°×É«",3,4,5);
		Shape c = new Circle("ºìÉ«", 3);
		System.out.println(t.getType());
		System.out.println(t.getPerimeter());
		System.out.println(c.getType());
		System.out.println(c.getPerimeter());
	}
}