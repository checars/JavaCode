package com.neu.checars;

public class ShapeTest
{
	public static void main(String args[])
	{
		Shape t = new Triangle("��ɫ",3,4,5);
		Shape c = new Circle("��ɫ", 3);
		System.out.println(t.getType());
		System.out.println(t.getPerimeter());
		System.out.println(c.getType());
		System.out.println(c.getPerimeter());
	}
}