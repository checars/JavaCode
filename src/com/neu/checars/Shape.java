package com.neu.checars;

public abstract class Shape
{
	{System.out.println("ִ��Shape�ĳ�ʼ����");}
	private String color;
	public abstract double getPerimeter();
	public abstract String getType();

	public Shape(){}
	public Shape(String color)
	{
		System.out.println("ִ��Shape�Ĺ�����");
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