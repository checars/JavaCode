package com.neu.checars;

public abstract class SpeedMeter
{
	private double trunRate;
	public abstract double getRadius();
	public void setTrunRate(double trunRate)
	{
		this.trunRate = trunRate;
	}
	public double getSpeed()
	{
		return 2 * Math.PI * getRadius() * trunRate;
	}
}